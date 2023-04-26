/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.ModeloPedido;
import modelo.Pedido;
import vista.JFInfoPedido;

/**
 *
 * @author chris
 */
public class ControladorPedido {

    ModeloPedido modelo;
    JFInfoPedido vista;

    public ControladorPedido(ModeloPedido modelo, JFInfoPedido vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        iniciarControl();
    }
    
    public void iniciarControl(){
        vista.getBtnVerificarDatos().addActionListener(l -> guardarPedido());
    }

    public void guardarPedido() {

        //Variables de la vista
        String nombredelmedicamento = vista.getTxtnombreMedicamento().getText().toString();
        
        String tipodemedicamento = (String) vista.getCbxTipoMedicamento().getSelectedItem();
        
        int cantidadproducto = Integer.parseInt(vista.getTxtCantidadProducto().getText().toString());
        
        String distribuidorfarmaceutico = "";
        if (vista.getRbtnCemefar().isSelected()) {
            distribuidorfarmaceutico = "CEMEFAR";
        } else if (vista.getRbtnEmpsephar().isSelected()) {
            distribuidorfarmaceutico = "EMPSEPHAR";
        } else if (vista.getRbtnDisCofarma().isSelected()) {
            distribuidorfarmaceutico = "COFARMA";
        }
        
        String sucursaldelafarmacia ="";
        if (vista.getChbxSucPrincipal().isSelected() && vista.getChbxSucSecundaria().isSelected()) {
            sucursaldelafarmacia = "PRINCIPAL Y SECUNDARIA";
        } else if (vista.getChbxSucPrincipal().isSelected()) {
            sucursaldelafarmacia = "PRINCIPAL";
        } else if (vista.getChbxSucPrincipal().isSelected()) {
            sucursaldelafarmacia = "SECUNDARIA";
        }
        // ArrayList de pedido 
        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(nombredelmedicamento, tipodemedicamento, cantidadproducto, distribuidorfarmaceutico, sucursaldelafarmacia));
        modelo.crearPedido(pedidos);
    }

}
