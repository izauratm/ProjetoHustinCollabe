package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Izaura
 */
    public class TelaCadastroCliente extends javax.swing.JFrame {
   
    public TelaCadastroCliente() {
        initComponents();
           }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jblnome = new javax.swing.JLabel();
        jbldatanasc = new javax.swing.JLabel();
        btnsalvr = new javax.swing.JButton();
        txtnome = new javax.swing.JTextField();
        jblendereco = new javax.swing.JLabel();
        txtendereco = new javax.swing.JTextField();
        jblacesso1 = new javax.swing.JLabel();
        txtdatanasc = new javax.swing.JTextField();
        jblhustin = new javax.swing.JLabel();
        jblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jbltelefone = new javax.swing.JLabel();
        txttelefone = new javax.swing.JTextField();
        txtrg = new javax.swing.JTextField();
        jblrg = new javax.swing.JLabel();
        txtcpf = new javax.swing.JTextField();
        jblcpf = new javax.swing.JLabel();
        btnlimpardados = new javax.swing.JButton();
        jtfhustinci = new javax.swing.JTextField();
        btnirpara = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jblnome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jblnome.setForeground(new java.awt.Color(0, 0, 0));
        jblnome.setText("1. Nome :");

        jbldatanasc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jbldatanasc.setForeground(new java.awt.Color(0, 0, 0));
        jbldatanasc.setText("3. Data de Nascimento : ");

        btnsalvr.setBackground(new java.awt.Color(204, 204, 204));
        btnsalvr.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btnsalvr.setForeground(new java.awt.Color(204, 0, 0));
        btnsalvr.setText("SALVAR");
        btnsalvr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsalvr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvrActionPerformed(evt);
            }
        });

        txtnome.setBackground(new java.awt.Color(204, 204, 204));
        txtnome.setFont(new java.awt.Font("Candara Light", 0, 16)); // NOI18N
        txtnome.setForeground(new java.awt.Color(0, 0, 0));
        txtnome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });

        jblendereco.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jblendereco.setForeground(new java.awt.Color(0, 0, 0));
        jblendereco.setText("2. Endereço :");

        txtendereco.setBackground(new java.awt.Color(204, 204, 204));
        txtendereco.setFont(new java.awt.Font("Candara Light", 0, 16)); // NOI18N
        txtendereco.setForeground(new java.awt.Color(0, 0, 0));
        txtendereco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtendereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenderecoActionPerformed(evt);
            }
        });

        jblacesso1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jblacesso1.setForeground(new java.awt.Color(0, 0, 0));
        jblacesso1.setText("Cadastro de Clientes");

        txtdatanasc.setBackground(new java.awt.Color(204, 204, 204));
        txtdatanasc.setFont(new java.awt.Font("Candara Light", 0, 16)); // NOI18N
        txtdatanasc.setForeground(new java.awt.Color(0, 0, 0));
        txtdatanasc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtdatanasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdatanascActionPerformed(evt);
            }
        });

        jblhustin.setFont(new java.awt.Font("Candara Light", 2, 12)); // NOI18N
        jblhustin.setForeground(new java.awt.Color(0, 0, 0));
        jblhustin.setText("HUSTINCOLLABE IMÒVEIS - A Sua Imobiliária Digital");

        jblemail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jblemail.setForeground(new java.awt.Color(0, 0, 0));
        jblemail.setText("4. Email :");

        txtemail.setBackground(new java.awt.Color(204, 204, 204));
        txtemail.setFont(new java.awt.Font("Candara Light", 0, 16)); // NOI18N
        txtemail.setForeground(new java.awt.Color(0, 0, 0));
        txtemail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jbltelefone.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jbltelefone.setForeground(new java.awt.Color(0, 0, 0));
        jbltelefone.setText("5. Telefone :");

        txttelefone.setBackground(new java.awt.Color(204, 204, 204));
        txttelefone.setFont(new java.awt.Font("Candara Light", 0, 16)); // NOI18N
        txttelefone.setForeground(new java.awt.Color(0, 0, 0));
        txttelefone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txttelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefoneActionPerformed(evt);
            }
        });

        txtrg.setBackground(new java.awt.Color(204, 204, 204));
        txtrg.setFont(new java.awt.Font("Candara Light", 0, 16)); // NOI18N
        txtrg.setForeground(new java.awt.Color(0, 0, 0));
        txtrg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrgActionPerformed(evt);
            }
        });

        jblrg.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jblrg.setForeground(new java.awt.Color(0, 0, 0));
        jblrg.setText("6. RG :");

        txtcpf.setBackground(new java.awt.Color(204, 204, 204));
        txtcpf.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        txtcpf.setForeground(new java.awt.Color(0, 0, 0));
        txtcpf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcpfActionPerformed(evt);
            }
        });

        jblcpf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jblcpf.setForeground(new java.awt.Color(0, 0, 0));
        jblcpf.setText("7. CPF :");

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

        jtfhustinci.setBackground(new java.awt.Color(255, 204, 204));
        jtfhustinci.setFont(new java.awt.Font("Candara Light", 1, 30)); // NOI18N
        jtfhustinci.setForeground(new java.awt.Color(0, 0, 0));
        jtfhustinci.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfhustinci.setText("* HUSTINCOLLABE IMÓVEIS *");
        jtfhustinci.setBorder(null);

        btnirpara.setBackground(new java.awt.Color(255, 204, 204));
        btnirpara.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnirpara.setForeground(new java.awt.Color(0, 0, 0));
        btnirpara.setText("Ir para");
        btnirpara.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnirpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnirparaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblnome, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbldatanasc)
                            .addComponent(txtdatanasc, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblrg, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbltelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblacesso1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtcpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnsalvr, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnlimpardados, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnirpara, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfhustinci, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblhustin, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfhustinci, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jblhustin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jblacesso1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jblnome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbldatanasc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdatanasc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jblemail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbltelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblrg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsalvr, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlimpardados, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnirpara, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalvrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvrActionPerformed
                                           
    String nomecliente = txtnome.getText();
    String endereco = txtendereco.getText();
    String datanascStr = txtdatanasc.getText();
    String email = txtemail.getText();
    String telefone = txttelefone.getText();
    String rg = txtrg.getText();
    String cpf = txtcpf.getText();                                   
    String url = "jdbc:mysql://localhost:3306/hustincollabe";
    String user = "root";
    String password = "spyke289";

    if (nomecliente.isEmpty() || endereco.isEmpty() || datanascStr.isEmpty() || email.isEmpty() || telefone.isEmpty() || rg.isEmpty() || cpf.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos com valores válidos.");
        return;
    }

    try {
        // Converter a string para java.sql.Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = sdf.parse(datanascStr);
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "INSERT INTO cliente (nomecliente, endereco, datanasc, email, telefone, rg, cpf) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, nomecliente);
            statement.setString(2, endereco);
            statement.setDate(3, sqlDate);
            statement.setString(4, email);
            statement.setString(5, telefone);
            statement.setString(6, rg);
            statement.setString(7, cpf);
            statement.executeUpdate();
            System.out.println("Cliente cadastrado com sucesso!");
            JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
        }
    } catch (ParseException e) {
        System.out.println("Erro ao converter data!" + e.getMessage());
        JOptionPane.showMessageDialog(this, "Erro ao converter data!" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        System.out.println("Erro ao cadastrar cliente!" + e.getMessage());
        JOptionPane.showMessageDialog(this, "Erro ao cadastrar cliente!" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }   
    }//GEN-LAST:event_btnsalvrActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void txtenderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtenderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtenderecoActionPerformed

    private void txtdatanascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdatanascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdatanascActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txttelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefoneActionPerformed

    private void txtrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrgActionPerformed

    private void txtcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpfActionPerformed

    private void btnlimpardadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpardadosActionPerformed
               limparCampos();
    }                                     
    private void limparCampos() {
        txtnome.setText("");
        txtendereco.setText("");
        txtdatanasc.setText("");
        txtemail.setText("");
        txttelefone.setText("");
        txtrg.setText("");
        txtcpf.setText("");    
    }//GEN-LAST:event_btnlimpardadosActionPerformed

    private void btnirparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnirparaActionPerformed
        TelaBuscaCliente telabuscacliente = new TelaBuscaCliente();
        telabuscacliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnirparaActionPerformed
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
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnirpara;
    private javax.swing.JButton btnlimpardados;
    private javax.swing.JButton btnsalvr;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblacesso1;
    private javax.swing.JLabel jblcpf;
    private javax.swing.JLabel jbldatanasc;
    private javax.swing.JLabel jblemail;
    private javax.swing.JLabel jblendereco;
    private javax.swing.JLabel jblhustin;
    private javax.swing.JLabel jblnome;
    private javax.swing.JLabel jblrg;
    private javax.swing.JLabel jbltelefone;
    private javax.swing.JTextField jtfhustinci;
    private javax.swing.JTextField txtcpf;
    private javax.swing.JTextField txtdatanasc;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtrg;
    private javax.swing.JTextField txttelefone;
    // End of variables declaration//GEN-END:variables
}
