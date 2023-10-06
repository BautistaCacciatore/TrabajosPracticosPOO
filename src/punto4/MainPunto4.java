package punto4;
import java.util.Scanner;

public class MainPunto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario usuario= new Usuario("45626436");
        usuario.asociarCuenta(50000.00, 20000.00);
        usuario.asociarCuentaCredito(800000.00);
        usuario.mostrarEstado();
        usuario.realizarGasto(25000.00);
        usuario.realizarCompra(300000.00);
        System.out.println("");
        usuario.mostrarEstado();
        usuario.invertir(20000.00);
        usuario.realizarCompra(400000.00);
        System.out.println("");
        usuario.mostrarEstado();
        usuario.realizarPago(150000.00);
        System.out.println("");
        usuario.mostrarEstado();
    }
}
