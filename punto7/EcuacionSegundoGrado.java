package poo.punto7;

import static java.lang.Math.sqrt;

public class EcuacionSegundoGrado {
    private int a;
    private int b;
    private int c;
    private int valorx;

    /*Constructor*/
    public EcuacionSegundoGrado(int a, int b, int c, int valorx){
       setA(a);
       setB(b);
       setC(c);
       setValorx(valorx);
    }

    /*Setters*/
    private void setA(int a1) {
        this.a= a1;
    }
    private void setB(int b1){
        this.b=b1;
    }
    private void setC(int c1) {
        this.c= c1;
    }
    private void setValorx(int valorx1) {
        this.valorx= valorx1;
    }

    /*Getters*/
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
    public int getValorx() {
        return valorx;
    }

    private int calcularCuantasRaicesPosee(){
        return  ((b * b) - 4*a*c);
    }

    public int[] calcularRaices(){
        int raices= calcularCuantasRaicesPosee();
        if (raices>0){
            System.out.println("LA ECUACION POSEE DOS RAICES REALES");
            int raiz1= (-b + (int) sqrt((b * b) - 4 * a * c)) / (2 * a);
            int raiz2= (-b - (int) sqrt((b * b) - 4 * a * c)) / (2 * a);
            int[] resultado_raices= {raiz1, raiz2};
            return resultado_raices;
        }
        else{
            if (raices==0){
                System.out.println("LA ECUACION POSEE UNA SOLA RAIZ REAL");
                int raiz= (-b + (int) sqrt((b * b) - 4 * a * c)) / (2 * a);
                int[] resultado_raices= {raiz};
                return resultado_raices;
            }
            else{
                System.out.println("LA ECUACION NO POSEE RAICES REALES");
                int[] resultado_raices= {};
                return resultado_raices;
            }
        }
    }

    public int resolverEcuacion(){
        int y;
        y= a *(valorx * valorx) + b * valorx + c;
        return y;
    }

    public void mostrarCoeficientes(){
        System.out.println("Coeficiente a: " + getA());
        System.out.println("Coeficiente b: " + getB());
        System.out.println("Coeficiente c: " + getC());
    }

}
