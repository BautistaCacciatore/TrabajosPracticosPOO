package punto3;

import java.util.ArrayList;

public class Diagramacion {
    private String dia;
    private String horario;
    private String nivel;
    private Disciplina disciplina;
    private Profesor profesor;
    private ArrayList<Alumno> alumnos_inscriptos;
    private ArrayList<Alumno> asistencias;

    /*Constructor*/
    public Diagramacion(String dia, String horario, String nivel, Disciplina disciplina, Profesor profesor){
        setDia(dia);
        setHorario(horario);
        setNivel(nivel);
        setDisciplina(disciplina);
        setProfesor(profesor);
        setAlumnos_inscriptos(new ArrayList<>());
        setAsistencias(new ArrayList<>());
    }

    /*Setters*/
    public void setDia(String dia) {
        this.dia = dia;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public void setAlumnos_inscriptos(ArrayList<Alumno> alumnos_inscriptos) {
        this.alumnos_inscriptos= alumnos_inscriptos;
    }
    public void setAsistencias(ArrayList<Alumno> asistencias) {
        this.asistencias= asistencias;
    }

    /*Getters*/
    public String getDia() {
        return dia;
    }
    public String getHorario() {
        return horario;
    }
    public String getNivel() {
        return nivel;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public ArrayList<Alumno> getAlumnos_inscriptos() {
        return alumnos_inscriptos;
    }
    public ArrayList<Alumno> getAsistencias() {
        return asistencias;
    }

    public void inscribir(Alumno alumno){
        alumnos_inscriptos.add(alumno);
    }

    public void registrarAsistencia(Alumno alumno){
        asistencias.add(alumno);
    }

    public void mostrarAsistencias(){
        for (int i=0; i<asistencias.size(); i++){
            System.out.println(asistencias.get(i).getNombre() + " " + asistencias.get(i).getApellido() + " " + asistencias.get(i).getDni());
        }
    }

    public int cantidadAsistencias(){
        int asis= 0;
        for (int i=0; i<asistencias.size(); i++){
            asis+=1;
        }
        return (asis*10);
    }
}
