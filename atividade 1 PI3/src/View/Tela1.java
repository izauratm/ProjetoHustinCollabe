package View;

/**
 *
 * @author Izaura
 */
public class Tela1 extends javax.swing.JFrame {

    public Tela1() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jblhcid = new javax.swing.JLabel();
        jbtencontreimovel = new javax.swing.JButton();
        jbltitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtftelefone = new javax.swing.JTextField();
        btncontato = new javax.swing.JButton();
        jtfNome = new javax.swing.JTextField();
        jtfTelefone = new javax.swing.JTextField();
        jctipoimovel = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnlimpar = new javax.swing.JButton();
        jtfnome = new javax.swing.JTextField();
        jtftipoimovel = new javax.swing.JTextField();
        jtfemail = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtsair1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jblhcid.setBackground(new java.awt.Color(204, 204, 255));
        jblhcid.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jblhcid.setForeground(new java.awt.Color(0, 0, 0));
        jblhcid.setText("HustinCollabe Imóveis - A sua Imobiliária Digital");

        jbtencontreimovel.setBackground(new java.awt.Color(204, 204, 204));
        jbtencontreimovel.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jbtencontreimovel.setForeground(new java.awt.Color(0, 0, 0));
        jbtencontreimovel.setText("Encontre Seu Imóvel");
        jbtencontreimovel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtencontreimovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtencontreimovelActionPerformed(evt);
            }
        });

        jbltitulo.setBackground(new java.awt.Color(204, 204, 255));
        jbltitulo.setFont(new java.awt.Font("Arial Narrow", 0, 28)); // NOI18N
        jbltitulo.setForeground(new java.awt.Color(0, 0, 153));
        jbltitulo.setText("Imóveis em Porto Alegre, seja para voce morar ou para o seu negócio! ");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jtftelefone.setBackground(new java.awt.Color(255, 204, 204));
        jtftelefone.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jtftelefone.setForeground(new java.awt.Color(0, 0, 0));
        jtftelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtftelefone.setText("Telefone");
        jtftelefone.setBorder(null);
        jtftelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtftelefoneActionPerformed(evt);
            }
        });

        btncontato.setBackground(new java.awt.Color(255, 204, 204));
        btncontato.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btncontato.setForeground(new java.awt.Color(0, 0, 0));
        btncontato.setText("Contato");
        btncontato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncontato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontatoActionPerformed(evt);
            }
        });

        jtfNome.setBackground(new java.awt.Color(255, 204, 204));
        jtfNome.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jtfNome.setForeground(new java.awt.Color(0, 0, 0));
        jtfNome.setText(" ");
        jtfNome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtfTelefone.setBackground(new java.awt.Color(255, 204, 204));
        jtfTelefone.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jtfTelefone.setForeground(new java.awt.Color(0, 0, 0));
        jtfTelefone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jctipoimovel.setBackground(new java.awt.Color(255, 204, 204));
        jctipoimovel.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jctipoimovel.setForeground(new java.awt.Color(0, 0, 0));
        jctipoimovel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Para Morar", "Para Investir", "Para Trabalhar" }));
        jctipoimovel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jctipoimovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jctipoimovelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("*  Fale com nossos Consultores de Vendas! *");

        btnlimpar.setBackground(new java.awt.Color(255, 204, 204));
        btnlimpar.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btnlimpar.setForeground(new java.awt.Color(204, 0, 0));
        btnlimpar.setText("LImpar Dados");
        btnlimpar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });

        jtfnome.setBackground(new java.awt.Color(255, 204, 204));
        jtfnome.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jtfnome.setForeground(new java.awt.Color(0, 0, 0));
        jtfnome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfnome.setText("Seu Nome");
        jtfnome.setBorder(null);
        jtfnome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfnomeActionPerformed(evt);
            }
        });

        jtftipoimovel.setBackground(new java.awt.Color(255, 204, 204));
        jtftipoimovel.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jtftipoimovel.setForeground(new java.awt.Color(0, 0, 0));
        jtftipoimovel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtftipoimovel.setText("Tipo de Imóvel");
        jtftipoimovel.setBorder(null);
        jtftipoimovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtftipoimovelActionPerformed(evt);
            }
        });

        jtfemail.setBackground(new java.awt.Color(255, 204, 204));
        jtfemail.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jtfemail.setForeground(new java.awt.Color(0, 0, 0));
        jtfemail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfemail.setText("Email");
        jtfemail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtfemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfemailActionPerformed(evt);
            }
        });

        jtfEmail.setBackground(new java.awt.Color(255, 204, 204));
        jtfEmail.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jtfEmail.setForeground(new java.awt.Color(0, 0, 0));
        jtfEmail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jctipoimovel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtftipoimovel)
                            .addComponent(jtfemail))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfnome, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtftelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btncontato, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfnome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtftipoimovel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtftelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jctipoimovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncontato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfemail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(btnlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("HustinCollabe Imóveis * A Sua Imobiliária Digital!");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Somos pioneiros na plataforma digital para soluções imobiliárias, com uma equipe especializada no que é importante para voce: ");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("realizar o sonho da compra do imóvel residencial ou para o seu negócio!");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("A HustinCollabe Imóveis tem a a solução para cada necessidade, porque o que é importante para voce, para nós é prioridade!!");

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("Entre em Contato: 4099-9999");

        jbtsair1.setBackground(new java.awt.Color(255, 204, 204));
        jbtsair1.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jbtsair1.setForeground(new java.awt.Color(204, 0, 0));
        jbtsair1.setText("SAIR");
        jbtsair1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtsair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtsair1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jblhcid, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbtencontreimovel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtsair1)
                                .addGap(51, 51, 51)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblhcid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jbtencontreimovel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtsair1)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfnomeActionPerformed

    private void jtftelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtftelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtftelefoneActionPerformed

    private void jtfemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfemailActionPerformed

    private void jtftipoimovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtftipoimovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtftipoimovelActionPerformed

    private void btncontatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontatoActionPerformed
        Tela2 tela = new Tela2();
        boolean b = false;
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncontatoActionPerformed

    private void jctipoimovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jctipoimovelActionPerformed
      String tipoSelecionado = (String) jctipoimovel.getSelectedItem();

    switch (tipoSelecionado) {
        case "Para Morar":
            // Escolha "Para Morar"
            break;
        case "Para Investir":
            // Escolha "Para Investir"
            break;
        case "Para Trabalhar":
            // Escolha "Para Trabalhar"
            break;
        default:
            // Em caso de seleção inválida ou padrão
    }         
    }//GEN-LAST:event_jctipoimovelActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
           jtfNome.setText("");
           jtfTelefone.setText("");
           jtfEmail.setText("");
    }//GEN-LAST:event_btnlimparActionPerformed

    private void jbtencontreimovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtencontreimovelActionPerformed
         Tela3 tela = new Tela3();
        boolean b = false;
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtencontreimovelActionPerformed

    private void jbtsair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsair1ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jbtsair1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncontato;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jblhcid;
    private javax.swing.JLabel jbltitulo;
    private javax.swing.JButton jbtencontreimovel;
    private javax.swing.JButton jbtsair1;
    private javax.swing.JComboBox<String> jctipoimovel;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfTelefone;
    private javax.swing.JTextField jtfemail;
    private javax.swing.JTextField jtfnome;
    private javax.swing.JTextField jtftelefone;
    private javax.swing.JTextField jtftipoimovel;
    // End of variables declaration//GEN-END:variables
}
