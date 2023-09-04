package poo.punto3;

import java.util.Scanner;

public class MainPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pila pilapruebas= new Pila();
        System.out.println("PILA CREADA CON EXITO.");
        System.out.println("---------------------------------------------------");

        for (int i= 1; i<=5; i++){
            pilapruebas.apilar(i);
        }
        System.out.println("SE APILARON 5 NUMEROS EN LA PILA");
        pilapruebas.mostrar();
        System.out.println("---------------------------------------------------");

        boolean vacia;
        vacia= pilapruebas.pilaVacia();
        if (vacia==true){
            System.out.println("LA PILA ESTA VACIA");
        }
        else{
            System.out.println("LA PILA NO ESTA VACIA");
        }
        System.out.println("---------------------------------------------------");

        pilapruebas.desapilar();
        pilapruebas.desapilar();
        System.out.println("SE DESAPILARON DOS ELEMENTOS DE LA PILA");
        pilapruebas.mostrar();
        System.out.println("---------------------------------------------------");

        Object tope;
        tope= pilapruebas.obtenerTope();
        System.out.println("TOPE DE LA PILA: " + tope + ".");
        System.out.println("---------------------------------------------------");

        pilapruebas.mostrar();
    }
}
