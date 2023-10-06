package punto11;

public abstract class Automovil {
    protected String patente;
    protected double precioBase;
    protected double alquilerPorDia;
    protected int estado;//0 ocupado, 1 disponible

    public Automovil(String patente){
        this.patente= patente;
        this.precioBase= 3000;
        this.estado= 1;
    }

    public String getPatente(){
        return this.patente;
    }
    public double getAlquilerPorDia(){
        return this.alquilerPorDia;
    }

    public void modificarEstado(int a) {
        if ((a==0) || (a==1)){
            this.estado= a;
        }
    }

    public abstract double calcularCostoPorDia();
}
