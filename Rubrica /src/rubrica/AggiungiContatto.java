package rubrica;

public class AggiungiContatto extends javax.swing.JFrame {

    public AggiungiContatto() {
        initComponents();
        this.setTitle("Aggiungi contatto");
        n_nome = 0;
        n_cognome = 0;
        n_tel = 0;
        n_c = 0;
    }
    
    int n_nome;
    int n_cognome;
    int n_tel;
    int n_c;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        cognome = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        aggiungi = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Cognome");

        jLabel3.setText("Telefono");

        jLabel4.setText("Contatto");

        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeKeyReleased(evt);
            }
        });

        cognome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cognomeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cognomeKeyReleased(evt);
            }
        });

        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telKeyReleased(evt);
            }
        });

        c.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cKeyReleased(evt);
            }
        });

        aggiungi.setText("Aggiungi");
        aggiungi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Annulla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(nome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(cognome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(c))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aggiungi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aggiungi)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aggiungiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungiActionPerformed
        Rubrica.r.addContact(new Contatto(nome.getText(), cognome.getText(), tel.getText(), c.getText()), c.getText());
        Rubrica.r.save();
        Rubrica.r.loadJList();
        Rubrica.window.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_aggiungiActionPerformed

    private void nomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyPressed
        if (!(((evt.getKeyCode()>=65) && (evt.getKeyCode()<=90)) || (evt.getKeyCode()>=97 && (evt.getKeyCode()<=122)) || (evt.getKeyCode()==32) || (evt.getKeyCode()==8) || (evt.getKeyCode()==16) || (evt.getKeyCode()==17) || (evt.getKeyCode()==20))){
            n_nome++;
        }
    }//GEN-LAST:event_nomeKeyPressed

    private void nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyReleased
        for (int i=0; i<n_nome; i++){
            nome.setText(nome.getText().substring(0, nome.getText().length()-1));
        }
        n_nome = 0;
    }//GEN-LAST:event_nomeKeyReleased

    private void cognomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cognomeKeyPressed
        if (!(((evt.getKeyCode()>=65) && (evt.getKeyCode()<=90)) || (evt.getKeyCode()>=97 && (evt.getKeyCode()<=122)) || (evt.getKeyCode()==32) || (evt.getKeyCode()==8) || (evt.getKeyCode()==16)  || (evt.getKeyCode()==17) || (evt.getKeyCode()==20))){
            n_cognome++;
        }
    }//GEN-LAST:event_cognomeKeyPressed

    private void cognomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cognomeKeyReleased
        for (int i=0; i<n_cognome; i++){
            cognome.setText(cognome.getText().substring(0, cognome.getText().length()-1));
        }
        n_cognome = 0;
    }//GEN-LAST:event_cognomeKeyReleased

    private void telKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyPressed
        if (!(((evt.getKeyCode()>=48) && (evt.getKeyCode()<=57)) || (evt.getKeyChar()=='+') || (evt.getKeyCode()==8) || (evt.getKeyCode()==16) || (evt.getKeyCode()==17) || (evt.getKeyCode()==20))){
            n_tel++;
        }
    }//GEN-LAST:event_telKeyPressed

    private void telKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyReleased
        for (int i=0; i<n_tel; i++){
            tel.setText(tel.getText().substring(0, tel.getText().length()-1));
        }
        n_tel = 0;
    }//GEN-LAST:event_telKeyReleased

    private void cKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cKeyPressed
        if (evt.getKeyChar()=='|'){
            n_c++;
        }
    }//GEN-LAST:event_cKeyPressed

    private void cKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cKeyReleased
        for (int i=0; i<n_c; i++){
            c.setText(c.getText().substring(0, c.getText().length()-1));
        }
        n_c = 0;
    }//GEN-LAST:event_cKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Rubrica.window.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Rubrica.window.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiungi;
    private javax.swing.JTextField c;
    private javax.swing.JTextField cognome;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}