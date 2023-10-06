package punto11;

import java.time.LocalDate;

public class Alquiler {
    private Presupuesto presupuesto;
    private Cliente cliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double totalAPagar;

    public Alquiler(Presupuesto presupuesto, Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin){
        this.presupuesto= presupuesto;
        this.cliente= cliente;
        this.fechaInicio= fechaInicio;
        this.fechaFin= fechaFin;
        this.totalAPagar= presupuesto.getPresupuestoTotaL();
    }

    public Automovil getAutomovil(){
        return presupuesto.getAutomovil();
    }
    public int getCantDias(){
        return presupuesto.getCantDias();
    }
    public double getCostoPorDia(){
        return presupuesto.getPresupuestoPorDia();
    }
    public double getTotalAPagar(){
        return this.totalAPagar;
    }
    public Cliente getCliente() {
        return cliente;
    }
}
