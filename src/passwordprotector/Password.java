
package passwordprotector;

public class Password {
    
    private String username;
    private String mail;
    private String description;
    private String encryptedPassword;
    
    public Password (String username, String mail, String description, String password) {
        Encryptor encry = new Encryptor();
        
        this.username = username;
        this.mail = mail;
        this.description = description;
        
        this.encryptedPassword = encry.encryptXOR(password);
        password = null;        
    }
    
}
