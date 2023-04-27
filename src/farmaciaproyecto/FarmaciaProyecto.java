/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package farmaciaproyecto;

import controlador.ControladorPedido;
import modelo.ModeloPedido;
import vista.JFInfoPedido;

/**
 *
 * @author chris
 */
public class FarmaciaProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFInfoPedido mivista = new JFInfoPedido();
        ModeloPedido modeloP = new ModeloPedido();
        ControladorPedido controlerP = new ControladorPedido(modeloP, mivista);
    }
    
}
