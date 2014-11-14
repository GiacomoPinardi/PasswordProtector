
package passwordprotector;

import Graphics.GraphicInterface;

public class PasswordProtector {

    
    public static void main(String[] args) {
        
        GraphicInterface GUI = new GraphicInterface();
        GUI.show();
        
        // DEBUG:
        
        Encryptor e = new Encryptor();
        
        Password unE = new Password("Giacomo", "giacki8@libero.it", "La password dell'account Origin", "www.origin.org", "prova1234#");
        Password E = e.encryptThisPassword(unE, "prova");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("UnE: " + unE.getInfo(i));
            System.out.println("E: " + E.getInfo(i));
        }
        
    }
    
}
