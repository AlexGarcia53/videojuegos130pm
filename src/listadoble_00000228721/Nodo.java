/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoble_00000228721;

/**
 * Clase Nodo, la cual sirve para representar un nodo de la lista y para
 * modificar los atributos del mismo.
 *
 * ListaDoble_00000228721
 *
 * @author Alex Gael García Acosta
 */
public class Nodo {

    /**
     * Valor que contiene el nodo.
     */
    private int valor;
    /**
     * Nodo siguiente de lista.
     */
    private Nodo siguiente;
    /**
     * Nodo anterior de lista.
     */
    private Nodo anterior;

    /**
     * Método constructor que inicializa un nodo con su valor a 0, además su
     * siguiente y anterior a vacío.
     */
    public Nodo() {
        this.valor = 0;
        this.siguiente = null;
        this.anterior = null;
    }

    /**
     * Método de acceso que regresa el valor de un nodo.
     *
     * @return Valor del nodo.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Método de acceso que asigna el valor de un nodo.
     *
     * @param valor Valor del nodo.
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Método de acceso que obtiene el siguiente nodo.
     *
     * @return Nodo siguiente.
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * Método de acceso a que asigna el valor del siguiente nodo.
     *
     * @param siguiente Nodo siguiente.
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Método de acceso que obtiene el nodo anterior.
     *
     * @return Nodo anterior.
     */
    public Nodo getAnterior() {
        return anterior;
    }

    /**
     * Método de acceso a que asigna el valor del nodo anterior.
     *
     * @param anterior Nodo anterior.
     */
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

}
