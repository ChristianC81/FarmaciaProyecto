/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author jhudy
 */
public class JFInfoPedido extends javax.swing.JFrame {

    /**
     * Creates new form JFInfoPedido
     */
    public JFInfoPedido() {
        initComponents();
    }

    public ButtonGroup getBtnGDistribuidor() {
        return btnGDistribuidor;
    }

    public void setBtnGDistribuidor(ButtonGroup btnGDistribuidor) {
        this.btnGDistribuidor = btnGDistribuidor;
    }

    public JButton getBtnVerificarDatos() {
        return btnVerificarDatos;
    }

    public void setBtnVerificarDatos(JButton btnVerificarDatos) {
        this.btnVerificarDatos = btnVerificarDatos;
    }

    public JComboBox<String> getCbxTipoMedicamento() {
        return cbxTipoMedicamento;
    }

    public void setCbxTipoMedicamento(JComboBox<String> cbxTipoMedicamento) {
        this.cbxTipoMedicamento = cbxTipoMedicamento;
    }

    public JCheckBox getChbxSucPrincipal() {
        return chbxSucPrincipal;
    }

    public void setChbxSucPrincipal(JCheckBox chbxSucPrincipal) {
        this.chbxSucPrincipal = chbxSucPrincipal;
    }

    public JCheckBox getChbxSucSecundaria() {
        return chbxSucSecundaria;
    }

    public void setChbxSucSecundaria(JCheckBox chbxSucSecundaria) {
        this.chbxSucSecundaria = chbxSucSecundaria;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JRadioButton getRbtnCemefar() {
        return rbtnCemefar;
    }

    public void setRbtnCemefar(JRadioButton rbtnCemefar) {
        this.rbtnCemefar = rbtnCemefar;
    }

    public JRadioButton getRbtnDisCofarma() {
        return rbtnDisCofarma;
    }

    public void setRbtnDisCofarma(JRadioButton rbtnDisCofarma) {
        this.rbtnDisCofarma = rbtnDisCofarma;
    }

    public JRadioButton getRbtnEmpsephar() {
        return rbtnEmpsephar;
    }

    public void setRbtnEmpsephar(JRadioButton rbtnEmpsephar) {
        this.rbtnEmpsephar = rbtnEmpsephar;
    }

    public JTextField getTxtCantidadProducto() {
        return txtCantidadProducto;
    }

    public void setTxtCantidadProducto(JTextField txtCantidadProducto) {
        this.txtCantidadProducto = txtCantidadProducto;
    }

    public JTextField getTxtnombreMedicamento() {
        return txtnombreMedicamento;
    }

    public void setTxtnombreMedicamento(JTextField txtnombreMedicamento) {
        this.txtnombreMedicamento = txtnombreMedicamento;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JDialog getjDialog1() {
        return jDialog1;
    }

    public void setjDialog1(JDialog jDialog1) {
        this.jDialog1 = jDialog1;
    }

    public JLabel getLblPedido() {
        return lblPedido;
    }

    public void setLblPedido(JLabel lblPedido) {
        this.lblPedido = lblPedido;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGDistribuidor = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        lblPedido = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtnombreMedicamento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCantidadProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbtnDisCofarma = new javax.swing.JRadioButton();
        rbtnEmpsephar = new javax.swing.JRadioButton();
        rbtnCemefar = new javax.swing.JRadioButton();
        chbxSucPrincipal = new javax.swing.JCheckBox();
        chbxSucSecundaria = new javax.swing.JCheckBox();
        cbxTipoMedicamento = new javax.swing.JComboBox<>();
        btnVerificarDatos = new javax.swing.JButton();

        lblPedido.setText("jLabel2");

        btnGuardar.setText("Guardar");

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(btnGuardar)
                .addGap(92, 92, 92)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(lblPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtnombreMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreMedicamentoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre del medicamento:");

        jLabel2.setText("Tipo de medicamento:");

        jLabel3.setText("Cantidad de producto:");

        jLabel4.setText("Distribuidor farmaceútico:");

        jLabel5.setText("Sucursal de la farmacia:");

        btnGDistribuidor.add(rbtnDisCofarma);
        rbtnDisCofarma.setText("COFARMA");

        btnGDistribuidor.add(rbtnEmpsephar);
        rbtnEmpsephar.setText("EMPSEPHAR");

        btnGDistribuidor.add(rbtnCemefar);
        rbtnCemefar.setText("CEMEFAR");

        chbxSucPrincipal.setText("PRINCIPAL");

        chbxSucSecundaria.setText("SECUNDARIA");

        cbxTipoMedicamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<< Seleccione >>", "Analgésico", "Analéptico", "Anestésico", "Antiácido", "Antidepresivo", "Antibióticos" }));

        btnVerificarDatos.setText("OK");
        btnVerificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnombreMedicamento)
                    .addComponent(cbxTipoMedicamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnDisCofarma)
                            .addComponent(chbxSucPrincipal))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbxSucSecundaria)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbtnEmpsephar)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnCemefar)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(txtCantidadProducto))
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(btnVerificarDatos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombreMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cbxTipoMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbtnDisCofarma)
                    .addComponent(rbtnEmpsephar)
                    .addComponent(rbtnCemefar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(chbxSucPrincipal)
                    .addComponent(chbxSucSecundaria))
                .addGap(33, 33, 33)
                .addComponent(btnVerificarDatos)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarDatosActionPerformed
        // TODO add your handling code here:
     
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setSize(482, 325);
        jDialog1.show();
    }//GEN-LAST:event_btnVerificarDatosActionPerformed

    private void txtnombreMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreMedicamentoActionPerformed
   
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
            java.util.logging.Logger.getLogger(JFInfoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFInfoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFInfoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFInfoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFInfoPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup btnGDistribuidor;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVerificarDatos;
    private javax.swing.JComboBox<String> cbxTipoMedicamento;
    private javax.swing.JCheckBox chbxSucPrincipal;
    private javax.swing.JCheckBox chbxSucSecundaria;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPedido;
    private javax.swing.JRadioButton rbtnCemefar;
    private javax.swing.JRadioButton rbtnDisCofarma;
    private javax.swing.JRadioButton rbtnEmpsephar;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtnombreMedicamento;
    // End of variables declaration//GEN-END:variables
}
