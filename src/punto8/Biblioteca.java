package punto8;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Revista> revistas;
    private ArrayList<Tesis> tesis;
    private ArrayList<Diario> diarios;
    private ArrayList<Socio> socios;

    /*Constructor*/
    public Biblioteca(){
        this.libros= new ArrayList<>();
        this.revistas= new ArrayList<>();
        this.tesis= new ArrayList<>();
        this.diarios= new ArrayList<>();
        this.socios= new ArrayList<>();
    }

    public void agregarLibro(String nombre, String editor, String telefonoProveedor, String isbn, int anioPublicacion, String autores[], int cantidadPaginas, int cantidadEjemplares){
        Libro l1= buscarLibro(nombre);
        if (l1 == null) {
            Libro l= new Libro(nombre, editor, telefonoProveedor, isbn, anioPublicacion, autores, cantidadPaginas, cantidadEjemplares);
            this.libros.add(l);
        }
        else{
            l1.incrementarDisponibles();
        }
    }

    public void agregarRevista(String nombre, String editor, String telefonoProveedor, String issn, int numero, int anioPublicacion, int cantidadPAginas){
        Revista r= new Revista(nombre, editor, telefonoProveedor, issn, numero, anioPublicacion, cantidadPAginas);
        this.revistas.add(r);
    }

    public void agregarTesis(String nombre, String editor, String telefonoProveedor, String autor, int numero, Year anioPublicacion){
        Tesis t= new Tesis(nombre, editor, telefonoProveedor, autor, numero, anioPublicacion);
        this.tesis.add(t);
    }

    public void agregarDiario(String nombre, String editor, String telefonoProveedor, LocalDate fechaPublicacion){
        Diario d= new Diario(nombre, editor, telefonoProveedor, fechaPublicacion);
        this.diarios.add(d);
    }

    public void asociar(String nombre, String apellido, String dni){
        Socio s= new Socio(nombre, apellido, dni);
        this.socios.add(s);
    }

    private Socio buscarSocio(String dni){
        for (int i=0; i< socios.size(); i++){
            Socio socioActual= socios.get(i);
            if (socioActual.getDni().equals(dni)){
                return socioActual;
            }
        }
        return null;
    }

    private Libro buscarLibro(String titulo){
        for (int i=0; i< libros.size(); i++){
            Libro libro_actual= libros.get(i);
            if (libro_actual.getNombre().equals(titulo)){
                return libro_actual;
            }
        }
        return null;
    }

    public Libro prestarLibro(String titulo, String dni){
        Libro l= buscarLibro(titulo);
        Socio s= buscarSocio(dni);
        if ((l != null) && (s != null)){
            boolean prestar= l.libroPuedeSerPrestado();
            if (prestar==true){
                System.out.println("EL LIBRO " + l.getNombre() + " FUE PRESTADO CON EXITO");
                l.registrarLibroComoPrestado();
                s.nuevoPrestamo(l);
                return l;
            }
            else{
                System.out.println("EL LIBRO " + l.getNombre() + " NO PUEDE SER PRESTADO");
                return null;
            }
        }
        else{
            System.out.println("NO SE PUDO REALIZAR EL PRESTAMO");
            return null;
        }
    }

    public void ejemplaresPrestadosActualmente(){
        System.out.println("PRESTADOS: ");
        for (int i= 0; i<socios.size(); i++){
            socios.get(i).mostrarLibrosEnPoder();
        }
    }

    public void devolverLibro(String titulo, String dni){
        Libro l= buscarLibro(titulo);
        Socio s= buscarSocio(dni);
        if ((l!= null) && (s!= null)){
            l.incrementarDisponibles();
            s.nuevaDevolucion(l);
            System.out.println("DEVOLUCION REGISTRADA CON EXITO");
        }
        else{
            System.out.println("NO SE PUDO REGISTRAR LA DEVOLUCION");
        }
    }

    public int cantidadEjemplaresDisponibles(String titulo){
        Libro l= buscarLibro(titulo);
        if (l!= null){
            return l.getEjemplaresDisponibles();
        }
        else{
            System.out.println("EL LIBRO NO SE ENCUENTRA EN LA BIBLIOTECA");
            return -1;
        }
    }

    public int cantidadPrestamos(){
        int cont= 0;
        for (int i=0; i<libros.size(); i++){
            Libro l= libros.get(i);
            cont+= l.getEjemplaresPrestados();
        }
        return cont;
    }

    public Libro libroMasPaginas(String titulo1, String titulo2){
        Libro l1= buscarLibro(titulo1);
        Libro l2= buscarLibro(titulo2);
        if ((l1==null) || (l2==null)){
            System.out.println("ALGUNO DE LOS LIBROS NO SE ENCUENTRA EN LA BIBLIOTECA");
            return null;
        }
        else{
            if (l1.getCantidadPaginas()>=l2.getCantidadPaginas()){
                System.out.println("EL LIBRO " + l1.getNombre() + " TIENE MAS PAGINAS QUE " + l2.getNombre());
                return l1;
            }
            else{
                System.out.println("EL LIBRO " + l2.getNombre() + " TIENE MAS PAGINAS QUE " + l1.getNombre());
                return l2;
            }
        }
    }




}
