/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_hotel;

import Ingreso.Pantallaso;
import com.sun.awt.AWTUtilities;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Clarisse_Naoemi-PC
 */
public class Sistema_Hotel {

    /**
     * @param args the command line arguments
     */
    static String BD = "sistema_hotel";
    static String usua = "root";
    static String pass = "";
    static String url = "jdbc:mysql://localhost/" + BD;

    public Connection Conectar() {
        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usua, pass);

            if (con != null) {
                System.out.println("Conexion exitosamente");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion a Base de Datos");
        }
        return con;
    }

    public static void main(String[] args) {

        Pantallaso miPantalla = new Pantallaso();
        miPantalla.setVisible(true);
        
   

    }

}
