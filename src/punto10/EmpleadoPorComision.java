package punto10;

import java.time.LocalDate;

public class EmpleadoPorComision extends Empleado{
    private double porcentajeVentas;
    private int cantidadVentasRealizadas;
    private double montoBrutoVentas;

    public EmpleadoPorComision(String nombre, String apellido, String telefono, String cuit, String fechaCumpleaños, double porcentajeVentas) {
        super(nombre, apellido, telefono, cuit, fechaCumpleaños);
        this.porcentajeVentas= porcentajeVentas;
    }

    public void setCantidadVentasRealizadas(int cantidad, double montoBrutoVentas){
        this.cantidadVentasRealizadas= cantidad;
        this.montoBrutoVentas= montoBrutoVentas;
    }
    public void registrarNuevaVenta(double montoBrutoVenta){
        this.cantidadVentasRealizadas+= 1;
        this.montoBrutoVentas+= montoBrutoVenta;
    }

    public double calcularSueldo(){
        this.sueldo= cantidadVentasRealizadas * porcentajeVentas;
        if (this.cumpleaños.getMonthValue()== LocalDate.now().getMonthValue()){
            this.sueldo+= 2000;
            this.sueldo+= montoBrutoVentas * 0.5;
        }
        return this.sueldo;
    }
}
