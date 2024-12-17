package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Izaura
 */
public class TelaTransacao extends javax.swing.JFrame {

    public TelaTransacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtfhustinci = new javax.swing.JTextField();
        jblhustincol = new javax.swing.JLabel();
        jblnomecliente = new javax.swing.JLabel();
        jbldatavenda = new javax.swing.JLabel();
        jblvalorimovel = new javax.swing.JLabel();
        jblcondicaovenda = new javax.swing.JLabel();
        jblcomissao = new javax.swing.JLabel();
        btncalcularparcela = new javax.swing.JButton();
        txtnomecliente = new javax.swing.JTextField();
        txtdatavenda = new javax.swing.JTextField();
        txtresultado = new javax.swing.JTextField();
        txtvalorimovel = new javax.swing.JTextField();
        txtcondicaovenda = new javax.swing.JTextField();
        btnirpara = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jblnumparcela = new javax.swing.JLabel();
        btncalcularcomissao = new javax.swing.JButton();
        txtnumparcela = new javax.swing.JTextField();
        txtvalorparcela = new javax.swing.JTextField();
        jblsimulacao = new javax.swing.JLabel();
        jbltementrada = new javax.swing.JLabel();
        txtvalorentrada = new javax.swing.JTextField();
        jblvalorentrada = new javax.swing.JLabel();
        rbnsim = new javax.swing.JRadioButton();
        rbnnao = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        jtfhustinci.setBackground(new java.awt.Color(255, 204, 204));
        jtfhustinci.setFont(new java.awt.Font("Candara Light", 1, 26)); // NOI18N
        jtfhustinci.setForeground(new java.awt.Color(0, 0, 0));
        jtfhustinci.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfhustinci.setText("* HUSTINCOLLABE IMÓVEIS *");
        jtfhustinci.setBorder(null);

        jblhustincol.setFont(new java.awt.Font("Candara Light", 2, 12)); // NOI18N
        jblhustincol.setForeground(new java.awt.Color(0, 0, 0));
        jblhustincol.setText("HUSTINCOLLABE IMÒVEIS - A Sua Imobiliária Digital");

        jblnomecliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jblnomecliente.setForeground(new java.awt.Color(0, 0, 0));
        jblnomecliente.setText("Nome do Cliente :");

        jbldatavenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbldatavenda.setForeground(new java.awt.Color(0, 0, 0));
        jbldatavenda.setText("Data da Venda :");

        jblvalorimovel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jblvalorimovel.setForeground(new java.awt.Color(0, 0, 0));
        jblvalorimovel.setText("Valor do Imóvel :");

        jblcondicaovenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jblcondicaovenda.setForeground(new java.awt.Color(0, 0, 0));
        jblcondicaovenda.setText("Condição da Venda :");

        jblcomissao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jblcomissao.setForeground(new java.awt.Color(0, 0, 0));
        jblcomissao.setText("Comissão :");

