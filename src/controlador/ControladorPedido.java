/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.ModeloPedido;
import modelo.Pedido;

/**
 *
 * @author chris
 */
public class ControladorPedido {
    modelo.ModeloPedido crear = new ModeloPedido();
      
    public void guardarPedido(){
        Pedido nuevoPedido = new Pedido();
        nuevoPedido.setNombredelmedicamento("");
        nuevoPedido.setTipodemedicamento("");
        nuevoPedido.setCantidadproducto(0);
        nuevoPedido.setDistribuidorfarmaceutico("");
        nuevoPedido.setSucursaldelafarmacia("");
         crear.crearPedido(nuevoPedido);
}
    
}
