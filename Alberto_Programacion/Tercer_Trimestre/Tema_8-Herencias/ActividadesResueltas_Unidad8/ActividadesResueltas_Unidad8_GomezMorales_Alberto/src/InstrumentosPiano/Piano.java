/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package InstrumentosPiano;

class Piano extends Instrumento {
    
    /* Sobreescribo el método de Instrumento */
    public void interpretar(){
        System.out.println("Interpretando la música de un piano: ");
        for (Nota nota : notas) {
            System.out.println(nota.toString() + " ");
        }
        
        System.out.println(); //Espacio en blanco
    }
}
