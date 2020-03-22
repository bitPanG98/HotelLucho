/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Clarisse_Naoemi-PC
 */
public class Conectar {
    static String BD = "bd_hotellucho";
    static String usua = "root";
    static String pass = "";
    static String url = "jdbc:mysql://localhost:3306/" + BD;
            Connection con = null;

      public Connection Conectar() {

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
}
