
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.conexion;
import modelo.usuario;
import gui.frmHome;
import gui.frmLogin;

    public class usuarioController {

        Connection con;

        public usuarioController() {
            con = new conexion().establecerConexion();
        }

        
    
    // Método para validar credenciales
    public boolean validarCredenciales(String usuario, String contrasenia) {
        String sql = "SELECT * FROM usuario WHERE usuario = ? AND contrasenia = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contrasenia);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return true;  // Credenciales correctas
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;  // Credenciales incorrectas
    }
    
    // Método para gestionar el inicio de sesión
    public void iniciarSesion(frmLogin loginForm) {
        String usuario = loginForm.getTxtUsuario().getText();
        String contrasenia = new String(loginForm.getTxtContrasenia().getPassword());

        if (validarCredenciales(usuario, contrasenia)) {
            JOptionPane.showMessageDialog(null, "¡Inicio de sesión exitoso!");
            redirigirHome(loginForm);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        }
    }
    
    // Método para redirigir al home
    private void redirigirHome(frmLogin loginForm) {
        frmHome home = new frmHome();
        home.setVisible(true);
        loginForm.dispose();  // Cierra el formulario de login
    }
    
}
