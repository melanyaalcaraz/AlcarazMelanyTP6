package AlcarazMelanyTP6;

import java.util.*;


public class DirTelefonico {

    TreeMap<Long,Clientes> directorio = new TreeMap <>();

    public boolean agregarCliente(long telefono, Clientes cliente) {
        if(!directorio.containsKey(telefono)){
             directorio.put(telefono,cliente);
             return true;
             
        } else {
            return false;
        }
    }

    public Clientes buscarCliente(long telefono) {
       // System.out.println("Se encontro el cliente: ");
        return directorio.get(telefono);

    }

    public List<Long> buscarTelefono(Clientes apellido) {
        ArrayList<Long> telefonos = new ArrayList<>();
        //obtiene la clave
        Set<Long> claves = directorio.keySet();
        Iterator<Long> it= claves.iterator();
        while(it.hasNext()){
            Long telefono= it.next();
            Clientes c= directorio.get(telefono);
            if(c.getApellido() .equals(apellido)){
                telefonos.add(telefono);
            }}
        return telefonos;
    }

    public List<Clientes> buscarClientes(String ciudad){
        
        ArrayList<Clientes> clientes = new ArrayList<>();
        
        Set<Long> tels = directorio.keySet();
        Iterator<Long> it = tels.iterator();
        while(it.hasNext()){
            Long telefono = it.next();
            Clientes c = directorio.get(telefono);
            if(c.getCiudad().equals(ciudad)){
                clientes.add(c);
            }
        }
        return clientes;
    }


    public Clientes borrarCliente(long telefono) {
        Clientes cliente= directorio.remove(telefono);
        return cliente;
    }
}
