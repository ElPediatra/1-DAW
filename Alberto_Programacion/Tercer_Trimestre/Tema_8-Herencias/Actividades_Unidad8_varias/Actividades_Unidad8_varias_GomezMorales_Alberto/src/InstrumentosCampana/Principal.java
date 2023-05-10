/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * Ejercicio 8.11
 * Página 274
 * 
 * @author alber
 * 
 * Crea la clase Campana que hereda de Instrumento(definida en la Actividad resuelta 8.4).
 */

/* Paquetes */
package InstrumentosCampana;

public class Principal {
    public static void main(String[] args){
        Campana campana = new Campana();
        
        /* Añado las notas */
        campana.add(Nota.DO);
        campana.add(Nota.RE);
        campana.add(Nota.MI);
        
        /* Reproduzco la música del piano*/
        campana.interpretar();
    }
    
}

