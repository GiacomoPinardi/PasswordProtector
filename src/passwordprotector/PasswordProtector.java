
package passwordprotector;

import graphics.GraphicInterface;

public class PasswordProtector {

    
    public static void main(String[] args) {
        
        GraphicInterface GUI = new GraphicInterface();
        GUI.show();
        
        // DEBUG:
        
//        Encryptor e = new Encryptor();
//        
//        Password p1 = new Password("Giacomo", "giacki8@libero.it", "La password dell'account Origin", "www.origin.org", "prova1234#");
//        Password p2 = new Password("Stefano", "stafano@libero.it", "La password dell'account Ebay", "www.ebay.com", "thisISpsw"); 
//        
//        System.out.println("Create due nuove password");
//        
//        Password e1 = e.encryptThisPassword(p1, "prova12");
//        Password e2 = e.encryptThisPassword(p2, "prova12");
//        
//        System.out.println("Criptate correttamente");
//        
//        PasswordFolder pfCritt = new PasswordFolder();
//        
//        pfCritt.add(e1);
//        pfCritt.add(e2);
//        
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Crittografate 1: " + e1.getInfo(i));
//            System.out.println("Crittografate 2: " + e2.getInfo(i));
//        }
//        
//        PasswordFolder pfDecr = e.decryptThisPasswordFolder(pfCritt, "prova12");
//        
//        System.out.println("Decriptate correttamente");
//        
//        Password d1 = pfDecr.get(0);
//        Password d2 = pfDecr.get(1);
//        
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Decrittografate 1: " + d1.getInfo(i));
//            System.out.println("Decrittografate 2: " + d2.getInfo(i));
//        }
        
    }
    
}
