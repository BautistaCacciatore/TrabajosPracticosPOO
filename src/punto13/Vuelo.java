package punto13;

public class Vuelo {
    private String destino;
    private String partida;
    private int cantidadPasajeros;

    public Vuelo(String destino, String partida, int cantidadPasajeros) {
        this.destino = destino;
        this.partida = partida;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getDestino() {
        return destino;
    }

    public String getPartida() {
        return partida;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }
}
