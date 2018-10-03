package controler;

import models.Alquiler;
import models.Automovil;
import models.Cliente;
import models.Informe;
import models.modeloAutomovil;
import models.modeloAutomovilAlquilado;
import models.modeloCliente;
import view.RegistrarAutomovil;
import view.VentanaAdministrador;

public class controladorAdministrador {
    private static controladorAdministrador INSTANCE = null;
    private static final Informe registro = new Informe("Alquileres del mes de octubre");
    
    private synchronized static void createInstance(){
        if(INSTANCE == null){
            INSTANCE = new controladorAdministrador();
        }
    }
    public static controladorAdministrador getInstance(){
        createInstance();
        return INSTANCE;
    }
    
    public static void registrarAutomovil(String marca, String modelo,
            String fecha,String capacidad, String puertas, String placa, 
            String combustible){
        
        modeloAutomovil modeloAuto = modeloAutomovil.getInstance();
        Automovil auto = new Automovil(marca,modelo,fecha,capacidad,puertas,placa,combustible);
        modeloAuto.agregarAutomovil(auto);
        
        RegistrarAutomovil registro = RegistrarAutomovil.getInstance();
        registro.setVisible(false);
        VentanaAdministrador admin = VentanaAdministrador.getInstance();
        admin.setVisible(true);
    }
    
    public static void alquilarAutomovil(Automovil auto, int indiceAuto, Cliente cliente){
        modeloAutomovil modeloAuto = modeloAutomovil.getInstance();
        modeloAutomovilAlquilado modeloAutosAlquilados = modeloAutomovilAlquilado.getInstance();
        
        modeloAuto.eliminarAutomovil(indiceAuto);
        modeloAutosAlquilados.agregarAutomovil(auto);
        
        registro.agregarAlquiler(new Alquiler(auto, cliente));
        
    }
    
    public static void crearCliente(String cedula,String nombre,String primerApellido,
            String segundoApellido,String correo,String telefono) {
        
        modeloCliente modelocliente = modeloCliente.getInstance();
        Cliente nuevoCliente = new Cliente(cedula, nombre, primerApellido, segundoApellido, correo, telefono);
        modelocliente.agregarCliente(nuevoCliente);
    }
    
}
