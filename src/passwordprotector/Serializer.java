/*
 *
 *  PasswordProtector - Store your password in a safe place
 *
 *  Copyright (C) 2014  Giacomo Pinardi
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

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
