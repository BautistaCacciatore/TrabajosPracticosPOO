package punto1;

import java.time.LocalDate;

public class Socio {
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String telefono;
    private LocalDate fecha_inscripto;
    private Suscripcion suscripcion;
    private boolean abono_mes;
    private LocalDate fecha_ultimo_abono;

    /*Constructor*/
    public Socio(String nombre, String apellido, String dni, String email, String telefono, TipoSuscripcion tipo) {
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
        setEmail(email);
        setTelefono(telefono);
        setFecha_inscripto(LocalDate.now());
        setSuscripcion(new Suscripcion(tipo));
        setAbono_mes(true);
        setFecha_ultimo_abono(LocalDate.now());
    }

    /*Setters*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    private void setFecha_inscripto(LocalDate fecha_inscripto) {
        this.fecha_inscripto = fecha_inscripto;
    }
    public void setSuscripcion(Suscripcion tipo){
        this.suscripcion= tipo;
    }
    public void setAbono_mes(boolean abono_mes) {
        this.abono_mes = abono_mes;
    }
    public void setFecha_ultimo_abono(LocalDate fecha_ultimo_abono) {
        this.fecha_ultimo_abono = fecha_ultimo_abono;
    }

    /*Getters*/
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDni() {
        return dni;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefono() {
        return telefono;
    }
    public LocalDate getFecha_inscripto() {
        return fecha_inscripto;
    }
    public Suscripcion getSuscripcion(){
        return suscripcion;
    }
    public boolean getAbono_mes() {
        return abono_mes;
    }
    public LocalDate getFecha_ultimo_abono() {
        return fecha_ultimo_abono;
    }

    public void mostrarSocio(){
        System.out.println(getNombre() + " " + getApellido() + " " + getDni());
    }

    public void abonarCuota(){
        setFecha_ultimo_abono(LocalDate.now());
        setAbono_mes(true);
    }
}