        btncalcularparcela.setBackground(new java.awt.Color(204, 255, 204));
        btncalcularparcela.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btncalcularparcela.setForeground(new java.awt.Color(153, 0, 0));
        btncalcularparcela.setText("Calcular Valor das  Parcelas =>");
        btncalcularparcela.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncalcularparcela.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btncalcularparcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularparcelaActionPerformed(evt);
            }
        });

        txtnomecliente.setBackground(new java.awt.Color(204, 255, 204));
        txtnomecliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtnomecliente.setForeground(new java.awt.Color(0, 0, 0));
        txtnomecliente.setText(" ");
        txtnomecliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnomecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeclienteActionPerformed(evt);
            }
        });

        txtdatavenda.setBackground(new java.awt.Color(204, 255, 204));
        txtdatavenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtdatavenda.setForeground(new java.awt.Color(0, 0, 0));
        txtdatavenda.setText(" ");
        txtdatavenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtdatavenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdatavendaActionPerformed(evt);
            }
        });

        txtresultado.setBackground(new java.awt.Color(204, 255, 204));
        txtresultado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtresultado.setForeground(new java.awt.Color(0, 0, 0));
        txtresultado.setText(" ");
        txtresultado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresultadoActionPerformed(evt);
            }
        });

        txtvalorimovel.setBackground(new java.awt.Color(204, 255, 204));
        txtvalorimovel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtvalorimovel.setForeground(new java.awt.Color(0, 0, 0));
        txtvalorimovel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtvalorimovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorimovelActionPerformed(evt);
            }
        });

        txtcondicaovenda.setBackground(new java.awt.Color(204, 255, 204));
        txtcondicaovenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtcondicaovenda.setForeground(new java.awt.Color(0, 0, 0));
        txtcondicaovenda.setText(" ");
        txtcondicaovenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtcondicaovenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcondicaovendaActionPerformed(evt);
            }
        });

        btnirpara.setBackground(new java.awt.Color(204, 204, 255));
        btnirpara.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnirpara.setForeground(new java.awt.Color(0, 0, 0));
        btnirpara.setText("IR PARA");
        btnirpara.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnirpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnirparaActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(204, 0, 0));
        btnLimpar.setText("LIMPAR DADOS");
        btnLimpar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jblnumparcela.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jblnumparcela.setForeground(new java.awt.Color(0, 0, 0));
        jblnumparcela.setText("Número de Parcelas :");

        btncalcularcomissao.setBackground(new java.awt.Color(204, 255, 204));
        btncalcularcomissao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btncalcularcomissao.setForeground(new java.awt.Color(153, 0, 0));
        btncalcularcomissao.setText("Calcular=>");
        btncalcularcomissao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncalcularcomissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularcomissaoActionPerformed(evt);
            }
        });

        txtnumparcela.setBackground(new java.awt.Color(204, 255, 204));
        txtnumparcela.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtnumparcela.setForeground(new java.awt.Color(0, 0, 0));
        txtnumparcela.setText(" ");
        txtnumparcela.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnumparcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumparcelaActionPerformed(evt);
            }
        });

        txtvalorparcela.setBackground(new java.awt.Color(204, 255, 204));
        txtvalorparcela.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtvalorparcela.setForeground(new java.awt.Color(0, 0, 0));
        txtvalorparcela.setText(" ");
        txtvalorparcela.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtvalorparcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorparcelaActionPerformed(evt);
            }
        });

        jblsimulacao.setBackground(new java.awt.Color(204, 153, 255));
        jblsimulacao.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jblsimulacao.setForeground(new java.awt.Color(51, 0, 255));
        jblsimulacao.setText("SIMULAR FINANCIAMENTO");

        jbltementrada.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbltementrada.setForeground(new java.awt.Color(0, 0, 0));
        jbltementrada.setText("Tem Valor Entrada :");

        txtvalorentrada.setBackground(new java.awt.Color(204, 255, 204));
        txtvalorentrada.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtvalorentrada.setForeground(new java.awt.Color(0, 0, 0));
        txtvalorentrada.setText(" ");
        txtvalorentrada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtvalorentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorentradaActionPerformed(evt);
            }
        });

        jblvalorentrada.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jblvalorentrada.setForeground(new java.awt.Color(0, 0, 0));
        jblvalorentrada.setText("Valor de Entrada :");

        rbnsim.setBackground(new java.awt.Color(204, 153, 255));
        rbnsim.setForeground(new java.awt.Color(0, 0, 0));
        rbnsim.setText("SIM");

        rbnnao.setBackground(new java.awt.Color(204, 153, 255));
        rbnnao.setForeground(new java.awt.Color(0, 0, 0));
        rbnnao.setText("Não");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jblhustincol, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jblcomissao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jblsimulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jblcondicaovenda)
                                            .addComponent(jblvalorimovel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbldatavenda, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jblnomecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtvalorparcela, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtnomecliente, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                                .addComponent(txtdatavenda)
                                                .addComponent(txtvalorimovel)
                                                .addComponent(txtcondicaovenda))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btncalcularcomissao, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jblnumparcela, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(9, 9, 9)
                                    .addComponent(txtnumparcela, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btncalcularparcela, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jblvalorentrada)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbltementrada)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtvalorentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbnsim, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbnnao, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtfhustinci, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnirpara, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfhustinci, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jblhustincol)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnirpara, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jblsimulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblnomecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnomecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdatavenda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbldatavenda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblvalorimovel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtvalorimovel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblcondicaovenda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcondicaovenda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbltementrada, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbnsim)
                            .addComponent(rbnnao))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblvalorentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtvalorentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblnumparcela, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumparcela, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncalcularparcela, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtvalorparcela, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jblcomissao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncalcularcomissao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 83, Short.MAX_VALUE))))
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

    private void btncalcularparcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularparcelaActionPerformed
        if(txtnomecliente.getText().isEmpty() || txtdatavenda.getText().isEmpty() || txtcondicaovenda.getText().isEmpty() || txtvalorimovel.getText().isEmpty() || txtnumparcela.getText().isEmpty() || (rbnsim.isSelected() && txtvalorentrada.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        } try {
            double valorImovel = Double.parseDouble(txtvalorimovel.getText());
            int numeroParcelas = Integer.parseInt(txtnumparcela.getText());
            // verificação qual JRadioButton está sendo selecionado
            double valorEntrada = 0.0; // caso entrada não seja selecionada
            if(rbnsim.isSelected()){
                valorEntrada = Double.parseDouble(txtvalorentrada.getText());
                // JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            double valorRestante = valorImovel - valorEntrada; // Calcula  valor restante pra ser parcelado após a entrada
            double valorParcela = valorRestante / numeroParcelas; // Calcula valor da parcela considerando o restante a ser parcelado
            String formattedValorParcela = String.format("R$ %.2f", valorParcela);
            txtvalorparcela.setText(formattedValorParcela);
            // JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Valor do imóvel ou número de parcelas inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btncalcularparcelaActionPerformed

    private void txtnomeclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeclienteActionPerformed

    private void txtdatavendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdatavendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdatavendaActionPerformed

    private void txtresultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresultadoActionPerformed

    private void txtvalorimovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorimovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorimovelActionPerformed

    private void txtcondicaovendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcondicaovendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcondicaovendaActionPerformed

    private void btnirparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnirparaActionPerformed
        TelaBuscaImovel telabuscaimovel = new TelaBuscaImovel();
        telabuscaimovel.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnirparaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
        }
        private void limparCampos() {
            txtnomecliente.setText("");
            txtdatavenda.setText("");
            txtvalorimovel.setText("");
            txtcondicaovenda.setText("");
            txtresultado.setText("");
            txtnumparcela.setText("");
            txtvalorparcela.setText("");
            txtvalorentrada.setText("");
            rbnsim.setSelected(false);
            rbnnao.setSelected(false);

    }//GEN-LAST:event_btnLimparActionPerformed

    private void btncalcularcomissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularcomissaoActionPerformed
        if(txtnomecliente.getText().isEmpty() || txtdatavenda.getText().isEmpty() || txtcondicaovenda.getText().isEmpty() || txtvalorimovel.getText().isEmpty() ||
            txtnumparcela.getText().isEmpty() || (rbnsim.isSelected() && txtvalorentrada.getText().isEmpty())) {
            // Exibir mensagem de alerta se algum campo obrigatório estiver vazio
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {

            double valorImovel = Double.parseDouble(txtvalorimovel.getText());
            String formattedValorImovel = String.format("R$ %.2f", valorImovel);
            txtvalorimovel.setText(formattedValorImovel);
            double comissao = valorImovel * 0.025;
            String formattedComissao = String.format("R$ %.2f", comissao);
            txtresultado.setText(formattedComissao);
        }
    }//GEN-LAST:event_btncalcularcomissaoActionPerformed

    private void txtnumparcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumparcelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumparcelaActionPerformed

    private void txtvalorparcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorparcelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorparcelaActionPerformed

    private void txtvalorentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorentradaActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTransacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btncalcularcomissao;
    private javax.swing.JButton btncalcularparcela;
    private javax.swing.JButton btnirpara;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblcomissao;
    private javax.swing.JLabel jblcondicaovenda;
    private javax.swing.JLabel jbldatavenda;
    private javax.swing.JLabel jblhustincol;
    private javax.swing.JLabel jblnomecliente;
    private javax.swing.JLabel jblnumparcela;
    private javax.swing.JLabel jblsimulacao;
    private javax.swing.JLabel jbltementrada;
    private javax.swing.JLabel jblvalorentrada;
    private javax.swing.JLabel jblvalorimovel;
    private javax.swing.JTextField jtfhustinci;
    private javax.swing.JRadioButton rbnnao;
    private javax.swing.JRadioButton rbnsim;
    private javax.swing.JTextField txtcondicaovenda;
    private javax.swing.JTextField txtdatavenda;
    private javax.swing.JTextField txtnomecliente;
    private javax.swing.JTextField txtnumparcela;
    private javax.swing.JTextField txtresultado;
    private javax.swing.JTextField txtvalorentrada;
    private javax.swing.JTextField txtvalorimovel;
    private javax.swing.JTextField txtvalorparcela;
    // End of variables declaration//GEN-END:variables
}
