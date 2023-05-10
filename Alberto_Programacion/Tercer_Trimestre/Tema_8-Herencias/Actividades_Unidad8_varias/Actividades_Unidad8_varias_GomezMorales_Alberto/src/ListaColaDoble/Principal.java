/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * Página 275
 * Ejercicio 8.18
 * 
 * @author alber
 * 
 * Diseña la clase ColaDoble, que hereda de Cola para enteros, añadiendo los
 * siguientes métodos:
 *  - void encolarPrincipio(), que encola un elemento al principio de cola.
 *  - Integer desencolarFinal(), que desencola un elemento del final de la cola.
 */

/* Paquetes */
package ListaColaDoble;

public class Principal {
    public static void main(String[] args) {
        // Crear una nueva cola doble
        ColaDoble colaDoble = new ColaDoble();

        // Agregar elementos a la cola doble
        colaDoble.encolar(1);
        colaDoble.encolar(2);
        colaDoble.encolar(3);
        colaDoble.encolarPrincipio(0);
        colaDoble.encolarPrincipio(-1);

        // Imprimir el primer y último elemento de la cola doble
        System.out.println("Primer elemento: " + colaDoble.obtenerPrimero());
        System.out.println("Último elemento: " + colaDoble.obtenerUltimo());

        // Desencolar elementos de la cola doble
        System.out.println("Desencolando: " + colaDoble.desencolar());
        System.out.println("Desencolando: " + colaDoble.desencolar());
        System.out.println("Desencolando: " + colaDoble.desencolarFinal());

        // Imprimir el primer y último elemento de la cola doble después de desencolar
        System.out.println("Primer elemento: " + colaDoble.obtenerPrimero());
        System.out.println("Último elemento: " + colaDoble.obtenerUltimo());
    }
}
