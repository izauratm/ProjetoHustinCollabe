package View;

import data.Imovel;
import data.Imovel;
import data.ImovelDao;
import data.ImovelDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Izaura
 */
    public class TelaBuscaImovel extends javax.swing.JFrame {

    private Object tblbuscaimovelModel;

    public TelaBuscaImovel() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jblimoveiscad = new javax.swing.JLabel();
        txtbusca = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jtfhustinci = new javax.swing.JTextField();
        jScrollPane = new javax.swing.JScrollPane();
        tblbuscaimovel = new javax.swing.JTable();
        btnlimpar = new javax.swing.JButton();
        jblhustincol = new javax.swing.JLabel();
        btnirpara = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jblimoveiscad.setBackground(new java.awt.Color(255, 255, 204));
        jblimoveiscad.setFont(new java.awt.Font("Candara Light", 0, 22)); // NOI18N
        jblimoveiscad.setForeground(new java.awt.Color(0, 0, 0));
        jblimoveiscad.setText("Imóveis Cadastrados");

        txtbusca.setBackground(new java.awt.Color(204, 204, 204));
        txtbusca.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtbusca.setForeground(new java.awt.Color(0, 0, 0));
        txtbusca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnbuscar.setBackground(new java.awt.Color(153, 153, 153));
        btnbuscar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
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
        jtfhustinci.setText("* HUSTINCOLLABE IMÓVEIS *");
        jtfhustinci.setBorder(null);

        jScrollPane.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        tblbuscaimovel.setBackground(new java.awt.Color(204, 204, 204));
        tblbuscaimovel.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        tblbuscaimovel.setForeground(new java.awt.Color(0, 0, 0));
        tblbuscaimovel.setModel(new javax.swing.table.DefaultTableModel(
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
                "Nome do Imóvel", "Tipo de Imóvel", "Descrição", "Valor", "Bairro", "Condição da Venda", "corretor_idcorretor"
            }
        ));
        jScrollPane.setViewportView(tblbuscaimovel);

        btnlimpar.setBackground(new java.awt.Color(153, 153, 153));
        btnlimpar.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        btnlimpar.setForeground(new java.awt.Color(0, 0, 0));
        btnlimpar.setText("LIMPAR");
        btnlimpar.setBorder(null);
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });

        jblhustincol.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
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
                        .addGap(37, 37, 37)
                        .addComponent(jtfhustinci, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jblimoveiscad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtbusca, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(431, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnirpara, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jblhustincol, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfhustinci, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jblhustincol, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jblimoveiscad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnirpara, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        this.preencherTabela(txtbusca.getText());
        }
        private void preencherTabela(String filtro) {
            ImovelDao dao = new ImovelDao();
            boolean status = dao.conectar();
            if (!status) {
                JOptionPane.showMessageDialog(null, "Erro de conexão com o banco de dados.");
            } else {
                List<Imovel> listaImovel = dao.listagem(filtro);
                System.out.println("Filtro utilizado na busca: " + filtro);

                if (listaImovel != null) {
                    DefaultTableModel tabelaListagem = (DefaultTableModel) tblbuscaimovel.getModel();
                    tblbuscaimovel.setRowSorter(new TableRowSorter<>(tabelaListagem));
                    tabelaListagem.setRowCount(0); 
                    
                    for (Imovel f : listaImovel) {
                        Object[] obj = new Object[]{
                            f.getImovelnome(),
                            f.getTipoimovel(),
                            f.getDescricao(),
                            f.getValorimovel(),
                            f.getBairro(),
                            f.getCondicaovenda(),
                            f.getCorretor_idcorretor()
                        };
                        tabelaListagem.addRow(obj);                }
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum imóvel encontrado.");
                }
                dao.desconectar();
            }              
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        DefaultTableModel tabelaListagem = (DefaultTableModel) tblbuscaimovel.getModel();
        tabelaListagem.setRowCount(0);
        txtbusca.setText("");
    }//GEN-LAST:event_btnlimparActionPerformed

    private void btnirparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnirparaActionPerformed
        TelaCadastroImovel telacadastroimovel = new TelaCadastroImovel();
        telacadastroimovel.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnirparaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBuscaImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscaImovel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnirpara;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel jblhustincol;
    private javax.swing.JLabel jblimoveiscad;
    private javax.swing.JTextField jtfhustinci;
    private javax.swing.JTable tblbuscaimovel;
    private javax.swing.JTextField txtbusca;
    // End of variables declaration//GEN-END:variables
}
