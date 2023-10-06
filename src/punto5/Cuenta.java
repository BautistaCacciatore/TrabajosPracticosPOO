package punto5;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cuenta {
    private double saldo;
    private double limiteGiroDescubierto;
    private double giroDescubierto;
    private double saldoInvertido;
    public static final double INTERES_POR_INVERSION = 0.4;
    public static final double PLAZO_DIAS_INVERSION = 30;
    private LocalDate fechaInversion;

    /*Constructor*/
    public Cuenta(double saldo, double limiteGiroDescubierto) {
        setSaldo(saldo);
        setLimiteGiroDescubierto(limiteGiroDescubierto);
        setGiroDescubierto(0);
        setSaldoInvertido(0);
        setFechaInversion(null);
    }

    /*Setters*/
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    private void setLimiteGiroDescubierto(double limiteGiroDescubierto) {
        this.limiteGiroDescubierto = limiteGiroDescubierto;
    }
    private void setGiroDescubierto(double giroDescubierto) {
        this.giroDescubierto = giroDescubierto;
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
    public double getLimiteGiroDescubierto() {
        return limiteGiroDescubierto;
    }
    public double getGiroDescubierto() {
        return giroDescubierto;
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

    /**
     * Dado un monto genera un gasto en la cuenta: quita del saldo el monto a gastar, si el monto es mayor
     * al saldo entonces gira en descubierto (siempre y cuando todavía quede límite).
     * Si (saldo + limite descubierto disponible) < monto, entonces la operacion no se realiza y devuelve false.
     * @param monto: el monto a gastar
     * @return boolean: indica si la operación fué exitosa.
     */

    public boolean gastar(double monto) {
        boolean res = false;

        if ((this.saldo + (this.limiteGiroDescubierto-this.giroDescubierto)) >= monto) {
            if (this.saldo < monto) {
                cancelarInversion();
                //Giro en descubierto
                this.giroDescubierto += monto - this.saldo;
                this.saldo = 0;
            }else {
                // El saldo me alzanza para el gasto
                this.saldo -= monto;
            }
            res = true;
        }

        return res;
    }

    /**
     * Deposita el monto en la cuenta. Si existe giro en descubierto, primero intenta cubrirlo y si queda
     * dinero disponible aumenta el saldo.
     * @param monto
     */
    public void depositar(double monto) {
        // TODO Implementar....
        double restante;
        if (this.giroDescubierto > 0){
            if (this.giroDescubierto >= saldo){
                this.giroDescubierto -= monto;
            }
            else{
                restante= monto - this.giroDescubierto;
                this.giroDescubierto -= this.giroDescubierto;
                this.saldo += restante;
            }
        }
        else{
            this.saldo += monto;
        }
    }

    /**
     * Realiza la inversion del monto indicado. Condiciones para que la operación sea exitosa:
     * 	a. Que el saldo sea >= monto
     *  b. Que no exista una inversión activa.
     *
     * Tambien establece la fecha de inversión.
     *
     * @param monto
     * @return
     */
    public boolean invertir(double monto) {
        // TODO Implementar ...
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

    /**
     * Devuelve el monto invertido al saldo con el interes establecido. Se puede realizar siempre y cuando
     * hayan pasado los N días que dura la inversión.
     * @return
     */
    public boolean recuperarInversion() {
        // TODO Implementar
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
