/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaToString;

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * Ejercicio 8.14
 * Página 274
 * 
 * @author alber
 * 
 * Reimplementa la clase Lista de la Actividad Resuelta 7.11, sustituyendo el método mostrar() por el método toString().
 */
public class Principal {
    public static void main(String[] args) {
        Lista lista = new Lista();

        // Insertar elementos al final
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        System.out.println("Lista después de insertar elementos al final: " + lista);

        // Insertar elemento al inicio
        lista.insertarInicio(0);
        System.out.println("Lista después de insertar elemento al inicio: " + lista);

        // Insertar elemento en índice específico
        lista.insertar(4, 4);
        System.out.println("Lista después de insertar elemento en índice 4: " + lista);

        // Añadir otra lista al final
        Lista otraLista = new Lista();
        otraLista.insertarFinal(5);
        otraLista.insertarFinal(6);
        lista.añadirLista(otraLista);
        System.out.println("Lista después de añadir otra lista al final: " + lista);

        // Eliminar elemento en índice específico
        lista.eliminar(2);
        System.out.println("Lista después de eliminar elemento en índice 2: " + lista);

        // Buscar elemento en la lista
        int indice = lista.buscar(4);
        if (indice != -1) {
            System.out.println("El número 4 se encuentra en la lista en el índice " + indice);
        } else {
            System.out.println("El número 4 no se encuentra en la lista.");
        }
    }
}
