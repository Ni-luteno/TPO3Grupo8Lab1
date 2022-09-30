package tpo3grupo8lab1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.swing.JOptionPane;

public class Directorio {

    private final HashMap<Telefono, Cliente> registroClientes = new HashMap<>();

    public Directorio() {
    }

    public HashMap<Telefono, Cliente> getRegistroClientes() {
        return registroClientes;
    }

    public boolean agregarCliente(Cliente cliente, Telefono numero) {

        if (registroClientes.containsKey(numero)) {
            JOptionPane.showMessageDialog(null, "Este numero de telefono ya se encontraba registrado");
            return false;
        } else {
            registroClientes.put(numero, cliente);
            JOptionPane.showMessageDialog(null, "Cliente registrado.");
            return true;
        }

    }

    public boolean borrarCliente(Telefono numero) {

        if (registroClientes.containsKey(numero)) {
            JOptionPane.showMessageDialog(null, "Cliente eliminado del registro");
            registroClientes.remove(numero);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El numero no corresponde a ningun cliente registrado.");
            return false;
        }
    }

    public Cliente buscarCliente(Telefono numero) {

        if (registroClientes.containsKey(numero)) {
            return registroClientes.get(numero);
        } else {
            JOptionPane.showMessageDialog(null, "El numero no corresponde a ningun cliente registrado.");
            return registroClientes.get(numero);
        }
    }

    public ArrayList<Telefono> buscarTelefono(String apellido) {

        ArrayList<Telefono> listaTelefonos = new ArrayList();
        for (Map.Entry<Telefono, Cliente> entry : registroClientes.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                listaTelefonos.add(entry.getValue().getNumTel());
            }else{
                JOptionPane.showMessageDialog(null, "El apellido no corresponde a ningun cliente registrado.");
            }
        }
        return listaTelefonos;
    }

    public HashSet<Cliente> buscarClientes(String nombreCiudad) {

        HashSet<Cliente> listaClientes = new HashSet();
        for (Map.Entry<Telefono, Cliente> entry : registroClientes.entrySet()) {
            if (entry.getValue().getDireccion().getCiudad().equalsIgnoreCase(nombreCiudad)) {
                listaClientes.add(entry.getValue());
            }else{
                JOptionPane.showMessageDialog(null, "La ciudad no corresponde a ningun cliente registrado.");
            }
        }
        return listaClientes;

    }

    @Override
    public String toString() {
        return "Directorio: " + "Registro: " + registroClientes;
    }

}
