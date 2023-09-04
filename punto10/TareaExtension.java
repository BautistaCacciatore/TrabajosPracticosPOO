package poo.punto10;

import poo.punto5.Tarea;

import java.time.LocalDate;

public class TareaExtension {
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
    private LocalDate fecha_recordatorio;

    /*Constructor*/
    public TareaExtension(String descripcion, TareaExtension.Prioridad prioridad, TareaExtension.Estado estado, LocalDate fecha_limite, LocalDate fecha_recordatorio){
        setDescripcion(descripcion);
        setPrioridad(prioridad);
        setEstado(estado);
        setFecha_limite(fecha_limite);
        setFecha_recordatorio(fecha_recordatorio);
    }

    /*Setters*/
    public void setDescripcion(String descripcion1){
        descripcion= descripcion1;
    }

    public void setPrioridad(TareaExtension.Prioridad prioridad1){
        prioridad= prioridad1;
    }

    public void setEstado(TareaExtension.Estado estado1){
        estado= estado1;
    }

    public void setFecha_limite(LocalDate fecha_limite1){
        fecha_limite= fecha_limite1;
    }

    public void setFecha_recordatorio(LocalDate fecha_recordatorio1){
        fecha_recordatorio= fecha_recordatorio1;
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

    public LocalDate getFechaRecordatorio(){
        return fecha_recordatorio;
    }

    /*Modificadores*/
    public void modificarDescripcion(String descripcion1){
        descripcion= descripcion1;
    }

    public void modificarPrioridad(TareaExtension.Prioridad prioridad1){
        prioridad= prioridad1;
    }

    public void modificarEstado(TareaExtension.Estado estado1){
        estado= estado1;
    }


    public boolean esCompleta(){
        if (this.estado == TareaExtension.Estado.COMPLETA ){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean esVencida() {
        if (this.estado == TareaExtension.Estado.VENCIDA){
            return true;
        }
        else {
            if (this.estado == TareaExtension.Estado.INCOMPLETA){
                if (LocalDate.now().isAfter(fecha_limite)) {
                    this.estado = TareaExtension.Estado.VENCIDA;
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

    public boolean esPorVencer(){
        if (getFechaRecordatorio() != null){
            if ((getFechaRecordatorio().isEqual(LocalDate.now()) || (getFechaRecordatorio().isBefore(LocalDate.now())))){
                if (getEstado() != Estado.COMPLETA){
                    setPrioridad(Prioridad.ALTA);
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        else {
            return false;
        }
    }

    public void mostrarTarea(){
        if (esCompleta()==true){
            System.out.println("(COMPLETA) " + descripcion);
        }
        else if(esVencida()==true){
            System.out.println("(VENCIDA) " + descripcion);
        }
        else if (esPorVencer()==true) {
            System.out.println("(POR VENCER) " + descripcion);
        } else{
            System.out.println("(INCOMPLETA) " + descripcion);
        }
    }
}
