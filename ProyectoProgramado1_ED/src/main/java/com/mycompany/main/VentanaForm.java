/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.main;

import java.awt.event.KeyEvent;

/**
 *
 * @author Alejandro P
 */
public class VentanaForm extends javax.swing.JFrame {
    private Mercado tienda;
    /**
     * Creates new form VentanaForm
     */
    public VentanaForm() {
        initComponents();
        tienda = new Mercado();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaCliente = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnIngresarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        lblClientes1 = new javax.swing.JLabel();
        lblSaldo1 = new javax.swing.JLabel();
        lblAtendidos1 = new javax.swing.JLabel();
        lblClientes2 = new javax.swing.JLabel();
        lblSaldo2 = new javax.swing.JLabel();
        lblAtendidos2 = new javax.swing.JLabel();
        lblClientes3 = new javax.swing.JLabel();
        lblSaldo3 = new javax.swing.JLabel();
        lblAtendidos3 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        lblClientes4 = new javax.swing.JLabel();
        lblSaldo4 = new javax.swing.JLabel();
        lblAtendidos4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        btnAtender4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnAtender1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnAtender2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAtender3 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        btnAtender5 = new javax.swing.JButton();

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setText("Nombre:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 27, -1, -1));

        jLabel17.setText("Caja:");
        jLabel17.setToolTipText("");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 80, -1, -1));

