
package passwordprotector;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Encryptor {
    
    private FileInputStream fileIn = null;
    private ObjectInputStream inObj = null;
    
    public Password encryptThisPassword (Password unencrypted, String passphrase) {
        
        String[] info = new String[5];
        
        for (int i = 0; i < info.length; i++) {
            info[i] = this.toBits(unencrypted.getInfo(i));
        }
        
        String psp = this.toBits(passphrase);
        
        String[] encrypted = this.encryptThisBits(info, psp);
        
        return new Password (encrypted[0], encrypted[1], encrypted[2], encrypted[3], encrypted[4]);        
    }
    
    private String toBits (String word) {              
        int k;
        String s;
        String result = "";
        byte[] bs = word.getBytes();
        
        for (int i = 0; i < bs.length; i++) {
            k = bs[i];
            s = Integer.toBinaryString(k);
            
            while (s.length() < 8) {
                // add "0" if the string representing the byte is too short:
                s = "0".concat(s);
            }
            result = result.concat(s);
        }
        System.out.println(result);
        return result;
    }
    
    private String[] encryptThisBits (String info[], String psp) {
        // info crypted using XOR and the passphrase
        String[] crpd = new String[5];
        for (int i = 0; i < crpd.length; i++) {
            crpd[i] = "";
        }
        
        int pspCounter = 0;
        int maxLenght = psp.length();
        
        for (int i = 0; i < info.length; i++) {
            String currentWord = info[i];
              
            for (int j = 0; j < currentWord.length(); j++) {
                char c = currentWord.charAt(j);
                char p = psp.charAt(pspCounter);
                
                String result;
                if (c == p) {
                    result = "0";
                }
                else {
                    result = "1";
                }
                crpd[i] = crpd[i].concat(result);
                
                pspCounter ++;
                if (pspCounter >= maxLenght) {
                    pspCounter = 0;
                }
            }
            
        }
        return crpd;
    }
    
    public PasswordFolder decryptThisFile (File pfFile, String passphrase) {
        
        PasswordFolder pfDecrypted = null;
        PasswordFolder pfCrypted = null;
        
        try {
            fileIn = new FileInputStream(pfFile.getAbsolutePath());
            inObj = new ObjectInputStream(fileIn);

            pfCrypted = (PasswordFolder) inObj.readObject();

            inObj.close();
            fileIn.close();
            
            pfDecrypted = this.decryptThisPasswordFolder(pfCrypted, passphrase);
            
            return pfDecrypted;
        }
        catch (IOException | ClassNotFoundException ex) {
            return pfDecrypted;
        }
    }
    
    private PasswordFolder decryptThisPasswordFolder (PasswordFolder pf, String passphrase) {
        
        PasswordFolder decrypted = new PasswordFolder();
        Password p = null;
        
        for (int i = 0; i < pf.size(); i++) {
            p = this.decryptThisPassword(pf.get(i), passphrase);
            decrypted.add(p);
        }        
        return decrypted;
    }
    
    private Password decryptThisPassword (Password p, String passphrase) {
        
        Password decrypted;
        String[] infoDec = new String[5];
                
        for (int i = 0; i < 5; i++) {
            infoDec[i] = this.decryptThisString(p.getInfo(i), passphrase);
        }
        
        decrypted = new Password(infoDec[0], infoDec[1], infoDec[2], infoDec[3], infoDec[4]);
        
        return decrypted;
    }
    
    private String decryptThisString (String s, String psp) {
        String passphrase = this.toBits(psp);
        String decrypted = "";
        
        String subS = null;
        
        for (int i = 0; i < (s.length()/8); i++) {
            subS = s.substring(i*8, (i+1)*8);
            // subS = 01000101, cioe' una lettera
            
        }
        
        return decrypted;
    }
}
