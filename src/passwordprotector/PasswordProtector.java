
package passwordprotector;

import Graphics.GraphicInterface;

public class PasswordProtector {

    
    public static void main(String[] args) {
        
        GraphicInterface GUI = new GraphicInterface();
        GUI.show();
        
        // DEBUG:
        
        Encryptor e = new Encryptor();
        
        Password p = new Password("Giacomo", "giacki8@libero.it", "la password dell'account Origin", "www.origin.org", "prova1234#");
        e.encryptThis(p);
        
        
    }
    
}
