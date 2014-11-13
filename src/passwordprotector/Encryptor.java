
package passwordprotector;

public class Encryptor {
    
    public Password encryptThis (Password unencrypted) {
        String usr = unencrypted.getUsername();
        String eml = unencrypted.getEmail();
        String des = unencrypted.getDescription();        
        String web = unencrypted.getWebsite();
        String psw = unencrypted.getPassword();
        
        usr = this.toBits(usr);
        eml = this.toBits(eml);
        des = this.toBits(des);
        web = this.toBits(web);
        psw = this.toBits(psw);
        
        System.out.println("usr: " + usr);
        System.out.println("eml: " + eml);
        System.out.println("des: " + des);
        System.out.println("web: " + web);
        System.out.println("psw: " + psw);
        
        return new Password (null,null,null,null,null);
        
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
        /*
        String result = "";
        String sc;
        int bits;
        char c;
        
        
        for (int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            sc = Character.toString(c);
            bits = sc.hashCode();
            //result = result.concat(String.format("%08d", 12));
            result = result.concat(";" + Integer.toBinaryString(bits));
            //result = result.concat(Integer.toBinaryString(bits));
        }
        
        
        return result;
                */
    }
    
}
