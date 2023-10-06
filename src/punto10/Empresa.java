package punto10;
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa(){
        this.empleados= new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public void calcularSueldos(){
        for (int i=0; i< empleados.size(); i++){
            Empleado e= empleados.get(i);
            System.out.println("EMPLEADO: " + e.getNombre() + " , SUELDO: " + e.calcularSueldo());
        }
    }
}
