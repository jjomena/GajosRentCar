package models;

public class Automovil {
    String marcar;
    String modelo;
    String fechaRegistro;
    String capacidad;
    String numPuertas;
    String numPlaca;
    String combustible;
    
    public Automovil(String marcar,String modelo,String fechaRegistro,
            String capacidad,String numPuertas,
            String numPlaca,String combustible){
        
        this.marcar = marcar;
        this.modelo = modelo;
        this.fechaRegistro = fechaRegistro;
        this.capacidad = capacidad;
        this.numPuertas = numPuertas;
        this.numPlaca = numPlaca;
        this.combustible =  combustible;
    }

    public String getMarcar() {
        return marcar;
    }

    public void setMarcar(String marcar) {
        this.marcar = marcar;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(String numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }
    
    
}
