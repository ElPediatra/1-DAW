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

public class ColaDoble extends Cola {
    
    public ColaDoble() {
        super(); // Llama al constructor de la clase padre Cola
    }
    
    public void encolarPrincipio(Integer numero) {
        insertarInicio(numero); // Añade el elemento al principio de la lista
    }
    
    public Integer desencolarFinal() {
        if (obtenerTamano() == 0) { // Si la cola está vacía, devuelve null
            return null;
        }
        
        Integer ultimo = tabla[obtenerTamano() - 1]; // Guarda el último elemento
        eliminar(obtenerTamano() - 1); // Elimina el último elemento
        return ultimo; // Devuelve el último elemento
    }
    
    @Override
    public Integer desencolar() {
        if (obtenerTamano() == 0) { // Si la cola está vacía, devuelve null
            return null;
        }
        
        Integer primero = tabla[0]; // Guarda el primer elemento
        eliminar(0); // Elimina el primer elemento
        return primero; // Devuelve el primer elemento
    }
}