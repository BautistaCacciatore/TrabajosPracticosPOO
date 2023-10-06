package punto13;

import java.util.ArrayList;

public class Tripulante {
    private String cargo;
    private ArrayList<ReciboSueldo> recibos;

    public Tripulante(String cargo){
        this.cargo= cargo;
        this.recibos= new ArrayList<>();
    }

    public void anadirRecibo(ReciboSueldo reciboSueldo){
        this.recibos.add(reciboSueldo);
    }
}
