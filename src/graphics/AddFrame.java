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

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import passwordprotector.Encryptor;
import passwordprotector.Password;
import passwordprotector.PasswordFolder;
import passwordprotector.Serializer;

public class AddFrame extends javax.swing.JFrame {
    
    private  PasswordInformationPanel pip = new PasswordInformationPanel(); 
    private StorageInformationPanel sip = new StorageInformationPanel();      
    
    Encryptor enc = new Encryptor();
    Serializer ser = new Serializer();
    
    public AddFrame() {
        initComponents();
        this.setTitle("Password Information & Storage");

        this.initPasswordPanel();
        this.initStoragePanel();
        
        pip.setVisible(true);
        sip.setVisible(false);
        jButton3.show(false);
        
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        Image image = new ImageIcon("src/img/lock.png").getImage();
        this.setIconImage(image);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(410, 400));

        jButton1.setText("Next ->");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton3.setText("<- Back");
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(69, 69, 69)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(338, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.specialDispose();    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jButton1.getText().equals("Next ->")) {
            // first input check
            switch (pip.getProblems()) {
                case 4:
                    // psw will not crypted?!
                    int h = JOptionPane.showConfirmDialog(rootPane, "The password will not encrypted,\nso everyone can easly read it.\nAre you sure?", "Are you sure?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    // h == 0, YES
                    // h == 1, NO
                    if (h == 1) {
                        break;
                    }
                // else go to case 0:
                case 0:
                    // all is good
                    pip.setVisible(false);
                    sip.setVisible(true);
                    jButton1.setText("Save");
                    jButton3.setVisible(true);
                    break;
                case 1:                
                    // no password/s inserted
                    JOptionPane.showMessageDialog(rootPane, "Please insert both passwords!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
                case 2:
                    // passwords don't match
                    JOptionPane.showMessageDialog(rootPane, "The passwords inserted don't match!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
                case 3:
                    // no description
                    JOptionPane.showMessageDialog(rootPane, "Please fill description field!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;                
            }            
        }
        else {
            // second input check
            switch (sip.getProblems()) {
                case 0:
                    // all is good
                    
                    // create a new Object Password
                    Password pswUnencrypted = new Password(pip.getUsername(), pip.getEmail(), pip.getDescription(), pip.getWebsite(), pip.getPassword(), pip.getEncryptedFields());
                    
                    // encrypt the password
                    Password pswCrypted = enc.encryptThisPassword(pswUnencrypted, sip.getPassphrase());

                    // get the path of the file
                    String path = sip.getPath();
                    
                    if (sip.getAction()) {
                        // add to existing PasswordFolder
                        if (ser.addToExisting(pswCrypted, path)) {
                            JOptionPane.showMessageDialog(rootPane, "Successfully added a new Password in:\n" + path + "\n\nRemember to store a copy of your\nPasswordFolder in a safe place.", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                            this.specialDispose();
                        }
                        else {
                            JOptionPane.showMessageDialog(rootPane, "Cannot add new Password in:\n!" + path, "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else {
                        // create a new PasswordFolder
                        PasswordFolder passfold = new PasswordFolder();
                        passfold.add(pswCrypted);
                        
                        if (ser.createNew(passfold, path)) {
                            JOptionPane.showMessageDialog(rootPane, "Successfully created a new PasswordFolder in:\n" + path + "\n\nRemember to store a copy of your\nPasswordFolder in a safe place.", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                            this.specialDispose();
                        }
                        else {
                            JOptionPane.showMessageDialog(rootPane, "Cannot create a new PasswordFolder!", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;
                case 1:
                    // no passphrases inserted
                    JOptionPane.showMessageDialog(rootPane, "Please insert both passphrases!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;                    
                case 2:
                    // passwords don't match
                    JOptionPane.showMessageDialog(rootPane, "The passphrases inserted don't match!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;              
                case 3:
                    // passphrase too short
                    JOptionPane.showMessageDialog(rootPane, "The passphrase inserted is too short!\nUse at least 8 characters.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
                case 4:  
                    // no file1 selected
                    JOptionPane.showMessageDialog(rootPane, "Please select a .pf file!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;                    
                case 5:                    
                    // no file2 selected
                    JOptionPane.showMessageDialog(rootPane, "Please select the destination folder!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;  
            }
        }
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        sip.setVisible(false);
        pip.setVisible(true);
        jButton3.setVisible(false);
        jButton1.setText("Next ->");        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void initPasswordPanel () {
        this.setLayout(new BorderLayout());
        this.add(pip);
        this.pack();
    }
    
    private void initStoragePanel () {        
        this.setLayout(new BorderLayout());
        this.add(sip);
        this.pack();
    }
        
    private void specialDispose () {
        this.dispose();
        this.pip.setVisible(true);
        this.sip.setVisible(false);
        jButton3.setVisible(false);
        jButton1.setText("Next ->");  
        pip.resetFields();
        sip.resetFields();
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
