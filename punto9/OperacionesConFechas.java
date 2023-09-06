package poo.punto9;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class OperacionesConFechas{
    public String transformarFecha(String fecha, int opcion){
        String dia="", mes="", anio="";
        for (int i=0; i < fecha.length(); i++){
            if (i<=1){
                dia += fecha.charAt(i);
            }
            else{
                if (i==2 || i==3){
                    mes += fecha.charAt(i);
                }
                else{
                    anio += fecha.charAt(i);
                }
            }
        }
        int diai= Integer.parseInt(dia);
        int mesi= Integer.parseInt(mes);
        int anioi= Integer.parseInt(anio);
        LocalDate DDMMYYYY= LocalDate.of(anioi, mesi, diai);
        if (opcion==1){
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String fechaString = DDMMYYYY.format(formato); // Convierte LocalDate a String
            return fechaString;
        }
        else{
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM-dd-yyyy");
            String fechaString = DDMMYYYY.format(formato); // Convierte LocalDate a String
            return fechaString;
        }
    }

    public boolean fechaEntreDos(LocalDate fecha1, LocalDate fecha2, LocalDate fecha_buscada){
        if (fecha_buscada.isAfter(fecha1) && fecha_buscada.isBefore(fecha2)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean fechaMayor(LocalDate fecha1, LocalDate fecha2){
        if (fecha1.isAfter(fecha2)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean fechaMenor(LocalDate fecha1, LocalDate fecha2){
        if (fecha1.isBefore(fecha2)){
            return true;
        }
        else{
            return false;
        }
    }



}
