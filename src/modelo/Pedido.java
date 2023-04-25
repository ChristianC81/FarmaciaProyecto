/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author chris
 */
public class Pedido {
    int idpedido;
    String nombredelmedicamento;
    String tipodemedicamento;
    int cantidadproducto;
    String distribuidorfarmaceutico;
    String sucursaldelafarmacia;

    public Pedido() {
    }

    public Pedido(int idpedido, String nombredelmedicamento, String tipodemedicamento, int cantidadproducto, String distribuidorfarmaceutico, String sucursaldelafarmacia) {
        this.idpedido = idpedido;
        this.nombredelmedicamento = nombredelmedicamento;
        this.tipodemedicamento = tipodemedicamento;
        this.cantidadproducto = cantidadproducto;
        this.distribuidorfarmaceutico = distribuidorfarmaceutico;
        this.sucursaldelafarmacia = sucursaldelafarmacia;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public String getNombredelmedicamento() {
        return nombredelmedicamento;
    }

    public void setNombredelmedicamento(String nombredelmedicamento) {
        this.nombredelmedicamento = nombredelmedicamento;
    }

    public String getTipodemedicamento() {
        return tipodemedicamento;
    }

    public void setTipodemedicamento(String tipodemedicamento) {
        this.tipodemedicamento = tipodemedicamento;
    }

    public int getCantidadproducto() {
        return cantidadproducto;
    }

    public void setCantidadproducto(int cantidadproducto) {
        this.cantidadproducto = cantidadproducto;
    }

    public String getDistribuidorfarmaceutico() {
        return distribuidorfarmaceutico;
    }

    public void setDistribuidorfarmaceutico(String distribuidorfarmaceutico) {
        this.distribuidorfarmaceutico = distribuidorfarmaceutico;
    }

    public String getSucursaldelafarmacia() {
        return sucursaldelafarmacia;
    }

    public void setSucursaldelafarmacia(String sucursaldelafarmacia) {
        this.sucursaldelafarmacia = sucursaldelafarmacia;
    }
    
    
}
