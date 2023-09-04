package poo.punto9;
import java.time.LocalDate;

public class OperacionesConFechas{
    public LocalDate transformarFecha(String fecha){
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
        return DDMMYYYY;
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
