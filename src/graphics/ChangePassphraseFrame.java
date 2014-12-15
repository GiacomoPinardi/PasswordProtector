/*
 * The MIT License
 *
 * Copyright 2014 giacomo.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package graphics;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import passwordprotector.Encryptor;
import passwordprotector.PasswordFolder;
import passwordprotector.Serializer;

public class ChangePassphraseFrame extends javax.swing.JFrame {

    JFileChooser fc = null;
    FileFilter filter = null;
    
    Encryptor enc = new Encryptor();
    Serializer ser = new Serializer();
    
    File f1 = null;
    
    public ChangePassphraseFrame() {
        initComponents();
        this.setTitle("Change Passphrase");
        
        fc = new JFileChooser();
        fc.setAcceptAllFileFilterUsed(false);
        filter = new FileNameExtensionFilter(".pf file","pf");
        
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jPasswordField4 = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Change");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton3.setText("Cancel");
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Change Passphrase");

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));

        jButton2.setText("Select");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setText("Old Passphrase:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setText("Select .pf file:");

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel1.setText("<html>Select .pf file, then insert two time the old and the new Passphrase:</html>");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setText("Repeat old Passphrase:");

        jLabel12.setText("Repeat new Passphrase:");

        jLabel13.setText("New Passphrase:");

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        jLabel3.setText("<html>Keep your Passphrase in a safe place, without it you CANNOT access to the information stored in the PasswordFolder</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel9)
                        .addGap(104, 104, 104)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        fc.setFileFilter(filter);
        fc.showOpenDialog(this.getRootPane());
        f1 = fc.getSelectedFile();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String op = this.getOldPass();
        String rop = this.getRepeatOldPass();
        String np = this.getNewPass();
        String rnp = this.getRepeatNewPass();
        
        if (f1 != null) {
            // file chose
            if (op.equals("") || rop.equals("") || np.equals("") || rnp.equals("")) {
                // no passphrases inserted
                JOptionPane.showMessageDialog(rootPane, "Please insert all the passphrases!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else if (op.length() < 8 || rop.length() < 8 || np.length() < 8 || rnp.length() < 8) {
                // passphrases too short
                JOptionPane.showMessageDialog(rootPane, "The passphrase inserted is too short!\nUse at least 8 characters.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else if (!op.equals(rop)) {
                // old passphrase != repeat old passphrase
                JOptionPane.showMessageDialog(rootPane, "Old passphrases don't match!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else if (!np.equals(rnp)) {
                // new passphrase != repeat new passphrase
                JOptionPane.showMessageDialog(rootPane, "New passphrases don't match!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else if (np.equals(op)) {
                // new passphrase == old passphrase
                JOptionPane.showMessageDialog(rootPane, "New passphrase equals to the old one!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else {
                // all is good
                                                
                PasswordFolder cry = new PasswordFolder();
                String path = f1.getAbsolutePath();
                
                // file selected is decrypted with old passphrase
                PasswordFolder dec = enc.decryptThisFile(f1, op);
                                
                // 'dec' is encrypted using the new passphrase, then added to the encrypted PasswordFolder 'cry'
                for (int i = 0; i < dec.size(); i++) {
                    cry.add(enc.encryptThisPassword(dec.get(i), np));
                }
                
                // encrypted PasswordFolder is serialized and writed on disk
                if (ser.createNew(cry, path)) {
                    JOptionPane.showMessageDialog(rootPane, "Successfully changed PasswordFolder's passphrase!\n\nRemember to keep your new passphrase in a safe place.", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    // cannot create new PasswordFolder error
                    JOptionPane.showMessageDialog(rootPane, "Cannot change the PasswordFolder's passphrase!", "ERROR", JOptionPane.ERROR_MESSAGE);                        
                }                                          
                
                this.specialDispose();
            }
        }
        else {
            // no file chose
            JOptionPane.showMessageDialog(rootPane, "Please select a .pf file!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }                      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.specialDispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private String getOldPass () {
        char c[] = jPasswordField1.getPassword();
        String s = "";
        for (int i = 0; i < c.length; i++) {
            s = s + c[i];
        }
        return s;
    }
    
    private String getRepeatOldPass () {
        char c[] = jPasswordField2.getPassword();
        String s = "";
        for (int i = 0; i < c.length; i++) {
            s = s + c[i];
        }
        return s;
    }

    private String getNewPass () {
        char c[] = jPasswordField4.getPassword();
        String s = "";
        for (int i = 0; i < c.length; i++) {
            s = s + c[i];
        }
        return s;
    }
    
    private String getRepeatNewPass () {
        char c[] = jPasswordField3.getPassword();
        String s = "";
        for (int i = 0; i < c.length; i++) {
            s = s + c[i];
        }
        return s;
    }
    
    private void specialDispose() {
        f1 = null;
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        jPasswordField3.setText("");
        jPasswordField4.setText("");
        this.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
