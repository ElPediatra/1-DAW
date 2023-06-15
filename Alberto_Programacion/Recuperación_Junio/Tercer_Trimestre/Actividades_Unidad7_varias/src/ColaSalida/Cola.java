/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package ColaSalida;

public class Cola {
    private int[] elementos;
    private int primero;
    private int ultimo;

    public Cola(int capacidad) {
        elementos = new int[capacidad];
        primero = -1;
        ultimo = -1;
    }

    public boolean estaVacia() {
        return primero == -1;
    }

    public boolean estaLlena() {
        return ultimo == elementos.length - 1;
    }

    public void encolar(int elemento) {
        if (estaLlena()) {
            System.out.println("La cola está llena");
        }
        if (estaVacia()) {
            primero = 0;
        }
        ultimo++;
        elementos[ultimo] = elemento;
    }

    public int desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
        }
        int elemento = elementos[primero];
        if (primero == ultimo) {
            primero = -1;
            ultimo = -1;
        } else {
            primero++;
        }
        return elemento;
    }

    public int tamano() {
        if (estaVacia()) {
            return 0;
        }
        return ultimo - primero + 1;
    }

    public int getPrimero() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
        }
        return elementos[primero];
    }

    public int getUltimo() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
        }
        return elementos[ultimo];
    }
}
