package poo.punto13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MainPunto13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate fechalimite_supermercado = LocalDate.of(2023, 9, 20);
        LocalDate fechalimite_repuesto = LocalDate.of(2023, 9, 22);
        LocalDate fechalimite_cine = LocalDate.of(2023, 9, 10);
        LocalDate fechalimite_cortarpasto = LocalDate.of(2023, 9, 25);
        LocalDate fechalimite_bañarperro = LocalDate.of(2023, 9, 30);
        LocalDate fechalimite_cancha = LocalDate.of(2023, 9, 28);
        System.out.println("-----AGREGANDO TAREAS A LA LISTA DE TAREAS-----");
        AdministradorDeTareas at = new AdministradorDeTareas();
        at.agregarTarea("Ir al supermercado mañana", TareaExtensionDos.Prioridad.BAJA, TareaExtensionDos.Estado.INCOMPLETA, fechalimite_supermercado, null);
        at.agregarTarea("Consultar repuesto del auto", TareaExtensionDos.Prioridad.ALTA, TareaExtensionDos.Estado.INCOMPLETA, fechalimite_repuesto, null);
        at.agregarTarea("Ir al cine a ver la nueva pelicula de Marvel", TareaExtensionDos.Prioridad.NORMAL, TareaExtensionDos.Estado.INCOMPLETA, fechalimite_cine, null);
        at.agregarTarea("Cortar el pasto", TareaExtensionDos.Prioridad.BAJA, TareaExtensionDos.Estado.INCOMPLETA, fechalimite_cortarpasto, null);
        at.agregarTarea("Bañar al perro", TareaExtensionDos.Prioridad.ALTA, TareaExtensionDos.Estado.INCOMPLETA, fechalimite_bañarperro, null);
        at.agregarTarea("Ir a la cancha", TareaExtensionDos.Prioridad.NORMAL, TareaExtensionDos.Estado.INCOMPLETA, fechalimite_cancha, null);
        System.out.println("-----MOSTRANDO LISTADO DE TAREAS-----");
        at.listadoTareas();
        System.out.println("-----MARCANDO LAS 3 PRIMERAS TAREAS COMO FINALIZADAS, A NOMBRE DEL COLABORADOR: BAUTISTA CACCIATORE-----");
        at.marcarTareaComoCompleta("Ir al supermercado mañana", "Bautista", "Cacciatore");
        at.marcarTareaComoCompleta("Consultar repuesto del auto", "Bautista", "Cacciatore");
        at.marcarTareaComoCompleta("Ir al cine a ver la nueva pelicula de Marvel", "Bautista", "Cacciatore");
        System.out.println("-----MARCANDO LAS 3 SIGUIENTES TAREAS COMO FINALIZADAS, A NOMBRE DEL COLABORADOR: JORGE LOPEZ-----");
        at.marcarTareaComoCompleta("Cortar el pasto", "Jorge", "Lopez");
        at.marcarTareaComoCompleta("Bañar al perro", "Jorge", "Lopez");
        at.marcarTareaComoCompleta("Ir a la cancha", "Jorge", "Lopez");
        System.out.println("-----MOSTRANDO LISTADO DE TAREAS-----");
        at.listadoTareas();
        System.out.println("-----OBTENIENDO LISTADO DE TAREAS REALIZADAS POR BAUTISTA CACCIATORE-----");
        ArrayList<TareaExtensionDos> tcol1= at.tareasRealizadasPor("Bautista", "Cacciatore");
        for (int i=0; i<tcol1.size(); i++){
            tcol1.get(i).mostrarTarea();
        }
        System.out.println("-----OBTENIENDO LISTADO DE TAREAS REALIZADAS POR JORGE LOPEZ-----");
        ArrayList<TareaExtensionDos> tcol2= at.tareasRealizadasPor("Jorge", "Lopez");
        for (int i=0; i<tcol2.size(); i++){
            tcol2.get(i).mostrarTarea();
        }
    }
}
