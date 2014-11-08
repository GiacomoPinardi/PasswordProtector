
package passwordprotector;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class AddFrame extends javax.swing.JFrame {
    
    PasswordInformationPanel pip = new PasswordInformationPanel(); 
    StorageInformationPanel sip = new StorageInformationPanel();      
    
    public AddFrame() {
        initComponents();
        
        this.initPasswordPanel();
        this.initStoragePanel();
        
        pip.setVisible(true);
        sip.setVisible(false);
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
                .addContainerGap(313, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch (pip.getProblems()) {
            case 0:
                // all is good
                pip.setVisible(false);
                sip.setVisible(true);
                jButton1.setText("Save");
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
                // no username and email
                JOptionPane.showMessageDialog(rootPane, "Please fill username or email field!", "ERROR", JOptionPane.ERROR_MESSAGE);
                break;
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        sip.setVisible(false);
        pip.setVisible(true);
        jButton1.setText("Next ->");        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void initPasswordPanel () {
        this.setLayout(new BorderLayout());
        //this.add(pip, BorderLayout.CENTER);
        this.add(pip);
        this.pack();
        this.setTitle("Password Protector - Password Info");
    }
    
    private void initStoragePanel () {        
        this.setLayout(new BorderLayout());
        //this.add(pip, BorderLayout.CENTER);
        this.add(sip);
        this.pack();
        this.setTitle("Password Protector - Storage Info");
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
