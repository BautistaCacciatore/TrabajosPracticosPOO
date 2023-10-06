package punto10;

public class MainPunto10 {
    public static void main(String[] args) {
        Empresa empresa= new Empresa();
        EmpleadoAsalariado empleadoAsalariado= new EmpleadoAsalariado("Bautista", "Cacciatore", "116364364", "20-3423432-1","2003-09-28" ,190000);
        EmpleadoPorComision empleadoPorComision= new EmpleadoPorComision("Alejandro", "Garnacho", "1132432234", "21-3254232-9", "2000-07-12",3200);
        empleadoPorComision.setCantidadVentasRealizadas(21, 130000);
        EmpleadoPorComisionYSalarioBase empleadoPorComisionYSalarioBase= new EmpleadoPorComisionYSalarioBase("Andre", "Onana", "11399344", "11-8983232-4", "1990-02-20",180000, 2500);
        empleadoPorComisionYSalarioBase.setCantidadVentasRealizadas(14, 100500);
        EmpleadoPorHora empleadoPorHora= new EmpleadoPorHora("Marcus", "Rashford", "1189273947", "19-8328032-2", "1999-09-18",40, 6000);
        empresa.agregarEmpleado(empleadoAsalariado);
        empresa.agregarEmpleado(empleadoPorComision);
        empresa.agregarEmpleado(empleadoPorComisionYSalarioBase);
        empresa.agregarEmpleado(empleadoPorHora);
        Pasante pasante= new Pasante("Sergio", "Reguilon", "118838433", "18-432983242-3", "2004-11-30");
        empresa.agregarEmpleado(pasante);
        empresa.calcularSueldos();
    }
}
