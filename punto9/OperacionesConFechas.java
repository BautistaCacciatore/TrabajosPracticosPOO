package poo.punto9;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class OperacionesConFechas{
    public LocalDate transformarFecha(String dateString, String format){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return LocalDate.parse(dateString, formatter);
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
