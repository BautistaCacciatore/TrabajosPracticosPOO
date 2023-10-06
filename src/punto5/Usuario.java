package punto5;

public class Usuario {
    private String dni;
    private Cuenta cuenta;
    private CuentaCredito cuentaCredito;

    public Usuario(String dni) {
        setDni(dni);
    }

    /*Setters*/
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    public void setCuentaCredito(CuentaCredito cuentaCredito) {
        this.cuentaCredito = cuentaCredito;
    }

    /*Getters*/
    public String getDni() {
        return dni;
    }
    public Cuenta getCuenta() {
        return cuenta;
    }
    public CuentaCredito getCuentaCredito() {
        return cuentaCredito;
    }

    public void asociarCuenta(Double saldo, Double limiteGiroDescubierto){
        Cuenta cuenta1= new Cuenta(saldo, limiteGiroDescubierto);
        setCuenta(cuenta1);
    }

    public void asociarCuentaCredito(Double limite){
        CuentaCredito cuentaCredito1= new CuentaCredito(limite);
        setCuentaCredito(cuentaCredito1);
    }


    /**
     * Muestra por consola el estado de su cuenta, imprime:
     * 	a. El saldo
     *  b. El limite de giro en descubierto y en parentesis el monto girado en descubierto.
     *  c. El monto total invertido y entre parentesis el interes a ganar.
     *  d. El monto disponible para compras a credito y la deuda total a pagar segun las compras.
     */
    public void mostrarEstado() {
        System.out.println("-----------------------");
        System.out.println("Cuenta de: " + getDni());
        System.out.println("Saldo: "+ this.cuenta.getSaldo());
        System.out.println("Giro en descubierto: "+this.cuenta.getLimiteGiroDescubierto()+"("+this.cuenta.getGiroDescubierto()+")");
        System.out.println("Inversiones: "+this.cuenta.getSaldoInvertido()+"("+this.cuenta.getInteresAGanar()+")");
        System.out.println("--- Cuenta crédito ----");
        System.out.println("Disponible para compras: "+this.cuentaCredito.getMontoDisponibleParaCompras());
        System.out.println("Saldo deudor: "+this.cuentaCredito.getSaldoDeudor());
    }

    /**
     * Intenta realizar un gasto sobre la cuenta. En caso de que el monto sea mayor al saldo, emite un mensaje que no se puede
     * realizar el gasto porque se va a girar en descubierto.
     * @param monto
     * @return
     */
    public boolean realizarGasto(double monto) {
        if(monto > this.cuenta.getSaldo()) {
            System.out.println("No se puede realizar el gasto, se va a girar en descubierto...");
            return false;
        }else {
            return this.cuenta.gastar(monto);
        }

    }

    /**
     * Intenta realizar un gasto sobre la cuenta por mas que se vaya a girar en descubierto
     * @param monto
     * @return
     */
    public boolean realizarGastoYGirar(double monto) {
        return this.cuenta.gastar(monto);
    }

    public void depositar(double monto){
        this.cuenta.depositar(monto);
    }

    public boolean invertir(double monto){
        return this.cuenta.invertir(monto);
    }

    public boolean recuperarInversion(){
        return this.cuenta.recuperarInversion();
    }

    public boolean cancelarInversion(){
        return this.cuenta.cancelarInversion();
    }

    // TODO de aca para abajo falta implementar todas las operaciones posibles sobre la cuenta credito.
    public boolean realizarCompra(double monto_compra){
        return this.cuentaCredito.comprar(monto_compra);
    }

    public void realizarPago(double monto_pagar){
        this.cuentaCredito.pagar(monto_pagar);
    }

}


