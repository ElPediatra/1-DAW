/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package InstrumentosCampana;

class Campana extends Instrumento {
    @Override
    public void interpretar(){
        System.out.println("Esta es la melodía de una campana: ");
        for (Nota nota : notas) {
            System.out.println(nota.toString() + " ");
        }
        System.out.println();
    }
}