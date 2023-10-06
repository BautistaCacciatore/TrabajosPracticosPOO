package punto6;

public class Cliente {
    private String patente;
    private String nombre;

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

    /*Getters*/
    public String getPatente() {
        return patente;
    }
    public String getNombre() {
        return nombre;
    }
}