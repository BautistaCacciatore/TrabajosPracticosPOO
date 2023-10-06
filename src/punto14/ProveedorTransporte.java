package punto14;

public class ProveedorTransporte extends Proveedor{
    private String tipo;
    public ProveedorTransporte(String nombre, double precioBase, String tipo){
        super(nombre, precioBase);
        this.tipo= tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void calcularPrecioFinal(int cantClientes) {
        this.precioFinal= this.precioBase + (cantClientes * (precioBase * 0.3));
    }

    public void mostrar(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo: " + getTipo());
    }
}
