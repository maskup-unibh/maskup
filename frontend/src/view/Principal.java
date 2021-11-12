/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author rafaela.cruz
 */
public class Principal extends javax.swing.JFrame {

    public final JDesktopPane jdp = new JDesktopPane() {
        public void paintComponent(Graphics g) {
            ImageIcon img = new ImageIcon("images/loja.jpg");
            g.drawImage(img.getImage(), 0, 0, null);
            super.paintComponent(g);
        }
    };

    /**
     * Creates new form NewJFrame
     */
    public Principal() {
        initComponents();
        config();
        this.setLocationRelativeTo(null);
    }

    private void config() {
        this.setLayout(new BorderLayout());
        jdp.add(this.jLabelImage);
        this.add(jdp);
        jdp.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelImage = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemClienteCad = new javax.swing.JMenuItem();
        jMenuItemProdutoCad = new javax.swing.JMenuItem();
        jMenuItemVendaCad = new javax.swing.JMenuItem();
        jMenuConsulta = new javax.swing.JMenu();
        jMenuItemClienteCon = new javax.swing.JMenuItem();
        jMenuItemProdutoCon = new javax.swing.JMenuItem();
        jMenuItemVendaCon = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 650));

        jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        jMenuCadastro.setText("Cadastro");

        jMenuItemClienteCad.setText("Cliente");
        jMenuItemClienteCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteCadActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemClienteCad);

        jMenuItemProdutoCad.setText("Produto");
        jMenuItemProdutoCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutoCadActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemProdutoCad);

        jMenuItemVendaCad.setText("Venda");
        jMenuCadastro.add(jMenuItemVendaCad);

        jMenuBar1.add(jMenuCadastro);

        jMenuConsulta.setText("Consulta");

        jMenuItemClienteCon.setText("Cliente");
        jMenuItemClienteCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteConActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemClienteCon);

        jMenuItemProdutoCon.setText("Produto");
        jMenuItemProdutoCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutoConActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemProdutoCon);

        jMenuItemVendaCon.setText("Venda");
        jMenuConsulta.add(jMenuItemVendaCon);

        jMenuBar1.add(jMenuConsulta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jLabelImage)
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabelImage)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemClienteCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteCadActionPerformed
        JInternalFrameCadastrarCliente jicc = new JInternalFrameCadastrarCliente(this);
        this.jdp.add(jicc);
        jicc.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteCadActionPerformed

    private void jMenuItemProdutoCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutoCadActionPerformed

    }//GEN-LAST:event_jMenuItemProdutoCadActionPerformed

    private void jMenuItemProdutoConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutoConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemProdutoConActionPerformed

    private void jMenuItemClienteConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteConActionPerformed
        JInternalFrameConsultarCliente jiconc = new JInternalFrameConsultarCliente(this);
        this.jdp.add(jiconc);
        jiconc.setVisible(true);

    }//GEN-LAST:event_jMenuItemClienteConActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuConsulta;
    private javax.swing.JMenuItem jMenuItemClienteCad;
    private javax.swing.JMenuItem jMenuItemClienteCon;
    private javax.swing.JMenuItem jMenuItemProdutoCad;
    private javax.swing.JMenuItem jMenuItemProdutoCon;
    private javax.swing.JMenuItem jMenuItemVendaCad;
    private javax.swing.JMenuItem jMenuItemVendaCon;
    // End of variables declaration//GEN-END:variables
}