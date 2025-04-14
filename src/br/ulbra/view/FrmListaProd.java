    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.dao.ProdutoDAO;
import br.ulbra.entity.Produto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aluno.saolucas
 */
public class FrmListaProd extends javax.swing.JFrame {

      private List<Produto> listaProdutos;
      
    public FrmListaProd() {
        initComponents();
        listarProdutosNaTabela();
        btnCalcularEstoqueActionPerformed.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCalcularEstoqueActionPerformed(evt);
    }
});

    }
    
   private void listarProdutosNaTabela() {
    try {
        ProdutoDAO dao = new ProdutoDAO();
        listaProdutos = dao.readAll();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0); 

        for (Produto p : dao.readAll()) {
    model.addRow(new Object[]{
        p.getIdProd(),
        p.getNomeProd(),
        p.getDataCadProd(),
        p.getCategoriaProd(),
        p.getValorUnitProd(),
        p.getQuantEstoqueProd()
    });
}

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao listar produtos: " + e.getMessage());
    }
}

    
    private void btnCalcularEstoqueActionPerformed(java.awt.event.ActionEvent evt) {
        if (listaProdutos == null || listaProdutos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum produto carregado. Clique em 'Listar Produtos' primeiro.");
            return;
        }

        double totalEstoque = 0;
        for (Produto p : listaProdutos) {
            totalEstoque += p.calcularEstoque();
        }

        JOptionPane.showMessageDialog(this, "Valor total em estoque: R$ " + String.format("%.2f", totalEstoque));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnListarActionPerformed = new javax.swing.JButton();
        btnCalcularEstoqueActionPerformed = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lista Produtos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "DATA", "CATEGORIA", "VALOR", "QUANTIDADE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnListarActionPerformed.setText("Listar");
        btnListarActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformedActionPerformed(evt);
            }
        });

        btnCalcularEstoqueActionPerformed.setText("Calcular Estoque");
        btnCalcularEstoqueActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularEstoqueActionPerformedActionPerformed(evt);
            }
        });

        btnSair.setText("Fechar");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnListarActionPerformed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcularEstoqueActionPerformed)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btnSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarActionPerformed)
                    .addComponent(btnCalcularEstoqueActionPerformed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformedActionPerformed
         listarProdutosNaTabela();
    }//GEN-LAST:event_btnListarActionPerformedActionPerformed

    private void btnCalcularEstoqueActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularEstoqueActionPerformedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularEstoqueActionPerformedActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       new FrmDashBoard().setVisible(true);
       dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(() -> new FrmListaProd().setVisible(true));
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmListaProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularEstoqueActionPerformed;
    private javax.swing.JButton btnListarActionPerformed;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
