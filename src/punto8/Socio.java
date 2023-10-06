package punto8;

import java.util.ArrayList;

public class Socio {
    private String nombre;
    private String apellido;
    private String dni;
    private int prestamosTotales;
    private ArrayList<Libro> librosEnPoderActualmente;

    /*Constructor*/
    public Socio(String nombre, String apellido, String dni){
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
        this.prestamosTotales= 0;
        this.librosEnPoderActualmente= new ArrayList<>();
    }

    /*Setters*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    /*Getters*/
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDni() {
        return dni;
    }
    public int getPrestamosTotales() {
        return prestamosTotales;
    }
    public ArrayList<Libro> getLibrosEnPoderActualmente() {
        return librosEnPoderActualmente;
    }

    public void nuevoPrestamo(Libro l){
        this.librosEnPoderActualmente.add(l);
        this.prestamosTotales+=1;
    }

    public Libro nuevaDevolucion(Libro l){
        this.librosEnPoderActualmente.remove(l);
        return l;
    }

    public void mostrarLibrosEnPoder(){
        for (int i=0; i<librosEnPoderActualmente.size(); i++){
            System.out.println("Libro " + librosEnPoderActualmente.get(i).getNombre() + " , en manos de: " + getDni());
        }
    }

}
