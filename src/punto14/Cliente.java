package punto14;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private ArrayList<PaqueteTurismo> compras;

    /*Constructor*/
    public Cliente(String nombre, String apellido, String dni) {
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
        setCompras(new ArrayList<>());
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
    private void setCompras(ArrayList<PaqueteTurismo> compras) {
        this.compras = compras;
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
    public ArrayList<PaqueteTurismo> getCompras() {
        return compras;
    }

    public void registrarCompra(PaqueteTurismo compra){
        compras.add(compra);
    }

}
