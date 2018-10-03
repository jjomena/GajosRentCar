
package models;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class modeloCliente extends AbstractListModel {
    private static modeloCliente INSTANCE = null;
    private final ArrayList<Cliente> listaClientes = new ArrayList<>();

    private synchronized static void createInstance(){
        if(INSTANCE == null){
            INSTANCE = new modeloCliente();
        }
    }
    
    public static modeloCliente getInstance(){
        createInstance();
        return INSTANCE;
    }

    @Override
    public int getSize() {
        return listaClientes.size();
    }

    @Override
    public Object getElementAt(int index) {
        Cliente cliente = listaClientes.get(index);
        String cadena = cliente.getCedula();
        return cadena;
    }
    
    public void agregarCliente(Cliente cliente){
        listaClientes.add(cliente);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    
    public void eliminarCliente(int index){
        listaClientes.remove(index);
         this.fireIntervalRemoved(index, getSize(), getSize()+1);
    }
    
    public Cliente getCliente(int index){
        return listaClientes.get(index);
    }
    
    public void eliminarTodosClientes(){
        listaClientes.clear();
    }
}
