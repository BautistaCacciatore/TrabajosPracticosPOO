package punto11;

public class Camion extends Automovil{
    private double costoFijo;
    private int diasAlquiler;

    public Camion(String patente){
        super(patente);
        this.costoFijo= 100000;
    }

    @Override
    public double calcularCostoPorDia() {
        if (diasAlquiler>30){
            this.precioBase= 75000;
            this.alquilerPorDia= 75000;
        }
        else{
            this.alquilerPorDia= this.costoFijo;
        }
        return this.alquilerPorDia;
    }
}
