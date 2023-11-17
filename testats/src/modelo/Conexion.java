
package modelo;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/usuarios?autoReconnect=true&useSSL=false";
    public static final String usuario = "root";
    public static final String password = "benites1234";

    public Connection getConnection(){
        Connection conexion = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // Cambio de la clase del controlador
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios", "root", "benites1234");
            conexion = java.sql.DriverManager.getConnection(URL, usuario, password);
            JOptionPane.showMessageDialog(null, "Conectado");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar");
            System.out.println("Error: " + e);
        }
        return conexion;
    }
}