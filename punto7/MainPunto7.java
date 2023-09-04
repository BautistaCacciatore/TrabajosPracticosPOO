package poo.punto7;

public class MainPunto7{
    public static void main(String[] args) {
         EcuacionSegundoGrado ecuacion1= new EcuacionSegundoGrado(1, 6, 8, 0);
         int vector[];

         System.out.println("ECUACION 1: ");
        ecuacion1.mostrarCoeficientes();
         vector= ecuacion1.calcularRaices();
         for (int i=0; i< vector.length; i++){
             if (vector[i] != 0){
                 System.out.println("Raiz " + (i+1) + ": " + vector[i]);
             }
         }

        System.out.println("--------------------------------------------------------------");
        EcuacionSegundoGrado ecuacion2= new EcuacionSegundoGrado(-1, 7, -10, 0);
        System.out.println("ECUACION 2: ");
        ecuacion2.mostrarCoeficientes();
        vector= ecuacion2.calcularRaices();
        for (int i=0; i< vector.length; i++){
            if (vector[i] != 0){
                System.out.println("Raiz " + (i+1) + ": " + vector[i]);
            }
        }

        System.out.println("--------------------------------------------------------------");
        EcuacionSegundoGrado ecuacion3= new EcuacionSegundoGrado(1, -2, 1, 0);
        System.out.println("ECUACION 3: ");
        ecuacion3.mostrarCoeficientes();
        vector= ecuacion3.calcularRaices();
        for (int i=0; i< vector.length; i++){
            if (vector[i] != 0){
                System.out.println("Raiz " + (i+1) + ": " + vector[i]);
            }
        }

        System.out.println("--------------------------------------------------------------");
        EcuacionSegundoGrado ecuacion4= new EcuacionSegundoGrado(1, 1, 1, 0);
        System.out.println("ECUACION 4: ");
        ecuacion4.mostrarCoeficientes();
        vector= ecuacion4.calcularRaices();
        for (int i=0; i< vector.length; i++){
            if (vector[i] != 0){
                System.out.println("Raiz " + (i+1) + ": " + vector[i]);
            }
        }

        System.out.println("--------------------------------------------------------------");
        EcuacionSegundoGrado ecuacion5= new EcuacionSegundoGrado(2, 4, 5, 3);
        System.out.println("ECUACION 5: ");
        ecuacion5.mostrarCoeficientes();
        int valorx= ecuacion5.getValorx();
        System.out.println("Valor de X: " + valorx);
        int resultado_ecuacion= ecuacion5.resolverEcuacion();
        System.out.println("RESULTADO DE Y: " + resultado_ecuacion);
    }
}
