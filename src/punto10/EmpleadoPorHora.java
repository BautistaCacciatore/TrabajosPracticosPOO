package punto10;

import java.time.LocalDate;

public class EmpleadoPorHora extends Empleado{
    private int horasTrabajadas;
    private double monto;

    public EmpleadoPorHora(String nombre, String apellido, String telefono, String cuit, String fechaCumpleaños, int horasTrabajadas, double monto) {
        super(nombre, apellido, telefono, cuit, fechaCumpleaños);
        this.horasTrabajadas= horasTrabajadas;
        this.monto= monto;
    }

    public double calcularSueldo(){
        if (this.horasTrabajadas > 40){
            this.sueldo= (monto*horasTrabajadas) * 1.20;
        }
        else{
            this.sueldo= monto*horasTrabajadas;
        }
        if (this.cumpleaños.getMonthValue()== LocalDate.now().getMonthValue()){
            this.sueldo+= 2000;
        }
        return this.sueldo;
    }

}
