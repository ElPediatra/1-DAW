/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * Página 275
 * Ejercicio 8.16
 * 
 * @author alber
 * 
 * Diseña la clase Pila heredando de Lista (ver Actividad resuelta 7.13).
 */

/* Paquetes */
package ListaPila;

public class Principal {
    public static void main(String[] args) {
        Pila miPila = new Pila();
        
        // Agregar elementos a la pila
        miPila.apilar(1);
        miPila.apilar(2);
        miPila.apilar(3);
        
        // Imprimir la pila
        System.out.println("Pila: " + miPila);
        
        // Eliminar el último elemento de la pila
        miPila.desapilar();
        
        // Imprimir la pila actualizada
        System.out.println("Pila después de eliminar el último elemento: " + miPila);
    }   
}
