package punto11;

public class Camioneta extends Automovil {
    private int PAT;

    public Camioneta(String patente, int PAT) {
        super(patente);
        this.PAT = PAT;
    }

    @Override
    public double calcularCostoPorDia() {
        this.alquilerPorDia = precioBase + (600 * PAT);
        return this.alquilerPorDia;
    }
}