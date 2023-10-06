package punto10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Empleado {
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String cuit;
    protected double sueldo;
    protected LocalDate cumpleaños;

    public Empleado(String nombre, String apellido, String telefono, String cuit, String fechaCumpleaños){
        this.nombre= nombre;
        this.apellido= apellido;
        this.telefono= telefono;
        this.cuit= cuit;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fecha = LocalDate.parse(fechaCumpleaños, formatter);
        this.cumpleaños= fecha;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public String getTelefono() {
        return this.telefono;
    }
    public String getCuit() {
        return this.cuit;
    }
    public LocalDate getCumpleaños(){
        return this.cumpleaños;
    }
    public double getSueldo(){
        return this.sueldo;
    }


    public abstract double calcularSueldo();
}
