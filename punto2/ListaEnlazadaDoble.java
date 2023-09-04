package poo.punto2;

public class ListaEnlazadaDoble {
    private NodoDoble primero= null;

    public ListaEnlazadaDoble crear(){
        //creo una lista enlazada doble y la retorno
        ListaEnlazadaDoble nuevaLista= new ListaEnlazadaDoble();
        return nuevaLista;
    }

    public boolean listaVacia(){
        // si el primer elemento es nulo, la lista esta vacia
        if (primero==null){
            return true;
        }
        else{
            return false;
        }
    }

    public int longitudLista(){
        int contador= 0;
        NodoDoble nodoAux= primero;
        //recorro la lista contando todos los nodos
        while (nodoAux != null){
            contador+=1;
            nodoAux= nodoAux.getProximo();
        }
        return contador;
    }

    public void agregar(Object dato){
        //creo un nuevo nodo a agregar
        NodoDoble nuevoNodo= new NodoDoble();
        nuevoNodo.setDato(dato);
        //si la lista esta vacia, agrego el nuevo nodo a la primera posicion
        if (primero==null){
            primero= nuevoNodo;
            nuevoNodo.setProximo(null);
            nuevoNodo.setAnterior(null);
        }
        else{
            //si la lista no esta vacia, la recorro hasta el final
            NodoDoble nodoAux= primero;
            while(nodoAux.getProximo() != null){
                nodoAux= nodoAux.getProximo();
            }
            //agrego el nuevo nodo al final de la lista, le asigno el anterior y el proximo
            nodoAux.setProximo(nuevoNodo);
            nuevoNodo.setAnterior(nodoAux);
            nuevoNodo.setProximo(null);
        }
    }

    public void eliminar(Object dato){
        NodoDoble nodoAux= primero;
        //si el nodo a eliminar es el primero, lo elimino y muevo el inicio al siguiente nodo
        while ((nodoAux != null) && (nodoAux.getDato()==dato)){
            NodoDoble nuevoPrimero= nodoAux.getProximo();
            primero= nuevoPrimero;
            nuevoPrimero.setAnterior(null);
            nodoAux= primero;
        }
        //busco el dato a eliminar en el resto de la lista
        while ((nodoAux != null) && (nodoAux.getProximo() != null)){
            if (nodoAux.getProximo().getDato()==dato){
                //si encuentro el dato,dejo desconectado el nodo a eliminar
                NodoDoble nodoSiguiente= nodoAux.getProximo();
                nodoAux.setProximo(nodoSiguiente.getProximo());
                nodoSiguiente.getProximo().setAnterior(nodoAux);
            }
            else{
                nodoAux= nodoAux.getProximo();
            }
        }
    }

    public Object recuperar(Object dato){
        NodoDoble nodoAux= primero;
        //si la lista esta vacia, retorno nulo
        if (primero==null){
            return null;
        }
        else{
            //recorro la lista buscando el dato y lo retorno
            while(nodoAux != null){
                if (nodoAux.getDato()==dato){
                    return nodoAux.getDato();
                }
                else{
                    nodoAux= nodoAux.getProximo();
                }
            }
            //si no encuentro el dato, retorno nulo
            return null;
        }
    }

    public void insertar(Object dato, int pos){
        //verifico si es una posicion valida de la lista
        if ((pos>=1) && (pos<=longitudLista())){
            NodoDoble nuevoNodo= new NodoDoble();
            nuevoNodo.setDato(dato);
            //si debo insertar en la posicion 1, cambia el primero
            if (pos==1){
                nuevoNodo.setProximo(primero);
                nuevoNodo.setAnterior(null);
                primero.setAnterior(nuevoNodo);
                primero= nuevoNodo;
            }
            else{
                //si debo insertar en otra posicion, me posiciono e inserto
                NodoDoble nodoAux= primero;
                for (int i=0; i< pos-2; i++){
                    nodoAux= nodoAux.getProximo();
                }
                nuevoNodo.setProximo(nodoAux.getProximo());
                nodoAux.getProximo().setAnterior(nuevoNodo);
                nodoAux.setProximo(nuevoNodo);
                nuevoNodo.setAnterior(nodoAux);
            }
        }
    }

    public void mostrarLista(){
        if (primero==null){
            System.out.println("LISTA VACIA.");
        }
        else{
            //recorro la lista y muestro cada uno de sus datos
            NodoDoble nodoAux= primero;
            while (nodoAux != null){
                System.out.println("Nodo: " + nodoAux.getDato());
                nodoAux = nodoAux.getProximo();
            }
        }
    }
}
