
package gui;

import controlador.usuarioController;

public class frmLogin extends javax.swing.JFrame {
    
    usuarioController usuarioContr;
    
    public frmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        usuarioContr= new usuarioController();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondoLogin = new javax.swing.JPanel();
        jpImagen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 350));
        setMinimumSize(new java.awt.Dimension(500, 350));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpFondoLogin.setBackground(new java.awt.Color(217, 201, 188));
        jpFondoLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpImagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpFondoLogin.add(jpImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 350));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(28, 22, 16));
        jLabel1.setText("BIENVENIDO");
        jpFondoLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 130, 40));

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(28, 22, 16));
        jLabel2.setText("Usuario :");
        jpFondoLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 80, 20));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(28, 22, 16));
        jLabel3.setText("Contraseña :");
        jpFondoLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 110, 20));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jpFondoLogin.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 190, -1));

        txtContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        txtContrasenia.setForeground(new java.awt.Color(0, 0, 0));
        jpFondoLogin.add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 190, -1));

        btnIniciar.setBackground(new java.awt.Color(68, 52, 36));
        btnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jpFondoLogin.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 100, -1));

        getContentPane().add(jpFondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        usuarioContr.iniciarSesion(frmLogin.this);
    }//GEN-LAST:event_btnIniciarActionPerformed
public javax.swing.JTextField getTxtUsuario() {
    return txtUsuario;
}

public javax.swing.JPasswordField getTxtContrasenia() {
    return txtContrasenia;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jpFondoLogin;
    private javax.swing.JPanel jpImagen;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
