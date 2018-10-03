package models;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class modeloAutomovilAlquilado extends AbstractListModel {
    private static modeloAutomovilAlquilado INSTANCE = null;
    private final ArrayList<Automovil> listaAutomovilesAlquilados = new ArrayList<>();
    
    private synchronized static void createInstance(){
        if(INSTANCE == null){
            INSTANCE = new modeloAutomovilAlquilado();
        }
    }
    
    public static modeloAutomovilAlquilado getInstance(){
        createInstance();
        return INSTANCE;
    }
    
    @Override
    public int getSize() {
        return listaAutomovilesAlquilados.size();
    }

    @Override
    public Object getElementAt(int index) {
        Automovil automovil = listaAutomovilesAlquilados.get(index);
        String cadena = automovil.getNumPlaca();
        return cadena;
    }
    
    public void agregarAutomovil(Automovil automovil){
        listaAutomovilesAlquilados.add(automovil);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    
    public void eliminarAutomovil(int index){
        listaAutomovilesAlquilados.remove(index);
         this.fireIntervalRemoved(index, getSize(), getSize()+1);
    }
    
    public Automovil getAutomovil(int index){
        return listaAutomovilesAlquilados.get(index);
    }
    
    public void eliminarTodosAutomoviles(){
        listaAutomovilesAlquilados.clear();
    }
}
