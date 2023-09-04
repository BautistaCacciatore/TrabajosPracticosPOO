package poo.punto6;

import java.util.ArrayList;

public class Biblioteca{
    private ArrayList<Libro> array_libros;

    /*Constructor*/
    public Biblioteca(){
        ArrayList<Libro> array= new ArrayList<>();
        setArray_libros(array);
    }

    /*Setters*/
    public void setArray_libros(ArrayList<Libro> array_libros) {
        this.array_libros = array_libros;
    }

    /*Getters*/
    public ArrayList<Libro> getArray_libros() {
        return array_libros;
    }

    private Libro buscarLibro(String titulo){
        for (int i=0; i< array_libros.size(); i++){
            Libro libro_actual= array_libros.get(i);
            if (libro_actual.getTitulo().equals(titulo)){
                return libro_actual;
            }
        }
        return null;
    }

    public void agregarLibro(String titulo, String autor, int num_paginas, int cant_ejemplares){
        Libro l= buscarLibro(titulo);
        if (l != null){
            l.incrementarDisponibles();
        }
        else{
            Libro nuevo= new Libro(titulo, autor, num_paginas, cant_ejemplares, 0);
            array_libros.add(nuevo);
        }
        System.out.println("LIBRO AGREGADO CON EXITO");
    }

    public Libro prestarLibro(String titulo){
        Libro l= buscarLibro(titulo);
        if (l != null){
            boolean prestar= l.libroPuedeSerPrestado();
            if (prestar==true){
                System.out.println("EL LIBRO " + l.getTitulo() + " FUE PRESTADO CON EXITO");
                l.registrarLibroComoPrestado();
                return l;
            }
            else{
                System.out.println("EL LIBRO " + l.getTitulo() + " NO PUEDE SER PRESTADO");
                return null;
            }
        }
        else{
            System.out.println("EL LIBRO NO SE ENCUENTRA EN LA BIBLIOTECA");
            return null;
        }
    }

    public void verLibro(String titulo){
        Libro l= buscarLibro(titulo);
        if (l != null){
            l.mostrarLibro();
        }
        else{
            System.out.println("EL LIBRO NO SE ENCUENTRA EN LA BIBLIOTECA");
        }
    }

    public int cantidadPrestamos(){
        int cont= 0;
        for (int i=0; i<array_libros.size(); i++){
            Libro l= array_libros.get(i);
            cont+= l.getEjemplares_prestados();
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
            if (l1.getNum_paginas()>=l2.getNum_paginas()){
                System.out.println("EL LIBRO " + l1.getTitulo() + " TIENE MAS PAGINAS QUE " + l2.getTitulo());
                return l1;
            }
            else{
                System.out.println("EL LIBRO " + l2.getTitulo() + " TIENE MAS PAGINAS QUE " + l1.getTitulo());
                return l2;
            }
        }
    }
}
