/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * Página 274
 * Ejercicio 8.15
 * 
 * @author alber
 * 
 * Escribe en la clase Lista un método equals() para compararlas. Dos listas se
 * considerarán iguales si tienen los mismos elementos (incluidas las repeticiones)
 * en el mismo orden.
 */

/* Paquetes */
package ListaEquals;

public class Principal {
    public static void main(String[] args) {

        // Crear dos listas con elementos iguales
        Lista lista1 = new Lista();
        lista1.insertarFinal(1);
        lista1.insertarFinal(2);
        lista1.insertarFinal(3);

        Lista lista2 = new Lista();
        lista2.insertarFinal(1);
        lista2.insertarFinal(2);
        lista2.insertarFinal(3);

        // Comparar las listas
        if (lista1.equals(lista2)) {
            System.out.println("Las listas son iguales");
        } else {
            System.out.println("Las listas no son iguales");
        }

        // Modificar una lista para que los elementos no coincidan
        lista1.eliminar(1);
        lista1.insertarFinal(4);

        // Volver a comparar las listas
        if (lista1.equals(lista2)) {
            System.out.println("Las listas son iguales");
        } else {
            System.out.println("Las listas no son iguales");
        }
    }
}
