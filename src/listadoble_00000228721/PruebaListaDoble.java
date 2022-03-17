/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoble_00000228721;

import java.util.Scanner;

/**
 * Clase Main, en la cual se ejecutan todos los métodos creados en la clase
 * ListaDoble por medio de un menú.
 *
 * ListaDoble_00000228721
 *
 * @author Alex Gael García Acosta
 */
public class PruebaListaDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ListaDoble lista = new ListaDoble();
        int op;
        boolean repetir = true;

        do {
            System.out.println("------------- M E N Ú -------------");
            System.out.println("1.- Revisar si la lista esta vacía");
            System.out.println("2.- Agregar al inicio");
            System.out.println("3.- Agregar al final");
            System.out.println("4.- Imprimir lista");
            System.out.println("5.- Imprimir lista inversa");
            System.out.println("6.- Eliminar el elemento de la posición dada");
            System.out.println("7.- Actualizar");
            System.out.println("8.- Limpiar");
            System.out.println("9.- Buscar");
            System.out.println("10.- Contiene");
            System.out.println("11.- Tamaño");
            System.out.println("12.- Salir");
            System.out.println("-----------------------------------");
            op = teclado.nextInt();

            switch (op) {
                case 1: {
                    boolean vacio = lista.estaVacio();

                    if (vacio) {
                        System.out.println("La lista esta vacía");
                    } else {
                        System.out.println("La lista No esta vacía");
                    }
                }
                break;
                case 2: {
                    System.out.print("Inserte el dato a agregar: ");
                    int dato = teclado.nextInt();
                    boolean respuesta = lista.agregarInicio(dato);

                    if (respuesta) {
                        System.out.println("Se agregó");
                    }
                }
                break;
                case 3: {
                    System.out.print("Inserte el dato a agregar: ");
                    int dato = teclado.nextInt();
                    boolean respuesta = lista.agregarFinal(dato);

                    if (respuesta) {
                        System.out.println("Se agregó");
                    }

                }
                break;
                case 4: {

                    lista.imprimirLista();
                }
                break;
                case 5: {

                    lista.imprimirListaInversa();

                }
                break;
                case 6: {
                    System.out.print("Inserte el posición a eliminar: ");
                    int pos = teclado.nextInt();
                    boolean respuesta = lista.eliminarPosicion(pos);
                    if (respuesta) {
                        System.out.println("Se eliminó");
                    } else {
                        System.out.println("No se eliminó");
                    }

                }
                break;
                case 7: {
                    System.out.print("Inserte la posición a actualizar: ");
                    int pos = teclado.nextInt();
                    System.out.print("Inserte el dato nuevo: ");
                    int dato = teclado.nextInt();

                    boolean respuesta = lista.actualizar(pos, dato);

                    if (respuesta) {
                        System.out.println("Se actualizó");
                    } else {
                        System.out.println("No se actualizó");
                    }

                }
                break;
                case 8: {
                    lista.limpiar();
                }
                break;
                case 9: {
                    System.out.print("Inserte el valor a buscar: ");
                    int dato = teclado.nextInt();

                    if (lista.buscar(dato) != -1) {
                        System.out.println("La posición del dato es: " + lista.buscar(dato));
                    } else {
                        System.out.println("No se encontro ningun elemento con ese valor...");
                    }
                }
                break;
                case 10: {
                    System.out.print("Inserte el valor a confirmar: ");
                    int dato = teclado.nextInt();

                    if (lista.contiene(dato)) {
                        System.out.println("La lista contiene el elemento dado");
                    } else {
                        System.out.println("La lista NO contiene el elemento dado");
                    }
                }
                break;

                case 11: {

                    System.out.println("El tamaño de la lista es: " + lista.tamaño());
                }
                break;

                case 12: {
                    repetir = false;
                }
            }

        } while (repetir);

    }

}
