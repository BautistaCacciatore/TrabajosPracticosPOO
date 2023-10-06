package punto1;
import java.time.LocalDate;
import java.util.Scanner;

public class MainClub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Club club1= new Club("Cerro Catedral FC", "San Carlos de Bariloche");
        System.out.println("-----ASOCIANDO SOCIOS AL CLUB-----");
        club1.asociar("Kylian", "Mbappe", "45626436", "aaaaa@gmail.com", "1132432234", TipoSuscripcion.BASICA);
        club1.asociar("Erling", "Haaland", "42765487", "bbbbbb@gmail.com", "111121233", TipoSuscripcion.DESTACADA);
        club1.asociar("Cristiano", "Ronaldo", "23566545", "cccccc@gmail.com", "110009843", TipoSuscripcion.BASICA);
        club1.asociar("Lionel", "Messi", "40987654", "ddddd@gmail.com", "110872777", TipoSuscripcion.INTERMEDIA);
        club1.asociar("Marcus", "Rashford", "21345622", "eeeee@gmail.com", "111102744", TipoSuscripcion.INTERMEDIA);
        System.out.println("------------------------------------------------------------------------");
        LocalDate fecha= LocalDate.now();
        club1.reporteNuevosSocios(fecha);
        System.out.println("------------------------------------------------------------------------");
        club1.actividadesPorSuscripcion();
        System.out.println("------------------------------------------------------------------------");
        club1.listadoSociosPorSuscripcion(TipoSuscripcion.BASICA);
        club1.listadoSociosPorSuscripcion(TipoSuscripcion.INTERMEDIA);
        club1.listadoSociosPorSuscripcion(TipoSuscripcion.DESTACADA);
    }
}
