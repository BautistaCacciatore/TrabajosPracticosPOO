package punto11;

public class Combi extends Automovil{
    private int cantAsientos;

    public Combi(String patente, int cantAsientos){
        super(patente);
        this.precioBase= 4500;
        this.cantAsientos= cantAsientos;
    }

    @Override
    public double calcularCostoPorDia() {
        this.alquilerPorDia= precioBase + (300*cantAsientos);
        return this.alquilerPorDia;
    }
}
