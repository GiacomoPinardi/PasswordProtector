
package passwordprotector;

import java.io.Serializable;

public class Password implements Serializable {
    
    private String username;
    private String email;
    private String website;
    private String description;
    private String password;
    
    public Password (String username, String email, String website, String description, String password) {
        Encryptor encry = new Encryptor();
        
        this.username = username;
        this.email = email;
        this.description = description;
        this.website = website;
        
        this.password = password;
        password = null;        
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getWebsite() {
        return website;
    }

    public String getDescription() {
        return description;
    }

    public String getPassword() {
        return password;
    }
    
    
    
}
