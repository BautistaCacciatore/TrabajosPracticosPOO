package punto7;
import java.time.LocalDate;

public class Venta {
    private LocalDate fecha;
    private Cliente cliente;
    private Empleado empleado;
    private Expendedor expendedor;
    private float litros;
    private float total_venta;

    /*Constructor*/
    public Venta(Cliente c, Empleado e, Expendedor ex, float litros){
        setFecha(LocalDate.now());
        setCliente(c);
        setEmpleado(e);
        setExpendedor(ex);
        setLitros(litros);
        setTotal_venta(calcularTotalVenta());
    }

    /*Setters*/
    private void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    private void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    private void setExpendedor(Expendedor expendedor) {
        this.expendedor = expendedor;
    }
    private void setLitros(float litros) {
        this.litros = litros;
    }
    public void setTotal_venta(float total_venta) {
        this.total_venta = total_venta;
    }

    /*Getters*/
    public LocalDate getFecha() {
        return fecha;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public Expendedor getExpendedor() {
        return expendedor;
    }
    public float getLitros() {
        return litros;
    }
    public float getTotal_venta() {
        return total_venta;
    }

    public float calcularTotalVenta(){
        float precio= getExpendedor().getCombustible().getPrecio();
        return (precio*getLitros());
    }

    public float montoVentaSurtidor(){
        return (getExpendedor().getCombustible().getPrecio()*getLitros());
    }

}
