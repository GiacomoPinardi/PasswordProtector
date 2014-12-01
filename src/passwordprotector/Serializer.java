
package passwordprotector;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializer {
    
    private FileOutputStream fileOut = null;
    private FileInputStream fileIn = null;
    private ObjectOutputStream outObj = null;
    private ObjectInputStream inObj = null;
    
    public boolean addToExisting (Password p, String location) {
        try {  
            fileIn = new FileInputStream(location);
            inObj = new ObjectInputStream(fileIn);
            
            PasswordFolder pf = (PasswordFolder) inObj.readObject();
            
            inObj.close();
            fileIn.close();
            
            pf.add(p);
            
            boolean b = this.createNew(pf, location);
            
            return (true && b);
        }
        catch (IOException | ClassNotFoundException ex) {
            return false;
        }
    }
    
    public boolean createNew (PasswordFolder pf, String location) {       
        try {
            fileOut = new FileOutputStream(location);
            outObj = new ObjectOutputStream(fileOut);
            outObj.writeObject(pf);
            outObj.close();
            fileOut.close();
            return true;
        }         
        catch (IOException ex) {            
            return false;
        }
        
    }
}
