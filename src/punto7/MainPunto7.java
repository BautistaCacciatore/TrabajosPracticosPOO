package punto7;
import java.time.LocalDate;
import java.util.Scanner;

public class MainPunto7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----CREANDO ESTACION DE SERVICIO-----");
        EstacionDeServicio estacion= new EstacionDeServicio();
        estacion.agregarCombustible("Nafta", 800);
        estacion.agregarCombustible("Gasoil", 500);
        estacion.agregarCombustible("Kerosene", 300);
        estacion.agregarExpendedor(1, "Nafta");
        estacion.agregarExpendedor(2, "Gasoil");
        estacion.agregarExpendedor(3, "Nafta");
        estacion.agregarExpendedor(4, "Gasoil");
        estacion.agregarExpendedor(5, "Nafta");
        estacion.agregarExpendedor(6, "Nafta");
        estacion.agregarExpendedor(7, "Nafta");
        estacion.agregarExpendedor(8, "Kerosene");
        estacion.agregarExpendedor(9, "Gasoil");
        estacion.agregarExpendedor(10, "Kerosene");
        estacion.registrarEmpleado("Bautista", "Cacciatore", "45626436");
        estacion.registrarEmpleado("Cristiano", "Ronaldo", "33411099");
        estacion.registrarEmpleado("Bruno", "Fernandez", "38900811");
        estacion.registrarVenta("AAA", "Bautista", 3, "45626436", 3.5f);
        estacion.registrarVenta("AAA", "Bautista", 1, "45626436", 2.5f);
        estacion.registrarVenta("BBB", "Cristiano", 7, "33411099", 5);
        estacion.registrarVenta("CCC", "Bruno", 2, "33411099", 1);
        estacion.registrarVenta("CCC", "Bruno", 2, "33411099", 1.5f);
        estacion.registrarVenta("BBB", "Cristiano", 10, "38900811", 2);
        System.out.println("-----LISTADO DE PROPORCION DE VENTAS POR COMBUSTIBLE-----");
        LocalDate fecha= LocalDate.now();
        estacion.porcentajeVentasPorCombustible(fecha);
        System.out.println("-----LISTADO DE EXPENDEDORES ORDENADOS POR MONTO TOTAL DE VENTA-----");
        estacion.totalVentasPorExpendedor(fecha);
        System.out.println("-----LISTADO DE SURTIDORES ORDENADOS POR LITROS EXPENDIDOS-----");
        estacion.totalLitrosExpendidosPorExpendedor(fecha);
        System.out.println("-----LISTADO DE EMPLEADOS ORDENADOS POR MONTO TOTAL DE VENTA-----");
        estacion.totalVentasPorEmpleado(fecha);
        System.out.println("----LISTADO DE TOP 10 CLIENTES-----");
        estacion.top10Clientes(fecha);
        System.out.println("-----PRECIOS DE LOS COMBUSTIBLES----");
        estacion.mostrarPreciosCombustible();
        estacion.moficarPrecioCombustible("Nafta", 1200);
        estacion.moficarPrecioCombustible("Gasoil", 900);
        estacion.moficarPrecioCombustible("Kerosene", 700);
        System.out.println("-----PRECIOS DE LOS COMBUSTIBLES----");
        estacion.mostrarPreciosCombustible();

    }
}
