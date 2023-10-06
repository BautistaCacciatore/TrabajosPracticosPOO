package punto13;

public class ReciboSueldo {
    private int codigo;
    private double importe;

    public ReciboSueldo(int codigo, double importe){
        this.codigo= codigo;
        this.importe= importe;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getImporte() {
        return importe;
    }
}
