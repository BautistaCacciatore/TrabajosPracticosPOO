package punto10;

import java.time.LocalDate;

public class EmpleadoPorComisionYSalarioBase extends Empleado{
    private double salarioBase;
    private double porcentajeVentas;
    private int cantidadVentasRealizadas;
    private double montoBrutoVentas;

    public EmpleadoPorComisionYSalarioBase(String nombre, String apellido, String telefono, String cuit, String fechaCumpleaños, double salarioBase, double porcentajeVentas) {
        super(nombre, apellido, telefono, cuit, fechaCumpleaños);
        this.salarioBase= salarioBase;
        this.porcentajeVentas= porcentajeVentas;
    }

    public void setCantidadVentasRealizadas(int cantidad, double montoBrutoVentas){
        this.cantidadVentasRealizadas= cantidad;
        this.montoBrutoVentas= montoBrutoVentas;
    }

    public void registrarNuevaVenta(double montoBrutoVentas){
        this.cantidadVentasRealizadas+= 1;
        this.montoBrutoVentas+= montoBrutoVentas;
    }

    public double calcularSueldo(){
        this.sueldo= (cantidadVentasRealizadas * porcentajeVentas) + salarioBase;
        if (this.cumpleaños.getMonthValue()== LocalDate.now().getMonthValue()){
            this.sueldo+= 3000;
            this.sueldo+= montoBrutoVentas * 0.5;
        }
        return this.sueldo;
    }

}
