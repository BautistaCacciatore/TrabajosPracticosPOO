package poo.punto5;
import java.time.LocalDate;

public class Tarea {
    public enum Prioridad{
        ALTA,
        NORMAL,
        BAJA,
    }

    public enum Estado{
        COMPLETA,
        INCOMPLETA,
        VENCIDA,
    }

    private String descripcion;
    private Prioridad prioridad;
    private Estado estado;
    private LocalDate fecha_limite;

    /*Constructor*/
    public Tarea(String descripcion, Prioridad prioridad, Estado estado, LocalDate fecha_limite){
        setDescripcion(descripcion);
        setPrioridad(prioridad);
        setEstado(estado);
        setFecha_limite(fecha_limite);
    }

    /*Setters*/
    public void setDescripcion(String descripcion1){
        descripcion= descripcion1;
    }

    public void setPrioridad(Prioridad prioridad1){
        prioridad= prioridad1;
    }

    public void setEstado(Estado estado1){
        estado= estado1;
    }

    public void setFecha_limite(LocalDate fecha_limite1){
        fecha_limite= fecha_limite1;
    }

    /*Getters*/
    public String getDescripcion() {
        return descripcion;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public Estado getEstado() {
        return estado;
    }

    public LocalDate getFechaLimite() {
        return fecha_limite;
    }

    /*Modificadores*/
    public void modificarDescripcion(String descripcion1){
        descripcion= descripcion1;
    }

    public void modificarPrioridad(Prioridad prioridad1){
        prioridad= prioridad1;
    }

    public void modificarEstado(Estado estado1){
        estado= estado1;
    }


    public boolean esCompleta(){
        if (this.estado == Estado.COMPLETA ){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean esVencida() {
        if (this.estado == Estado.VENCIDA){
            return true;
        }
        else {
            if (this.estado == Estado.INCOMPLETA){
                if (LocalDate.now().isAfter(fecha_limite)) {
                    this.estado = Estado.VENCIDA;
                    return true;
                } else {
                    return false;
                }
            }
            else{
                return false;
            }
        }
    }

    public void mostrarTarea(){
        if (esCompleta()==true){
            System.out.println("(COMPLETA) " + descripcion);
        }
        else if(esVencida()==true){
            System.out.println("(VENCIDA) " + descripcion);
        }
        else{
            System.out.println("(IMCOMPLETA) " + descripcion);
        }
    }

}
