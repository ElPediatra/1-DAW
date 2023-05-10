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

/* Imports */
import java.util.Arrays;

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

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Conjunto)) {
            return false;
        }
        Conjunto otroConjunto = (Conjunto) o;
        if (obtenerTamano() != otroConjunto.obtenerTamano()) {
            return false;
        }
        Integer[] elementosEsteConjunto = Arrays.copyOf(tabla, obtenerTamano());
        Integer[] elementosOtroConjunto = Arrays.copyOf(otroConjunto.tabla, otroConjunto.obtenerTamano());
        Arrays.sort(elementosEsteConjunto);
        Arrays.sort(elementosOtroConjunto);
        return Arrays.equals(elementosEsteConjunto, elementosOtroConjunto);
    }

    public Conjunto union(Conjunto otroConjunto) {
        Conjunto resultado = new Conjunto();
        resultado.añadirLista(this);
        for (int i = 0; i < otroConjunto.obtenerTamano(); i++) {
            if (!contiene(otroConjunto.tabla[i])) {
                resultado.insertarFinal(otroConjunto.tabla[i]);
            }
        }
        return resultado;
    }

    public Conjunto interseccion(Conjunto otroConjunto) {
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < obtenerTamano(); i++) {
            if (otroConjunto.contiene(tabla[i])) {
                resultado.insertarFinal(tabla[i]);
            }
        }
        return resultado;
    }

    public Conjunto diferencia(Conjunto otroConjunto) {
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < obtenerTamano(); i++) {
            if (!otroConjunto.contiene(tabla[i])) {
                resultado.insertarFinal(tabla[i]);
            }
        }
        return resultado;
    }

    public Conjunto diferenciaSimetrica(Conjunto otroConjunto) {
        Conjunto resultado = new Conjunto();
        Conjunto union = union(otroConjunto);
        Conjunto interseccion = interseccion(otroConjunto);
        resultado = union.diferencia(interseccion);
        return resultado;
    }
}