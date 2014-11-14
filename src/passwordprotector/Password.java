
package passwordprotector;

import java.io.Serializable;

public class Password implements Serializable {
    
    private String username;
    private String email;
    private String description;
    private String website;    
    private String password;
    
    public Password (String username, String email, String description, String website, String password) {
        Encryptor encry = new Encryptor();
        
        this.username = username;
        this.email = email;
        this.description = description;
        this.website = website;        
        this.password = password;
    }

    public String getInfo(int index) {
        switch (index) {
            case 0: return username;
            case 1: return email;
            case 2: return description;
            case 3: return website;
            case 4: return password;
            default: return null;
        }
    }
}
