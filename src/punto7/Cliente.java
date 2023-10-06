package punto7;

public class Cliente {
    private String patente;
    private String nombre;
    private boolean descuentoDisponible;

    /*Constructor*/
    public Cliente(String patente, String nombre) {
       setPatente(patente);
       setNombre(nombre);
    }

    /*Setters*/
    private void setPatente(String patente) {
        this.patente = patente;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescuentoDisponible(boolean descuentoDisponible) {
        this.descuentoDisponible = descuentoDisponible;
    }

    /*Getters*/
    public String getPatente() {
        return patente;
    }
    public String getNombre() {
        return nombre;
    }
    public boolean getDescuentoDisponible() {
        return descuentoDisponible;
    }
}