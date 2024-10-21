
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion {
    
    Connection conectar = null;
    
    String usuario = "root";
    String contrasenia = "75985029";
    String bd = "tiendabd";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectarse, error:"+e.toString());
        }
       return conectar;
    }
}
