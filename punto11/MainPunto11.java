package poo.punto11;
import java.util.Scanner;

public class MainPunto11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Juego nuevo_juego= new Juego("Bautista", "Genaro");
        nuevo_juego.agregarPalabraValida("software");
        nuevo_juego.agregarPalabraValida("hardware");
        nuevo_juego.agregarPalabraValida("computadora");
        nuevo_juego.agregarPalabraValida("tortuga");
        nuevo_juego.agregarPalabraValida("zorro");
        nuevo_juego.agregarPalabraValida("gato");
        nuevo_juego.agregarPalabraValida("perro");
        nuevo_juego.agregarPalabraValida("leon");
        System.out.println("-----SE HA CREADO UN NUEVO JUEGO CON 2 JUGADORES Y SE HAN AGREGADO PALABRAS VALIDAS AL JUEGO-----");
        nuevo_juego.mostrarJuego();
        System.out.println("-----SE HAN AGREGADO 3 PALABRAS A CADA JUGADOR-----");
        nuevo_juego.formarPalabra("Bautista", "tortuga");
        nuevo_juego.formarPalabra("Bautista", "zorro");
        nuevo_juego.formarPalabra("Bautista", "computadora");
        nuevo_juego.formarPalabra("Genaro", "software");
        nuevo_juego.formarPalabra("Genaro", "hardware");
        nuevo_juego.formarPalabra("Genaro", "gato");
        nuevo_juego.determinarGanador();
    }
}
