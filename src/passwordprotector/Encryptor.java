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
            info[i] = this.toBits((String) unencrypted.getInfo(i));
        }
        
        boolean[] encryptedFields = (boolean[]) unencrypted.getInfo(5);
        
        String psp = this.toBits(passphrase);
        
        String[] encrypted = this.encryptThisBits(info, psp, encryptedFields);
        
        return new Password (encrypted[0], encrypted[1], encrypted[2], encrypted[3], encrypted[4], encryptedFields);        
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
        return result;
    }
    
    private String[] encryptThisBits (String info[], String psp, boolean[] encFields) {
        // info crypted using XOR and the passphrase
        String[] crpd = new String[5];
        for (int i = 0; i < crpd.length; i++) {
            crpd[i] = "";
        }
        
        int pspCounter = 0;
        int maxLenght = psp.length();
        
        for (int i = 0; i < info.length; i++) {
            if (encFields[i]) {                
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
            else {
                crpd[i] = info[i];
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
        String info[] = new String[5];
        String[] infoDecBit;
        String[] infoDecTxt = new String[5];
                
        boolean[] encryptedFields = (boolean[]) p.getInfo(5);
        
        for (int i = 0; i < 5; i++) {
            info[i] = (String) p.getInfo(i);
        }
        
        infoDecBit = this.decryptThisBits(info, passphrase, encryptedFields);                
        
        for (int i = 0; i < infoDecBit.length; i++) {
            infoDecTxt[i] = this.toText(infoDecBit[i]);
        }
        
        decrypted = new Password(infoDecTxt[0], infoDecTxt[1], infoDecTxt[2], infoDecTxt[3], infoDecTxt[4], encryptedFields);
        
        return decrypted;
    }
    
    private String[] decryptThisBits (String info[], String psp, boolean[] encFields) {
        // info decrypted using XOR and the passphrase
        String passphrase = this.toBits(psp);
        String[] infoDec = new String[5];
        
        for (int i = 0; i < infoDec.length; i++) {
            infoDec[i] = "";
        }
        
        int counter = 0;
        int maxLenght = passphrase.length();
        
        for (int i = 0; i < info.length; i++) {         
            
            if (encFields[i]) {               
                for (int j = 0; j < info[i].length(); j++) {
                    char c = info[i].charAt(j);
                    char p = passphrase.charAt(counter);

                    String result;
                    if (c == p) {
                        result = "0";
                    }
                    else {
                        result = "1";
                    }
                    infoDec[i] = infoDec[i].concat(result);

                    counter ++;
                    if (counter >= maxLenght) {
                        counter = 0;
                    }
                }  
            }
            else {
                infoDec[i] = info[i];
            }
        }
        return infoDec;
    }
    
    private String toText (String bits) {
        
        String word = "";
        String subS = null;
        char c;
        
        for (int i = 0; i < (bits.length()/8); i++) {
            subS = bits.substring(i*8, ((i+1)*8));
            c = ((char) Integer.parseInt(subS, 2));
            word = word + c;
        }
        
        return word;
    }
}
