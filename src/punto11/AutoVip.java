package punto11;

public class AutoVip extends Automovil{
    private int cantAsientos;

    public AutoVip(String patente, int cantAsientos){
        super(patente);
        this.cantAsientos= cantAsientos;
    }

    public int getCantAsientos(){
        return this.cantAsientos;
    }

    @Override
    public double calcularCostoPorDia() {
        this.alquilerPorDia= precioBase + (500*cantAsientos);
        return this.alquilerPorDia;
    }
}
