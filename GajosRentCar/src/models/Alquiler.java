/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author Sergio Hidalgo
 */
public class Alquiler {
    private Automovil autoAlquilado;
    private Cliente cliente;
    private String fecha;
    private int monto;
    
    public Alquiler(Automovil auto, Cliente pCliente) {
        Date currentTime = new Date();
        this.autoAlquilado = auto;
        this.cliente = pCliente;
        this.monto = 50000;
        this.fecha = currentTime.toString();
        currentTime = null;
    }

    public Automovil getAutoAlquilado() {
        return autoAlquilado;
    }

    public void setAutoAlquilado(Automovil autoAlquilado) {
        this.autoAlquilado = autoAlquilado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
