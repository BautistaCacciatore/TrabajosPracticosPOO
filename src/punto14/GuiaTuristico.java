package punto14;

public class GuiaTuristico extends Proveedor{
    private String apellido;
    private String dni;
    public GuiaTuristico(String nombre, double precioBase, String apellido, String dni){
        super(nombre, precioBase);
        this.apellido= apellido;
        this.dni= dni;
    }

    public String getApellido() {
        return apellido;
    }
    public String getDni() {
        return dni;
    }

    @Override
    public void calcularPrecioFinal(int cantClientes) {
        if (cantClientes>200){
            this.precioFinal= this.precioBase + 90;
        }
        else{
            this.precioFinal= this.precioBase;
        }
    }

    public void mostrar(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("DNI: " + getDni());
    }

}
