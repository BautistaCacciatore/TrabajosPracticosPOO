package poo.punto9;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainPunto9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperacionesConFechas opf= new OperacionesConFechas();
        System.out.println("-----TRANSFORMANDO STRING EN FECHA-----");
        LocalDate fecha1= opf.transformarFecha("15-08-2023", "dd-MM-yyyy");
        System.out.println("FORMATO DD-MM-YYYY: ");
        System.out.println(fecha1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        LocalDate fecha2= opf.transformarFecha("08-15-2023", "MM-dd-yyyy");
        System.out.println("FORMATO MM-DD-YYYY: ");
        System.out.println(fecha2.format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
        System.out.println("-----AVERIGUANDO SI UNA FECHA SE ENCUENTRA ENTRE OTRAS DOS---");
        LocalDate f1= opf.transformarFecha("28-09-2023", "dd-MM-yyyy");
        LocalDate f2= opf.transformarFecha("15-09-2023", "dd-MM-yyyy");
        LocalDate f3= opf.transformarFecha("30-10-2023", "dd-MM-yyyy");
        boolean correcto= opf.fechaEntreDos(f2, f3, f1);
        if (correcto == true){
            System.out.println("LA FECHA " + f1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + " SE ENCUENTRA ENTRE " + f2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + " Y " + f3.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        }else{
            System.out.println("LA FECHA " + f1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + " NO SE ENCUENTRA ENTRE " + f2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + " Y " + f3.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        }
        System.out.println("-----AVERIGUANDO SI UNA FECHA ES MAYOR A OTRA---");
        boolean mayor= opf.fechaMayor(f1, f2);
        if (mayor == true){
            System.out.println("LA FECHA " + f1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + " ES MAYOR A " + f2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        }
        else{
            System.out.println("LA FECHA " + f1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + " NO ES MAYOR A " + f2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        }
        System.out.println("-----AVERIGUANDO SI UNA FECHA ES MENOR A OTRA---");
        boolean menor= opf.fechaMenor(f1, f3);
        if (menor == true){
            System.out.println("LA FECHA " + f1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + " ES MENOR A " + f3.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        }
        else{
            System.out.println("LA FECHA " + f1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) +  " NO ES MENOR A " + f3.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        }

    }
}
