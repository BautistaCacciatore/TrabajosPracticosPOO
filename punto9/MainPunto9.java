package poo.punto9;
import java.time.LocalDate;
import java.util.Scanner;

public class MainPunto9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperacionesConFechas opf= new OperacionesConFechas();
        System.out.println("-----TRANSFORMANDO STRING EN FECHA-----");
        String a= opf.transformarFecha("30082023", 1);
        System.out.println("FORMATO DD-MM-YYYY: ");
        System.out.println(a);
        String b= opf.transformarFecha("30082023", 2);
        System.out.println("FORMATO MM-DD-YYYY: ");
        System.out.println(b);
        System.out.println("-----AVERIGUANDO SI UNA FECHA SE ENCUENTRA ENTRE OTRAS DOS---");
        LocalDate f1= LocalDate.of(2023, 9, 28);
        LocalDate f2= LocalDate.of(2023, 9, 15);
        LocalDate f3= LocalDate.of(2023, 10, 30);
        boolean correcto= opf.fechaEntreDos(f2, f3, f1);
        if (correcto == true){
            System.out.println("LA FECHA " + f1 + " SE ENCUENTRA ENTRE " + f2 + " Y " + f3);
        }else{
            System.out.println("LA FECHA " + f1 + " NO SE ENCUENTRA ENTRE " + f2 + " Y " + f3);
        }
        System.out.println("-----AVERIGUANDO SI UNA FECHA ES MAYOR A OTRA---");
        boolean mayor= opf.fechaMayor(f1, f2);
        if (mayor == true){
            System.out.println("LA FECHA " + f1 + " ES MAYOR A " + f2);
        }
        else{
            System.out.println("LA FECHA " + f1 + " NO ES MAYOR A " + f2);
        }
        System.out.println("-----AVERIGUANDO SI UNA FECHA ES MENOR A OTRA---");
        boolean menor= opf.fechaMenor(f1, f3);
        if (menor == true){
            System.out.println("LA FECHA " + f1 + " ES MENOR A " + f3);
        }
        else{
            System.out.println("LA FECHA " + f1 +  " NO ES MENOR A " + f3);
        }

    }
}
