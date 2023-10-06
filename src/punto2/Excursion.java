package punto2;

public class Excursion {
    private String ciudad;
    private String nombre;
    private int precio;

    /*Constructor*/
    public Excursion(String ciudad, String nombre, int precio){
        setCiudad(ciudad);
        setNombre(nombre);
        setPrecio(precio);
    }

    /*Setters*/
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /*Getters*/
    public String getCiudad() {
        return ciudad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }
}
