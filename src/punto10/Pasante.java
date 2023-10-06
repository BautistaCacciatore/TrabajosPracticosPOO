package punto10;

public class Pasante extends Empleado{

    public Pasante(String nombre, String apellido, String telefono, String cuit, String fechaCumpleaños) {
        super(nombre, apellido, telefono, cuit, fechaCumpleaños);
    }

    public double calcularSueldo(){
        this.sueldo= 0;
        return this.sueldo;
    }
}
