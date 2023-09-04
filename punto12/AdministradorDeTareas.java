package poo.punto12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AdministradorDeTareas {
    private ArrayList<TareaExtension> array_tareas;

    /*Constructor*/
    public AdministradorDeTareas(){
        array_tareas = new ArrayList<>();
        setArray_tareas(array_tareas);
    }

    /*Setters*/
    public void setArray_tareas(ArrayList<TareaExtension> array_tareas) {
        this.array_tareas = array_tareas;
    }

    /*Getters*/
    public ArrayList<TareaExtension> getArray_tareas() {
        return array_tareas;
    }

    public void agregarTarea(String descripcion, TareaExtension.Prioridad prioridad, TareaExtension.Estado estado, LocalDate fecha_limite, LocalDate fecha_recordatorio){
        TareaExtension t= new TareaExtension(descripcion, prioridad, estado, fecha_limite, fecha_recordatorio);
        array_tareas.add(t);
        System.out.println("TAREA AGREGADA CON EXITO");
    }

    public void marcarTareaComoCompleta(String descripcion){
        TareaExtension t= buscarTarea(descripcion);
        if (t==null){
            System.out.println("LA TAREA NO SE ENCUENTRA EN LA LISTA");
        }
        else{
            t.setEstado(TareaExtension.Estado.COMPLETA);
            System.out.println("TAREA MARCADA COMO COMPLETA CON EXITO");
        }
    }

    public TareaExtension buscarTarea(String descripcion){
        for (int i=0; i<array_tareas.size(); i++){
            TareaExtension t= array_tareas.get(i);
            if (t.getDescripcion().equals(descripcion)){
                return t;
            }
        }
        return null;
    }

    public void listadoTareas(){
        for (int i=0; i<array_tareas.size(); i++){
            array_tareas.get(i).mostrarTarea();
        }
    }

    public ArrayList<TareaExtension> tareasNoVencidasPrioridad(){
        TareaExtension t;
        ArrayList<TareaExtension> tareasnovencidas= new ArrayList<>();
        for (int i=0; i<array_tareas.size(); i++){
            t= array_tareas.get(i);
            if (t.esVencida()==false){
                tareasnovencidas.add(t);
            }
        }
        Collections.sort(tareasnovencidas, new Comparator<TareaExtension>() {
            @Override
            public int compare(TareaExtension t1, TareaExtension t2) {
                return (t1.getPrioridad().compareTo(t2.getPrioridad()));
            }
        });
        return tareasnovencidas;
    }

    public ArrayList<TareaExtension> tareasNoVencidasFechaVencimiento(){
        TareaExtension t;
        ArrayList<TareaExtension> tareasnovencidas= new ArrayList<>();
        for (int i=0; i<array_tareas.size(); i++){
            t= array_tareas.get(i);
            if (t.esVencida()==false){
                tareasnovencidas.add(t);
            }
        }
        Collections.sort(tareasnovencidas, new Comparator<TareaExtension>() {
            @Override
            public int compare(TareaExtension t1, TareaExtension t2) {
                return (t1.getFechaLimite().compareTo(t2.getFechaLimite()));
            }
        });
        return tareasnovencidas;
    }


}
