/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package ListaColaDoble;

public class Cola extends Lista {
    
    public Cola() {
        super(); // Llama al constructor de la clase padre Lista
    }
    
    public void encolar(Integer numero) {
        insertarFinal(numero); // Añade el elemento al final de la lista
    }
    
    public Integer desencolar() {
        if (obtenerTamano() == 0) { // Si la cola está vacía, devuelve null
            return null;
        }
        
        Integer primero = tabla[0]; // Guarda el primer elemento
        eliminar(0); // Elimina el primer elemento
        return primero; // Devuelve el primer elemento
    }
    
    public Integer obtenerPrimero() {
        if (obtenerTamano() == 0) { // Si la cola está vacía, devuelve null
            return null;
        }
        return tabla[0]; // Devuelve el primer elemento
    }
    
    public Integer obtenerUltimo() {
        if (obtenerTamano() == 0) { // Si la cola está vacía, devuelve null
            return null;
        }
        return tabla[obtenerTamano() - 1]; // Devuelve el último elemento
    }
}