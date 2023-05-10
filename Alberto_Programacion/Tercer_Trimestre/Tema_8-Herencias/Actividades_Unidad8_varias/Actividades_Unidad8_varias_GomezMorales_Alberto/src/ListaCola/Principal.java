/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * Página 275
 * Ejercicio 8.17
 * 
 * @author alber
 * 
 * Escribe la clase Cola heredando de Lista (ver Actividad final 7.18).
 */

/* Paquetes */
package ListaCola;

public class Principal {
    public static void main(String[] args) {
        // Creamos una nueva cola
        Cola cola = new Cola();

        // Añadimos elementos a la cola
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);

        // Mostramos la cola
        System.out.println("Cola: " + cola);

        // Sacamos el primer elemento de la cola
        System.out.println("Elemento desencolado: " + cola.desencolar());

        // Mostramos la cola de nuevo
        System.out.println("Cola: " + cola);

        // Añadimos más elementos a la cola
        cola.encolar(4);
        cola.encolar(5);

        // Mostramos la cola de nuevo
        System.out.println("Cola: " + cola);

        // Vaciamos la cola
        cola.desencolar();

        // Mostramos la cola vacía
        System.out.println("Cola vacía: " + cola);

        // Añadimos un elemento a la cola vacía
        cola.encolar(6);

        // Mostramos la cola con el elemento añadido
        System.out.println("Cola: " + cola);
    } 
}
