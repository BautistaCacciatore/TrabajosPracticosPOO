package poo.punto4;

public class Cola {
    private Nodo frente= null;
    private Nodo finall= null;

    public Cola crear(){
        Cola nuevaCola= new Cola();
        return nuevaCola;
    }

    public boolean colaVacia(){
        if (frente==null){
            return true;
        }
        else{
            return false;
        }
    }

    public void encolar(Object dato){
        Nodo nuevoNodo= new Nodo();
        nuevoNodo.setDato(dato);
        nuevoNodo.setProximo(null);
        if (frente==null){
            frente= nuevoNodo;
            finall= nuevoNodo;
        }
        else{
            finall.setProximo(nuevoNodo);
            finall= nuevoNodo;
        }
    }

    public Object desencolar(){
        if (frente==null){
            return null;
        }
        Nodo nodoAux= frente;
        frente= nodoAux.getProximo();
        return nodoAux.getDato();
    }

    public Object obtenerFrente(){
        if (frente==null){
            return null;
        }
        else{
            return frente.getDato();
        }
    }

    public void mostrar(){
        if (frente==null){
            System.out.println("COLA VACIA");
        }
        else{
            Cola c2= new Cola();
            Object dato;
            while( colaVacia() != true){
                dato= desencolar();
                System.out.println("Nodo: " + dato);
                c2.encolar(dato);
            }
            while( c2.colaVacia() != true){
                dato= c2.desencolar();
                encolar(dato);
            }
        }
    }

}
