/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import modelo.usuario;

public class frmHome extends javax.swing.JFrame {

    
    public frmHome() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpMenu = new javax.swing.JPanel();
        btnGestionarInventario = new javax.swing.JButton();
        btnBuscarProducto = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        btnRegistrarVenta = new javax.swing.JButton();
        btnGestionarCliente = new javax.swing.JButton();
        btnGestionarProducto = new javax.swing.JButton();
        btnGestionarVenta = new javax.swing.JButton();
        jpTitulo = new javax.swing.JPanel();
        jpcontenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMenu.setBackground(new java.awt.Color(217, 201, 188));

        btnGestionarInventario.setBackground(new java.awt.Color(68, 52, 36));
        btnGestionarInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarInventario.setText("Gestionar Inventario");

        btnBuscarProducto.setBackground(new java.awt.Color(68, 52, 36));
        btnBuscarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarProducto.setText("Buscar Producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnBuscarCliente.setBackground(new java.awt.Color(68, 52, 36));
        btnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnRegistrarCliente.setBackground(new java.awt.Color(68, 52, 36));
        btnRegistrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCliente.setText("Registrar Cliente");

        btnRegistrarVenta.setBackground(new java.awt.Color(68, 52, 36));
        btnRegistrarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarVenta.setText("Registrar Venta");

        btnGestionarCliente.setBackground(new java.awt.Color(68, 52, 36));
        btnGestionarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarCliente.setText("Gestionar Cliente");
        btnGestionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarClienteActionPerformed(evt);
            }
        });

        btnGestionarProducto.setBackground(new java.awt.Color(68, 52, 36));
        btnGestionarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarProducto.setText("Gestionar Producto");
        btnGestionarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarProductoActionPerformed(evt);
            }
        });

        btnGestionarVenta.setBackground(new java.awt.Color(68, 52, 36));
        btnGestionarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarVenta.setText("Gestionar Venta");

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGestionarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnGestionarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestionarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestionarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(btnBuscarProducto)
                .addGap(17, 17, 17)
                .addComponent(btnBuscarCliente)
                .addGap(17, 17, 17)
                .addComponent(btnRegistrarCliente)
                .addGap(17, 17, 17)
                .addComponent(btnRegistrarVenta)
                .addGap(17, 17, 17)
                .addComponent(btnGestionarCliente)
                .addGap(17, 17, 17)
                .addComponent(btnGestionarProducto)
                .addGap(17, 17, 17)
                .addComponent(btnGestionarVenta)
                .addGap(17, 17, 17)
                .addComponent(btnGestionarInventario))
        );

        jpTitulo.setBackground(new java.awt.Color(158, 126, 95));
        jpTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpcontenedor.setBackground(new java.awt.Color(236, 228, 221));
        jpcontenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                    .addComponent(jpcontenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpcontenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jpMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarProductoActionPerformed
        btnGestionarProducto.setSelected(true);
        
        jpGestionProductos gestionP = new jpGestionProductos();
        gestionP.setSize(600, 400);
        gestionP.setLocation(0,0);
        
        jpcontenedor.removeAll();
        jpcontenedor.setLayout(new BorderLayout());
        jpcontenedor.add(gestionP, BorderLayout.CENTER);
        jpcontenedor.revalidate();
        jpcontenedor.repaint();
    }//GEN-LAST:event_btnGestionarProductoActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        btnBuscarProducto.setSelected(true);
        
        jpBuscarProducto buscarP = new jpBuscarProducto();
        buscarP.setSize(600, 400);
        buscarP.setLocation(0,0);
        
        jpcontenedor.removeAll();
        jpcontenedor.setLayout(new BorderLayout());
        jpcontenedor.add(buscarP, BorderLayout.CENTER);
        jpcontenedor.revalidate();
        jpcontenedor.repaint();
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        btnBuscarCliente.setSelected(true);
        
        jpBuscarCliente buscarC = new jpBuscarCliente();
        buscarC.setSize(600, 400);
        buscarC.setLocation(0,0);
        
        jpcontenedor.removeAll();
        jpcontenedor.setLayout(new BorderLayout());
        jpcontenedor.add(buscarC, BorderLayout.CENTER);
        jpcontenedor.revalidate();
        jpcontenedor.repaint();
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnGestionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnGestionarCliente;
    private javax.swing.JButton btnGestionarInventario;
    private javax.swing.JButton btnGestionarProducto;
    private javax.swing.JButton btnGestionarVenta;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPanel jpcontenedor;
    // End of variables declaration//GEN-END:variables
}
