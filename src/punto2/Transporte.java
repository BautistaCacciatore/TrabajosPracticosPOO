package punto2;

public class Transporte {
    private String destino;
    private String tipo;
    private String nombre;
    private int precio;

    /*Constructor*/
    public Transporte(String destino, String tipo, String nombre, int precio){
        setDestino(destino);
        setTipo(tipo);
        setNombre(nombre);
        setPrecio(precio);
    }

    /*Setters*/
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /*Getters*/
    public String getDestino() {
        return destino;
    }
    public String getTipo() {
        return tipo;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }
}
