package punto12;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CajaDeAhorro extends Cuenta{
    private double saldo;
    private double saldoInvertido;
    public static final double INTERES_POR_INVERSION = 0.4;
    public static final double PLAZO_DIAS_INVERSION = 30;
    private LocalDate fechaInversion;

    public CajaDeAhorro(double saldo){
        setSaldo(saldo);
        setSaldoInvertido(0);
        setFechaInversion(null);
    }

    /*Setters*/
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    private void setSaldoInvertido(double saldoInvertido) {
        this.saldoInvertido = saldoInvertido;
    }
    private void setFechaInversion(LocalDate fechaInversion) {
        this.fechaInversion = fechaInversion;
    }

    /*Getters*/
    public double getSaldo() {
        return saldo;
    }
    public double getSaldoInvertido() {
        return saldoInvertido;
    }
    public LocalDate getFechaInversion() {
        return fechaInversion;
    }
    public double getInteresPorInversion(){
        return INTERES_POR_INVERSION;
    }
    public double getInteresAGanar() {
        if (this.fechaInversion != null)
            return this.saldoInvertido * INTERES_POR_INVERSION;
        return 0.0d;
    }

    public boolean gastar(double monto) {
        boolean res = false;

        if (this.saldo >= monto) {
            res = true;
            this.saldo -= monto;
        }

        return res;
    }

    public void depositar(double monto) {
        this.saldo+= monto;
    }

    public boolean invertir(double monto) {
        if ((this.saldo >= monto) && (this.saldoInvertido==0)){
            this.saldo -= monto;
            this.saldoInvertido += monto;
            this.fechaInversion= LocalDate.now();
            return true;
        }
        else{
            return false;
        }
    }

    public boolean recuperarInversion() {
        if (this.fechaInversion != null){
            long diasTranscurridos = ChronoUnit.DAYS.between(this.fechaInversion, LocalDate.now());
            if (diasTranscurridos >= PLAZO_DIAS_INVERSION){
                this.saldo += this.saldoInvertido * INTERES_POR_INVERSION;
                this.saldoInvertido= 0;
                this.fechaInversion= null;
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public boolean cancelarInversion() {
        if (this.fechaInversion != null){
            long diasTranscurridos = ChronoUnit.DAYS.between(this.fechaInversion, LocalDate.now());
            if (diasTranscurridos >= PLAZO_DIAS_INVERSION){
                this.saldo += this.saldoInvertido * (0*05);
                this.saldoInvertido= 0;
                this.fechaInversion= null;
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

}
