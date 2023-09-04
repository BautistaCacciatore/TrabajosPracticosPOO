package poo.punto5;

import java.time.LocalDate;
import java.util.Scanner;

public class MainPunto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate fechalimite_supermercado= LocalDate.of(2023, 9, 20);
        LocalDate fechalimite_repuesto= LocalDate.of(2023, 8, 31);
        LocalDate fechalimite_cine= LocalDate.of(2023, 8, 31);
        System.out.println("-----CREANDO TAREAS-----");
        Tarea t1= new Tarea("Ir al supemercado mañana", Tarea.Prioridad.NORMAL, Tarea.Estado.INCOMPLETA, fechalimite_supermercado);
        Tarea t2= new Tarea("Consultar repuesto del auto", Tarea.Prioridad.NORMAL, Tarea.Estado.COMPLETA, fechalimite_repuesto);
        Tarea t3= new Tarea("Ir al cine a ver la nueva pelicula de Marvel", Tarea.Prioridad.NORMAL, Tarea.Estado.INCOMPLETA, fechalimite_cine);
        System.out.println("-----MOSTRANDO TAREAS-----");
        t1.mostrarTarea();
        t2.mostrarTarea();
        t3.mostrarTarea();

    }
}
