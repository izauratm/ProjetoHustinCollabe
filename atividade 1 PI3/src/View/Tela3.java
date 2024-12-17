package View;

/**
 *
 * @author Izaura
 */
public class Tela3 extends javax.swing.JFrame {

    public Tela3() {
        initComponents();
                   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jblhcid = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtfcomercial = new javax.swing.JTextField();
        jtfbairro = new javax.swing.JTextField();
        jtfresidencial = new javax.swing.JTextField();
        jctresidencial = new javax.swing.JComboBox<>();
        jctcomercial = new javax.swing.JComboBox<>();
        jctbairro = new javax.swing.JComboBox<>();
        btnlimpar = new javax.swing.JButton();
        btnvoltar3 = new javax.swing.JButton();
        jtfvalor = new javax.swing.JTextField();
        jctvalor = new javax.swing.JComboBox<>();
        jblencontre = new javax.swing.JLabel();
        btncontateconsultor = new javax.swing.JButton();
        jtfresposta = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jblcontato = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jblhcid.setBackground(new java.awt.Color(204, 204, 255));
        jblhcid.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jblhcid.setForeground(new java.awt.Color(0, 0, 0));
        jblhcid.setText("HustinCollabe Imóveis - A sua Imobiliária Digital");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jtfcomercial.setBackground(new java.awt.Color(255, 204, 204));
        jtfcomercial.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jtfcomercial.setForeground(new java.awt.Color(0, 0, 0));
        jtfcomercial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfcomercial.setText("Comercial");
        jtfcomercial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtfcomercial.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfcomercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfcomercialActionPerformed(evt);
            }
        });

        jtfbairro.setBackground(new java.awt.Color(255, 204, 204));
        jtfbairro.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jtfbairro.setForeground(new java.awt.Color(0, 0, 0));
        jtfbairro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfbairro.setText("Bairro");
        jtfbairro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtfbairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfbairroActionPerformed(evt);
            }
        });

        jtfresidencial.setBackground(new java.awt.Color(255, 204, 204));
        jtfresidencial.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jtfresidencial.setForeground(new java.awt.Color(0, 0, 0));
        jtfresidencial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfresidencial.setText("Residencial");
        jtfresidencial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtfresidencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfresidencialActionPerformed(evt);
            }
        });

        jctresidencial.setBackground(new java.awt.Color(255, 204, 204));
        jctresidencial.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jctresidencial.setForeground(new java.awt.Color(0, 0, 0));
        jctresidencial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apartamento", "Apartamento Garden", "Cobertura", "Loft", "Casa", "Studio", "Lote em Condomínio" }));
        jctresidencial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jctresidencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jctresidencialActionPerformed(evt);
            }
        });

        jctcomercial.setBackground(new java.awt.Color(255, 204, 204));
        jctcomercial.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jctcomercial.setForeground(new java.awt.Color(0, 0, 0));
        jctcomercial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loja", "Sala", "Loft", "Studio", "Casa Comercial" }));
        jctcomercial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jctcomercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jctcomercialActionPerformed(evt);
            }
        });

        jctbairro.setBackground(new java.awt.Color(255, 204, 204));
        jctbairro.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jctbairro.setForeground(new java.awt.Color(0, 0, 0));
        jctbairro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azenha", "Auxliliadora", "Bela Vista", "BomFim", "Centro", "Chácara das Pedras", "Cidade Baixa", "Cristal", "Floresta", "Higienópolis", "Menino Deus", "Mont'Serrat", "Moinhos de Vento", "Petrópolis", "Rio Branco", "Santa Cecília", "Santana", "Teresópolis", "Tres Figueiras" }));
        jctbairro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jctbairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jctbairroActionPerformed(evt);
            }
        });

        btnlimpar.setBackground(new java.awt.Color(255, 204, 204));
        btnlimpar.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        btnlimpar.setForeground(new java.awt.Color(204, 0, 0));
        btnlimpar.setText("LImpar Dados");
        btnlimpar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });

        btnvoltar3.setBackground(new java.awt.Color(255, 204, 204));
        btnvoltar3.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btnvoltar3.setForeground(new java.awt.Color(0, 0, 0));
        btnvoltar3.setText("Voltar");
        btnvoltar3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnvoltar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltar3ActionPerformed(evt);
            }
        });

        jtfvalor.setBackground(new java.awt.Color(255, 204, 204));
        jtfvalor.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jtfvalor.setForeground(new java.awt.Color(0, 0, 0));
        jtfvalor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfvalor.setText("Valor");
        jtfvalor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtfvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfvalorActionPerformed(evt);
            }
        });

        jctvalor.setBackground(new java.awt.Color(255, 204, 204));
        jctvalor.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jctvalor.setForeground(new java.awt.Color(0, 0, 0));
        jctvalor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "R$ 150mil", "R$ 300mil", "R$ 450mil", "R$ 600mil", "R$ 750mil", "R$ 1000mil", "R$ 1500mil", "R$ 3000mil", "Sem Limite" }));
        jctvalor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jctvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jctvalorActionPerformed(evt);
            }
        });

        jblencontre.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jblencontre.setForeground(new java.awt.Color(0, 0, 0));
        jblencontre.setText("*  Encontre Seu Imóvel *");

        btncontateconsultor.setBackground(new java.awt.Color(255, 204, 204));
        btncontateconsultor.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        btncontateconsultor.setForeground(new java.awt.Color(0, 0, 0));
        btncontateconsultor.setText("Contate um Consultor");
        btncontateconsultor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncontateconsultor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontateconsultorActionPerformed(evt);
            }
        });

        jtfresposta.setBackground(new java.awt.Color(255, 255, 255));
        jtfresposta.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jtfresposta.setForeground(new java.awt.Color(0, 0, 0));
        jtfresposta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnbuscar.setBackground(new java.awt.Color(255, 204, 204));
        btnbuscar.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btnbuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnbuscar.setText("Buscar");
        btnbuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfresidencial)
                            .addComponent(jctresidencial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btncontateconsultor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnvoltar3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfcomercial, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jctcomercial, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jctbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(jctvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtfbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jtfresposta))
                .addGap(37, 37, 37))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jblencontre, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jblencontre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfresidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfcomercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jctresidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jctcomercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jctbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jctvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfresposta, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnvoltar3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncontateconsultor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        jblcontato.setBackground(new java.awt.Color(204, 204, 255));
        jblcontato.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jblcontato.setForeground(new java.awt.Color(204, 0, 51));
        jblcontato.setText("Entre em Contato: 4099-9999");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("A plataforma digital para soluções imobiliárias que está sempre ao seu lado, ");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText(" com uma equipe especializada no que é importante pra você!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jblhcid, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jblcontato, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(85, 85, 85)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jblhcid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jblcontato, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
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

    private String residencialSelecionado = "";
    private String comercialSelecionado = "";
    private String bairroSelecionado = "";
    private String valorSelecionado = "";

    
    private void jtfcomercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfcomercialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfcomercialActionPerformed

    private void jtfbairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfbairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfbairroActionPerformed

    private void btncontateconsultorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontateconsultorActionPerformed
        Tela2 tela = new Tela2();
        boolean b = false;
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncontateconsultorActionPerformed

    private void jtfresidencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfresidencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfresidencialActionPerformed

    private void jctresidencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jctresidencialActionPerformed
        residencialSelecionado = (String) jctresidencial.getSelectedItem();
        switch (residencialSelecionado) {
            case "Apartamento":
            break;
            case "Apartamento Garden":
            break;
            case "Apartamento Luxo":
            break;    
            case "Cobertura":
            break;
            case "Loft":
            break;
            case "Casa":
            break;
            case "Studio":
            break;
            case "Lote em Condominio":
            break;
            case "Condominio Residencial":
            break;            
            default:}           
    }//GEN-LAST:event_jctresidencialActionPerformed
    private void jctcomercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jctcomercialActionPerformed
        comercialSelecionado = (String) jctcomercial.getSelectedItem();
        switch (comercialSelecionado) {
            case "Loja":
            break;
            case "Sala":
            break;
            case "Loft":
            break;
            case "Studio":
            break;
            case "Casa Comercial":
            break;  }  
    }//GEN-LAST:event_jctcomercialActionPerformed

    private void jctbairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jctbairroActionPerformed
       bairroSelecionado = (String) jctbairro.getSelectedItem();  
       switch (bairroSelecionado) {
            case "Azenha":
            break;
            case "Auxiliadora":
            break;
            case "Bela Vista":
            break;
            case "BomFim":
            break;
            case "Centro":
            break;
            case "Chácara das Pedras":
            break;   
            case "Cidade Baixa":
            break;
            case "Cristal":
            break;
            case "Floresta":
            break;
            case "Higienópolis":
            break;
            case "Menino Deus":
            break;
            case "Mont'Serrat":
            break;   
            case "Moinhos de Vento":
            break;   
            case "Petrópolis":
            break;
            case "Rio Branco":
            break;
            case "Santa Cecilia":
            break;
            case "Santana":
            break;
            case "Teresópolis":
            break;
            case "Trres Figueiras":
            break;}
    }//GEN-LAST:event_jctbairroActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
          jtfresposta.setText("");
    }//GEN-LAST:event_btnlimparActionPerformed

    private void btnvoltar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltar3ActionPerformed
        Tela1 tela = new Tela1();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnvoltar3ActionPerformed
    private void jtfvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfvalorActionPerformed
        
    }//GEN-LAST:event_jtfvalorActionPerformed

    private void jctvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jctvalorActionPerformed
        valorSelecionado = (String) jctvalor.getSelectedItem();
        switch (valorSelecionado) {
            case "150mil":
            break;
            case "300mil":
            break;
            case "450mil":
            break;
            case "600mil":
            break;
            case "750mil":
            break;
            case "1000mil":
            break;
            case "1500mil":
            break;
            case "3000mil":
            break; 
            case "Sem Limite":
            break;
        } 
    }//GEN-LAST:event_jctvalorActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
       String resposta = "";

    if (!residencialSelecionado.isEmpty() && !comercialSelecionado.isEmpty()){
        residencialSelecionado = ""; // Limpa o valor de residencialSelecionado se houver seleção
    }

    if (!residencialSelecionado.isEmpty()) {
        resposta += "Residencial: " + residencialSelecionado + "\n";
    }

    if (!comercialSelecionado.isEmpty()) {
        resposta += "Comercial: " + comercialSelecionado + "\n";
    }

    if (!bairroSelecionado.isEmpty()) {
        resposta += "Bairro: " + bairroSelecionado + "\n";
    }

    if (!valorSelecionado.isEmpty()) {
        resposta += "Valor: R$ " + valorSelecionado;
    }

    if (resposta.isBlank()) {
        resposta = "Nenhuma seleção feita.";
    }
    
    jtfresposta.setText(resposta);

    }//GEN-LAST:event_btnbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncontateconsultor;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JButton btnvoltar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jblcontato;
    private javax.swing.JLabel jblencontre;
    private javax.swing.JLabel jblhcid;
    private javax.swing.JComboBox<String> jctbairro;
    private javax.swing.JComboBox<String> jctcomercial;
    private javax.swing.JComboBox<String> jctresidencial;
    private javax.swing.JComboBox<String> jctvalor;
    private javax.swing.JTextField jtfbairro;
    private javax.swing.JTextField jtfcomercial;
    private javax.swing.JTextField jtfresidencial;
    private javax.swing.JTextField jtfresposta;
    private javax.swing.JTextField jtfvalor;
    // End of variables declaration//GEN-END:variables
}
