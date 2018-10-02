package models;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class modeloAutomovil extends AbstractListModel {
    private static modeloAutomovil INSTANCE = null;
    private final ArrayList<Automovil> listaAutomoviles = new ArrayList<>();
    
    private synchronized static void createInstance(){
        if(INSTANCE == null){
            INSTANCE = new modeloAutomovil();
        }
    }
    
    public static modeloAutomovil getInstance(){
        createInstance();
        return INSTANCE;
    }
    
    @Override
    public int getSize() {
        return listaAutomoviles.size();
    }

    @Override
    public Object getElementAt(int index) {
        Automovil automovil = listaAutomoviles.get(index);
        String cadena = automovil.getMarcar();
        return cadena;
    }
    
    public void agregarAutomovil(Automovil automovil){
        listaAutomoviles.add(automovil);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    
    public void eliminarAutomovil(int index){
        listaAutomoviles.remove(index);
         this.fireIntervalRemoved(index, getSize(), getSize()+1);
    }
    
    public Automovil getAutomovil(int index){
        return listaAutomoviles.get(index);
    }
    
    public void eliminarTodosAutomoviles(){
        listaAutomoviles.clear();
    }
}
