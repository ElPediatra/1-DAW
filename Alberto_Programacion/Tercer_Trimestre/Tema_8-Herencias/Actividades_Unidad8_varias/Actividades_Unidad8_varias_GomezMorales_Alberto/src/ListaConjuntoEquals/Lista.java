/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package ListaConjuntoEquals;

public class Lista {
    protected Integer[] tabla;
    protected int tamano;

    public Lista() {
        tabla = new Integer[0];
        tamano = 0;
    }

    public int obtenerTamano() {
        return tamano;
    }

    public void insertarFinal(Integer numero) {
        redimensionarTabla(tamano + 1);
        tabla[tamano - 1] = numero;
    }

    public void insertarInicio(Integer numero) {
        redimensionarTabla(tamano + 1);
        for (int i = tamano - 1; i > 0; i--) {
            tabla[i] = tabla[i - 1];
        }
        tabla[0] = numero;
    }

    public void insertar(Integer numero, int indice) {
        if (indice < 0 || indice > tamano) {
            System.out.println("El índice está fuera de los límites de la lista.");
        }
        redimensionarTabla(tamano + 1);
        for (int i = tamano - 1; i > indice; i--) {
            tabla[i] = tabla[i - 1];
        }
        tabla[indice] = numero;
    }

    public void añadirLista(Lista otraLista) {
        redimensionarTabla(tamano + otraLista.obtenerTamano());
        for (int i = 0; i < otraLista.obtenerTamano(); i++) {
            tabla[tamano - otraLista.obtenerTamano() + i] = otraLista.tabla[i];
        }
    }

    public void eliminar(int indice) {
        if (indice < 0 || indice >= tamano) {
            System.out.println("El índice está fuera de los límites de la lista.");
        }
        for (int i = indice; i < tamano - 1; i++) {
            tabla[i] = tabla[i + 1];
        }
        redimensionarTabla(tamano - 1);
    }

    public int buscar(Integer numero) {
        for (int i = 0; i < tamano; i++) {
            if (tabla[i].equals(numero)) {
                return i;
            }
        }
        return -1;
    }

    private void redimensionarTabla(int nuevoTamano) {
        if (nuevoTamano < 0) {
            System.out.println("El tamaño de la lista no puede ser negativo.");
        }
        Integer[] nuevaTabla = new Integer[nuevoTamano];
        int copiarHasta = Math.min(tamano, nuevoTamano);
        for (int i = 0; i < copiarHasta; i++) {
            nuevaTabla[i] = tabla[i];
        }
        tabla = nuevaTabla;
        tamano = nuevoTamano;
    }

    @Override
    public String toString() {
        StringBuilder respuesta = new StringBuilder();
        respuesta.append("[");
        for (int i = 0; i < tamano; i++) {
            respuesta.append(tabla[i]);
            if (i < tamano - 1) {
                respuesta.append(", ");
            }
        }
        respuesta.append("]");
        return respuesta.toString();
    }
    
    public boolean equals(Lista lista) {
        if (lista == this) {
            return true;
        }
        if (!(lista instanceof Lista)) {
            return false;
        }
        Lista otraLista = (Lista) lista;
        if (this.tamano != otraLista.tamano) {
            return false;
        }
        for (int i = 0; i < tamano; i++) {
            if (!this.tabla[i].equals(otraLista.tabla[i])) {
                return false;
            }
        }
        return true;
    }
}
