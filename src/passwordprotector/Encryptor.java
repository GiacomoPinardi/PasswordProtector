
package passwordprotector;

public class Encryptor {
    
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
    
}
