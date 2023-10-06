package punto14;

public abstract class Proveedor {
    protected String nombre;
    protected double precioBase;
    protected double precioFinal;

    public Proveedor(String nombre, double precioBase){
        this.nombre= nombre;
        this.precioBase= precioBase;
    }

    public String getNombre() {
        return nombre;
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public double getPrecioFinal(){
        return precioFinal;
    }

    public abstract void calcularPrecioFinal(int cantClientes);
    public abstract void mostrar();
}
