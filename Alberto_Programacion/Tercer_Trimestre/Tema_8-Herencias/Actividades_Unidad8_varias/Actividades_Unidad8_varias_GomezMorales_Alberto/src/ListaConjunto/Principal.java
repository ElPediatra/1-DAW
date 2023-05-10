/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * Página 275
 * Ejercicio 8.19
 * 
 * @author alber
 * 
 * Un conjunto es un objeto similar a las listas, capaz de guardar valores de un
 * tipo determinado, con la diferencia de que sus elementos no pueden estar repetidos.
 * Escribe la clase Conjunto para enteros heredando de Lista y reimplementando los métodos
 * de reinserción para evitar las repeticiones.
 */

/* Paquetes */
package ListaConjunto;

public class Principal {
    public static void main(String[] args) {
        // Creamos una lista y añadimos algunos números
        Lista lista = new Lista();
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        System.out.println("Lista original: " + lista);
        
        // Creamos un conjunto y añadimos algunos números
        Conjunto conjunto = new Conjunto();
        conjunto.insertarFinal(1);
        conjunto.insertarFinal(2);
        conjunto.insertarFinal(3);
        conjunto.insertarFinal(4);
        System.out.println("Conjunto original: " + conjunto);
        
        // Agregamos la lista al conjunto
        conjunto.añadirLista(lista);
        System.out.println("Conjunto después de agregar la lista: " + conjunto);
        
        // Eliminamos el número 2 de la lista
        lista.eliminar(lista.buscar(2));
        System.out.println("Lista después de eliminar el número 2: " + lista);
        
        // Eliminamos el número 3 del conjunto
        conjunto.eliminar(conjunto.buscar(3));
        System.out.println("Conjunto después de eliminar el número 3: " + conjunto);
    }
}
