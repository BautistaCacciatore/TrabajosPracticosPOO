package punto11;

import java.time.LocalDate;

public class MainPunto11 {
    public static void main(String[] args) {
        Empresa e= new Empresa();
        System.out.println("-----REGISTRANDO AUTOS Y CLIENTES EN LA EMPRESA-----");
        AutoPasajero autoPasajero= new AutoPasajero("111AAA", 4);
        AutoVip autoVip= new AutoVip("222BBB", 7);
        Camion camion= new Camion("333CCC");
        Camioneta camioneta= new Camioneta("444DDD", 30);
        Combi combi= new Combi("555EEE", 5);
        e.añadirAuto(autoPasajero);
        e.añadirAuto(autoVip);
        e.añadirAuto(camion);
        e.añadirAuto(camioneta);
        e.añadirAuto(combi);
        e.añadirCliente("Bautista", "Cacciatore", "45626436");
        e.añadirCliente("Cristiano", "Ronaldo", "37865120");
        System.out.println("---------------------------------------------");
        System.out.println("-----GENERANDO PRESUPUESTOS Y ALQUILERES-----");
        LocalDate fechainicio= LocalDate.of(2023, 10, 15);
        LocalDate fechafin= LocalDate.of(2023, 10, 25);
        e.generarPresupuesto("45626436", "222BBB", 10, fechainicio, fechafin);
        e.generarPresupuesto("45626436", "444DDD", 10, fechainicio, fechafin);
        e.generarPresupuesto("45626436", "555EEE", 10, fechainicio, fechafin);
        e.generarPresupuesto("37865120", "111AAA", 10, fechainicio, fechafin);
        e.generarPresupuesto("37865120", "333CCC", 10, fechainicio, fechafin);
        System.out.println("---------------------------------------------");
        System.out.println("-----CALCULANDO MONTOS DE ALQUILERES POR CLIENTES Y MONTO TOTAL DE ALQUILERES DE LA EMPRESA-----");
        e.montoTotalPorCliente("45626436");
        e.montoTotalPorCliente("37865120");
        e.totalAlquileres();
    }
}
