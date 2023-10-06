package punto13;

public class Ticket {
    private int codigo;
    private Vuelo vuelo;

    public Ticket(int codigo, Vuelo vuelo) {
        this.codigo = codigo;
        this.vuelo = vuelo;
    }

    public int getCodigo() {
        return codigo;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }
}
