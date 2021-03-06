/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Controle.IOSQL;
/**
 *
 * @author d119322
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuPrincipal = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuJogador = new javax.swing.JMenu();
        jMenuCadastro = new javax.swing.JMenuItem();
        jMenuPagamento = new javax.swing.JMenu();
        jMenuAvulso = new javax.swing.JMenuItem();
        jMenuMensalidade = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuBalancoMensal = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador BBMC");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuArquivo.setText("Arquivo");
        jMenuArquivo.setToolTipText("");

        jMenuItemSair.setText("Sair");
        jMenuArquivo.add(jMenuItemSair);

        jMenuPrincipal.add(jMenuArquivo);

        jMenuJogador.setText("Jogador");
        jMenuJogador.setToolTipText("");

        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.setToolTipText("");
        jMenuCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCadastroMouseClicked(evt);
            }
        });
        jMenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroActionPerformed(evt);
            }
        });
        jMenuJogador.add(jMenuCadastro);

        jMenuPagamento.setText("Pagamento");
        jMenuPagamento.setToolTipText("");

        jMenuAvulso.setText("Avulso");
        jMenuPagamento.add(jMenuAvulso);

        jMenuMensalidade.setText("Mensalidade");
        jMenuPagamento.add(jMenuMensalidade);

        jMenuJogador.add(jMenuPagamento);

        jMenuPrincipal.add(jMenuJogador);

        jMenuEditar.setText("Edit");
        jMenuEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuEditarMouseClicked(evt);
            }
        });
        jMenuPrincipal.add(jMenuEditar);

        jMenuRelatorios.setText("Relatorios");

        jMenuBalancoMensal.setText("Balanço Mensal");
        jMenuRelatorios.add(jMenuBalancoMensal);

        jMenuPrincipal.add(jMenuRelatorios);

        setJMenuBar(jMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroActionPerformed
        // TODO add your handling code here:
        TelaCadastro cadastro = new TelaCadastro();
        cadastro.setVisible(true);
        
    }//GEN-LAST:event_jMenuCadastroActionPerformed

    private void jMenuCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCadastroMouseClicked
        // TODO add your handling code here:
                
    }//GEN-LAST:event_jMenuCadastroMouseClicked

    private void jMenuEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEditarMouseClicked
        // TODO add your handling code here:
        IOSQL teste = new IOSQL();
        
        teste.Conexao();
        
    }//GEN-LAST:event_jMenuEditarMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuItem jMenuAvulso;
    private javax.swing.JMenuItem jMenuBalancoMensal;
    private javax.swing.JMenuItem jMenuCadastro;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuJogador;
    private javax.swing.JMenuItem jMenuMensalidade;
    private javax.swing.JMenu jMenuPagamento;
    private javax.swing.JMenuBar jMenuPrincipal;
    private javax.swing.JMenu jMenuRelatorios;
    // End of variables declaration//GEN-END:variables
}
