/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package RecolectorBasura;

public class Basura {
        
        // Sobrescribir el método finalize()
        protected void finalize() throws Throwable {
            System.out.println("Objeto recogido por el recolector de basura");
        }
}
