package poo.punto4;

import poo.punto4.Cola;

import java.util.Scanner;

public class MainCola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cola colapruebas= new Cola();
        System.out.println("COLA CREADA CON EXITO.");
        System.out.println("---------------------------------------------------");

        for (int i= 1; i<=5; i++){
            colapruebas.encolar(i);
        }
        System.out.println("SE ENCOLARON 5 NUMEROS EN LA COLA");
        colapruebas.mostrar();
        System.out.println("---------------------------------------------------");

        boolean vacia;
        vacia= colapruebas.colaVacia();
        if (vacia==true){
            System.out.println("LA COLA ESTA VACIA");
        }
        else{
            System.out.println("LA COLA NO ESTA VACIA");
        }
        System.out.println("---------------------------------------------------");

        colapruebas.desencolar();
        colapruebas.desencolar();
        System.out.println("SE DESENCOLARON DOS ELEMENTOS DE LA COLA");
        colapruebas.mostrar();
        System.out.println("---------------------------------------------------");

        Object frente;
        frente= colapruebas.obtenerFrente();
        System.out.println("FRENTE DE LA COLA: " + frente + ".");
        System.out.println("---------------------------------------------------");

        colapruebas.mostrar();
    }
}
