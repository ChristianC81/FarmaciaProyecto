/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.ModeloPedido;
import modelo.Pedido;
import vista.JFInfoPedido;
import vista.JFPedido;

/**
 *
 * @author chris
 */
public class ControladorPedido {

    ModeloPedido modelo;
    JFInfoPedido vista;
    JFPedido vistaConf;

    public ControladorPedido(ModeloPedido modelo, JFInfoPedido vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        iniciarControl();
    }

    public void iniciarControl() {
        vista.getBtnVerificarDatos().addActionListener(l -> guardarPedido());
    }

    public void guardarPedido() {
       //Control de excepciones en caso de existir un error al crear un pedido
        try{
        //Condicion de validar campos- si esta nos devuelve true podra continuar con la creacion del pedido
            if(validarCampos()==true){
        //Variables de lo campos de la vista
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
        String sucursaldelafarmacia = "";
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
        vistaConf.setTitle(distribuidorfarmaceutico);
        vistaConf.getLblPedido().setText(cantidadproducto+" de unidades, "+tipodemedicamento+" " );
        vistaConf.setVisible(true);
        }
        }catch(Exception e){
             JOptionPane.showMessageDialog(vista, "Error al crear un pedido");
             System.out.println(e.getMessage());
        }
        }

    public boolean validarCampos() {
        boolean validado = false;
        Validaciones validar = new Validaciones();
        if (!vista.getTxtnombreMedicamento().getText().toString().isEmpty()) {
            if (validar.MedicinaNombre(vista.getTxtnombreMedicamento().getText().toString())) {
                if (validar.Selection(vista.getCbxTipoMedicamento().getSelectedIndex())) {
                    if (!vista.getTxtCantidadProducto().getText().toString().isEmpty()) {
                        if (validar.esNumeroPositivo(vista.getTxtCantidadProducto().getText().toString())) {
                            if (!(vista.getRbtnEmpsephar().isSelected() && vista.getRbtnCemefar().isSelected() && vista.getRbtnDisCofarma().isSelected())) {
                                if (!(vista.getChbxSucPrincipal().isSelected() && vista.getChbxSucSecundaria().isSelected())) {
                                    validado = true;
                                } else {
                                    JOptionPane.showMessageDialog(vista, "Es necesario seleccionar una Sucursal de la farmacia");
                                }
                            } else {
                                JOptionPane.showMessageDialog(vista, "Es necesario seleccionar un Distribuidor farmaceútico");
                            }
                        } else {
                            JOptionPane.showMessageDialog(vista, "Es necesario ingresar un numero mayor a 0");
                        }
                    } else {
                        JOptionPane.showMessageDialog(vista, "Es necesario ingresar una cantidad del producto");
                    }
                } else {
                    JOptionPane.showMessageDialog(vista, "Es necesario seleccionar un tipo de medicamento");
                }
            } else {
                JOptionPane.showMessageDialog(vista, "Es necesario escribir correctamente el nombre del medicamento");
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Es necesario escribir el nombre de un medicamento");
        }
        return validado;
    }

}
