package punto12;

import java.util.ArrayList;

public class CuentaCredito extends Cuenta{
    private double limite;
    private ArrayList<Double> compras;
    private ArrayList<Double> pagado;

    /*Constructor*/
    public CuentaCredito(double limite) {
        setLimite(limite);
        setCompras(new ArrayList<Double>());
        setPagado(new ArrayList<Double>());
    }

    /*Setters*/
    private void setLimite(double limite) {
        this.limite = limite;
    }
    private void setCompras(ArrayList<Double> compras) {
        this.compras = compras;
    }
    private void setPagado(ArrayList<Double> pagado) {
        this.pagado = pagado;
    }

    /*Getters*/
    public double getLimite() {
        return limite;
    }
    public ArrayList<Double> getCompras() {
        return compras;
    }
    public ArrayList<Double> getPagado() {
        return pagado;
    }
    public double getMontoDisponibleParaCompras(){
        return limite;
    }
    public double getSaldoDeudor(){
        double compras= 0;
        double pagos= 0;
        for (int i=0; i<this.compras.size(); i++){
            compras+= this.compras.get(i);
        }
        for (int i=0; i<this.pagado.size(); i++){
            pagos+= this.pagado.get(i);
        }
        return (compras-pagos);
    }


    /*Si la compra es menor o igual al limite, se registra */
    public boolean comprar(double monto_compra){
        if (monto_compra <= this.limite){
            this.limite -= monto_compra;
            compras.add(monto_compra+ (monto_compra*0.05));
            return true;
        }
        else{
            return false;
        }
    }

    /* Se registra un pago, aumentando el limite pero no la parte que va destinada a la recarga */
    public void pagar(double monto_pagar){
        this.pagado.add(monto_pagar);
        this.limite += (monto_pagar - monto_pagar*0.05);
    }


}
