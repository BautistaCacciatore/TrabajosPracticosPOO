package punto11;

public class Presupuesto {
    private Automovil automovil;
    private int cantDias;
    private double presupuestoPorDia;
    private double presupuestoTotaL;

    public Presupuesto(Automovil automovil, int cantDias){
        this.automovil= automovil;
        this.cantDias= cantDias;
        this.presupuestoPorDia= automovil.calcularCostoPorDia();
        this.presupuestoTotaL= this.presupuestoPorDia * cantDias;
    }

    public Automovil getAutomovil() {
        return automovil;
    }
    public int getCantDias() {
        return cantDias;
    }
    public double getPresupuestoPorDia() {
        return presupuestoPorDia;
    }
    public double getPresupuestoTotaL() {
        return presupuestoTotaL;
    }

    public void mostrarPresupuesto(){
        System.out.println("PRESUPUESTO: ");
        System.out.println("AUTOMOVIL: " + this.automovil.getPatente());
        System.out.println("CANTIDAD DIAS: " + this.cantDias);
        System.out.println("PRECIO POR DIA: " + this.presupuestoPorDia);
        System.out.println("PRECIO TOTAL: " + this.presupuestoTotaL);
    }
}
