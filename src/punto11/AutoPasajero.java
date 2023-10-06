package punto11;

public class AutoPasajero extends Automovil{
    private int cantAsientos;

    public AutoPasajero(String patente, int cantAsientos) {
        super(patente);
        this.cantAsientos= cantAsientos;
    }

    public int getCantAsientos(){
        return this.cantAsientos;
    }
    @Override
    public double calcularCostoPorDia() {
        this.alquilerPorDia= this.precioBase + (300*cantAsientos);
        return this.alquilerPorDia;
    }
}
