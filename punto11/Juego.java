package poo.punto11;


public class Juego {
    private Jugador j1;
    private Jugador j2;
    private Diccionario diccionario;

    /*Constructor*/
    public Juego(String nickname1, String nickname2) {
        Jugador j1= new Jugador(nickname1);
        Jugador j2= new Jugador(nickname2);
        Diccionario diccio= new Diccionario();
        setJ1(j1);
        setJ2(j2);
        setDiccionario(diccio);
    }

    /*Setters*/
    public void setJ1(Jugador j1) {
        this.j1 = j1;
    }

    public void setJ2(Jugador j2) {
        this.j2 = j2;
    }

    public void setDiccionario(Diccionario diccio){
        this.diccionario= diccio;
    }

    /*Getters*/
    public Jugador getJ1() {
        return j1;
    }

    public Jugador getJ2() {
        return j2;
    }

    public Diccionario getDiccionario(){
        return diccionario;
    }

    public void agregarPalabraValida(String palabra){
        getDiccionario().agregarPalabra(palabra);
    }

    public void formarPalabra(String nickname, String palabra){
        boolean esta= getDiccionario().palabraExiste(palabra);
        if (esta==true){
            Jugador j= buscarJugador(nickname);
            if (j != null){
                j.agregarPalabraAJugador(palabra);
            }
            else {
                System.out.println("NO EXISTE UN JUGADOR CON ESE NICKNAME");
            }
        }
        else{
            System.out.println("LA PALABRA NO PUEDE SER AGREGADA YA QUE NO EXISTE EN EL DICCIONARIO");
        }
    }


    public Jugador buscarJugador(String nickname){
        if (getJ1().getNickname()==nickname){
            return j1;
        }
        else{
            if (getJ2().getNickname()==nickname){
                return j2;
            }
        }
        return null;
    }

    private int determinarPuntaje(String nickname){
        Jugador j= buscarJugador(nickname);
        if (j != null){
            int puntaje= j.calcularPuntaje();
            return puntaje;
        }
        else{
            return -1;
        }
    }

    public Jugador determinarGanador(){
        int puntaje1= determinarPuntaje(getJ1().getNickname());
        int puntaje2= determinarPuntaje(getJ2().getNickname());
        System.out.println("Puntaje de " + getJ1().getNickname() + ": " + puntaje1);
        System.out.println("Puntaje de " + getJ2().getNickname() + ": " + puntaje2);
        Jugador ganador;
        if (puntaje1 > puntaje2){
            ganador= getJ1();
            System.out.println("GANADOR: " + getJ1().getNickname());
        }
        else{
            if (puntaje2 > puntaje1){
                ganador= getJ2();
                System.out.println("GANADOR: " + getJ2().getNickname());
            }
            else{
                ganador= null;
                System.out.println("EMPATE");
            }
        }
        return ganador;
    }

    public void mostrarJuego(){
        System.out.println("JUGADOR 1: " + getJ1().getNickname());
        System.out.println("JUGADOR 2: " + getJ2().getNickname());
        getDiccionario().mostrarDiccionario();
    }
}
