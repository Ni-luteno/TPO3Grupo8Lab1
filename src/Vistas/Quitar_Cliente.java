package Vistas;

import javax.swing.JOptionPane;
import tpo3grupo8lab1.Directorio;
import tpo3grupo8lab1.Telefono;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author Santi
 */
public class Quitar_Cliente extends javax.swing.JPanel {

    private static Directorio d = new Directorio();

    /**
     * Creates new form Quitar_Cliente
     * @param d
     */
    public Quitar_Cliente(Directorio d) {
        Quitar_Cliente.d = d;
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

        jpBorrarCliente = new javax.swing.JPanel();
        jlTelefono = new javax.swing.JLabel();
        jtfTelefonoBorrarCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbBorrarCliente = new javax.swing.JButton();

        jpBorrarCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlTelefono.setText("Telefono");

        jtfTelefonoBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTelefonoBorrarClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Borrar Cliente");

        jbBorrarCliente.setText("Borrar");
        jbBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBorrarClienteLayout = new javax.swing.GroupLayout(jpBorrarCliente);
        jpBorrarCliente.setLayout(jpBorrarClienteLayout);
        jpBorrarClienteLayout.setHorizontalGroup(
            jpBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBorrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBorrarClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbBorrarCliente))
                    .addGroup(jpBorrarClienteLayout.createSequentialGroup()
                        .addComponent(jlTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfTelefonoBorrarCliente))
                    .addGroup(jpBorrarClienteLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 288, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpBorrarClienteLayout.setVerticalGroup(
            jpBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBorrarClienteLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(jpBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefono)
                    .addComponent(jtfTelefonoBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                .addComponent(jbBorrarCliente)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBorrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBorrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfTelefonoBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelefonoBorrarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTelefonoBorrarClienteActionPerformed

    private void jbBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarClienteActionPerformed
        try {
            Telefono aux = new Telefono(Long.parseLong(jtfTelefonoBorrarCliente.getText()));
            d.borrarCliente(aux);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error, ingrese numero de telefono valido.");
        }

    }//GEN-LAST:event_jbBorrarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbBorrarCliente;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JPanel jpBorrarCliente;
    private javax.swing.JTextField jtfTelefonoBorrarCliente;
    // End of variables declaration//GEN-END:variables
}
