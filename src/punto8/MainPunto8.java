package punto8;
import java.util.Scanner;

public class MainPunto8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca b1= new Biblioteca();
        String[] autores = {"Bram Stoker"};
        String[] autores2 = {"Antoine de Saint-Exupery"};
        System.out.println("-----AGREGANDO LIBROS A LA BIBLIOTECA-----");
        b1.agregarLibro("Dracula", "Editorial1", "435345", "13ADSA", 1890, autores, 418, 10);
        b1.agregarLibro("El Principito", "Editorial2", "3434234", "ASD35", 1974, autores2, 120, 7);
        System.out.println("-----ASOCIANDO SOCIOS-----");
        b1.asociar("Bautista", "Cacciatore", "45626436");
        System.out.println("-----REALIZANDO PRESTAMOS-----");
        b1.prestarLibro("Dracula", "45626436");
        b1.prestarLibro("El Principito", "45626436");
        System.out.println("-----CANTIDAD DE PRESTAMOS HECHOS-----");
        int prestados= b1.cantidadPrestamos();
        System.out.println("CANTIDAD TOTAL DE PRESTAMOS: " + prestados);
        System.out.println("----LIBROS PRESTADOS-----");
        b1.ejemplaresPrestadosActualmente();
        System.out.println("-----CANTIDAD DE EJEMPLARES DISPONIBLES DE LOS LIBROS QUE SE ENCUENTRAN EN LA BIBLIOTECA-----");
        int n1= b1.cantidadEjemplaresDisponibles("Dracula");
        System.out.println("CANTIDAD DE EJEMPLARES DISPONIBLES DE DRACULA: " + n1);
        int n2= b1.cantidadEjemplaresDisponibles("El Principito");
        System.out.println("CANTIDAD DE EJEMPLARES DISPONIBLES DE EL PRINCIPITO: " + n2);


    }
}
