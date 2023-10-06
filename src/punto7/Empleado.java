package punto7;

public class Empleado {
    private String nombre;
    private String apellido;
    private String dni;
    private boolean puedeAplicarDescuento;

    /*Constructor*/
    public Empleado(String nombre, String apellido, String dni) {
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
        setPuedeAplicarDescuento(false);
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
    public void setPuedeAplicarDescuento(boolean puede){
        this.puedeAplicarDescuento= puede;
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
    public boolean getPuedeAplicarDescuento(){
        return puedeAplicarDescuento;
    }
}