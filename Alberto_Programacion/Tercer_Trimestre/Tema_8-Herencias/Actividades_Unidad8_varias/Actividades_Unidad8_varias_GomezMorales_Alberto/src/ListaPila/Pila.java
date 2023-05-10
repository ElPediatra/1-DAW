/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package ListaPila;

public class Pila extends Lista {
    public Pila() {
        super();
    }

    public void apilar(Integer numero) {
        insertarFinal(numero);
    }

    public Integer desapilar() {
        if (obtenerTamano() == 0) {
            System.out.println("La pila está vacía.");
            return null;
        } else {
            Integer numeroDesapilado = tabla[tamano - 1];
            eliminar(tamano - 1);
            return numeroDesapilado;
        }
    }

    public Integer cima() {
        if (obtenerTamano() == 0) {
            System.out.println("La pila está vacía.");
            return null;
        } else {
            return tabla[tamano - 1];
        }
    }

    public boolean estaVacia() {
        return obtenerTamano() == 0;
    }

    @Override
    public String toString() {
        StringBuilder respuesta = new StringBuilder();
        respuesta.append("Pila [");
        for (int i = 0; i < tamano; i++) {
            respuesta.append(tabla[i]);
            if (i < tamano - 1) {
                respuesta.append(", ");
            }
        }
        respuesta.append("]");
        return respuesta.toString();
    }
}
