package poo.punto11;
import java.util.ArrayList;
import java.util.List;

public class Diccionario {
    private ArrayList<String> palabras_validas;

    /*Constructor*/
    public Diccionario() {
        ArrayList<String> diccio= new ArrayList<>();
        setPalabras_validas(diccio);
    }

    /*Setters*/
    public void setPalabras_validas(ArrayList<String> palabras_validas) {
        this.palabras_validas = palabras_validas;
    }

    /*Getters*/
    public ArrayList<String> getPalabras_validas() {
        return palabras_validas;
    }

    public void agregarPalabra(String palabra){
        getPalabras_validas().add(palabra);
    }

    public boolean palabraExiste(String palabra){;
        for (int i=0; i<getPalabras_validas().size(); i++){
            if (getPalabras_validas().get(i)==palabra){
                return true;
            }
        }
        return false;
    }

    public void mostrarDiccionario(){
        System.out.println("PALABRAS VALIDAS: ");
        for (int i=0; i<palabras_validas.size(); i++){
            String palabra= palabras_validas.get(i);
            System.out.println(palabra);
        }
    }
}
