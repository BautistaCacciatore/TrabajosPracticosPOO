package punto3;

public class Profesor {
    private String nombre;
    private String apellido;
    private String dni;

    /*Constructor*/
    public Profesor(String nombre, String apellido, String dni){
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
    }

    /*Setters*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    /*Getters*/
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDni() {
        return dni;
    }
}
