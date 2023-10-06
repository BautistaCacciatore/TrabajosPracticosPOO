package punto3;
import java.util.ArrayList;

public class Disciplina {
    private String nombre;
    private ArrayList<Diagramacion> diagramaciones;

    /*Constructor*/
    public Disciplina(String nombre){
        setNombre(nombre);
        ArrayList<Diagramacion> array= new ArrayList<>();
        setDiagramaciones(array);
    }

    /*Setters*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDiagramaciones(ArrayList<Diagramacion> diagramaciones) {
        this.diagramaciones = diagramaciones;
    }

    /*Getters*/
    public String getNombre() {
        return nombre;
    }
    public ArrayList<Diagramacion> getDiagramaciones() {
        return diagramaciones;
    }

    public void añadirDiagramacion(Diagramacion d){
        diagramaciones.add(d);
    }

    public Diagramacion buscarDiagramacion(String dia, String hora){
        for (int i=0; i<diagramaciones.size(); i++){
            if ((diagramaciones.get(i).getDia().equals(dia)) && (diagramaciones.get(i).getHorario().equals(hora))){
                return diagramaciones.get(i);
            }
        }
        return null;
    }

    public void asistencias(Profesor profesor){
        for (int i=0; i<diagramaciones.size(); i++){
            if ((diagramaciones.get(i).getProfesor().equals(profesor))){
                diagramaciones.get(i).mostrarAsistencias();
            }
        }
    }

    public int pago(Profesor profesor){
        int pago= 0;
        for (int i=0; i<diagramaciones.size(); i++){
            if ((diagramaciones.get(i).getProfesor().equals(profesor))){
                pago+= diagramaciones.get(i).cantidadAsistencias();
            }
        }
        return pago;
    }

    public int ingresoTotal(){
        int asis= 0;
        for (int i=0; i<diagramaciones.size(); i++){
            asis+= diagramaciones.get(i).cantidadAsistencias();
        }
        return asis;
    }



}
