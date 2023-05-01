/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * 
 * @author alber
 * 
 * Una cola es otra estructura dinámica como la pila, donde los elementos, en vez de apilarse y desapilarse, se encolan y desencolan.
 * La diferencia con las pilas es que se desencola el primer elemento encolado, ya que así es como funcionan las colas del autobús o del cine.
 * El primero que llega es el primero que sale de la cola (vamos a suponer que nadie se cuela). Por tanto, los elementos se encolan y desencolan
 * en extremos opuestos de la estructura, llamados primero (el que está primero y será el próximo en abandonar la cola) y último (el que llegó último).
 *
 * Implementa la clase Cola donde los elementos Integer encolados se guardan en una tabla.
 */

/* Paquetes */
package ColaSalida;

public class Principal {

    public static void main(String[] args) {
        /* Variables */
        Cola miCola = new Cola(5);
        int elemento;

        miCola.encolar(1);
        miCola.encolar(2);
        miCola.encolar(3);
        miCola.encolar(4);
        miCola.encolar(5);

        System.out.println("El tamaño de la cola es: " + miCola.tamano());

        while (!miCola.estaVacia()) {
            elemento = miCola.desencolar();
            System.out.println("El elemento desencolado es: " + elemento);
        }

        System.out.println("El tamaño de la cola es: " + miCola.tamano());
    }
}
