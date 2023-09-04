package poo.punto10;

import java.time.LocalDate;
import java.util.Scanner;

public class MainPunto10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate fechalimite_supermercado = LocalDate.of(2023, 9, 20);
        LocalDate fechalimite_repuesto = LocalDate.of(2023, 8, 22);
        LocalDate fechalimite_cine = LocalDate.of(2023, 8, 22);
        LocalDate fechalimite_tp = LocalDate.of(2023, 9, 6);
        LocalDate fecharecordatorio_tp = LocalDate.of(2023, 8, 30);
        System.out.println("-----AGREGANDO TAREAS-----");
        TareaExtension t1 = new TareaExtension("Ir al supermercado mañana", TareaExtension.Prioridad.NORMAL, TareaExtension.Estado.INCOMPLETA, fechalimite_supermercado, null);
        TareaExtension t2 = new TareaExtension("Consultar repuesto del auto", TareaExtension.Prioridad.NORMAL, TareaExtension.Estado.COMPLETA, fechalimite_repuesto, null);
        TareaExtension t3 = new TareaExtension("Ir al cine a ver la nueva pelicula de Marvel", TareaExtension.Prioridad.NORMAL, TareaExtension.Estado.INCOMPLETA, fechalimite_cine, null);
        TareaExtension t4 = new TareaExtension("Terminar el TP de POO", TareaExtension.Prioridad.ALTA, TareaExtension.Estado.INCOMPLETA, fechalimite_tp, fecharecordatorio_tp);
        System.out.println("-----MOSTRANDO TAREAS-----");
        t1.mostrarTarea();
        t2.mostrarTarea();
        t3.mostrarTarea();
        t4.mostrarTarea();
    }
}
