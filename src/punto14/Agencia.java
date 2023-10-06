package punto14;
import java.util.ArrayList;
import java.util.Random;

public class Agencia {
    private String nombre;
    private ArrayList<ProveedorHospedaje> hospedajes;
    private ArrayList<GuiaTuristico> guias;
    private ArrayList<ProveedorTransporte> transportes;
    private ArrayList<PaqueteTurismo> paquetes;
    private ArrayList<Cliente> clientes;

    /*Constructor*/
    public Agencia() {
        setNombre("SunBeach");
        setGuias(new ArrayList<>());
        setHospedajes(new ArrayList<>());
        setTransportes(new ArrayList<>());
        setPaquetes(new ArrayList<>());
        setClientes(new ArrayList<>());
    }

    /*Setters*/
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private void setHospedajes(ArrayList<ProveedorHospedaje> hospedajes) {
        this.hospedajes = hospedajes;
    }
    private void setGuias(ArrayList<GuiaTuristico> guias) {
        this.guias = guias;
    }
    private void setTransportes(ArrayList<ProveedorTransporte> transportes) {
        this.transportes = transportes;
    }
    private void setPaquetes(ArrayList<PaqueteTurismo> paquetes) {
        this.paquetes = paquetes;
    }
    private void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    /*Getters*/
    public String getNombre() {
        return nombre;
    }
    public ArrayList<ProveedorHospedaje> getHospedajes() {
        return hospedajes;
    }
    public ArrayList<GuiaTuristico> getGuias() {
        return guias;
    }
    public ArrayList<ProveedorTransporte> getTransportes() {
        return transportes;
    }
    public ArrayList<PaqueteTurismo> getPaquetes() {
        return paquetes;
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void registrarCliente(String nombre, String apellido, String dni){
        Cliente c= new Cliente(nombre, apellido, dni);
        clientes.add(c);
    }
    public void anadirHospedaje(String nombre, int precioBase, int cantClientesMinima){
        ProveedorHospedaje h= new ProveedorHospedaje(nombre, precioBase, cantClientesMinima);
        getHospedajes().add(h);
    }
    public void anadirTransporte(String nombre, int precioBase, String tipo){
        ProveedorTransporte t= new ProveedorTransporte(nombre, precioBase, tipo);
        getTransportes().add(t);
    }
    public void anadirGuia(String nombre, int precioBase, String apellido, String dni){
        GuiaTuristico g= new GuiaTuristico(nombre, precioBase, apellido, dni);
        getGuias().add(g);
    }

    public PaqueteTurismo generarNuevoPaqueteTurismo(String destino, int cantidadClientesMaxima){
        Random random= new Random();
        //genero un hospedaje aleatorio
        int indiceHospedajeAleatorio= random.nextInt(hospedajes.size());
        ProveedorHospedaje nuevoHospedaje = hospedajes.get(indiceHospedajeAleatorio);
        //genero un transporte aleatorio
        int indiceTransporteAleatorio= random.nextInt(transportes.size());
        ProveedorTransporte nuevoTransporte = transportes.get(indiceTransporteAleatorio);
        //genero un guia aleatorio
        int indiceGuiaAleatorio= random.nextInt(guias.size());
        GuiaTuristico nuevoGuia = guias.get(indiceGuiaAleatorio);
        PaqueteTurismo nuevoPaquete= new PaqueteTurismo(destino, nuevoHospedaje, nuevoTransporte, nuevoGuia, cantidadClientesMaxima);
        getPaquetes().add(nuevoPaquete);
        return nuevoPaquete;
    }

    public void mostrarTodosLosPaquetes(){
        for (int i=0; i<paquetes.size(); i++){
            System.out.println("");
            paquetes.get(i).mostrarPaquete();
        }
    }

    private PaqueteTurismo buscarPaquete(int codigo){
        for (int i=0; i<paquetes.size(); i++){
            if (paquetes.get(i).getCodigo()==codigo){
                return paquetes.get(i);
            }
        }
        return null;
    }

    private Cliente buscarCliente(String dni){
        for (int i=0; i<clientes.size(); i++){
            if (clientes.get(i).getDni().equals(dni)){
                return clientes.get(i);
            }
        }
        return null;
    }

    public void venderPaquete(int codigo, String dni){
        Cliente c= buscarCliente(dni);
        PaqueteTurismo p= buscarPaquete(codigo);
        if ((c != null) && (p != null)){
            c.registrarCompra(p);
            p.registrarVentaPaquete();
        }
        else{
            System.out.println("NO SE PUDO REALIZAR LA VENTA");
        }
    }

    public String destinoFavorito(){
        String favorito= "";
        int aparicionesMaximas= 0;
        for (int i=0; i<paquetes.size(); i++){
            String actual= paquetes.get(i).getDestino();
            int contador= 0;
            for (int j=0; j<paquetes.size(); j++){
                if (paquetes.get(j).getDestino().equals(actual)){
                    contador+= paquetes.get(i).getCantidadVendida();
                }
            }

            if (contador > aparicionesMaximas){
                favorito= actual;
                aparicionesMaximas= contador;
            }
        }
        System.out.println("DESTINO FAVORITO: " + favorito);
        return favorito;
    }

    public void listadoVentas(){
        System.out.println("VENTAS REALIZADAS: ");
        for (int i=0; i<paquetes.size(); i++){
            if (paquetes.get(i).getCantidadVendida() > 0){
                paquetes.get(i).mostrarPaquete();
                System.out.println("");
            }
        }
    }

    public void listadoProveedores(){
        System.out.println("PROVEEDORES: ");
        System.out.println("GUIAS: ");
        for (int i=0; i<guias.size(); i++){
            guias.get(i).mostrar();
        }
        System.out.println("");
        System.out.println("HOSPEDAJES: ");
        for (int i=0; i<hospedajes.size(); i++){
            hospedajes.get(i).mostrar();
        }
        System.out.println("");
        System.out.println("TRANSPORTES: ");
        for (int i=0; i<transportes.size(); i++){
            transportes.get(i).mostrar();
        }
    }

}
