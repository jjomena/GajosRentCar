/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author Sergio Hidalgo
 */
public class Informe {
    private ArrayList<Alquiler> listaAlquileres;
    private int monto;
    private String descripcion;
    
    public Informe(String pDescripcion){
        this.listaAlquileres = new ArrayList<>();
        this.monto = 0;
        this.descripcion = pDescripcion;
    }
    

    public ArrayList<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }

    public void agregarAlquiler(Alquiler pAlquiler) {
        this.listaAlquileres.add(pAlquiler);
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
