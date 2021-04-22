package Diaz_TP6;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Directorio {
    private final TreeMap<String,Persona> directorio = new TreeMap<>();
    
    //Constructor
    public Directorio() {
    }
    
    // agregarCliente() que permite registrar un nuevo cliente con su 
    //respectivo nro de teléfono. Siendo el nro del teléfono la clave del mismo.
    public void agregarCliente(String telefono, Persona persona){
        if(directorio.get(telefono)!=null){
            System.out.println("Este telefono ya se encuentra agendado.");
        }else {
            System.out.println("Ingreso exitoso!");
        }
        directorio.put(telefono, persona);
    }
    
    // buscarCliente() que en base al nro de teléfono retorna el 
    //Cliente asociado al mismo.
    public Persona buscarCliente(String telefono){
        if(directorio.get(telefono)==null){
            System.out.println("No se encontro dicha persona en el directorio");
        }
        return directorio.get(telefono);
    }
    
    // buscarTeléfono() que en base a un apellido nos devuelve una lista con los 
    //nros de teléfono asociados a dicho apellido.
    public Set<String> buscarTelefono(String apellido) {
        Set<String> aux = new HashSet<>();
        directorio.keySet().forEach(a -> {
            if (directorio.get(a).getApellido().equals(apellido)) {
                aux.add(a);
            }
        });
        if(aux.isEmpty()){
            System.out.println("No se encontro dicha persona en el directorio");
        } else {
            System.out.println(aux);
        }
        return aux;
    }
    
    // buscarClientes() que en base a una ciudad nos devuelve una 
    //lista con los Clientes asociados a dicha ciudad.
    public Set<Persona> buscarClientes(String ciudad) {
        Set<Persona> aux = new HashSet<>();
        directorio.keySet().forEach((String a) -> {
            if (directorio.get(a).getCiudad().equals(ciudad)) {
                aux.add(directorio.get(a));
            }
        });
        if(aux.isEmpty()){
            System.out.println("No se encontro a ninguna persona de esa ciudad en el directorio");
        } else {
            System.out.println(aux);
        }
        return aux;
    }
    
    // borrarCliente() que en base a un dni elimina el cliente del directorio.
    public void borrarCliente(String dni){
        Set<String> aux = directorio.keySet();
        for(String a:aux){
            if (directorio.get(a).getDni().equals(dni)) {
                System.out.println("El cliente " + (directorio.get(a).getApellido())+ " ha sido eliminado.");
                directorio.remove(a);
                return;
            }
        }
    }
}