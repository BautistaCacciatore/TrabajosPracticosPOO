package punto11;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Automovil> autos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Alquiler> alquileres;

    public Empresa(){
        this.autos= new ArrayList<>();
        this.clientes= new ArrayList<>();
        this.alquileres= new ArrayList<>();
    }

    public Automovil buscarAuto(String patente){
        for (int i=0; i<autos.size(); i++){
            if (patente.equals(autos.get(i).getPatente())){
                return autos.get(i);
            }
        }
        return null;
    }

    public void añadirAuto(Automovil automovil){
        Automovil a= buscarAuto(automovil.getPatente());
        if (a==null){
            autos.add(automovil);
        }
        else{
            System.out.println("EL AUTO NO SE AGREGO YA QUE YA SE ENCONTRABA EN LA EMPRESA");
        }
    }

    public Cliente buscarCliente(String dni){
        for (int i=0; i<clientes.size(); i++){
            if (dni.equals(clientes.get(i).getDni())){
                return clientes.get(i);
            }
        }
        return null;
    }

    public void añadirCliente(String nombre, String apellido, String dni){
        Cliente c= buscarCliente(dni);
        if (c==null){
            clientes.add(new Cliente(nombre, apellido, dni));
        }
        else{
            System.out.println("EL CLIENTE NO SE AGREGO YA QUE YA SE ENCONTRABA EN LA EMPRESA");
        }
    }

    public void generarPresupuesto(String dni, String patente, int cantDias, LocalDate fechainicio, LocalDate fechafin){
        Cliente c= buscarCliente(dni);
        Automovil a= buscarAuto(patente);
        if ((c!=null) && (a!=null)){
            Presupuesto p= new Presupuesto(a, cantDias);
            p.mostrarPresupuesto();
            System.out.println("SE GENERO UN ALQUILER A PARTIR DEL PRESUPUESTO");
            Alquiler al= new Alquiler(p, c, fechainicio, fechafin);
            alquileres.add(al);
            Automovil auto= al.getAutomovil();
            auto.modificarEstado(0);
        }
    }

    public void montoTotalPorCliente(String dni){
        Cliente c= buscarCliente(dni);
        double total= 0;
        if (c!=null){
            for (int i= 0; i<alquileres.size(); i++){
                if (dni.equals(alquileres.get(i).getCliente().getDni())){
                    total+= alquileres.get(i).getTotalAPagar();
                }
            }
        }
        System.out.println("MONTO TOTAL DE LOS ALQUILERES REALIZADOS AL CLIENTE " + dni + ": " + total);
    }

    public void totalAlquileres(){
        double total= 0;
        for (int i= 0; i<alquileres.size(); i++){
            total+= alquileres.get(i).getTotalAPagar();
        }
        System.out.println("MONTO TOTAL DE LOS ALQUILERES REALIZADOS: " + total);
    }

}
