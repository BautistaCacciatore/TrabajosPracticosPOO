package poo.punto13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AdministradorDeTareas {
    private ArrayList<TareaExtensionDos> array_tareas;
    private ArrayList<Colaborador> array_colaboradores;

    /*Constructor*/
    public AdministradorDeTareas(){
        ArrayList<TareaExtensionDos> array_tareas = new ArrayList<>();
        setArray_tareas(array_tareas);
        ArrayList<Colaborador> array_colaboradores = new ArrayList<>();
        setArray_colaboradores(array_colaboradores);
    }

    /*Setters*/
    public void setArray_tareas(ArrayList<TareaExtensionDos> array_tareas) {
        this.array_tareas = array_tareas;
    }

    public void setArray_colaboradores(ArrayList<Colaborador> array_colaboradores) {
        this.array_colaboradores = array_colaboradores;
    }

    /*Getters*/
    public ArrayList<TareaExtensionDos> getArray_tareas() {
        return array_tareas;
    }
    public ArrayList<Colaborador> getArray_colaboradores() {
        return array_colaboradores;
    }

    public void agregarTarea(String descripcion, TareaExtensionDos.Prioridad prioridad, TareaExtensionDos.Estado estado, LocalDate fecha_limite, LocalDate fecha_recordatorio){
        TareaExtensionDos t= new TareaExtensionDos(descripcion, prioridad, estado, fecha_limite, fecha_recordatorio);
        array_tareas.add(t);
        System.out.println("TAREA AGREGADA CON EXITO");
    }

    public Colaborador agregarColaborador(String nombre, String apellido){
        Colaborador c= new Colaborador(nombre, apellido);
        array_colaboradores.add(c);
        return c;
    }

    public void marcarTareaComoCompleta(String descripcion, String nombre, String apellido){
        TareaExtensionDos t= buscarTarea(descripcion);
        if (t==null){
            System.out.println("LA TAREA NO SE ENCUENTRA EN LA LISTA");
        }
        else{
            t.setEstado(TareaExtensionDos.Estado.COMPLETA);
            Colaborador c_buscado= buscarColaborador(nombre, apellido);
            if (c_buscado==null){
                Colaborador c= agregarColaborador(nombre, apellido);
                c.agregarTareaRealizada(t);
                t.setColaborador(c);
            }
            else{
                c_buscado.agregarTareaRealizada(t);
                t.setColaborador(c_buscado);
            }
            t.setFecha_realizada(LocalDate.now());

            System.out.println("TAREA MARCADA COMO COMPLETA CON EXITO");
        }
    }

    public TareaExtensionDos buscarTarea(String descripcion){
        for (int i=0; i<array_tareas.size(); i++){
            TareaExtensionDos t= array_tareas.get(i);
            if (t.getDescripcion().equals(descripcion)){
                return t;
            }
        }
        return null;
    }

    public Colaborador buscarColaborador(String nombre, String apellido){
        for (int i=0; i<array_colaboradores.size(); i++){
            Colaborador c= array_colaboradores.get(i);
            if ((c.getNombre().equals(nombre)) && (c.getApellido().equals(apellido))){
                return c;
            }
        }
        return null;
    }

    public void listadoTareas(){
        for (int i=0; i<array_tareas.size(); i++){
            array_tareas.get(i).mostrarTarea();
        }
    }

    public ArrayList<TareaExtensionDos> tareasNoVencidasPrioridad(){
        TareaExtensionDos t;
        ArrayList<TareaExtensionDos> tareasnovencidas= new ArrayList<>();
        for (int i=0; i<array_tareas.size(); i++){
            t= array_tareas.get(i);
            if (t.esVencida()==false){
                tareasnovencidas.add(t);
            }
        }
        Collections.sort(tareasnovencidas, new Comparator<TareaExtensionDos>() {
            @Override
            public int compare(TareaExtensionDos t1, TareaExtensionDos t2) {
                return (t1.getPrioridad().compareTo(t2.getPrioridad()));
            }
        });
        return tareasnovencidas;
    }

    public ArrayList<TareaExtensionDos> tareasNoVencidasFechaVencimiento(){
        TareaExtensionDos t;
        ArrayList<TareaExtensionDos> tareasnovencidas= new ArrayList<>();
        for (int i=0; i<array_tareas.size(); i++){
            t= array_tareas.get(i);
            if (t.esVencida()==false){
                tareasnovencidas.add(t);
            }
        }
        Collections.sort(tareasnovencidas, new Comparator<TareaExtensionDos>() {
            @Override
            public int compare(TareaExtensionDos t1, TareaExtensionDos t2) {
                return (t1.getFecha_limite().compareTo(t2.getFecha_limite()));
            }
        });
        return tareasnovencidas;
    }

    public ArrayList<TareaExtensionDos> tareasRealizadasPor(String nombre, String apellido){
        Colaborador c= buscarColaborador(nombre, apellido);
        if (c==null){
            return null;
        }
        else{
            return c.listadoDeTareasRealizadas();
        }
    }


}

