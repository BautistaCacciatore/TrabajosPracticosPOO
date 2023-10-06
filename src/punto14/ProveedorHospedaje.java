package punto14;

public class ProveedorHospedaje extends Proveedor{
    private double cantClientesMinima;

    public ProveedorHospedaje(String nombre, double precioBase,int cantClientesMinima){
        super(nombre, precioBase);
        this.cantClientesMinima= cantClientesMinima;
    }

    public double getCantClientesMinima() {
        return cantClientesMinima;
    }

    @Override
    public void calcularPrecioFinal(int cantClientes) {
        if (cantClientes > cantClientesMinima){
            this.precioFinal= this.precioBase - (this.precioBase * 0.5);
        }
        else{
            this.precioFinal= this.precioBase;
        }
    }

    public void mostrar(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cantidad clientes minima: " + getCantClientesMinima());
    }
}
