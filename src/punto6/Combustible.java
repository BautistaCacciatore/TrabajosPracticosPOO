package punto6;

public class Combustible {
    private String nombre;
    private float precio;

    /*Constructor*/
    public Combustible(String nombre, float precio){
        setNombre(nombre);
        setPrecio(precio);
    }

    /*Setters*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private void setPrecio(float precio) {
        this.precio = precio;
    }

    /*Getters*/
    public String getNombre() {
        return nombre;
    }
    public float getPrecio() {
        return precio;
    }
}
