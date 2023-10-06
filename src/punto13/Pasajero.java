package punto13;

import java.util.ArrayList;

public class Pasajero extends Rol{
    private int numeroPasajero;
    private ArrayList<Ticket> tickets;

    public Pasajero(int numeroPasajero){
        this.numeroPasajero= numeroPasajero;
        this.tickets= new ArrayList<>();
    }

    public void anadirTicket(Ticket ticket){
        this.tickets.add(ticket);
    }
}
