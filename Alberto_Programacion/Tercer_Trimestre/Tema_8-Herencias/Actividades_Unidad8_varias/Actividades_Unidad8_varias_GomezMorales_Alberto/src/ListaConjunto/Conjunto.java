/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package ListaConjunto;

public class Conjunto extends Lista {

    public Conjunto() {
        super();
    }

    @Override
    public void insertarInicio(Integer numero) {
        if (!contiene(numero)) { // Si el número no está en el conjunto, se añade al principio
            super.insertarInicio(numero);
        }
    }

@Override
    public void insertarFinal(Integer numero) {
        if (!contiene(numero)) { // Si el número no está en el conjunto, se añade al final
            super.insertarFinal(numero);
        }
    }

    @Override
    public void insertar(Integer numero, int indice) {
        if (!contiene(numero)) { // Verifica si el número ya existe en el conjunto
            super.insertar(numero, indice);
        }
    }

    public boolean contiene(Integer numero) {
        for (int i = 0; i < obtenerTamano(); i++) {
            if (tabla[i].equals(numero)) {
                return true;
            }
        }
        return false;
    }
}
