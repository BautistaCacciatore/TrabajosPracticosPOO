package punto3;
import java.util.Scanner;

public class MainAcademia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Academia academia= new Academia();
        System.out.println("-----AGREGANDO DISCIPLINAS------");
        academia.agregarDisciplina("Tango");
        academia.agregarDisciplina("Bachata");
        academia.agregarDisciplina("Pop");
        System.out.println("-----AGREGANDO PROFESORES------");
        academia.agregarProfesor("Bautista", "Cacciatore", "45626436");
        academia.agregarProfesor("Luke", "Shaw", "32456011");
        academia.agregarProfesor("Marcus", "Rashford", "28900855");
        System.out.println("-----AGREGANDO DIAGRAMACIONES------");
        academia.agregarDiagramacion("Lunes y viernes", "17hs", "inicial", "Tango", "45626436");
        academia.agregarDiagramacion("Martes y jueves", "17hs", "inicial", "Tango", "45626436");
        academia.agregarDiagramacion("Sabados", "20hs", "avanzado", "Tango", "45626436");
        academia.agregarDiagramacion("Viernes", "19hs", "inicial", "Bachata", "32456011");
        academia.agregarDiagramacion("Sabados", "19hs", "intermedio", "Bachata", "32456011");
        academia.agregarDiagramacion("Miercoles", "20hs", "avanzado", "Pop", "28900855");
        System.out.println("-----REGISTRANDO ALUMNOS------");
        academia.registrarAlumno("Jorge", "Chabez", "111", "1109090909", "Tango", "Sabados", "20hs");
        academia.registrarAlumno("Martina", "Martinez", "222", "9020233", "Tango", "Lunes y viernes", "17hs");
        academia.registrarAlumno("Santiago", "Hernandez", "333", "1109090909", "Tango", "Martes y jueves", "17hs");
        academia.registrarAlumno("Candela", "Lopez", "444", "1109090909", "Bachata", "Viernes", "19hs");
        academia.registrarAlumno("Gustavo", "Cordera", "555", "1109090909", "Pop", "Miercoles", "20hs");
        System.out.println("-----INSCRIBIENDO A ALUMNOS EN DIAGRAMACIONES------");
        academia.inscribirAlumnoEnDiagramacion("111", "Tango", "Lunes y viernes", "17hs");
        academia.inscribirAlumnoEnDiagramacion("333", "Bachata", "Viernes", "19hs");
        academia.inscribirAlumnoEnDiagramacion("111", "Pop", "Miercoles", "20hs");
        academia.inscribirAlumnoEnDiagramacion("222", "Pop", "Miercoles", "20hs");
        academia.inscribirAlumnoEnDiagramacion("333", "Pop", "Miercoles", "20hs");
        academia.inscribirAlumnoEnDiagramacion("444", "Pop", "Miercoles", "20hs");
        System.out.println("-----REGISTRANDO ASISTENCIAS A DIAGRAMACIONES-----");
        academia.registrarAsistencia("111", "Tango", "Lunes y viernes", "17hs");
        academia.registrarAsistencia("111", "Tango", "Sabados", "20hs");
        academia.registrarAsistencia("333", "Bachata", "Viernes", "19hs");
        academia.registrarAsistencia("444", "Bachata", "Viernes", "19hs");
        academia.registrarAsistencia("222", "Pop", "Miercoles", "20hs");
        academia.registrarAsistencia("333", "Pop", "Miercoles", "20hs");
        academia.registrarAsistencia("444", "Pop", "Miercoles", "20hs");
        academia.registrarAsistencia("555", "Pop", "Miercoles", "20hs");
        System.out.println("-----GENERANDO LISTADO DE ASISTENCIAS A CLASES POR PROFESOR-----");
        academia.generarListadoAsistencias("45626436");
        academia.importeAAbonar("45626436");
        academia.generarListadoAsistencias("32456011");
        academia.importeAAbonar("32456011");
        academia.generarListadoAsistencias("28900855");
        academia.importeAAbonar("28900855");
        Disciplina d= academia.disciplinaQueGeneraMasIngresos();
        System.out.println("-----CALCULANDO DISCIPLINA QUE GENERA MAS INGRESOS-----");
        System.out.println("DISCIPLINA QUE GENERA MAS INGRESOS: " + d.getNombre());
    }
}
