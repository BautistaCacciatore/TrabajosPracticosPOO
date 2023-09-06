package poo.punto1;

public class ListaEnlazada {
    private Nodo primero= null;

    public ListaEnlazada crear(){
        //creo una lista enlazada y la retorno
        ListaEnlazada nuevaLista= new ListaEnlazada();
        return nuevaLista;
    }

    public boolean listaVacia(){
        //verifico si el primero es nulo, si es asi, la lista esta vacia
        if (primero==null){
            return true;
        }
        else {
            return false;
        }
    }

    public int longitudLista(){
        int cont= 0;
        Nodo nodoAux= primero;
        //me posiciono en el primer nodo y recorro la lista contando los mismos
        while (nodoAux != null){
            cont++;
            nodoAux= nodoAux.getProximo();
        }
        return cont;
    }

    public void agregar(Object dato){
        //creo un nuevo nodo, le asigno el dato y como proximo le asigno un nulo
        Nodo nuevoNodo= new Nodo();
        nuevoNodo.setDato(dato);
        nuevoNodo.setProximo(null);
        //creo un nodo auxiliar para recorrer los nodos desde el primero
        Nodo nodoAux= primero;
        //si la lista esta vacia, coloco al nuevo nodo como primero
        if (primero==null){
            primero= nuevoNodo;
        }
        else{
            //recorro la lista hasta llegar al ultimo nodo y encadeno el nuevo
            while (nodoAux.getProximo() != null){
                nodoAux= nodoAux.getProximo();
            }
            nodoAux.setProximo(nuevoNodo);
        }
    }

    public void eliminar(Object dato){
        Nodo nodoAux= primero;
        // si la lista esta vacia, termino
        if (nodoAux == null){
            return;
        }
        else{
            //busco el dato en el primer nodo y lo elimino, cambia el primero
            while ((nodoAux != null) && (nodoAux.getDato()==dato)){
                primero= nodoAux.getProximo();
                nodoAux= primero;
            }
            //busco el dato en el resto de los nodos y lo elimino
            while ((nodoAux != null) && (nodoAux.getProximo() != null)){
                if (nodoAux.getProximo().getDato()==dato){
                    Nodo nodoSiguiente= nodoAux.getProximo();
                    nodoAux.setProximo(nodoSiguiente.getProximo());
                }
                else{
                    nodoAux= nodoAux.getProximo();
                }
            }
        }
    }

    public Object recuperar(Object dato){
        Nodo nodoAux= primero;
        if (primero==null){
            return null;
        }
        else{
            //recorro la lista y cuando encuentro el dato, lo retorno
            while (nodoAux != null){
                if (nodoAux.getDato()==dato){
                    return nodoAux.getDato();
                }
                nodoAux= nodoAux.getProximo();
            }
            //si el dato no esta en la lista, retorno nulo
            return null;
        }
    }

    public void insertar(Object dato, int pos){
        //verifico si es una posicion valida
        if ((pos>=1) && (pos<=longitudLista())){
            Nodo nuevoNodo= new Nodo();
            nuevoNodo.setDato(dato);
            nuevoNodo.setProximo(null);
            //si debo insertar en la posicion 1, cambia el primero de la lista
            if (pos==1){
                nuevoNodo.setProximo(primero);
                primero= nuevoNodo;
            }
            else{
                //si debo insertar en otra posicion, me posiciono e inserto
                Nodo nodoAux= primero;
                for (int i=0; i < pos-2; i++){
                    nodoAux= nodoAux.getProximo();
                }
                nuevoNodo.setProximo(nodoAux.getProximo());
                nodoAux.setProximo(nuevoNodo);
            }
        }
    }

    public void mostrarLista(){
        if (primero==null){
            System.out.println("LISTA VACIA.");
        }
        else{
            //recorro la lista y muestro cada uno de sus datos
            Nodo nodoAux= primero;
            while (nodoAux != null){
                System.out.println("Nodo: " + nodoAux.getDato());
                nodoAux = nodoAux.getProximo();
            }
        }
    }
}
