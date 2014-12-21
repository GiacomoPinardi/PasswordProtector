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

package graphics;

import java.awt.Image;
import javax.swing.ImageIcon;

public class HelpFrame extends javax.swing.JFrame {
    
    public HelpFrame() {
        initComponents();
        this.setTitle("Help & F.A.Q.");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);   
        
        Image image = new ImageIcon("src/img/lock.png").getImage();
        this.setIconImage(image);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Help and F.A.Q.");

        jTextPane1.setEditable(false);
        jTextPane1.setContentType("text/html"); // NOI18N
        jTextPane1.setText("<html>\n  <body style=\"font-size:10px\">\n    <p><b>Will the information be encrypted?<b></p>\n    <p>Yes, the information stored in the PasswordFolders will be encrypted using XOR cryptography. However the XOR cryptography is an obsolete technique and it cannot be hundred per cent safe.</p>\n    <p>To dissuade anyone from trying to decrypt your information without the correct passphrase, you should encrypt the least possible data. So it's important to use efficiently the tick that permit you to decide what information will be encrypted.</p>    \n    <p>It is proved that XOR cryptography is incomprehensible (obviously without the right passphrase) when the information word length is equal to the passphrase word length.</p> \n    <p><b>What influence have the password length and the passphrase lenght?</b></p>\n    <p>To protect the accounts and the informations stored in the PasswordFolders you should choose at least an eight character password composed with numbers, capital letters and symbols.</p>\n    <p><b>Is necessary make a backup copy of my PasswordFolder?</b></p>\n    <p>Yes, a backup copy is highly recommended. To prevent your PasswordFolder from accidental and unauthorized deletion you should store a backup copy in a safe place.</p>\n    <p>This software allows you to hide your information in the PasswordFolder, but cannot block the deletion of it.</p>\n    <p><b>Is it dangerous to copy the password into the clipboard? Later someone might get it...</b></p>\n    <p>No it isn't. Your password will stay in the clipboard for only 10 seconds, after the clipboard will be erased.</p>\n  </body>\n</html>\n");
        jTextPane1.setToolTipText("");
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPane1.setFocusable(false);
        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
