/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author chris
 */
public class ModeloPedido {
    //Variable conexion
    ConexionBD conn = new ConexionBD();
    
    public void crearPedido( ArrayList<Pedido> pedidos){
    // Insertar personas en la base de datos
    for (Pedido p : pedidos) {
      try {
        String sql = "INSERT INTO pedido (nombredelmedicamento, tipodemedicamento,cantidadproducto,distribuidorfarmaceutico,sucursaldelafarmacia) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.getConnection().prepareStatement(sql);
        //Asignación de valores a la sentencia en base a los datos recorridos del arraylist
        stmt.setString(1, p.getNombredelmedicamento());
        stmt.setString(2, p.getTipodemedicamento());
        stmt.setInt(3, p.getCantidadproducto());
        stmt.setString(4, p.getDistribuidorfarmaceutico());
        stmt.setString(5, p.getSucursaldelafarmacia());
        stmt.executeUpdate();
        System.out.println(p.getNombredelmedicamento()+ " insertado en la base de datos");
      } catch (SQLException e) {
        System.out.println(e.getMessage());
      }
    }
}
}