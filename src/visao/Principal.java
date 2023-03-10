package visao;

import controle.ContaControle;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelo.ContaModel;

public class Principal extends javax.swing.JFrame {

    private ContaControle controller = new ContaControle();

    public Principal() {
        initComponents();
        Read(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpDesktop = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConta = new javax.swing.JTable();
        JBCriar_Conta = new javax.swing.JButton();
        JBAlterar_Conta = new javax.swing.JButton();
        JBRemover_Conta = new javax.swing.JButton();
        JBMostrar_Contas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agência 1027");
        setMinimumSize(new java.awt.Dimension(950, 700));
        setPreferredSize(new java.awt.Dimension(950, 700));

        jTableConta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NConta", "Nome User", "Rua", "NCasa", "Bairro", "Cidade", "Estado", "Cep"
            }
        ));
        jTableConta.setMinimumSize(new java.awt.Dimension(600, 800));
        jTableConta.setPreferredSize(new java.awt.Dimension(600, 800));
        jScrollPane1.setViewportView(jTableConta);

        JBCriar_Conta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBCriar_Conta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/create.png"))); // NOI18N
        JBCriar_Conta.setText("Criar Conta");
        JBCriar_Conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCriar_ContaActionPerformed(evt);
            }
        });

        JBAlterar_Conta.setText("Alterar Conta");
        JBAlterar_Conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterar_ContaActionPerformed(evt);
            }
        });

        JBRemover_Conta.setText("Remover Conta");
        JBRemover_Conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemover_ContaActionPerformed(evt);
            }
        });

        JBMostrar_Contas.setText("Atualizar");
        JBMostrar_Contas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMostrar_ContasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDesktopLayout = new javax.swing.GroupLayout(jpDesktop);
        jpDesktop.setLayout(jpDesktopLayout);
        jpDesktopLayout.setHorizontalGroup(
            jpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDesktopLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JBCriar_Conta))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDesktopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBAlterar_Conta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBRemover_Conta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBMostrar_Contas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpDesktopLayout.setVerticalGroup(
            jpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDesktopLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(JBCriar_Conta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBMostrar_Contas)
                .addGap(18, 18, 18)
                .addComponent(JBAlterar_Conta)
                .addGap(18, 18, 18)
                .addComponent(JBRemover_Conta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCriar_ContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCriar_ContaActionPerformed
        FormPadrao formulario = new FormPadrao();
        jpDesktop.add(formulario);
        formulario.setVisible(true);
    }//GEN-LAST:event_JBCriar_ContaActionPerformed

    private void JBAlterar_ContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterar_ContaActionPerformed
        FormEdit formularioEdit = new FormEdit();
        jpDesktop.add(formularioEdit);
        formularioEdit.setVisible(true);
    }//GEN-LAST:event_JBAlterar_ContaActionPerformed

    private void JBRemover_ContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemover_ContaActionPerformed
        FormDelete formularioDelete = new FormDelete();
        jpDesktop.add(formularioDelete);
        formularioDelete.setVisible(true);
    }//GEN-LAST:event_JBRemover_ContaActionPerformed

    private void JBMostrar_ContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMostrar_ContasActionPerformed
        DefaultTableModel tabelaConta = (DefaultTableModel) jTableConta.getModel();
        try {
            limparTabela();
            for (ContaModel conta : controller.getAll()) {
                Object[] contaRow = new Object[]{
                    conta.getNumeroConta(),
                    conta.getNomeCliente(),
                    conta.getRua(),
                    conta.getNumeroCasa(),
                    conta.getBairro(),
                    conta.getCidade(),
                    conta.getEstado(),
                    conta.getCep()
                };
                tabelaConta.addRow(contaRow);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        //tabelaConta.addRow(rowData);
    }//GEN-LAST:event_JBMostrar_ContasActionPerformed

    public void Read(java.awt.event.ActionEvent evt) {                                                 
        DefaultTableModel tabelaConta = (DefaultTableModel) jTableConta.getModel();
        try {
            limparTabela();
            for (ContaModel conta : controller.getAll()) {
                Object[] contaRow = new Object[]{
                    conta.getNumeroConta(),
                    conta.getNomeCliente(),
                    conta.getRua(),
                    conta.getNumeroCasa(),
                    conta.getBairro(),
                    conta.getCidade(),
                    conta.getEstado(),
                    conta.getCep()
                };
                tabelaConta.addRow(contaRow);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }  
    
    private void limparTabela() {
        DefaultTableModel tabelaConta = (DefaultTableModel) jTableConta.getModel();
        int nLinhas = tabelaConta.getRowCount();
        for (int i = 1; i <= nLinhas; i++) {
            tabelaConta.removeRow(0);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar_Conta;
    private javax.swing.JButton JBCriar_Conta;
    private javax.swing.JButton JBMostrar_Contas;
    private javax.swing.JButton JBRemover_Conta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConta;
    private javax.swing.JPanel jpDesktop;
    // End of variables declaration//GEN-END:variables
}
