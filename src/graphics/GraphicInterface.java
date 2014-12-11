
package graphics;

import java.io.File;
import java.util.Vector;
import javax.swing.JOptionPane;
import passwordprotector.Encryptor;
import passwordprotector.Password;
import passwordprotector.PasswordFolder;
import passwordprotector.Serializer;

public class GraphicInterface extends javax.swing.JFrame {

    Encryptor enc = new Encryptor();
    Serializer ser = new Serializer();
    AddFrame af = new AddFrame();
    AboutFrame ab = new AboutFrame();
    OpenDialog od = new OpenDialog(this,true);
    PasswordDetailsDialog pdd = new PasswordDetailsDialog(this, true);
    
    PasswordFolder decrypted = null;
    Object[] openData = new Object[2];
    
    File currentOpened = null;
    String currentPassphrase = null;
    
    public GraphicInterface() {
        initComponents();
        this.setTitle("Password Protector");        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setText("Password Protector");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lock.png"))); // NOI18N
        jLabel2.setText(" ");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Show details of selected item");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Action");

        jMenuItem1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem1.setText("<html><b>New</b> Password</html>");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem2.setText("<html><b>Open</b> Password Folder</html>");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem7.setText("<html><b>Change</b> Passphrase</html>");
        jMenu1.add(jMenuItem7);
        jMenu1.add(jSeparator4);

        jMenuItem3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem3.setText("<html><b>Close</b> Password Folder</html>");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jMenu1.add(jSeparator2);
        jMenu1.add(jSeparator5);

        jMenuItem6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem6.setText("<html><b>Delete</b> Password Folder</html>");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem5.setText("Help (todo)");
        jMenu2.add(jMenuItem5);

        jMenuItem4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem4.setText("About");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        af.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.openData = od.showAndReturn();  
        // openData[0] --> file
        // openData[1] --> passpharse
        if ((openData[0] != null) && (openData[1] != null)) {
            this.currentOpened = (File) openData[0];
            this.currentPassphrase = (String) openData[1];
            
            this.decrypted = enc.decryptThisFile(currentOpened, currentPassphrase);
            if (decrypted.size() < 1) {
                JOptionPane.showMessageDialog(rootPane, "The PasswordFolder selected is empty!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else {
                this.setList(decrypted);
            }            
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selected = jList1.getSelectedIndex();
        
        if (selected == -1) {
            // nothing selected
            JOptionPane.showMessageDialog(rootPane, "Cannot show details!\nFirst make sure a PasswordFolder is currently open,\nthen select an item to show its details.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if ((jList1.getMinSelectionIndex() - jList1.getMaxSelectionIndex()) != 0) {
            // multiple selected
            JOptionPane.showMessageDialog(rootPane, "Please select only one element!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else {
            // show selected
            Object[] decision = pdd.showAndReturn(decrypted.get(selected));
            
            /* decision:
            **  delete --> [false][false]
            **  closed --> [false][true]
            **  new psw -->[true][Password]
            */
            if (!(boolean)decision[0]) {
                if ((boolean)decision[1]) {
                    // closed action
                }
                else {
                    // deleted action
                    decrypted.remove(selected);
                    
                   this.setDecisionFileAndGUI();
                }
            }
            else {
                if (decision[1] != null) {                    
                    // saved action, replace the old Password with the new one                                                         
                    Password saved = (Password) decision[1];
                    decrypted.set(selected, saved);
                    
                    this.setDecisionFileAndGUI();
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.closePassFold();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // delete currently opened PasswordFolder
        if (this.currentOpened != null) {                    
            int k = JOptionPane.showConfirmDialog(rootPane, "Do you really want delete this PasswordFolder?\nAll the Password stored in it will be deleted.\nThis action cannot be undone.", "Are you sure?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (k == 0) {
                this.currentOpened.delete();
                this.closePassFold();
                JOptionPane.showMessageDialog(rootPane, "Successfully deleted!", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
            }  
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Cannot delete!\nFirst make sure a PasswordFolder is currently open.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ab.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    
    private void setList (PasswordFolder passfold) {
        if (passfold != null) {
            String s[] = new String[passfold.size()];            
            for (int i = 0; i < s.length; i++) {
                s[i] = (String) passfold.get(i).getInfo(2);
            }            
            jList1.setListData(s);
        }
    }
    
    private void setDecisionFileAndGUI () {
        PasswordFolder crypted = new PasswordFolder();
        // encrypting decrypted passwordfolder
        for (int i = 0; i < decrypted.size(); i++) {
            crypted.add(enc.encryptThisPassword(decrypted.get(i), this.currentPassphrase));
        }
        ser.createNew(crypted, this.currentOpened.getAbsolutePath());
                                        
        this.setList(decrypted);
    }
    
    private void closePassFold () {
        jList1.setListData(new Vector());
        currentOpened = null;
        currentPassphrase = null;
        decrypted = null;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
