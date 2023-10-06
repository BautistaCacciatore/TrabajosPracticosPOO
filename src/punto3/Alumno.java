package punto3;

public class Alumno {
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;

    /*Constructor*/
    public Alumno(String nombre, String apellido, String dni, String telefono){
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
        setTelefono(telefono);
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
    public void setTelefono(String telefono){
        this.telefono= telefono;
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
    public String getTelefono() {
        return telefono;
    }

}
