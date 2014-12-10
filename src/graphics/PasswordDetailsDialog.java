
package graphics;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import passwordprotector.Password;

public class PasswordDetailsDialog extends javax.swing.JDialog {
    
    private Object[] decision = new Object[2];
    private boolean saved;
    
    Clipboard clipboard = null;
    StringSelection selection = null;
    
    Timer t = new Timer();
    TimerTask tt = null;
    
    public PasswordDetailsDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Password Details");
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        jLabel3.setVisible(false);
        jPasswordField2.setVisible(false);
        
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextField1.setEditable(false);

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));

        jTextField4.setEditable(false);

        jTextField2.setEditable(false);

        jPasswordField1.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Password Details");

        jTextField3.setEditable(false);

        jButton1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton1.setText("Close");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Enable modification");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Save changes");
        jButton3.setEnabled(false);
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton4.setText("Description:");
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton5.setText("Website:");
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton6.setText("Username/ID:");
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton7.setText("E-mail:");
        jButton7.setFocusPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton8.setText("Password:");
        jButton8.setFocusPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel2.setText("Click an item to copy it to Clipboard");

        jButton9.setText("Delete this password");
        jButton9.setFocusPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Repeat Password:");

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel4.setText("Tick means crypted:");

        jCheckBox1.setEnabled(false);

        jCheckBox2.setEnabled(false);

        jCheckBox3.setEnabled(false);

        jCheckBox4.setEnabled(false);

        jCheckBox5.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9))
                            .addComponent(jLabel3)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton2)
                                            .addComponent(jButton9))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton4)))
                                    .addComponent(jCheckBox1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6))
                                    .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7))
                                    .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5)))
                            .addComponent(jCheckBox4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8)))
                    .addComponent(jCheckBox5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // delete this password 
        int k = JOptionPane.showConfirmDialog(rootPane, "Do you really want delete this Password?\nThis action cannot be undone.", "Are you sure?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (k == 0) {
            this.disposeAfterDeleting();
        }        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // close action        
        if (jLabel3.isVisible() && !this.saved) {
            int h = JOptionPane.showConfirmDialog(rootPane, "Your changes aren't saved.\nSave it before closing?", "Are you sure?", JOptionPane.YES_NO_CANCEL_OPTION);
            // h == 0, YES
            // h == 1, NO
            // h == 2, CANCEL
            if (h == 0) {
                if (this.saveChanges()) {
                    this.disposeClose();
                }
            }
            else if (h == 1) {
                this.disposeClose();
            }
        }
        else {
            this.disposeClose();
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.enableModification();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.saveChanges();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setClipboard(jTextField1.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setClipboard(jTextField4.getText());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setClipboard(jTextField2.getText());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setClipboard(jTextField3.getText());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.setClipboard(this.getPsw1());
        tt = new TimerTask() {
            @Override
            public void run() {
                setClipboard("");
            }
        };
        t.schedule(tt, 10000);
    }//GEN-LAST:event_jButton8ActionPerformed

    public Object[] showAndReturn (Password p) {        
        jTextField1.setText((String) p.getInfo(2));
        jTextField4.setText((String) p.getInfo(3));
        jTextField2.setText((String) p.getInfo(0));
        jTextField3.setText((String) p.getInfo(1)); 
        jPasswordField1.setText((String) p.getInfo(4));
        
        boolean[] ef = (boolean[]) p.getInfo(5);
        jCheckBox1.setSelected(ef[2]);
        jCheckBox2.setSelected(ef[0]);
        jCheckBox3.setSelected(ef[1]);
        jCheckBox4.setSelected(ef[3]);
        jCheckBox5.setSelected(ef[4]);
        
        this.saved = false;
        
        this.show();
        return decision;
    }
    
    private boolean saveChanges () {
        if (jTextField1.getText().equals("")) {
            // must fill description field
            JOptionPane.showMessageDialog(rootPane, "Cannot save!\nPlease fill description field!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if (this.getPsw1().equals("") || this.getPsw2().equals("")) {
            // psw1 == null || pasw2 == null
            JOptionPane.showMessageDialog(rootPane, "Cannot save!\nPlease insert both passwords!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if (!this.getPsw1().equals(this.getPsw2())) {
            // psw1 != psw2
            JOptionPane.showMessageDialog(rootPane, "Cannot save!\nThe passwords inserted don't match!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else {
            // all is good
            jPasswordField2.setText("");
            jButton2.setEnabled(true);
            this.saved = true;
            
            boolean[] ef = new boolean[5];
            ef[0] = jCheckBox2.isSelected();
            ef[1] = jCheckBox3.isSelected();
            ef[2] = jCheckBox1.isSelected();
            ef[3] = jCheckBox4.isSelected();
            ef[4] = jCheckBox5.isSelected();
            
            decision[0] = true;
            decision[1] = new Password(jTextField2.getText(), jTextField3.getText(), jTextField1.getText(), jTextField4.getText(), this.getPsw1(), ef);
            
            this.blockAll();
            
            return true;
        }
    }
    
    private void setClipboard(String s) {
        selection = new StringSelection(s);
        clipboard.setContents(selection, null);
    }
    
    private String getPsw1 () {        
        char c[] = jPasswordField1.getPassword();
        String s = "";
        for (int i = 0; i < c.length; i++) {
            s = s +c [i];
        }
        return s;
    }
    
    private String getPsw2 () {
        char c[] = jPasswordField2.getPassword();
        String s = "";
        for (int i = 0; i < c.length; i++) {
            s = s +c [i];
        }
        return s;
    }
    
    private void disposeAfterDeleting () {        
        decision[0] = false;
        decision[1] = false;
        
        this.resetFields();
        this.dispose();
    }
    
    private void disposeClose () {
        if (!this.saved) {
            // if saved, don't change decision
            decision[0] = false;
            decision[1] = true;
        }        
        
        this.resetFields();
        this.dispose();
    }
    
    private void enableModification () {
        this.saved = false;
        
        jTextField1.setEditable(true);
        jTextField4.setEditable(true);
        jTextField2.setEditable(true);
        jTextField3.setEditable(true);
        jPasswordField1.setEditable(true);
        jPasswordField2.setVisible(true);
        jLabel3.setVisible(true);
        
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        jCheckBox5.setEnabled(true);
        
        jButton2.setEnabled(false);
        jButton3.setEnabled(true);
    }
    
    private void blockAll () {
        jTextField1.setEditable(false);
        jTextField4.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false); 
        jPasswordField1.setEditable(false);        
        jPasswordField2.setVisible(false);
        jLabel3.setVisible(false);
        
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jCheckBox4.setEnabled(false);
        jCheckBox5.setEnabled(false);
                
        jButton2.setEnabled(true);
        jButton3.setEnabled(false);
    }
    
    private void resetFields () {
        jTextField1.setText("");
        jTextField4.setText("");
        jTextField2.setText("");
        jTextField3.setText(""); 
        jPasswordField1.setText("");        
        jPasswordField2.setText("");
                
        this.blockAll();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
