/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW
 * @author alber
 * 
 * Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda
 * encender o apagar individualmente. Para ello, hacer una clase Bombilla con
 * una variables privada que indique si está encendida o apagada, así como un
 * método que nos diga el estado de una bombilla concreta. Además, queremos
 * poner un interruptor general, de forma que si este se apaga, todas las
 * bombillas quedan apagadas. Cuando el interruptor general se activa, las
 * bombillas vuelven a estar encendidas o apagadas, según estuvieran antes.
 * Cada bombilla se enciende y se apaga individualmente, pero solo responde que
 * está encendida si su interruptor particular está activado y además hay luz
 * general.
 */

/* Paquetes */
package RedElectrica;

/* Clase */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Variables */
        Bombilla bombillaCocina = new Bombilla(); //Defino las bombillas
        Bombilla bombillaComedor = new Bombilla();
        
        /* Desarrollamos el programa */
        bombillaCocina.encender(); //Dejo una encendida y otra apagada para probar
        bombillaComedor.apagar();
        
        //Muestro el estado con el general encendido
        System.out.println("Bombilla Cocina: " + bombillaCocina.estadoBombilla());
        System.out.println("Bombilla Comedor: " + bombillaComedor.estadoBombilla());
        System.out.println();
        
        //Apago el generadl y muestro el estado
        Bombilla.interruptorGeneral = false;
        System.out.println("Interruptor general apagado");
        System.out.println("Bombilla Cocina: " + bombillaCocina.estadoBombilla());
        System.out.println("Bombilla Comedor: " + bombillaComedor.estadoBombilla());
        System.out.println();
        
        //Vuelvo a encender la luz y compruebo que aparezca todo bien
        Bombilla.interruptorGeneral = true;
        System.out.println("Interruptor general encendido");
        System.out.println("Bombilla Cocina: " + bombillaCocina.estadoBombilla());
        System.out.println("Bombilla Comedor: " + bombillaComedor.estadoBombilla());
        System.out.println();        
    }
    
}
