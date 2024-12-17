package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Izaura
 */
    public class TelaCadastroImovel extends javax.swing.JFrame {

    public TelaCadastroImovel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jblnomeimovel = new javax.swing.JLabel();
        btnsalvar = new javax.swing.JButton();
        txtimovelnome = new javax.swing.JTextField();
        jbltipoimovel = new javax.swing.JLabel();
        txttipoimovel = new javax.swing.JTextField();
        jblcadastroimovel = new javax.swing.JLabel();
        jblhustin = new javax.swing.JLabel();
        jbldescricao = new javax.swing.JLabel();
        txtdescricao = new javax.swing.JTextField();
        jblvalorimovel = new javax.swing.JLabel();
        txtvalorimovel = new javax.swing.JTextField();
        txtbairro = new javax.swing.JTextField();
        jblbairro = new javax.swing.JLabel();
        txtcondicaovenda = new javax.swing.JTextField();
        jblidcorretor = new javax.swing.JLabel();
        btnlimpardados = new javax.swing.JButton();
        jblcondicaovenda = new javax.swing.JLabel();
        txtidcorretor = new javax.swing.JTextField();
        jblcodigoimovel = new javax.swing.JLabel();
        txtimovelcodigo = new javax.swing.JTextField();
        jblidcliente = new javax.swing.JLabel();
        txtidcliente = new javax.swing.JTextField();
        jtfhustinci = new javax.swing.JTextField();
        btnvoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jblnomeimovel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jblnomeimovel.setForeground(new java.awt.Color(0, 0, 0));
        jblnomeimovel.setText("1. Nome do Empreendimento :");

        btnsalvar.setBackground(new java.awt.Color(204, 204, 204));
        btnsalvar.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btnsalvar.setForeground(new java.awt.Color(204, 0, 0));
        btnsalvar.setText("SALVAR");
        btnsalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        txtimovelnome.setBackground(new java.awt.Color(204, 204, 204));
        txtimovelnome.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        txtimovelnome.setForeground(new java.awt.Color(0, 0, 0));
        txtimovelnome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtimovelnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtimovelnomeActionPerformed(evt);
            }
        });

        jbltipoimovel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jbltipoimovel.setForeground(new java.awt.Color(0, 0, 0));
        jbltipoimovel.setText("2. Tipo de imóvel : ");

        txttipoimovel.setBackground(new java.awt.Color(204, 204, 204));
        txttipoimovel.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        txttipoimovel.setForeground(new java.awt.Color(0, 0, 0));
        txttipoimovel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txttipoimovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipoimovelActionPerformed(evt);
            }
        });

        jblcadastroimovel.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        jblcadastroimovel.setForeground(new java.awt.Color(0, 0, 0));
        jblcadastroimovel.setText("Cadastro de Imoveis");

        jblhustin.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jblhustin.setForeground(new java.awt.Color(0, 0, 0));
        jblhustin.setText("HUSTINCOLLABE IMÒVEIS - A Sua Imobiliária Digital");

        jbldescricao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jbldescricao.setForeground(new java.awt.Color(0, 0, 0));
        jbldescricao.setText("4. Descrição do Imóvel : ");

        txtdescricao.setBackground(new java.awt.Color(204, 204, 204));
        txtdescricao.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        txtdescricao.setForeground(new java.awt.Color(0, 0, 0));
        txtdescricao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtdescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescricaoActionPerformed(evt);
            }
        });

        jblvalorimovel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jblvalorimovel.setForeground(new java.awt.Color(0, 0, 0));
        jblvalorimovel.setText("5. Valor do Imóvel :");

        txtvalorimovel.setBackground(new java.awt.Color(204, 204, 204));
        txtvalorimovel.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        txtvalorimovel.setForeground(new java.awt.Color(0, 0, 0));
        txtvalorimovel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtvalorimovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorimovelActionPerformed(evt);
            }
        });

        txtbairro.setBackground(new java.awt.Color(204, 204, 204));
        txtbairro.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        txtbairro.setForeground(new java.awt.Color(0, 0, 0));
        txtbairro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtbairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbairroActionPerformed(evt);
            }
        });

        jblbairro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jblbairro.setForeground(new java.awt.Color(0, 0, 0));
        jblbairro.setText("6. Bairro :");

        txtcondicaovenda.setBackground(new java.awt.Color(204, 204, 204));
        txtcondicaovenda.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        txtcondicaovenda.setForeground(new java.awt.Color(0, 0, 0));
        txtcondicaovenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtcondicaovenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcondicaovendaActionPerformed(evt);
            }
        });

        jblidcorretor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jblidcorretor.setForeground(new java.awt.Color(0, 0, 0));
        jblidcorretor.setText("9. Corretor  Responsável: ");

        btnlimpardados.setBackground(new java.awt.Color(204, 204, 204));
        btnlimpardados.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btnlimpardados.setForeground(new java.awt.Color(204, 0, 0));
        btnlimpardados.setText("LIMPAR DADOS");
        btnlimpardados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlimpardados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpardadosActionPerformed(evt);
            }
        });

        jblcondicaovenda.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jblcondicaovenda.setForeground(new java.awt.Color(0, 0, 0));
        jblcondicaovenda.setText("7. Condição de Venda :");

        txtidcorretor.setBackground(new java.awt.Color(204, 204, 204));
        txtidcorretor.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        txtidcorretor.setForeground(new java.awt.Color(0, 0, 0));
        txtidcorretor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtidcorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcorretorActionPerformed(evt);
            }
        });

        jblcodigoimovel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jblcodigoimovel.setForeground(new java.awt.Color(0, 0, 0));
        jblcodigoimovel.setText("3. Código do Imóvel :");

        txtimovelcodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtimovelcodigo.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        txtimovelcodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtimovelcodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtimovelcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtimovelcodigoActionPerformed(evt);
            }
        });

        jblidcliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jblidcliente.setForeground(new java.awt.Color(0, 0, 0));
        jblidcliente.setText("8. Cliente (id) :");

        txtidcliente.setBackground(new java.awt.Color(204, 204, 204));
        txtidcliente.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        txtidcliente.setForeground(new java.awt.Color(0, 0, 0));
        txtidcliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtidcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidclienteActionPerformed(evt);
            }
        });

        jtfhustinci.setBackground(new java.awt.Color(255, 204, 204));
        jtfhustinci.setFont(new java.awt.Font("Candara Light", 1, 30)); // NOI18N
        jtfhustinci.setForeground(new java.awt.Color(0, 0, 0));
        jtfhustinci.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfhustinci.setText("* HUSTINCOLLABE IMÓVEIS *");
        jtfhustinci.setBorder(null);

        btnvoltar.setBackground(new java.awt.Color(255, 204, 204));
        btnvoltar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnvoltar.setForeground(new java.awt.Color(0, 0, 0));
        btnvoltar.setText("VOLTAR");
        btnvoltar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblcadastroimovel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfhustinci, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblhustin, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtbairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblvalorimovel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbldescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblbairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(txtvalorimovel, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(464, 464, 464))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtimovelnome, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbltipoimovel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txttipoimovel, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jblnomeimovel, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtdescricao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtimovelcodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
                                .addComponent(jblcodigoimovel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(74, 74, 74)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(btnsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnlimpardados, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtidcorretor, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jblcondicaovenda, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtcondicaovenda, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jblidcliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jblidcorretor, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtfhustinci, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jblhustin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jblcadastroimovel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jblidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblnomeimovel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblcondicaovenda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtimovelnome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcondicaovenda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbltipoimovel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttipoimovel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblidcorretor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblcodigoimovel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtimovelcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidcorretor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbldescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimpardados, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jblvalorimovel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtvalorimovel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jblbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        String imovelnome = txtimovelnome.getText();
        String tipoimovel = txttipoimovel.getText();
        String imovelcodigo = txtimovelcodigo.getText();
        String descricao = txtdescricao.getText();
        String valorimovelStr = txtvalorimovel.getText();
        String bairro = txtbairro.getText();
        String condicaovenda = txtcondicaovenda.getText();
        String cliente_idcliente = txtidcliente.getText();
        String corretor_idcorretor = txtidcorretor.getText();
        
        String url = "jdbc:mysql://localhost:3306/hustincollabe";
        String user = "root";
        String password = "spyke289";
        
        if (imovelnome.isEmpty() || tipoimovel.isEmpty() || imovelcodigo.isEmpty() || descricao.isEmpty() || valorimovelStr.isEmpty() 
        || bairro.isEmpty() || condicaovenda.isEmpty() || cliente_idcliente.isEmpty() || corretor_idcorretor.isEmpty()) {
           JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos!");
           return;
       }
        try {
        // Convertendo a string para double
        double valorimovel = Double.parseDouble(valorimovelStr);

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
              String sql = "INSERT INTO imovel (imovelnome, tipoimovel, imovelcodigo, descricao, valorimovel, bairro, condicaovenda, cliente_idcliente, corretor_idcorretor) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, imovelnome);
            statement.setString(2, tipoimovel);
            statement.setString(3, imovelcodigo);
            statement.setString(4, descricao);
            statement.setDouble(5, valorimovel);
            statement.setString(6, bairro);
            statement.setString(7, condicaovenda);
            statement.setString(8, cliente_idcliente);
            statement.setString(9, corretor_idcorretor);
             
            statement.executeUpdate();
            System.out.println("Imóvel cadastrado com sucesso!");
            JOptionPane.showMessageDialog(this, "Imóvel cadastrado com sucesso!");
        }
        } catch (NumberFormatException e) {
        System.out.println("Erro ao converter valor do imóvel!" + e.getMessage());
        JOptionPane.showMessageDialog(this, "Erro ao converter valor do imóvel!" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
       } catch (SQLException e) {
        System.out.println("Erro ao cadastrar imóvel!" + e.getMessage());
        JOptionPane.showMessageDialog(this, "Erro ao cadastrar imóvel!" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void txtimovelnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtimovelnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtimovelnomeActionPerformed

    private void txttipoimovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipoimovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipoimovelActionPerformed

    private void txtdescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescricaoActionPerformed

    private void txtvalorimovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorimovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorimovelActionPerformed

    private void txtbairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbairroActionPerformed

    private void txtcondicaovendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcondicaovendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcondicaovendaActionPerformed

    private void btnlimpardadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpardadosActionPerformed
        limparCampos();
        }
        private void limparCampos() {
            txtimovelnome.setText("");
            txttipoimovel.setText("");
            txtimovelcodigo.setText("");
            txtdescricao.setText("");
            txtvalorimovel.setText("");
            txtbairro.setText("");
            txtcondicaovenda.setText("");
            txtidcliente.setText("");
            txtidcorretor.setText("");
            
    }//GEN-LAST:event_btnlimpardadosActionPerformed

    private void txtidcorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcorretorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidcorretorActionPerformed

    private void txtimovelcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtimovelcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtimovelcodigoActionPerformed

    private void txtidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidclienteActionPerformed

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        Tela1 tela1 = new Tela1();
        tela1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnvoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroImovel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlimpardados;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jblbairro;
    private javax.swing.JLabel jblcadastroimovel;
    private javax.swing.JLabel jblcodigoimovel;
    private javax.swing.JLabel jblcondicaovenda;
    private javax.swing.JLabel jbldescricao;
    private javax.swing.JLabel jblhustin;
    private javax.swing.JLabel jblidcliente;
    private javax.swing.JLabel jblidcorretor;
    private javax.swing.JLabel jblnomeimovel;
    private javax.swing.JLabel jbltipoimovel;
    private javax.swing.JLabel jblvalorimovel;
    private javax.swing.JTextField jtfhustinci;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JTextField txtcondicaovenda;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtidcorretor;
    private javax.swing.JTextField txtimovelcodigo;
    private javax.swing.JTextField txtimovelnome;
    private javax.swing.JTextField txttipoimovel;
    private javax.swing.JTextField txtvalorimovel;
    // End of variables declaration//GEN-END:variables
}
