package punto2;

import java.util.Scanner;

public class MainPunto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agencia agencia= new Agencia();
        agencia.anadirDestino("Madrid");
        agencia.anadirDestino("Ushuaia");
        agencia.anadirDestino("Londres");
        agencia.anadirDestino("Rio de Janeiro");
        agencia.anadirHospedaje("Madrid", "Hotel ´Las Piedras´", 40000);
        agencia.anadirHospedaje("Ushuaia", "Bungalos ´La familia´", 15000);
        agencia.anadirHospedaje("Londres", "Hotel ´Harrigam´", 30000);
        agencia.anadirHospedaje("Londres", "Hotel 'The King'", 40000);
        agencia.anadirHospedaje("Rio de Janeiro", "Hotel ´Brasilia´", 20000);
        agencia.anadirTransporte("Madrid", "Avion", "Aerolineas Argentinas", 100000);
        agencia.anadirTransporte("Ushuaia", "Tren", "El Veloz", 100000);
        agencia.anadirTransporte("Ushuaia", "Bus", "El capitan", 100000);
        agencia.anadirTransporte("Londres", "Avion", "Despegar", 100000);
        agencia.anadirTransporte("Londres", "Avion", "Aerolineas Argentinas", 100000);
        agencia.anadirTransporte("Rio de Janeiro", "Avion", "Despegar", 100000);
        agencia.anadirExcursion("Madrid", "Recorrido por la ciudad", 2000);
        agencia.anadirExcursion("Madrid", "Tour por el Santiago Bernabeu", 2500);
        agencia.anadirExcursion("Madrid", "Tour por el Camp Nou", 2500);
        agencia.anadirExcursion("Ushuaia", "Parque Nacional Tierra del Fuego", 2000);
        agencia.anadirExcursion("Ushuaia", "Cerro Castor", 2500);
        agencia.anadirExcursion("Ushuaia", "Isla Martillo", 2500);
        agencia.anadirExcursion("Londres", "Tour por Old Trafford", 2000);
        agencia.anadirExcursion("Londres", "Castillo de Windsor", 2500);
        agencia.anadirExcursion("Londres", "Oxford", 2500);
        agencia.anadirExcursion("Rio de Janeiro", "Playa de Copacabana", 2000);
        agencia.anadirExcursion("Rio de Janeiro", "Montaña Pan de Azúcar", 2500);
        agencia.anadirExcursion("Rio de Janeiro", "Estatua del Cristo Redentor", 2500);
        agencia.generarNuevoPaqueteTurismo();
        agencia.generarNuevoPaqueteTurismo();
        agencia.generarNuevoPaqueteTurismo();
        agencia.generarNuevoPaqueteTurismo();
        agencia.generarNuevoPaqueteTurismo();
        agencia.generarNuevoPaqueteTurismo();
        System.out.println("----MOSTRANDO LOS PAQUETES DE TURISMO DISPONIBLE----");
        agencia.mostrarTodosLosPaquetes();
        System.out.println("-----VENDIENDO PAQUETES A CLIENTES-----");
        agencia.registrarCliente("Bautista", "Cacciatore", "45626436");
        agencia.registrarCliente("Cristiano", "Ronaldo", "31776821");
        agencia.venderPaquete(1, "45626436");
        agencia.venderPaquete(3, "45626436");
        agencia.venderPaquete(4, "45626436");
        agencia.venderPaquete(2, "31776821");
        agencia.venderPaquete(6, "31776821");
        System.out.println("-----MOSTRANDO PAQUETES LUEGO DE LAS VENTAS-----");
        agencia.mostrarTodosLosPaquetes();
        agencia.informeDePaquetesVendidos();
        agencia.destinoFavorito();

    }
}
