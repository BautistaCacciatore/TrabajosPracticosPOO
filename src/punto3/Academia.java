package punto3;
import java.util.ArrayList;

public class Academia {
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Profesor> profesores;
    private ArrayList<Alumno> alumnos;

    /*Constructor*/
    public Academia(){
        ArrayList<Disciplina> disciplinas= new ArrayList<>();
        ArrayList<Profesor> profesores= new ArrayList<>();
        ArrayList<Alumno> alumnos= new ArrayList<>();
        setDisciplinas(disciplinas);
        setProfesores(profesores);
        setAlumnos(alumnos);
    }

    /*Setters*/
    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    /*Getters*/
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    /*Metodos*/
    public void agregarDisciplina(String nombre){
        Disciplina d= buscarDisciplina(nombre);
        if (d != null){
            System.out.println("LA DISCIPLINA YA EXISTE");
        }
        else{
            Disciplina nueva_disciplina= new Disciplina(nombre);
            disciplinas.add(nueva_disciplina);
            System.out.println("DISCIPLINA AGREGADA CON EXITO");
        }
    }

    public void agregarProfesor(String nombre, String apellido, String dni){
        Profesor p= buscarProfesor(dni);
        if (p != null){
            System.out.println("EL PROFESOR YA EXISTE");
        }
        else{
            Profesor nuevo_profesor= new Profesor(nombre, apellido, dni);
            profesores.add(nuevo_profesor);
            System.out.println("PROFESOR AGREGADA CON EXITO");
        }
    }

    public void agregarDiagramacion(String dia, String hora, String nivel, String disciplina, String dni_profe){
        Profesor p= buscarProfesor(dni_profe);
        Disciplina d= buscarDisciplina(disciplina);
        if ((p != null) && (d != null)){
            Diagramacion diag= new Diagramacion(dia, hora, nivel, d, p);
            d.añadirDiagramacion(diag);
            System.out.println("DIAGRAMACION AGREGADA CON EXITO");
        }
        else{
            if (p==null){
                System.out.println("NO EXISTE NINGUN PROFESOR CON ESE DNI");
            }
            else{
                System.out.println("NO EXISTE NINGUNA DISCIPLINA CON ESE NOMBRE");
            }
        }
    }

    public void registrarAlumno(String nombre, String apellido, String dni, String telefono, String disciplina, String dia, String hora){
        Alumno alumno= new Alumno(nombre, apellido, dni, telefono);
        Disciplina d= buscarDisciplina(disciplina);
        alumnos.add(alumno);
        Diagramacion diag= d.buscarDiagramacion(dia, hora);
        diag.inscribir(alumno);
        System.out.println("ALUMNO REGISTRADO CON EXITO");
    }

    public void inscribirAlumnoEnDiagramacion(String dni, String disciplina, String dia, String hora){
        Alumno alumno= buscarAlumno(dni);
        Disciplina d= buscarDisciplina(disciplina);
        Diagramacion diag= d.buscarDiagramacion(dia, hora);
        diag.inscribir(alumno);
        System.out.println("ALUMNO INSCRIPTO CON EXITO");
    }

    public void registrarAsistencia(String dni, String disciplina, String dia, String hora){
        Alumno a= buscarAlumno(dni);
        Disciplina d= buscarDisciplina(disciplina);
        Diagramacion diag= d.buscarDiagramacion(dia, hora);
        diag.registrarAsistencia(a);
    }

    public void generarListadoAsistencias(String dni_profesor){
        System.out.println("ASISTENCIA: ");
        Profesor p= buscarProfesor(dni_profesor);
        for (int i=0; i< disciplinas.size(); i++){
            disciplinas.get(i).asistencias(p);
        }
    }

    public int importeAAbonar(String dni_profesor){
        int importe= 0;
        Profesor p= buscarProfesor(dni_profesor);
        for (int i=0; i< disciplinas.size(); i++){
            importe+= disciplinas.get(i).pago(p);
        }
        System.out.println("IMPORTE A ABONAR AL PROFESOR " + p.getNombre() + " " + p.getApellido() + ": $" + importe);
        return importe;
    }

    public Disciplina disciplinaQueGeneraMasIngresos(){
        int flag= 0;
        Disciplina d= null;
        for (int i=0; i< disciplinas.size(); i++){
            if (flag==0){
                d= disciplinas.get(i);
                flag=1;
            }
            else{
                if (d.ingresoTotal() < disciplinas.get(i).ingresoTotal()){
                    d= disciplinas.get(i);
                }
            }
        }
        return d;
    }



    private Disciplina buscarDisciplina(String nombre){
        for (int i=0; i<disciplinas.size(); i++){
            if (disciplinas.get(i).getNombre().equals(nombre)){
                return disciplinas.get(i);
            }
        }
        return null;
    }

    private Profesor buscarProfesor(String dni){
        for (int i=0; i<profesores.size(); i++){
            if (profesores.get(i).getDni().equals(dni)){
                return profesores.get(i);
            }
        }
        return null;
    }

    private Alumno buscarAlumno(String dni){
        for (int i=0; i<alumnos.size(); i++){
            if (alumnos.get(i).getDni().equals(dni)){
                return alumnos.get(i);
            }
        }
        return null;
    }

}
