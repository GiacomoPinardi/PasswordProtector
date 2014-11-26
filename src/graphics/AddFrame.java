
package graphics;

import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import passwordprotector.Encryptor;
import passwordprotector.Password;
import passwordprotector.PasswordFolder;

public class AddFrame extends javax.swing.JFrame {
    
    private  PasswordInformationPanel pip = new PasswordInformationPanel(); 
    private StorageInformationPanel sip = new StorageInformationPanel();      
    
    private FileOutputStream fileOut = null;
    private FileInputStream fileIn = null;
    private ObjectOutputStream outObj = null;
    private ObjectInputStream inObj = null;
    
    Encryptor enc = new Encryptor();
    
    public AddFrame() {
        initComponents();
        this.setTitle("Password Information & Storage");

        this.initPasswordPanel();
        this.initStoragePanel();
        
        pip.setVisible(true);
        sip.setVisible(false);
        jButton3.show(false);
        
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addGap(60, 60, 60)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(333, Short.MAX_VALUE)
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
                    Password pswUnencrypted = new Password(pip.getUsername(), pip.getEmail(), pip.getDescription(), pip.getWebsite(), pip.getPassword());
                    
                    // encrypt the password
                    Password pswCrypted = enc.encryptThisPassword(pswUnencrypted, sip.getPassphrase());

                    // get the path of the file
                    String path = sip.getPath();
                    
                    if (sip.getAction()) {
                        // add to existing PasswordFolder
                        if (this.addToExisting(pswCrypted, path)) {
                            JOptionPane.showMessageDialog(rootPane, "Successfully added a new Password in:\n" + path, "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                            this.specialDispose();
                        }
                        else {
                            JOptionPane.showMessageDialog(rootPane, "Can not add new Password in:\n!" + path, "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else {
                        // create a new PasswordFolder
                        PasswordFolder passfold = new PasswordFolder();
                        passfold.add(pswCrypted);
                        
                        if (this.createNew(passfold, path)) {
                            JOptionPane.showMessageDialog(rootPane, "Successfully created a new PasswordFolder in:\n" + path, "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                            this.specialDispose();
                        }
                        else {
                            JOptionPane.showMessageDialog(rootPane, "Can not create a new PasswordFolder!", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;
                case 1:
                    // no file1 selected
                    JOptionPane.showMessageDialog(rootPane, "Please select a .pf file!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
                case 2:
                    // no file2 selected
                    JOptionPane.showMessageDialog(rootPane, "Please select the destination folder!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
                case 3:
                    // no passphrase insterted
                    JOptionPane.showMessageDialog(rootPane, "Please insert the passphrase!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
                case 4:
                    // no password/s inserted
                    JOptionPane.showMessageDialog(rootPane, "Please insert both passphrases!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
                case 5:
                    // passwords don't match
                    JOptionPane.showMessageDialog(rootPane, "The passphrases inserted don't match!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
                case 6:
                    // passphrase too short
                    JOptionPane.showMessageDialog(rootPane, "The passphrase inserted is too short!\nUse at least 8 characters.", "ERROR", JOptionPane.ERROR_MESSAGE);
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
        //this.add(pip, BorderLayout.CENTER);
        this.add(pip);
        this.pack();
    }
    
    private void initStoragePanel () {        
        this.setLayout(new BorderLayout());
        //this.add(pip, BorderLayout.CENTER);
        this.add(sip);
        this.pack();
    }
    
    private boolean addToExisting (Password p, String location) {
        try {  
            fileIn = new FileInputStream(location);
            inObj = new ObjectInputStream(fileIn);
            
            PasswordFolder pf = (PasswordFolder) inObj.readObject();
            
            inObj.close();
            fileIn.close();
            
            pf.add(p);
            
            boolean b = this.createNew(pf, location);
            
            return (true && b);
        }
        catch (IOException | ClassNotFoundException ex) {
            return false;
        }
    }
    
    private boolean createNew (PasswordFolder pf, String location) {       
        try {
            fileOut = new FileOutputStream(location);
            outObj = new ObjectOutputStream(fileOut);
            outObj.writeObject(pf);
            outObj.close();
            fileOut.close();
            return true;
        }         
        catch (IOException ex) {            
            return false;
        }
        
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
