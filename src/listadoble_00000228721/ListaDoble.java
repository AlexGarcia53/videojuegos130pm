/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoble_00000228721;

/**
 * Clase ListaDoble, con la cual se manipula la lista insertando y eliminando
 * nodos.
 *
 * ListaDoble_00000228721
 *
 * @author Alex Gael García Acosta
 */
public class ListaDoble {

    /**
     * Nodo inicial que funciona como apuntador de inicio.
     */
    private Nodo inicio;
    /**
     * Nodo final que funciona como apuntador de fin.
     */
    private Nodo fin;
    /**
     * Tamaño de la lista.
     */
    private int tamaño;

    /**
     * Método constructor que inicializa el tamaño a cero, además del nodo
     * inicial y final a un valor nulo.
     */
    public ListaDoble() {
        this.tamaño = 0;
        this.inicio = null;
        this.fin = null;
    }

    /**
     * Método que comprueba que la lista esta vacía.
     *
     * @return Verdadero en caso de estar vacía, falso en caso contrario.
     */
    public boolean estaVacio() {
        if (inicio == null && fin == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que agrega un nodo al inicio de la lista.
     *
     * @param valor Valor que contendrá el nodo.
     * @return Verdadero en caso de haberse agregado.
     */
    public boolean agregarInicio(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);

        if (!estaVacio()) {

            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
            tamaño++;
            return true;
        } else {
            inicio = fin = nuevo;
            tamaño++;
            return true;
        }
    }

    /**
     * Método que agrega un nodo al final de la lista.
     *
     * @param valor Valor que contendrá el nodo.
     * @return Verdadero en caso de haberlo agregado.
     */
    public boolean agregarFinal(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);

        if (!estaVacio()) {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
            tamaño++;
            return true;
        } else {
            inicio = fin = nuevo;
            tamaño++;
            return true;
        }
    }

    /**
     * Método que imprime la lista de todos los nodos contenidos.
     */
    public void imprimirLista() {
        if (estaVacio()) {
            System.out.println("La lista esta vacía");
        } else {
            Nodo aux = inicio;
            int i = 0;
            System.out.println("- - - Lista - - -");
            while (aux != null) {
                System.out.println("Posición: " + i + ", Valor: " + aux.getValor());
                aux = aux.getSiguiente();
                i++;
            }
        }
    }

    /**
     * Método que imprime la lista de todos los nodos contenidos de forma
     * inversa.
     */
    public void imprimirListaInversa() {
        if (estaVacio()) {
            System.out.println("La lista esta vacía");
        } else {
            Nodo aux = fin;
            int i = 0, pos = tamaño;
            System.out.println("- - - Lista Inversa - - -");
            while (aux != null && tamaño>i) {

                System.out.println("Posición: " + (pos - 1) + ", Valor: " + aux.getValor());
                aux = aux.getAnterior();
                pos--;
                i++;
            }
        }
    }

    /**
     * Método que remueve un nodo en base a la posición mandada por el
     * parámetro.
     *
     * @param pos posición a eliminar.
     */
    public boolean eliminarPosicion(int pos) {
        if (pos >= 0 && pos <= tamaño-1) {
            if (estaVacio()) {
                System.out.println("La lista esta vacía");
            } else {

                if (pos == 0) {
                    inicio = inicio.getSiguiente();
                    inicio.setAnterior(null);
                    tamaño--;
                    return true;
                }
                if (pos == tamaño - 1) {
                    fin = fin.getAnterior();
                    fin.setSiguiente(null);
                    tamaño--;
                    return true;
                }
                int cont = 0;
                Nodo aux = inicio;
                Nodo auxFin = fin;
                while (cont < pos - 1) {
                    aux = aux.getSiguiente();
                    cont++;
                }
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                auxFin.setAnterior(auxFin.getAnterior().getAnterior());

            }
            tamaño--;
            return true;
        }
        return false;
    }

    /**
     * Método que actualiza un nodo en base a la posición dada por el parámetro.
     *
     * @param pos Posición del nodo.
     * @param valor Valor que contiene el nodo.
     * @return Verdadero en caso de actualizar.
     */
    public boolean actualizar(int pos, int valor) {
        if (pos >= 0 && pos <= tamaño) {
            if (estaVacio()) {
                System.out.println("La lista esta vacía");
            } else {
                Nodo aux = inicio;

                for (int i = 0; i < pos; i++) {
                    aux = aux.getSiguiente();
                }
                aux.setValor(valor);
            }
            return true;
        }
        return false;
    }

    /**
     * Método que elimina todos los nodos de la lista, apuntando el primer nodo
     * y último nodo a un valor nulo.
     */
    public void limpiar() {
        inicio = null;
        fin = null;
        tamaño = 0;
    }

    /**
     * Método que busca un elemento en la lista y regresa la posición en que se
     * encuentra.
     *
     * @param valor Valor del elemento a buscar.
     * @return Posición del elemento con el valor buscado, -1 en caso de no
     * encontrar.
     */
    public int buscar(int valor) {
        Nodo aux = inicio;
        int cont = 0;

        while (aux != null) {
            if (aux.getValor() == valor) {
                return cont;
            } else {
                aux = aux.getSiguiente();
            }
            cont++;
        }
        return -1;
    }

    /**
     * Método que confirma si la lista contiene un elemento con el valor dado
     * por el parámetro.
     *
     * @param valor Valor a buscar.
     * @return Verdadero en caso de encontrarlo, falso en caso contrario.
     */
    public boolean contiene(int valor) {
        Nodo aux = inicio;

        while (aux != null) {
            if (aux.getValor() == valor) {
                return true;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return false;
    }

    /**
     * Método que obtiene el tamaño de la lista.
     *
     * @return el tamaño de la lista.
     */
    public int tamaño() {
        return tamaño;
    }

}
