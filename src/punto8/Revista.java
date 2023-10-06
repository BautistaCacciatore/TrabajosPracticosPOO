package punto8;

public class Revista extends Publicacion{
    private String issn;
    private int numero;
    private int anioPublicacion;
    private int cantidadPaginas;
    private int ejemplaresDisponibles;
    private int ejemplaresPrestados;

    /*Constructor*/
    public Revista(String nombre, String editor, String telefonoProveedor, String issn, int numero, int anioPublicacion, int cantidadPaginas) {
        super(nombre, editor, telefonoProveedor);
        this.issn= issn;
        this.numero= numero;
        this.anioPublicacion= anioPublicacion;
        this.cantidadPaginas= cantidadPaginas;
        this.ejemplaresDisponibles= 1;
        this.ejemplaresPrestados= 0;
    }

    /*Getters*/
    public String getIssn() {
        return issn;
    }
    public int getNumero() {
        return numero;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
}
