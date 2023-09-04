package poo.punto3;

public class Pila {
    private Nodo tope = null;

    public Pila crear(){
        //creo una nueva pila y la retorno
        Pila nuevaPila = new Pila();
        return nuevaPila;
    }

    public boolean pilaVacia(){
        //verifico si el tope es nulo, si es asi, la pila esta vacia
        if (tope==null){
            return true;
        }
        else{
            return false;
        }
    }

    public void apilar(Object dato){
        Nodo nuevoNodo= new Nodo();
        nuevoNodo.setDato(dato);
        nuevoNodo.setProximo(tope);
        tope= nuevoNodo;
    }

    public Object desapilar(){
        if (tope==null){
            return null;
        }
        else{
            Nodo topeActual= tope;
            tope= topeActual.getProximo();
            return topeActual.getDato();
        }
    }

    public Object obtenerTope(){
        if (tope==null){
            return null;
        }
        else{
            return tope.getDato();
        }
    }

    public void mostrar(){
        if (tope==null){
            System.out.println("PILA VACIA");
        }
        else{
            Pila p2= new Pila();
            Object dato;
            while( pilaVacia() != true){
                dato= desapilar();
                System.out.println("Nodo: " + dato);
                p2.apilar(dato);
            }
            while( p2.pilaVacia() != true){
                dato= p2.desapilar();
                apilar(dato);
            }
        }
    }
}
