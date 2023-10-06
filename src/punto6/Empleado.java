package punto6;

public class Empleado {
    private String nombre;
    private String apellido;
    private String dni;

    /*Constructor*/
    public Empleado(String nombre, String apellido, String dni) {
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

    private void setDni(String dni) {
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