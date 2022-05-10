package AlcarazMelanyTP6;

public class Clientes {

    private long dni;

    private String nombre;

    private String apellido;

    private String ciudad;

    private String domicilio;

    public Clientes(long dni, String nombre, String apellido, String ciudad, String domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.domicilio = domicilio;
    }

    public Clientes() {
    }

   

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCiudad(String cuidad) {
        this.ciudad = cuidad;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public long getDni() {
        return dni;
    }
    

    @Override
    public String toString() {
        return "Clientes{" + "dni= " + dni + ", nombre= " + nombre + ", apellido= " + apellido + ", cuidad= " + ciudad + ", domicilio= " + domicilio + '}';
    }

    
   
}
