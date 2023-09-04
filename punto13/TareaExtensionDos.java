package poo.punto13;

import java.time.LocalDate;

public class TareaExtensionDos {
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
    private TareaExtensionDos.Prioridad prioridad;
    private TareaExtensionDos.Estado estado;
    private LocalDate fecha_limite;
    private LocalDate fecha_recordatorio;
    private Colaborador colaborador;
    private LocalDate fecha_realizada;

    /*Constructor*/
    public TareaExtensionDos(String descripcion, TareaExtensionDos.Prioridad prioridad, TareaExtensionDos.Estado estado, LocalDate fecha_limite, LocalDate fecha_recordatorio){
        setDescripcion(descripcion);
        setPrioridad(prioridad);
        setEstado(estado);
        setFecha_limite(fecha_limite);
        setFecha_recordatorio(fecha_recordatorio);
    }

    /*Setters*/
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setFecha_limite(LocalDate fecha_limite) {
        this.fecha_limite = fecha_limite;
    }

    public void setFecha_recordatorio(LocalDate fecha_recordatorio) {
        this.fecha_recordatorio = fecha_recordatorio;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public void setFecha_realizada(LocalDate fecha_realizada) {
        this.fecha_realizada = fecha_realizada;
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

    public LocalDate getFecha_limite() {
        return fecha_limite;
    }

    public LocalDate getFecha_recordatorio() {
        return fecha_recordatorio;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public LocalDate getFecha_realizada() {
        return fecha_realizada;
    }

    /*Modificadores*/
    public void modificarDescripcion(String descripcion1){
        descripcion= descripcion1;
    }

    public void modificarPrioridad(TareaExtensionDos.Prioridad prioridad1){
        prioridad= prioridad1;
    }

    public void modificarEstado(TareaExtensionDos.Estado estado1){
        estado= estado1;
    }


    public boolean esCompleta(){
        if (this.estado == TareaExtensionDos.Estado.COMPLETA ){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean esVencida() {
        if (this.estado == TareaExtensionDos.Estado.VENCIDA){
            return true;
        }
        else {
            if (this.estado == TareaExtensionDos.Estado.INCOMPLETA){
                if (LocalDate.now().isAfter(fecha_limite)) {
                    this.estado = TareaExtensionDos.Estado.VENCIDA;
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
        if (getFecha_recordatorio() != null){
            if ((getFecha_recordatorio().isEqual(LocalDate.now()) || (getFecha_recordatorio().isBefore(LocalDate.now())))){
                if (getEstado() != TareaExtensionDos.Estado.COMPLETA){
                    setPrioridad(TareaExtensionDos.Prioridad.ALTA);
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
