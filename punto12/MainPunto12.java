package poo.punto12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MainPunto12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate fechalimite_supermercado= LocalDate.of(2023, 9, 20);
        LocalDate fechalimite_repuesto= LocalDate.of(2023, 9, 22);
        LocalDate fechalimite_cine= LocalDate.of(2023, 9, 10);
        System.out.println("-----AGREGANDO TAREAS A LA LISTA DE TAREAS-----");
        AdministradorDeTareas at= new AdministradorDeTareas();
        at.agregarTarea("Ir al supermercado mañana", TareaExtension.Prioridad.BAJA, TareaExtension.Estado.INCOMPLETA, fechalimite_supermercado, null);
        at.agregarTarea("Consultar repuesto del auto", TareaExtension.Prioridad.ALTA, TareaExtension.Estado.INCOMPLETA, fechalimite_repuesto, null);
        at.agregarTarea("Ir al cine a ver la nueva pelicula de Marvel", TareaExtension.Prioridad.NORMAL, TareaExtension.Estado.INCOMPLETA, fechalimite_cine, null);
        System.out.println("-----MOSTRANDO LISTADO DE TAREAS-----");
        at.listadoTareas();;
        System.out.println("-----MARCANDO TAREAS COMO REALIZADAS-----");
        at.marcarTareaComoCompleta("Ir al supermercado mañana");
        at.marcarTareaComoCompleta("Consultar repuesto del auto");
        at.marcarTareaComoCompleta("Ir al cine a ver la nueva pelicula de Marvel");
        System.out.println("-----MOSTRANDO LISTADO DE TAREAS-----");
        at.listadoTareas();

        System.out.println("-----MOSTRANDO LISTADO DE TAREAS SEGUN SU PRIORIDAD (DE LA MAS ALTA A LA MAS BAJA)-----");
        ArrayList<TareaExtension> a= at.tareasNoVencidasPrioridad();
        for (int i=0; i<a.size(); i++){
            a.get(i).mostrarTarea();
        }

        System.out.println("-----MOSTRANDO LISTADO DE TAREAS SEGUN SU FECHA DE VENCIMIENTO (DE LA MAS CERCANA A LA MAS LEJANA)-----");
        ArrayList<TareaExtension> b= at.tareasNoVencidasFechaVencimiento();
        for (int i=0; i<b.size(); i++){
            b.get(i).mostrarTarea();
        }

        LocalDate fechavencimiento_pagarlaluz= LocalDate.of(2023, 9, 1);
        LocalDate fecharecordatorio_pagarlaluz= LocalDate.of(2023, 8, 31);
        LocalDate fecharecordatorio_reservar= LocalDate.of(2023, 9, 5);
        LocalDate fechavencimiento_reservar= LocalDate.of(2023, 9, 7);
        LocalDate fecharecordatorio_terminareltp= LocalDate.of(2023, 9, 3);
        LocalDate fechavencimiento_terminareltp= LocalDate.of(2023, 9, 5);
        System.out.println("-----AGREGANDO TAREAS A LA LISTA DE TAREAS-----");
        at.agregarTarea("Pagar la luz", TareaExtension.Prioridad.ALTA, TareaExtension.Estado.INCOMPLETA,fechavencimiento_pagarlaluz, fecharecordatorio_pagarlaluz);
        at.agregarTarea("Reservar restaurante", TareaExtension.Prioridad.NORMAL, TareaExtension.Estado.INCOMPLETA, fechavencimiento_reservar, fecharecordatorio_reservar);
        at.agregarTarea("Terminar el tp de POO", TareaExtension.Prioridad.ALTA, TareaExtension.Estado.INCOMPLETA, fechavencimiento_terminareltp, fecharecordatorio_terminareltp);
        System.out.println("-----MOSTRANDO LISTADO DE TAREAS-----");
        at.listadoTareas();
    }
}
