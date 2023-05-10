/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaConjuntoEquals;

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * Página 275
 * Ejercicio 8.20
 * 
 * @author alber
 * 
 * Implementa el método equals() en la clase Conjunto. Dos conjuntos se consideran
 * iguales si tienen los mismos elementos, no importa en qué orden.
 */
public class Principal {
    public static void main(String[] args) {
        Lista lista1 = new Lista();
        lista1.insertarFinal(1);
        lista1.insertarFinal(2);
        lista1.insertarFinal(3);
        lista1.insertarFinal(4);

        System.out.println("Lista 1: " + lista1);

        Lista lista2 = new Lista();
        lista2.insertarFinal(5);
        lista2.insertarFinal(4);
        lista2.insertarFinal(3);
        lista2.insertarFinal(2);
        lista2.insertarFinal(1);

        System.out.println("Lista 2: " + lista2);

        if (lista1.equals(lista2)) {
            System.out.println("Las listas son iguales.");
        } else {
            System.out.println("Las listas son diferentes.");
        }

        Conjunto conjunto1 = new Conjunto();
        conjunto1.insertarFinal(1);
        conjunto1.insertarFinal(2);
        conjunto1.insertarFinal(3);
        conjunto1.insertarFinal(4);

        System.out.println("Conjunto 1: " + conjunto1);

        Conjunto conjunto2 = new Conjunto();
        conjunto2.insertarFinal(5);
        conjunto2.insertarFinal(4);
        conjunto2.insertarFinal(3);
        conjunto2.insertarFinal(2);
        conjunto2.insertarFinal(1);

        System.out.println("Conjunto 2: " + conjunto2);

        if (conjunto1.equals(conjunto2)) {
            System.out.println("Los conjuntos son iguales.");
        } else {
            System.out.println("Los conjuntos son diferentes.");
        }
    }
}
