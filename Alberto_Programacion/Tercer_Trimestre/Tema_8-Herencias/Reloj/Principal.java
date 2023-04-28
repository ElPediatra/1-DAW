/* Paquetes */
package Tiempo;

/* Imports */
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Alberto Gómez Morales 1º-DAW
 * @author alber
 * 
 *
 * Diseñar la clase hora, que representa un instante de tiempo compuesto por la hora (de 0 a 23) y los minutos.
 * Dispone de los métodos:
 *  - Hora(hora, minuto), que construye un objeto con los datos pasados como parámetros.
 *  - void inc(), que incrementa la hora en un minuto.
 *  - boolean setMinutos(valor), que asigna un valor, si es válido, a los minutos. Devuelve true o false según haya sido posible modificar los minutos o no.
 *  - boolean setHora(valor), que asigna un valor, si está comprendido entre 0 y 23, a la hora. Devuelve true o false según haya sido posible cambiar la hora o no.
 *  - String toString(), que devuelve un String con la representación de la hora.
 *
 **/
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Variables */
        int hora;
        boolean pruebaHora; //Comprobante para la hora del usuario
        Scanner teclado = new Scanner(System.in);
        Hora hora1 = new Hora(16,45);//Creo hora1 con el constructor
        
        //Muestro la hora para ver si se muestra correctamente
        System.out.println("Hora inicial: " + hora1 + ".");
        
        //Voy incrementando la hora para ver que los comprobantes funcionen bien
        for(int i = 1; i < 17; i++){
            hora1.inc(); //Llamo al paquete de incremento de minutos
            System.out.println(hora1);//Muestro y compruebo
        }
        
        //Muestro la hora final
        System.out.println("Hora final: " + hora1 + ".");
        
        //Pido una hora al usuario y la compruebo para ver si es correcta o no
        System.out.println("Escriba la hora 'Hora:XX':");
        hora = new Scanner(System.in).nextInt();
        
        pruebaHora = hora1.setHora(hora);
        //Compruebo la hora del cliente
        if (pruebaHora){
            System.out.println("La hora es: " + hora1 + ".");
         } else {
            System.out.println("La hora indicada no es válida");
        }
        
    }
    
}