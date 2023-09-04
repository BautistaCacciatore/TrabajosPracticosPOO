package poo.punto6;

public class Libro {
    private String titulo;
    private String autor;
    private int num_paginas;
    private int ejemplares_disponibles;
    private int ejemplares_prestados;

    /*Constructor*/
    public Libro(String titulo, String autor, int num_paginas, int ejemplares_disponibles, int ejemplares_prestados){
        setTitulo(titulo);
        setAutor(autor);
        setNum_paginas(num_paginas);
        setEjemplares_disponibles(ejemplares_disponibles);
        setEjemplares_prestados(ejemplares_prestados);
    }

    /*Setters*/
    public void setTitulo(String titulo1){
        this.titulo= titulo1;
    }

    public void setAutor(String autor1){
        this.autor= autor1;
    }

    public void setNum_paginas(int num_paginas1){
        this.num_paginas= num_paginas1;
    }

    public void setEjemplares_disponibles(int ejemplares_disponibles1){
        this.ejemplares_disponibles= ejemplares_disponibles1;
    }

    public void setEjemplares_prestados(int ejemplares_prestados1){
        this.ejemplares_prestados= ejemplares_prestados1;
    }

    /*Getters*/
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getNum_paginas(){
        return num_paginas;
    }

    public int getEjemplares_disponibles(){
        return ejemplares_disponibles;
    }

    public int getEjemplares_prestados(){
        return ejemplares_prestados;
    }

    public boolean libroPuedeSerPrestado(){
        if (this.ejemplares_disponibles > 1){
            return true;
        }
        else{
            return false;
        }
    }

    public void registrarLibroComoPrestado(){
        ejemplares_prestados+=1;
        ejemplares_disponibles-=1;
    }

    public void incrementarDisponibles(){
        this.ejemplares_disponibles+=1;
    }

    public void mostrarLibro(){
        System.out.println("El libro " + getTitulo() +  " creado por el autor " + getAutor() + " tiene " +  getNum_paginas() + " páginas, quedan " +  getEjemplares_disponibles() +  " disponibles y se prestaron " + getEjemplares_prestados() + " .");
    }
}
