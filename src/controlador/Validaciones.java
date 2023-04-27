/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JRadioButton;

/**
 *
 * @author chris
 */
public class Validaciones {
    
    //Metodo que valida la entrada de texto en base a los nombres de los medicamentos 
    public boolean MedicinaNombre(String medicinaNombre) {
    // Expresión regular para validar el nombre del medicamento
    String regex = "^[A-Za-z0-9\\s]{2,50}$";
    return medicinaNombre.matches(regex);
}
    //Metodo que valida el combobox para la seleccion del tipo de medicamento
    public boolean Selection(int itemcomboBox) {
    return (itemcomboBox != 0);
}
    //Metodo que valida numeros positivos ingresados en el Jtextfield
    public boolean esNumeroPositivo(String texto) {
    try {
        int numero = Integer.parseInt(texto);
        if (numero >= 0) {
            return true;
        } else {
            return false;
        }
    } catch (NumberFormatException e) {
        return false;
    }
}
}
