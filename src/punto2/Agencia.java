package punto2;
import java.util.ArrayList;
import java.util.Random;

public class Agencia {
    private String nombre;
    private ArrayList<Destino> destinos;
    private ArrayList<Hospedaje> hospedajes;
    private ArrayList<Excursion> excursiones;
    private ArrayList<Transporte> transportes;
    private ArrayList<PaqueteTurismo> paquetes;
    private ArrayList<Cliente> clientes;

    /*Constructor*/
    public Agencia() {
        setNombre("SunBeach");
        setDestinos(new ArrayList<>());
        setExcursiones(new ArrayList<>());
        setHospedajes(new ArrayList<>());
        setTransportes(new ArrayList<>());
        setPaquetes(new ArrayList<>());
        setClientes(new ArrayList<>());
    }

    /*Setters*/
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private void setDestinos(ArrayList<Destino> destinos) {
        this.destinos = destinos;
    }
    private  void setHospedajes(ArrayList<Hospedaje> hospedajes) {
        this.hospedajes = hospedajes;
    }
    private void setExcursiones(ArrayList<Excursion> excursiones) {
        this.excursiones = excursiones;
    }
    private void setTransportes(ArrayList<Transporte> transportes) {
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
    public ArrayList<Destino> getDestinos() {
        return destinos;
    }
    public ArrayList<Hospedaje> getHospedajes() {
        return hospedajes;
    }
    public ArrayList<Excursion> getExcursiones() {
        return excursiones;
    }
    public ArrayList<Transporte> getTransportes() {
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
    public void anadirDestino(String destino){
        Destino d= new Destino(destino);
        getDestinos().add(d);
    }
    public void anadirHospedaje(String ciudad, String nombre, int precio){
        Hospedaje h= new Hospedaje(ciudad, nombre, precio);
        getHospedajes().add(h);
    }
    public void anadirTransporte(String destino, String tipo, String nombre, int precio){
        Transporte t= new Transporte(destino, tipo, nombre, precio);
        getTransportes().add(t);
    }
    public void anadirExcursion(String ciudad, String nombre, int precio){
        Excursion e= new Excursion(ciudad, nombre, precio);
        getExcursiones().add(e);
    }

    public PaqueteTurismo generarNuevoPaqueteTurismo(){
        Random random= new Random();
        //genero un destino aleatorio
        int indiceDestinoAleatorio= random.nextInt(destinos.size());
        Destino nuevoDestino = destinos.get(indiceDestinoAleatorio);
        //genero un hospedaje aleatorio
        int indiceHospedajeAleatorio= random.nextInt(hospedajes.size());
        Hospedaje nuevoHospedaje = hospedajes.get(indiceHospedajeAleatorio);
        boolean sirve= false;
        while (sirve==false){
            if (nuevoHospedaje.getCiudad().equals(nuevoDestino.getNombre())){
                sirve= true;
            }
            else{
                indiceHospedajeAleatorio= random.nextInt(hospedajes.size());
                nuevoHospedaje = hospedajes.get(indiceHospedajeAleatorio);
            }
        }
        //genero un transporte aleatorio
        int indiceTransporteAleatorio= random.nextInt(transportes.size());
        Transporte nuevoTransporte = transportes.get(indiceTransporteAleatorio);
        boolean sirve1= false;

        while (sirve1==false){
            if (nuevoTransporte.getDestino().equals(nuevoDestino.getNombre())){
                sirve1= true;
            }
            else{
                indiceTransporteAleatorio= random.nextInt(transportes.size());
                nuevoTransporte = transportes.get(indiceTransporteAleatorio);
            }
        }

        //genero excursiones aleatorias
        int cant_excursiones_maxima= 0;
        for (int i=0; i<excursiones.size(); i++){
            if (excursiones.get(i).getCiudad().equals(nuevoDestino.getNombre())){
                cant_excursiones_maxima+=1;
            }
        }
        ArrayList<Excursion> nuevasExcursiones= new ArrayList<>();
        int cantidadExcursiones= random.nextInt(cant_excursiones_maxima);
        if (cantidadExcursiones==0){
            cantidadExcursiones+=1;
        }
        int i=0;
        while (i < cantidadExcursiones){
            int indiceExcursionAleatoria= random.nextInt(excursiones.size());
            Excursion ex= excursiones.get(indiceExcursionAleatoria);
            if (ex.getCiudad().equals(nuevoDestino.getNombre())){
                boolean esta= false;
                for (int j=0; j<nuevasExcursiones.size(); j++){
                    if (ex.getNombre().equals(nuevasExcursiones.get(j).getNombre())){
                        esta= true;
                    }
                }
                if (esta==false){
                    nuevasExcursiones.add(ex);
                    i++;
                }
            }
        }

        PaqueteTurismo nuevoPaquete= new PaqueteTurismo(nuevoDestino, nuevoHospedaje, nuevoTransporte, nuevasExcursiones);
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
            p.registrarPaqueteComoVendido();
        }
        else{
            System.out.println("NO SE PUDO REALIZAR LA VENTA");
        }
    }

    public void informeDePaquetesVendidos(){
        System.out.println("");
        for (int i=0; i<paquetes.size(); i++){
            paquetes.get(i).verificarSiEsVendido();
        }
    }

    public Destino destinoFavorito(){
        Destino favorito= null;
        int aparicionesMaximas= 0;
        for (int i=0; i<paquetes.size(); i++){
            Destino actual= paquetes.get(i).getDestino();
            int contador= 0;
            for (int j=0; j<paquetes.size(); j++){
                if (paquetes.get(j).getDestino().equals(actual)){
                    contador+=1;
                }
            }

            if (contador > aparicionesMaximas){
                favorito= actual;
                aparicionesMaximas= contador;
            }
        }
        System.out.println("DESTINO FAVORITO: " + favorito.getNombre());
        return favorito;
    }


}
