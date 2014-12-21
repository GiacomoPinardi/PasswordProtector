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

import java.io.Serializable;

public class Password implements Serializable {
    
    private String username;
    private String email;
    private String description;
    private String website;    
    private String password;
    private boolean[] encryptedFields;
    
    public Password (String username, String email, String description, String website, String password, boolean[] encFields) {                
        this.username = username;
        this.email = email;
        this.description = description;
        this.website = website;        
        this.password = password;
        this.encryptedFields = encFields;
    }

    public Object getInfo(int index) {
        switch (index) {
            case 0: return username;
            case 1: return email;
            case 2: return description;
            case 3: return website;
            case 4: return password;
            case 5: return encryptedFields;
            default: return null;
        }
    }
}
