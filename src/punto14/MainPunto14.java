package punto14;
import java.util.Scanner;

public class MainPunto14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agencia agencia= new Agencia();
        agencia.anadirHospedaje("Hotel ´Las Piedras´", 40000, 40);
        agencia.anadirHospedaje("Bungalos ´La familia´", 15000, 20);
        agencia.anadirHospedaje("Hotel ´Harrigam´", 30000, 70);
        agencia.anadirHospedaje("Hotel 'The King'", 40000, 38);
        agencia.anadirHospedaje("Hotel ´Brasilia´", 20000, 60);
        agencia.anadirTransporte("Aerolineas Argentina", 500000, "avion");
        agencia.anadirTransporte("El Veloz", 50000, "tren");
        agencia.anadirTransporte("El capitan", 100000, "Bus");
        agencia.anadirTransporte("Despegar", 300000, "Avion");
        agencia.anadirTransporte("Despegar", 350000, "Avion");
        agencia.anadirGuia("Jorge", 200000, "Lopez", "12345678");
        agencia.anadirGuia("Francisco", 170000, "Rodriguez", "23486721");
        agencia.generarNuevoPaqueteTurismo("Madrid", 50);
        agencia.generarNuevoPaqueteTurismo("Londres", 25);
        agencia.generarNuevoPaqueteTurismo("Rio de Janeiro", 55);
        agencia.generarNuevoPaqueteTurismo("Londres", 40);
        agencia.generarNuevoPaqueteTurismo("Londres", 80);
        agencia.generarNuevoPaqueteTurismo("Rio de Janeiro", 27);
        System.out.println("----MOSTRANDO LOS PAQUETES DE TURISMO DISPONIBLE----");
        agencia.mostrarTodosLosPaquetes();
        System.out.println("-----VENDIENDO PAQUETES A CLIENTES-----");
        agencia.registrarCliente("Bautista", "Cacciatore", "45626436");
        agencia.registrarCliente("Cristiano", "Ronaldo", "31776821");
        agencia.venderPaquete(1, "45626436");
        agencia.venderPaquete(3, "45626436");
        agencia.venderPaquete(4, "45626436");
        agencia.venderPaquete(3, "31776821");
        agencia.venderPaquete(1, "31776821");
        agencia.venderPaquete(1, "45626436");
        agencia.venderPaquete(1, "45626436");
        agencia.venderPaquete(2, "45626436");
        agencia.venderPaquete(6, "31776821");
        agencia.venderPaquete(6, "31776821");
        System.out.println("-----INFORME DE VENTAS-----");
        agencia.listadoVentas();
        System.out.println("-----INFORME PROVEEDORES-----");
        agencia.listadoProveedores();
        System.out.println("-----DESTINO FAVORITO-----");
        agencia.destinoFavorito();

    }
}
