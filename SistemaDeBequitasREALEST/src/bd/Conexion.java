package bd;

import java.sql.Connection;

public class Conexion {
    // jdbc:mysql://localhost:3306/?user=root
    String bd ="sistemadebecasdb";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "benites1234";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;
    
    public Connection conectar() {
        try {
            Class.forName(driver);
            cx = java.sql.DriverManager.getConnection(url+bd, user, password);
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return cx;
    }
    public void desconectar() {
        try {
            cx.close();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    // public static void main(String[] args) {
    //     Conexion c = new Conexion();
    //     c.conectar();
    //     if (c.conectar() != null) {
    //         System.out.println("Conectado");
    //     } else {
    //         System.out.println("No conectado");
    //     }
    // }
}