        jLabel18.setText("Total a Pagar:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 153, -1, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 43, 199, -1));

        txtValor.setText("0");
        jPanel2.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 173, 199, -1));

        jButton1.setText("Ingresar Cliente");
        jButton1.setActionCommand("btnIngresarCliente2");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 211, 199, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 105, -1, -1));

        jButton2.setText("jButton2");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 42, -1, -1));

        jButton3.setText("jButton2");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 42, -1, -1));

        jButton4.setText("jButton2");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 42, -1, -1));

        jButton5.setText("jButton2");
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        jButton6.setText("jButton2");
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        jButton7.setText("jButton2");
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        jButton8.setText("jButton2");
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        jButton9.setText("jButton2");
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jButton10.setText("jButton2");
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jButton11.setText("jButton2");
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        jButton12.setText("jButton2");
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        jButton13.setText("jButton2");
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        jButton14.setText("jButton2");
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, -1));

        jButton15.setText("jButton2");
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jButton16.setText("jButton2");
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        jLabel15.setText("Ingresar Cliente");

        javax.swing.GroupLayout VentanaClienteLayout = new javax.swing.GroupLayout(VentanaCliente.getContentPane());
        VentanaCliente.getContentPane().setLayout(VentanaClienteLayout);
        VentanaClienteLayout.setHorizontalGroup(
            VentanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VentanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(VentanaClienteLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        VentanaClienteLayout.setVerticalGroup(
            VentanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIngresarCliente.setText("Ingresar Cliente");
        btnIngresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel1.setText("Saldo Total");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lblSaldo.setText("$0");
        jPanel1.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel3.setText("Cola 1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 20, -1, -1));

        jLabel4.setText("Cola 2");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 20, -1, -1));

        jLabel5.setText("Cola 4");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        jScrollPane6.setViewportView(jList3);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 120, -1));

        lblClientes1.setText("$0");
        jPanel1.add(lblClientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        lblSaldo1.setText("$0");
        jPanel1.add(lblSaldo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        lblAtendidos1.setText("$0");
        jPanel1.add(lblAtendidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        lblClientes2.setText("$0");
        jPanel1.add(lblClientes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        lblSaldo2.setText("$0");
        jPanel1.add(lblSaldo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        lblAtendidos2.setText("$0");
        jPanel1.add(lblAtendidos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        lblClientes3.setText("$0");
        jPanel1.add(lblClientes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        lblSaldo3.setText("$0");
        jPanel1.add(lblSaldo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        lblAtendidos3.setText("$0");
        jPanel1.add(lblAtendidos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, -1));

        jScrollPane7.setViewportView(jList4);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 120, -1));

        jLabel19.setText("Cola 3");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 20, -1, -1));

        lblClientes4.setText("$0");
        jPanel1.add(lblClientes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, -1, -1));

        lblSaldo4.setText("$0");
        jPanel1.add(lblSaldo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, -1));

        lblAtendidos4.setText("$0");
        jPanel1.add(lblAtendidos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));

        jScrollPane4.setViewportView(jList1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 110, -1));

        jScrollPane5.setViewportView(jList2);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 110, -1));

        jLabel8.setText("Atendidos:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        btnAtender4.setText("Atender");
        btnAtender4.setActionCommand("Atender3");
        btnAtender4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtender4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtender4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        jLabel9.setText("Atendidos:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        jLabel10.setText("Saldo:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        jLabel11.setText("Clientes:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jLabel12.setText("Atendidos:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, -1));

        jLabel13.setText("Saldo:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        jLabel14.setText("Clientes:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));

        btnAtender1.setText("Atender");
        btnAtender1.setActionCommand("Atender1");
        btnAtender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtender1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        jLabel6.setText("Clientes:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));
        jLabel6.getAccessibleContext().setAccessibleName("");

        jLabel20.setText("Atendidos:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        btnAtender2.setText("Atender");
        btnAtender2.setActionCommand("Atender2");
        btnAtender2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtender2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtender2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        jLabel21.setText("Saldo:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        jLabel7.setText("Saldo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        btnAtender3.setText("Atender");
        btnAtender3.setActionCommand("Atender3");
        btnAtender3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtender3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtender3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        jLabel22.setText("Clientes:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        btnAtender5.setText("Atender");
        btnAtender5.setActionCommand("Atender3");
        btnAtender5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtender5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtender5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 166, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarClienteActionPerformed
        this.VentanaCliente.setVisible(true);
        this.VentanaCliente.setSize(400, 350);
    }//GEN-LAST:event_btnIngresarClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       tienda.ingresarCliente(new Cliente(txtNombre.getText(), Integer.parseInt(jComboBox1.getSelectedItem().toString()),Float.parseFloat(txtValor.getText())));
       tienda.imprimir(jList1,jList2,jList3,jList4);
       tienda.mostrarCuentas(lblClientes1,lblClientes2,lblClientes3,lblClientes4);
       tienda.mostrarSaldos(lblSaldo1,lblSaldo2,lblSaldo3,lblSaldo4);
       
       this.VentanaCliente.setVisible(false);
       txtNombre.setText("");
       txtValor.setText("0");
       jComboBox1.setSelectedItem("Caja 1");
       lblSaldo.setText("$"+tienda.calcularSaldo());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAtender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtender1ActionPerformed
        tienda.atender1(lblAtendidos1);
        tienda.imprimir(jList1, jList2, jList3, jList4);
    }//GEN-LAST:event_btnAtender1ActionPerformed

    private void btnAtender2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtender2ActionPerformed
        tienda.atender2(lblAtendidos2);
        tienda.imprimir(jList1, jList2, jList3, jList4);
    }//GEN-LAST:event_btnAtender2ActionPerformed

    private void btnAtender5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtender5ActionPerformed
        tienda.atender3(lblAtendidos3);
        tienda.imprimir(jList1, jList2, jList3, jList4);
    }//GEN-LAST:event_btnAtender5ActionPerformed

    private void btnAtender4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtender4ActionPerformed
        tienda.atender4(lblAtendidos4);
        tienda.imprimir(jList1, jList2, jList3, jList4);
    }//GEN-LAST:event_btnAtender4ActionPerformed

    private void btnAtender3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtender3ActionPerformed
        tienda.atender3(lblAtendidos3);
        tienda.imprimir(jList1, jList2, jList3, jList4);
    }//GEN-LAST:event_btnAtender3ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame VentanaCliente;
    private javax.swing.JButton btnAtender1;
    private javax.swing.JButton btnAtender2;
    private javax.swing.JButton btnAtender3;
    private javax.swing.JButton btnAtender4;
    private javax.swing.JButton btnAtender5;
    private javax.swing.JButton btnIngresarCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblAtendidos1;
    private javax.swing.JLabel lblAtendidos2;
    private javax.swing.JLabel lblAtendidos3;
    private javax.swing.JLabel lblAtendidos4;
    private javax.swing.JLabel lblClientes1;
    private javax.swing.JLabel lblClientes2;
    private javax.swing.JLabel lblClientes3;
    private javax.swing.JLabel lblClientes4;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblSaldo1;
    private javax.swing.JLabel lblSaldo2;
    private javax.swing.JLabel lblSaldo3;
    private javax.swing.JLabel lblSaldo4;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
