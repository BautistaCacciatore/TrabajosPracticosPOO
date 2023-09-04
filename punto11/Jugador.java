package poo.punto11;

import java.util.ArrayList;

public class Jugador {
    private String nickname;
    private ArrayList<String> array_palabras;
    private int puntaje;

    /*Constructor*/
    public Jugador(String nickname) {
        setNickname(nickname);
        ArrayList<String> array= new ArrayList<>();
        setArray_palabras(array);
        setPuntaje(0);
    }

    /*Setters*/
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setArray_palabras(ArrayList<String> array_palabras) {
        this.array_palabras = array_palabras;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    /*Getters*/
    public String getNickname() {
        return nickname;
    }

    public ArrayList<String> getArray_palabras() {
        return array_palabras;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void agregarPalabraAJugador(String palabra){
        array_palabras.add(palabra);
    }

    public int calcularPuntaje(){
        int puntaje= 0;
        for (int i=0; i< getArray_palabras().size(); i++){
            String palabra= getArray_palabras().get(i);
            for (int j= 0; j<palabra.length(); j++){
                char letra= palabra.charAt(j);
                if (letra == 'k' || letra == 'z' || letra == 'x' || letra == 'y'|| letra == 'w' || letra == 'q'){
                    puntaje+=2;
                }
                else{
                    puntaje+=1;
                }
            }
        }
        setPuntaje(puntaje);
        return puntaje;
    }
}

