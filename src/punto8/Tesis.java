package punto8;
import java.time.Year;

public class Tesis extends Publicacion{
    private String autor;
    private int mesPublicacion;
    private Year anioPublicacion = Year.of(2023);

    /*Constructor*/
    public Tesis(String nombre, String editor, String telefonoProveedor, String autor, int mesPublicacion, Year anioPublicacion) {
        super(nombre, editor, telefonoProveedor);
        this.autor= autor;
        this.mesPublicacion= mesPublicacion;
        this.anioPublicacion= anioPublicacion;
    }

    /*Getters*/
    public String getAutor() {
        return autor;
    }
    public int getMesPublicacion() {
        return mesPublicacion;
    }
    public Year getAnioPublicacion() {
        return anioPublicacion;
    }
}
