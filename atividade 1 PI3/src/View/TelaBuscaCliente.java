package View;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import data.ClienteDao;
import data.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Izaura
 */
public class TelaBuscaCliente extends javax.swing.JFrame {

    public TelaBuscaCliente() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbltitulo = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jtfhustinci = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbuscacliente = new javax.swing.JTable();
        btnlimpar = new javax.swing.JButton();
        jblhustincol = new javax.swing.JLabel();
        btnirpara = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jbltitulo.setBackground(new java.awt.Color(255, 255, 204));
        jbltitulo.setFont(new java.awt.Font("Candara Light", 0, 22)); // NOI18N
        jbltitulo.setForeground(new java.awt.Color(0, 0, 0));
        jbltitulo.setText("Meus Clientes: ");

        txtbuscar.setBackground(new java.awt.Color(204, 204, 204));
        txtbuscar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtbuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtbuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnbuscar.setBackground(new java.awt.Color(153, 153, 153));
        btnbuscar.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btnbuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnbuscar.setText("BUSCAR");
        btnbuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jtfhustinci.setBackground(new java.awt.Color(255, 204, 204));
        jtfhustinci.setFont(new java.awt.Font("Candara Light", 1, 30)); // NOI18N
        jtfhustinci.setForeground(new java.awt.Color(0, 0, 0));
        jtfhustinci.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfhustinci.setText("* HUSTINCOLLABE IMÓVEIS *");
        jtfhustinci.setBorder(null);

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        tblbuscacliente.setBackground(new java.awt.Color(204, 204, 204));
        tblbuscacliente.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        tblbuscacliente.setForeground(new java.awt.Color(0, 0, 0));
        tblbuscacliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome do Cliente", "Endereço", "Data de Nascimento", "Email", "Telefone", "RG", "CPF"
            }
        ));
        jScrollPane1.setViewportView(tblbuscacliente);

        btnlimpar.setBackground(new java.awt.Color(153, 153, 153));
        btnlimpar.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btnlimpar.setForeground(new java.awt.Color(0, 0, 0));
        btnlimpar.setText("LIMPAR");
        btnlimpar.setBorder(null);
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });

        jblhustincol.setFont(new java.awt.Font("Candara Light", 2, 12)); // NOI18N
        jblhustincol.setForeground(new java.awt.Color(0, 0, 0));
        jblhustincol.setText("HUSTINCOLLABE IMÒVEIS - A Sua Imobiliária Digital");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jblhustincol, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(jtfhustinci, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(177, 177, 177)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnirpara, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(930, 930, 930)
                                .addComponent(btnlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfhustinci, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jblhustincol, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnirpara, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        this.preencherTabela(txtbuscar.getText());
        }
        private void preencherTabela(String filtro) {
            ClienteDao dao = new ClienteDao();
            boolean status = dao.conectar();
            if (!status) {
                JOptionPane.showMessageDialog(null, "Erro de conexão com o banco de dados.");
            } else {
                List<Cliente> listaCliente = dao.listagem(filtro);
                System.out.println("Filtro utilizado na busca: " + filtro);
               
                if (listaCliente != null) {
                    DefaultTableModel tblbuscaclienteModel = (DefaultTableModel) tblbuscacliente.getModel();
                   // tblbuscaclienteModel.setRowSorter(new TableRowSorter<>(tblbuscaclienteModel));
                    tblbuscaclienteModel.setRowCount(0);

                    for (Cliente f : listaCliente) {
                    Object[] obj = new Object[]{
                        f.getNomeCliente(),
                        f.getEndereco(),
                        formatarData(f.getDatanasc().toString()),
                        f.getEmail(),
                        f.getTelefone(),
                        f.getRg(),
                        f.getCpf()
                    };
                    tblbuscaclienteModel.addRow(obj);                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum cliente encontrado.");
            }
            dao.desconectar();
        }
        }
        public String formatarData(String dataRecebida) {
            SimpleDateFormat conversor = new SimpleDateFormat("yyyy-MM-dd"); // Use the correct date format
            try {
                java.util.Date dataConvertida = conversor.parse(dataRecebida);
                conversor.applyPattern("dd/MM/yyyy"); // Change the format pattern
                return conversor.format(dataConvertida);
            } catch (ParseException ex) {
                System.out.println("Erro na conversão da data: " + ex.getMessage());
                return null;            
        }   
    }//GEN-LAST:event_btnbuscarActionPerformed
    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        DefaultTableModel tabelaListagem = (DefaultTableModel) tblbuscacliente.getModel();
        tabelaListagem.setRowCount(0);
        txtbuscar.setText("");
    }//GEN-LAST:event_btnlimparActionPerformed
    private void btnirparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnirparaActionPerformed
        TelaTransacao telatransacao = new TelaTransacao();
        telatransacao.setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaBuscaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnirpara;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblhustincol;
    private javax.swing.JLabel jbltitulo;
    private javax.swing.JTextField jtfhustinci;
    private javax.swing.JTable tblbuscacliente;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
