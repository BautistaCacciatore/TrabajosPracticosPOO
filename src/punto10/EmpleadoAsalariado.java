package punto10;

import java.time.LocalDate;

public class EmpleadoAsalariado extends Empleado{

    public EmpleadoAsalariado(String nombre, String apellido, String telefono, String cuit, String fechaCumpleaños, double sueldo) {
        super(nombre, apellido, telefono, cuit, fechaCumpleaños);
        this.sueldo= sueldo;
    }

    public double calcularSueldo(){
        if (this.cumpleaños.getMonthValue()== LocalDate.now().getMonthValue()){
            this.sueldo+= 3000;
        }
        return this.sueldo;
    }
}
