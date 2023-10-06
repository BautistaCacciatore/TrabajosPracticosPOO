package punto8;

public class Libro extends Publicacion{
    private String isbn;
    private int anioPublicacion;
    private String autores[];
    private int cantidadPaginas;
    private int ejemplaresDisponibles;
    private int ejemplaresPrestados;

    /*Constructor*/
    public Libro(String nombre, String editor, String telefonoProveedor, String isbn, int anioPublicacion, String autores[], int cantidadPaginas, int cantidadEjemplares){
        super(nombre, editor, telefonoProveedor);
        this.isbn= isbn;
        this.anioPublicacion= anioPublicacion;
        this.autores= autores;
        this.cantidadPaginas= cantidadPaginas;
        this.ejemplaresPrestados= 0;
        this.ejemplaresDisponibles= cantidadEjemplares;
    }

    /*Getters*/
    public String getIsbn() {
        return isbn;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public String[] getAutores() {
        return autores;
    }
    public int getCantidadPaginas() {
        return cantidadPaginas;
    }
    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }
    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public boolean libroPuedeSerPrestado(){
        if (this.ejemplaresDisponibles > 1){
            return true;
        }
        else{
            return false;
        }
    }

    public void registrarLibroComoPrestado(){
        ejemplaresPrestados+=1;
        ejemplaresDisponibles-=1;
    }

    public void incrementarDisponibles(){
        this.ejemplaresDisponibles+=1;
    }

    public void mostrarLibro(){
        System.out.println("El libro " + getNombre() +  " creado por el autor " + getAutores() + " tiene " +  getCantidadPaginas() + " páginas, quedan " +  getEjemplaresDisponibles() +  " disponibles y se prestaron " + getEjemplaresPrestados() + " .");
    }
}
