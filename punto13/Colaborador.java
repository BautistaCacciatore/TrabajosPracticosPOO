package poo.punto13;

import java.util.ArrayList;

public class Colaborador {
    private String nombre;
    private String apellido;
    private ArrayList<TareaExtensionDos> tareas_realizadas;
    private int cant_tareas_realizadas;

    /*Costructor*/
    public Colaborador(String nombre, String apellido){
        setNombre(nombre);
        setApellido(apellido);
        ArrayList<TareaExtensionDos> realizadas = new ArrayList<>();
        setTareas_realizadas(realizadas);
        setCant_tareas_realizadas(0);
    }

    /*Setters*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTareas_realizadas(ArrayList<TareaExtensionDos> tareas_realizadas) {
        this.tareas_realizadas = tareas_realizadas;
    }

    public void setCant_tareas_realizadas(int cant_tareas_realizadas) {
        this.cant_tareas_realizadas = cant_tareas_realizadas;
    }

    /*Getters*/
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ArrayList<TareaExtensionDos> getTareas_realizadas() {
        return tareas_realizadas;
    }

    public int getCant_tareas_realizadas() {
        return cant_tareas_realizadas;
    }

    public void agregarTareaRealizada(TareaExtensionDos t){
        tareas_realizadas.add(t);
        cant_tareas_realizadas+=1;
    }

    public ArrayList<TareaExtensionDos> listadoDeTareasRealizadas(){
        return getTareas_realizadas();
    }

}
