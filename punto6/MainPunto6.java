package poo.punto6;

import java.util.Scanner;

public class MainPunto6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca b1= new Biblioteca();
        System.out.println("-----AGREGANDO LIBROS A LA BIBLIOTECA-----");
        b1.agregarLibro("Dracula", "Bram Stoker", 418, 10);
        b1.agregarLibro("El Principito", "Antoine de Saint-Exupery",120, 1 );
        System.out.println("-----MOSTRANDO INFORMACION DE LOS LIBROS-----");
        b1.verLibro("Dracula");
        b1.verLibro("El Principito");
        System.out.println("-----QUE LIBRO TIENE MAS PAGINAS-----");
        Libro l= b1.libroMasPaginas("Dracula", "El Principito");
        System.out.println("-----PRESTANDO LIBROS-----");
        b1.prestarLibro("Dracula");
        b1.prestarLibro("El Principito");
        System.out.println("-----CANTIDAD DE PRESTAMOS HECHOS-----");
        int prestados= b1.cantidadPrestamos();
        System.out.println("CANTIDAD TOTAL DE PRESTAMOS: " + prestados);


    }
}
