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
        jTextPane1.setText("<html>\n  <body style=\"font-size:10px\">\n    <p><b>The information will be encrypted?<b></p>\n    <p>Yes, the information stored in the PasswordFolders will be encrypted using XOR cryptography. However the XOR cryptography is old and it cannot be hundred per cent safe.</p>\n    <p>FATTO: Le informazioni contenute nei PasswordFolder vengono criptate attraverso XOR, le informazioni quindi non vengono salvate in chiaro, ma la crittogravia attraverso XOR e' superata e non risulta sicura al 100%</p>\n    <p>To dissuade anyone from trying decrypting your information without the correct passphrase, you should encrypt the least possible data. So it's important to efficiently use the tick that permit you to decide what information will be encrypted.</p>    \n    <p>FATTO: Per scoraggiare chiunque cerchi di decrittare le informazioni senza la passphrase occorre criptare meno informazioni possibili. E' quindi importante utilizzare efficacemente le spunte che permettono di decidere quale informazioni criptare attraverso XOR</p>\n    <p>The XOR cryptography is incomprehensible proved (obviously without the right passphrase) when the information word length is equal to the passphrase word length.</p> \n    <p>FATTO: Infatti la crittografia attraverso XOR e' dimostrata indecifrabile (ovviamente in mancanza della passphrase) nel caso in cui la stringa da cifrare abbia la stessa lunghezza della passphrase</p> \n    <p><b>What influence have the password length and the passphrase lenght?</b></p>\n    <p><b>FATTO: Importanza della lunghezza della password e della passphrase</b></p>\n    <p>To protect the accounts and the informations stored in the PasswordFolders you should choose at least an eight character password composed with numbers, capital letters and symbols.</p>\n    <p>FATTO: Per proteggere gli accounts e le informazioni all'interno dei PasswordFolder e' necessario scegliere una password di adeguata lunghezza (sicuramente maggiore di 8 caratteri) e con l'utilizzo di numeri, maiuscole e caratteri speciali e di punteggiatura</p>\n    <p><b>Is necessary make a backup copy of my PasswordFolder?</b></p>\n    <p><b>FATTO: E' necessario tenere una copia di backup del PasswordFolder</b></p>\n    <p>Yes, a backup copy is strongly recomanded. To prevent your PasswordFolder form accidental and unauthorized deletion you should store a backup copy in a safe place.</p>\n    <p>FATTO: Si, e' assolutamente necessario. Per prevenire cancellazioni accidentali del PasswordFolder e anche cancellazioni volute da non autorizzati, mantenere una copia di backup in un posto sicuro</p>\n    <p>This software allow you to hide your information in the PasswordFolder, but cannot block the deletion of it.</p>\n    <p>FATTO: Questo software infatti permette di celare le informazioni in maniera tale da non poterle visualizzare, ma non puo' bloccare la cancellazione di queste ultime</p>\n    <p><b>Is danegrous copy the password into the clipboard? Later someone can get it...</b></p>\n    <p><b>FATTO: Copiare la password nella clipboard utilizzando l'apposito bottone non e' pericoloso poiche' qualcuno potrebbe successivamente ottenerla?</b></p>\n    <p>No it isn't. Your password will stay in the clipboard for only 10 seconds, after the clipboard will be erased.</p>\n    <p>No, la password rimarra' copiata nella clipboard solo per 10 secondi, al termine dei quali il contenuto della clipboard verra' cancellato.</p>\n  </body>\n</html>\n");
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
