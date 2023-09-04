package poo.punto2;

import java.util.Scanner;

public class MainListaEnlazadaDoble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaEnlazadaDoble listapruebas= new ListaEnlazadaDoble();
        System.out.println("LISTA ENLAZADA DOBLE CREADA CON EXITO.");
        System.out.println("---------------------------------------------------");

        for (int i= 1; i<=5; i++){
            listapruebas.agregar(i);
        }
        System.out.println("SE AGREGARON 5 NUMEROS EN LA LISTA");
        listapruebas.mostrarLista();
        System.out.println("---------------------------------------------------");

        boolean vacia;
        vacia= listapruebas.listaVacia();
        if (vacia==true){
            System.out.println("LA LISTA ESTA VACIA");
        }
        else{
            System.out.println("LA LISTA NO ESTA VACIA");
        }
        System.out.println("---------------------------------------------------");

        int cant_nodos= 0;
        cant_nodos= listapruebas.longitudLista();
        System.out.println("CANTIDAD DE ELEMENTOS DE LA LISTA: " + cant_nodos);
        System.out.println("---------------------------------------------------");

        listapruebas.eliminar(3);
        listapruebas.eliminar(1);
        System.out.println("EL 1 Y EL 3 FUERON ELIMINADOS DE LA LISTA");
        listapruebas.mostrarLista();
        System.out.println("---------------------------------------------------");

        Object recuperado;
        recuperado= listapruebas.recuperar(5);
        System.out.println("Elemento recuperado de la lista: " + recuperado + ".");
        System.out.println("---------------------------------------------------");

        listapruebas.insertar(300, 3);
        System.out.println("SE INSERTO EL 300 EN LA POSICION 3 DE LA LISTA.");
        listapruebas.mostrarLista();
    }
}
