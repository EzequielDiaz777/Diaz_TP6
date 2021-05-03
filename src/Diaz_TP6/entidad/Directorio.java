package Diaz_TP6.entidad;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Directorio {

    private final TreeMap<String, Cliente> directorio = new TreeMap<>();

    //Constructor
    public Directorio() {
    }

    // agregarCliente() que permite registrar un nuevo cliente con su 
    //respectivo nro de teléfono. Siendo el nro del teléfono la clave del mismo.
    public void agregarCliente(String telefono, Cliente cliente) {
        if (directorio.containsKey(telefono)) {
            System.out.println("Este telefono ya se encuentra agendado.");
        } else {
            System.out.println("Ingreso exitoso!");
        }
        directorio.put(telefono, cliente);
    }

    // buscarCliente() que en base al nro de teléfono retorna el 
    //Cliente asociado al mismo.
    public Cliente buscarCliente(String telefono) {
        if (!(directorio.containsKey(telefono))) {
            System.out.println("No se encontro dicha persona en el directorio");
        }
        System.out.println(directorio.get(telefono));
        return directorio.get(telefono);
    }

//    public Cliente buscarClienteDni(String dni) {
//        Cliente cliente = null;
//        directorio.keySet().forEach((String tel) -> {
//            if (!(directorio.get(tel).getDni().equals(dni))) {
//                cliente 
//            }
//        });
//        return null;
//    }
    
    // buscarTeléfono() que en base a un apellido nos devuelve una lista con los 
    //nros de teléfono asociados a dicho apellido.
    public Set<String> buscarTelefono(String apellido) {
        Set<String> aux = new HashSet<>();
        directorio.keySet().forEach(tel -> {
            if (directorio.get(tel).getApellido().equals(apellido)) {
                aux.add(tel);
            }
        });
        if (aux.isEmpty()) {
            System.out.println("No se encontro dicha persona en el directorio");
        } else {
            System.out.println(aux);
        }
        return aux;
    }

    // buscarClientes() que en base a una ciudad nos devuelve una 
    //lista con los Clientes asociados a dicha ciudad.
    public Set<Cliente> buscarClientes(String ciudad) {
        Set<Cliente> aux = new HashSet<>();
        directorio.keySet().forEach((String tel) -> {
            if (directorio.get(tel).getCiudad().equals(ciudad)) {
                aux.add(directorio.get(tel));
            }
        });
        if (aux.isEmpty()) {
            System.out.println("No se encontro a ninguna persona de esa ciudad en el directorio");
        } else {
            System.out.println(aux);
        }
        return aux;
    }
    
    // borrarCliente() que en base a un dni elimina el cliente del directorio.
    public TreeMap<String,Cliente> borrarCliente(String dni){
        TreeMap<String, Cliente> clientes = new TreeMap<>();
        Set<String> aux = directorio.keySet();
        String[] arreglo = new String[aux.size()];
        aux.toArray(arreglo);
        String tele = "";
        Cliente cliente = null;
        for(int i = 0; i<arreglo.length;i++){
            if (directorio.get(arreglo[i]).getDni().equals(dni)) {
                System.out.println("El cliente " + (directorio.get(arreglo[i]).getApellido())+ " ha sido eliminado.");
                tele += arreglo[i] + "/ ";
                cliente =directorio.get(arreglo[i]);
                directorio.remove(arreglo[i]);
            }
        }
        clientes.put(tele,cliente);
       return clientes;
    }
}