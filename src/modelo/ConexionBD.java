/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author chris
 */
public class ConexionBD {
    //Variable connection
    Connection conn;
    
    public Connection getConnection() {
        // Conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/farmaciaproyectobd";
        String user = "root";
        String password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión establecida");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
