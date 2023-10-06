package punto6;

import java.util.ArrayList;

public class EstacionDeServicio {
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;
    private ArrayList<Expendedor> expendedores;
    private ArrayList<Combustible> combustibles;
    private ArrayList<Venta> ventas;
    private ModuloInformes informes;

    /*Constructor*/
    public EstacionDeServicio(){
        setEmpleados(new ArrayList<>());
        setClientes(new ArrayList<>());
        setExpendedores(new ArrayList<>());
        setCombustibles(new ArrayList<>());
        setVentas(new ArrayList<>());
        setInformes(new ModuloInformes());
    }

    /*Setters*/
    private void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    private void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    private void setExpendedores(ArrayList<Expendedor> expendedores) {
        this.expendedores = expendedores;
    }
    private void setCombustibles(ArrayList<Combustible> combustibles) {
        this.combustibles = combustibles;
    }
    private void setVentas(ArrayList<Venta> ventas){
        this.ventas= ventas;
    }
    private void setInformes(ModuloInformes informes) {
        this.informes = informes;
    }

    /*Getters*/
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public ArrayList<Expendedor> getExpendedores() {
        return expendedores;
    }
    public ArrayList<Combustible> getCombustibles() {
        return combustibles;
    }
    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    public ModuloInformes getInformes() {
        return informes;
    }

    private Empleado buscarEmpleado(String dni){
        for (int i=0; i<empleados.size(); i++){
            if (empleados.get(i).getDni().equals(dni)){
                return empleados.get(i);
            }
        }
        return null;
    }

    private Expendedor buscarExpendedor(int codigo){
        for (int i=0; i<expendedores.size(); i++){
            if (expendedores.get(i).getCodigo()==codigo){
                return expendedores.get(i);
            }
        }
        return null;
    }

    private Cliente buscarCliente(String patente){
        for (int i=0; i<clientes.size(); i++){
            if (clientes.get(i).getPatente().equals(patente)){
                return clientes.get(i);
            }
        }
        return null;
    }

    private Combustible buscarCombustible(String nombre){
        for (int i=0; i<combustibles.size(); i++){
            if (combustibles.get(i).getNombre().equals(nombre)){
                return combustibles.get(i);
            }
        }
        return null;
    }

    public void agregarCombustible(String nombre, float precio){
        Combustible c= buscarCombustible(nombre);
        if (c==null){
            combustibles.add(new Combustible(nombre, precio));
        }
    }

    public void agregarExpendedor(int codigo, String nombreCombustible){
        Combustible c= buscarCombustible(nombreCombustible);
        if (c!=null){
            expendedores.add(new Expendedor(codigo, c));
        }
    }

    public void registrarEmpleado(String nombre, String apellido, String dni){
        Empleado e= new Empleado(nombre, apellido, dni);
        empleados.add(e);
        getInformes().anadirEmpleado(e);
    }

    public void registrarVenta(String patente, String nombreCliente, int codigoExpendedor, String dniEmpleado, float litros){
        Cliente c= buscarCliente(patente);
        if (c==null){
            c= new Cliente(patente, nombreCliente);
        }
        Expendedor ex= buscarExpendedor(codigoExpendedor);
        Empleado em= buscarEmpleado(dniEmpleado);
        Venta v= new Venta(c, em, ex, litros);
        v.calcularTotalVenta();
        getVentas().add(v);
        getClientes().add(c);
        getInformes().anadirVenta(v);
    }

    public void porcentajeVentasPorCombustible() {
        getInformes().porcentajeVentasPorCombustible();
    }

    public void totalVentasPorExpendedor() {
        getInformes().totalVentasPorExpendedor();
    }

    public void totalLitrosExpendidosPorExpendedor() {
        getInformes().totalLitrosExpendidosPorExpendedor();
    }

    public void totalVentasPorEmpleado(){
        getInformes().totalVentasPorEmpleado();
    }

    public void top10Clientes(){
        getInformes().top10Clientes();
    }
}
