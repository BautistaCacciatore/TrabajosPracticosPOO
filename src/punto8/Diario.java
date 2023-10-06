package punto8;
import java.time.LocalDate;

public class Diario extends Publicacion{
    private LocalDate fechaPublicacion;

    /*Constructor*/
    public Diario(String nombre, String editor, String telefonoProveedor, LocalDate fechaPublicacion) {
        super(nombre, editor, telefonoProveedor);
        this.fechaPublicacion= fechaPublicacion;
    }

    /*Getters*/
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }
}
