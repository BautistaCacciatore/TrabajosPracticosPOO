package punto7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ModuloInformes {
    private ArrayList<Empleado> empleados;
    private ArrayList<Venta> ventas;
    private ArrayList<Map.Entry<Cliente, Float>> top10;
    private ArrayList<Map.Entry<Empleado, Float>> top10Empleados;

    /*Constructor*/
    public ModuloInformes(){
        setEmpleados(new ArrayList<>());
        setVentas(new ArrayList<>());
    }

    /*Setters*/
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
    public void setTop10(ArrayList<Map.Entry<Cliente, Float>> top10) {
        this.top10 = top10;
    }
    public void setTop10Empleados(ArrayList<Map.Entry<Empleado, Float>> top10Empleados) {
        this.top10Empleados = top10Empleados;
    }

    /*Getters*/
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    public ArrayList<Map.Entry<Cliente, Float>> getTop10() {
        return top10;
    }
    public ArrayList<Map.Entry<Empleado, Float>> getTop10Empleados() {
        return top10Empleados;
    }

    public void anadirEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public void anadirVenta(Venta venta){
        ventas.add(venta);
    }

    public void porcentajeVentasPorCombustible(LocalDate fecha) {
        int total_ventas= ventas.size();
        Map<Combustible, Integer> ventasPorCombustible = new HashMap<>();
        for (int i=0; i<ventas.size(); i++) {
            Combustible tipoCombustible = ventas.get(i).getExpendedor().getCombustible();
            int cont= 1;
            if (ventas.get(i).getFecha().getMonthValue()==fecha.getMonthValue()){
                ventasPorCombustible.put(tipoCombustible, ventasPorCombustible.getOrDefault(tipoCombustible, 0) + cont);
            }
        }
        for (Map.Entry<Combustible, Integer> entry : ventasPorCombustible.entrySet()) {
            Combustible tipoCombustible = entry.getKey();
            int ventasTotales = entry.getValue();
            System.out.println("Tipo de Combustible: " + tipoCombustible.getNombre() + "- Porcentaje de Ventas: " + (((float)ventasTotales / total_ventas) * 100)+"%");

        }
    }

    public void totalVentasPorExpendedor(LocalDate fecha) {
        Map<Expendedor, Float> ventasPorExpendedor = new HashMap<>();
        for (int i=0; i<ventas.size(); i++) {
            Expendedor expendedor = ventas.get(i).getExpendedor();
            float monto= ventas.get(i).montoVentaSurtidor();
            if (ventas.get(i).getFecha().getMonthValue()==fecha.getMonthValue()){
                ventasPorExpendedor.put(expendedor, ventasPorExpendedor.getOrDefault(expendedor, 0f) + monto);
            }
        }
        ArrayList<Map.Entry<Expendedor, Float>> listaVentas = new ArrayList<>(ventasPorExpendedor.entrySet());
        Collections.sort(listaVentas, (a, b) -> Float.compare(b.getValue(), a.getValue()));
        for (int i=0; i<listaVentas.size(); i++) {
            System.out.println("Expendedor: " + listaVentas.get(i).getKey().getCodigo() + " - Monto total de ventas: " + listaVentas.get(i).getValue());
        }
    }

    public void totalLitrosExpendidosPorExpendedor(LocalDate fecha) {
        Map<Expendedor, Float> litrosPorExpendedor = new HashMap<>();
        for (int i = 0; i < ventas.size(); i++) {
            Expendedor expendedor = ventas.get(i).getExpendedor();
            float litros = ventas.get(i).getLitros();
            if (ventas.get(i).getFecha().getMonthValue()==fecha.getMonthValue()){
                litrosPorExpendedor.put(expendedor, litrosPorExpendedor.getOrDefault(expendedor, 0f) + litros);
            }
        }
        ArrayList<Map.Entry<Expendedor, Float>> listaExpendedorLitros = new ArrayList<>(litrosPorExpendedor.entrySet());
        Collections.sort(listaExpendedorLitros, (a, b) -> Float.compare(b.getValue(), a.getValue()));
        for (int i = 0; i < listaExpendedorLitros.size(); i++) {
            System.out.println("Expendedor: " + listaExpendedorLitros.get(i).getKey().getCodigo() + " - Litros expendidos: " + listaExpendedorLitros.get(i).getValue());
        }
    }

    public void totalVentasPorEmpleado(LocalDate fecha){
        Map<Empleado, Float> ventasPorEmpleado= new HashMap<>();
        for (int i=0; i< ventas.size(); i++){
            Empleado empleado= ventas.get(i).getEmpleado();
            float total= ventas.get(i).getTotal_venta();
            if (ventas.get(i).getFecha().getMonthValue()==fecha.getMonthValue()){
                ventasPorEmpleado.put(empleado, ventasPorEmpleado.getOrDefault(empleado, 0f) + total);
            }
        }
        ArrayList<Map.Entry<Empleado, Float>> listaTotalEmpleado= new ArrayList<>(ventasPorEmpleado.entrySet());
        Collections.sort(listaTotalEmpleado, (a, b) -> Float.compare(b.getValue(), a.getValue()));
        ArrayList<Map.Entry<Empleado, Float>> top10Empleados = new ArrayList<>();
        for (int i = 0; i < listaTotalEmpleado.size() && i < 10; i++) {
            listaTotalEmpleado.get(i).getKey().setPuedeAplicarDescuento(true);
            top10Empleados.add(listaTotalEmpleado.get(i));
        }
        for (int i = 0; i < top10Empleados.size(); i++) {
            System.out.println("Empleado: " + top10Empleados.get(i).getKey().getDni() + " - Monto total de ventas: " + top10Empleados.get(i).getValue());
        }
        setTop10Empleados(top10Empleados);
    }

    public void top10Clientes(LocalDate fecha){
        Map<Cliente, Float> ventasPorCliente= new HashMap<>();
        for (int i=0; i< ventas.size(); i++){
            Cliente cliente= ventas.get(i).getCliente();
            float total= ventas.get(i).getTotal_venta();
            if (ventas.get(i).getFecha().getMonthValue()==fecha.getMonthValue()){
                ventasPorCliente.put(cliente, ventasPorCliente.getOrDefault(cliente, 0f) + total);
            }
        }
        ArrayList<Map.Entry<Cliente, Float>> listaClientes= new ArrayList<>(ventasPorCliente.entrySet());
        Collections.sort(listaClientes, (a, b) -> Float.compare(b.getValue(), a.getValue()));
        ArrayList<Map.Entry<Cliente, Float>> top10 = new ArrayList<>();
        for (int i = 0; i < listaClientes.size() && i < 10; i++) {
            top10.add(listaClientes.get(i));
        }

        System.out.println("TOP 10 CLIENTES: ");
        for (int i = 0; i < top10.size(); i++) {
            top10.get(i).getKey().setDescuentoDisponible(true);
            System.out.println("TOP " + (i+1) + " : "  + top10.get(i).getKey().getNombre() + "(PATENTE: " + top10.get(i).getKey().getPatente() + ") - Monto total de ventas: " + top10.get(i).getValue());
        }
        setTop10(top10);
    }

}
