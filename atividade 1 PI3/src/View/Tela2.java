package View;

/**
 *
 * @author Izaura
 */
public class Tela2 extends javax.swing.JFrame {

    public Tela2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jblhcid = new javax.swing.JLabel();
        jtftexto1 = new javax.swing.JTextField();
        jtftexto2 = new javax.swing.JTextField();
        jtftexto3 = new javax.swing.JTextField();
        btnclique = new javax.swing.JButton();
        btnvoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jblhcid.setBackground(new java.awt.Color(204, 204, 255));
        jblhcid.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jblhcid.setForeground(new java.awt.Color(0, 0, 0));
        jblhcid.setText("HustinCollabe Imóveis - A sua Imobiliária Digital");

        jtftexto1.setBackground(new java.awt.Color(204, 204, 255));
        jtftexto1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jtftexto1.setForeground(new java.awt.Color(0, 0, 0));
        jtftexto1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtftexto1.setText("Obrigada por entrar em contato conosco.");
        jtftexto1.setBorder(null);
        jtftexto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtftexto1ActionPerformed(evt);
            }
        });

        jtftexto2.setBackground(new java.awt.Color(204, 204, 255));
        jtftexto2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jtftexto2.setForeground(new java.awt.Color(0, 0, 0));
        jtftexto2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtftexto2.setText(" Em breve voce será direcionado(a) para o nosso whatsapp .");
        jtftexto2.setBorder(null);

        jtftexto3.setBackground(new java.awt.Color(204, 204, 255));
        jtftexto3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jtftexto3.setForeground(new java.awt.Color(0, 0, 0));
        jtftexto3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtftexto3.setText("Um de nossos consultores entrará em contato.");
        jtftexto3.setBorder(null);

        btnclique.setBackground(new java.awt.Color(255, 204, 204));
        btnclique.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnclique.setForeground(new java.awt.Color(204, 0, 0));
        btnclique.setText("Clique Aqui");
        btnclique.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnclique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncliqueActionPerformed(evt);
            }
        });

        btnvoltar.setBackground(new java.awt.Color(255, 204, 204));
        btnvoltar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnvoltar.setForeground(new java.awt.Color(204, 0, 0));
        btnvoltar.setText("Voltar");
        btnvoltar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jtftexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(btnclique, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jblhcid, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 80, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtftexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtftexto3, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jblhcid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jtftexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtftexto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jtftexto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(btnclique, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtftexto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtftexto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtftexto1ActionPerformed

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        Tela1 tela = new Tela1();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnvoltarActionPerformed

    private void btncliqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncliqueActionPerformed
        TelaCadastroCliente telacadastrocliente = new TelaCadastroCliente();
        telacadastrocliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncliqueActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclique;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblhcid;
    private javax.swing.JTextField jtftexto1;
    private javax.swing.JTextField jtftexto2;
    private javax.swing.JTextField jtftexto3;
    // End of variables declaration//GEN-END:variables
}
