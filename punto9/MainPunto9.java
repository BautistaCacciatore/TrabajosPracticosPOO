package poo.punto9;
import java.time.LocalDate;
import java.util.Scanner;

public class MainPunto9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperacionesConFechas opf= new OperacionesConFechas();
        System.out.println("-----TRANSFORMANDO STRING EN FECHA-----");
        LocalDate a= opf.transformarFecha("30082023");
        System.out.println(a);
        System.out.println("-----AVERIGUANDO SI UNA FECHA SE ENCUENTRA ENTRE OTRAS DOS---");
        LocalDate b= opf.transformarFecha("28092023");
        LocalDate c= opf.transformarFecha("15092023");
        boolean correcto= opf.fechaEntreDos(a, b, c);
        if (correcto == true){
            System.out.println("LA FECHA " + c + " SE ENCUENTRA ENTRE " + a + " Y " + b);
        }else{
            System.out.println("LA FECHA " + c + " NO SE ENCUENTRA ENTRE " + a + " Y " + b);
        }
        System.out.println("-----AVERIGUANDO SI UNA FECHA ES MAYOR A OTRA---");
        boolean mayor= opf.fechaMayor(b, c);
        if (mayor == true){
            System.out.println("LA FECHA " + b + " ES MAYOR A " + c);
        }
        else{
            System.out.println("LA FECHA " + b + " NO ES MAYOR A " + c);
        }
        System.out.println("-----AVERIGUANDO SI UNA FECHA ES MENOR A OTRA---");
        boolean menor= opf.fechaMenor(a, c);
        if (menor == true){
            System.out.println("LA FECHA " + a + " ES MENOR A " + c);
        }
        else{
            System.out.println("LA FECHA " + a +  " NO ES MENOR A " + c);
        }




    }
}
