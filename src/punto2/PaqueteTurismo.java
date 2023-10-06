package punto2;
import java.util.ArrayList;

public class PaqueteTurismo {
    private static int numero=1;
    private int codigo;
    private Destino destino;
    private Hospedaje hospedaje;
    private Transporte transporte;
    private ArrayList<Excursion> excursiones;
    private int costo_total;
    private boolean vendido;

    /*Constructor*/
    public PaqueteTurismo(Destino destino, Hospedaje hospedaje, Transporte transporte, ArrayList<Excursion> excursiones) {
        this.codigo= numero++;
        setDestino(destino);
        setHospedaje(hospedaje);
        setTransporte(transporte);
        setExcursiones(excursiones);
        setCosto_total(calcularCostoTotalPaquete());
        setVendido(false);
    }

    /*Setters*/
    private void setDestino(Destino destino) {
        this.destino = destino;
    }
    private void setHospedaje(Hospedaje hospedaje) {
        this.hospedaje = hospedaje;
    }
    private void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
    private void setExcursiones(ArrayList<Excursion> excursiones) {
        this.excursiones = excursiones;
    }
    private void setCosto_total(int costo_total){
        this.costo_total= costo_total;
    }
    private void setVendido(boolean vendido){
        this.vendido= vendido;
    }

    /*Getters*/
    public Destino getDestino() {
        return destino;
    }
    public Hospedaje getHospedaje() {
        return hospedaje;
    }
    public Transporte getTransporte() {
        return transporte;
    }
    public ArrayList<Excursion> getExcursiones() {
        return excursiones;
    }
    public int getCosto_total(){
        return costo_total;
    }
    public boolean getVendido(){
        return vendido;
    }
    public int getCodigo(){
        return codigo;
    }

    public int calcularCostoTotalPaquete(){
        int total=0;
        total+=getTransporte().getPrecio();
        total+=getHospedaje().getPrecio();
        for (int i=0; i<excursiones.size(); i++){
            total+= excursiones.get(i).getPrecio();
        }
        setCosto_total(total);
        return total;
    }

    public void mostrarPaquete(){
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Destino: " + getDestino().getNombre());
        System.out.println("Hospedaje: " + getHospedaje().getNombre());
        System.out.println("Transporte: " + getTransporte().getTipo() + " " +getTransporte().getNombre());
        System.out.println("Excursiones: ");
        for (int i=0; i<excursiones.size(); i++){
            System.out.println(excursiones.get(i).getNombre());
        }
        System.out.println("PRECIO TOTAL: " + getCosto_total());
        System.out.println("VENDIDO: " + getVendido());
    }

    public void registrarPaqueteComoVendido(){
        setVendido(true);
    }

    public void verificarSiEsVendido(){
        if (getVendido()==true){
            System.out.println("PAQUETE VENDIDO. CODIGO " + getCodigo() + ". DESTINO: " + getDestino().getNombre() );
        }
    }
}
