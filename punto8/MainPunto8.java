package poo.punto8;
import java.util.Random;
import java.util.Scanner;

public class MainPunto8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud;
        System.out.println("INGRESE LA LONGITUD DE LAS CONTRASEÑAS A GENERAR: ");
        longitud= sc.nextInt();
        for (int i=0; i<10; i++){
            Password nuevacontraseña= new Password(longitud);
            nuevacontraseña.mostrarContraseña();
        }
    }
}
