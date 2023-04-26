/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chris
 */
public class ConexionBD {

    public Connection obtenerConexion() {
        // Conexión a la base de datos
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "mypassword";
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión establecida");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
