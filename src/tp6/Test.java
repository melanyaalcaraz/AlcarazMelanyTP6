package tp6;

public class Test {

     public static void main(String[] args) {
         
         DirTelefonico directorio = new DirTelefonico();
         
         Clientes  julia= new Clientes(1224,"Julia","Lucero","San Luis","Las Palmeritas");
         Clientes  luisa= new Clientes(1225,"Luisa","Martinez","Mendoza","Las Abejas");
         directorio.agregarCliente(124, julia);
         directorio.agregarCliente(222, luisa);
         
         //System.out.println(directorio.buscarCliente(124));
         
         //System.out.println("Buscando clientes"+directorio.buscarClientes("Mendoza"));
         System.out.println(directorio.borrarCliente(124)+"");
         
     }
}
