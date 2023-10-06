package punto1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Club {
    private String nombre;
    private String localidad;
    private LocalDate fecha_fundacion;
    private int cantidad_socios;
    private ArrayList<Socio> array_socios;

    /*Constructor*/
    public Club(String nombre, String localidad) {
        setNombre(nombre);
        setLocalidad(localidad);
        setFecha_fundacion(LocalDate.now());
        setCantidad_socios(0);
        setArray_socios(new ArrayList<Socio>());
    }

    /*Setters*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public void setFecha_fundacion(LocalDate fecha_fundacion) {
        this.fecha_fundacion = fecha_fundacion;
    }
    public void setCantidad_socios(int cantidad_socios) {
        this.cantidad_socios = cantidad_socios;
    }
    public void setArray_socios(ArrayList<Socio> array_socios){
        this.array_socios= array_socios;
    }

    /*Getters*/
    public String getNombre() {
        return nombre;
    }
    public String getLocalidad() {
        return localidad;
    }
    public LocalDate getFecha_fundacion() {
        return fecha_fundacion;
    }
    public int getCantidad_socios() {
        return cantidad_socios;
    }
    public ArrayList<Socio> getArray_socios() {
        return array_socios;
    }

    public void asociar(String nombre, String apellido, String dni, String email, String telefono, TipoSuscripcion tipo){
        Socio socio= new Socio(nombre, apellido, dni, email, telefono, tipo);
        array_socios.add(socio);
        cantidad_socios+=1;
        System.out.println("SOCIO ASOCIADO CON EXITO");
    }

    public void abonarCuota(String dni){
        Socio socio= buscarSocio(dni);
        if (socio != null){
            socio.abonarCuota();
        }
        else{
            System.out.println("NO SE ENCUENTRA UN SOCIO CON EL DNI INDICADO.");
        }
    }

    private Socio buscarSocio(String dni){
        for (int i=0; i< array_socios.size(); i++){
            Socio socio= array_socios.get(i);
            if (socio.getDni().equals(dni)){
                return socio;
            }
        }
        return null;
    }

    public void reporteNuevosSocios(LocalDate fecha){
        System.out.println("NUEVOS SOCIOS INSCRIPTOS EN EL MES " + fecha.getMonthValue() + ":");
        for (int i=0; i< array_socios.size(); i++){
            Socio socio_aux= array_socios.get(i);
            if (socio_aux.getFecha_inscripto().getMonthValue()== fecha.getMonthValue()){
                socio_aux.mostrarSocio();
            }
        }
    }

    public void actividadesPorSuscripcion(){
        Suscripcion s1= new Suscripcion(TipoSuscripcion.BASICA);
        Suscripcion s2= new Suscripcion(TipoSuscripcion.INTERMEDIA);
        Suscripcion s3= new Suscripcion(TipoSuscripcion.DESTACADA);
        System.out.println("ACTIVIDADES DE LA SUSCRIPCION BASICA: ");
        s1.mostrarActividades();
        System.out.println("ACTIVIDADES DE LA SUSCRIPCION INTERMEDIA: ");
        s2.mostrarActividades();
        System.out.println("ACTIVIDADES DE LA SUSCRIPCION DESTACADA: ");
        s3.mostrarActividades();
    }

    public void listadoSociosPorSuscripcion(TipoSuscripcion tipo){
        System.out.println("SOCIOS CON LA SUSCRIPCION " + tipo);
        for (int i=0; i<array_socios.size(); i++){
            if (array_socios.get(i).getSuscripcion().getTipo().equals(tipo)){
                array_socios.get(i).mostrarSocio();
            }
        }
    }
}
