package punto14;

public class PaqueteTurismo {
    private static int numero=1;
    private int codigo;
    private String destino;
    private ProveedorHospedaje hospedaje;
    private ProveedorTransporte transporte;
    private GuiaTuristico guiaTuristico;
    private int costo_total;
    private int cantidadClientesMaxima;
    private int cantidadVendida;

    /*Constructor*/
    public PaqueteTurismo(String destino, ProveedorHospedaje hospedaje, ProveedorTransporte transporte, GuiaTuristico guiaTuristico, int cantidadClientesMaxima) {
        this.codigo= numero++;
        setDestino(destino);
        setHospedaje(hospedaje);
        setTransporte(transporte);
        setGuiaTuristico(guiaTuristico);
        setCantidadClientesMaxima(cantidadClientesMaxima);
        setCosto_total(calcularCostoTotalPaquete(cantidadClientesMaxima));
        this.cantidadVendida= 0;
    }

    /*Setters*/
    private void setDestino(String destino) {
        this.destino = destino;
    }
    private void setHospedaje(ProveedorHospedaje hospedaje) {
        this.hospedaje = hospedaje;
    }
    private void setTransporte(ProveedorTransporte transporte) {
        this.transporte = transporte;
    }
    private void setGuiaTuristico(GuiaTuristico guiaTuristico) {
        this.guiaTuristico= guiaTuristico;
    }
    private void setCosto_total(int costo_total){
        this.costo_total= costo_total;
    }
    private void setCantidadClientesMaxima(int cantidadClientesMaxima){
        this.cantidadClientesMaxima= cantidadClientesMaxima;
    }

    /*Getters*/
    public String getDestino() {
        return destino;
    }
    public ProveedorHospedaje getHospedaje() {
        return hospedaje;
    }
    public ProveedorTransporte getTransporte() {
        return transporte;
    }
    public GuiaTuristico getGuiaTuristico() {
        return guiaTuristico;
    }
    public int getCosto_total(){
        return costo_total;
    }
    public int getCodigo(){
        return codigo;
    }
    public int getCantidadClientesMaxima() {
        return cantidadClientesMaxima;
    }
    public int getCantidadVendida(){
        return cantidadVendida;
    }

    public int calcularCostoTotalPaquete(int cantidadClientesMaxima){
        int total=0;
        transporte.calcularPrecioFinal(cantidadClientesMaxima);
        hospedaje.calcularPrecioFinal(cantidadClientesMaxima);
        guiaTuristico.calcularPrecioFinal(cantidadClientesMaxima);
        total+= (transporte.getPrecioFinal()) / cantidadClientesMaxima;
        total+= hospedaje.getPrecioFinal();
        total+= guiaTuristico.getPrecioFinal();
        setCosto_total(total);
        return total;
    }

    public void mostrarPaquete(){
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Destino: " + getDestino());
        System.out.println("Hospedaje: " + getHospedaje().getNombre());
        System.out.println("Transporte: " + getTransporte().getTipo() + " " +getTransporte().getNombre());
        System.out.println("Guia Turistico: " + getGuiaTuristico().getNombre());
        System.out.println("Cantidad vendida: " + getCantidadVendida());
        System.out.println("PRECIO TOTAL: " + getCosto_total());
    }

    public void registrarVentaPaquete(){
        this.cantidadVendida+=1;
    }

}
