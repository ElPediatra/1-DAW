/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * 
 * @author alber
 * 
 * Ejercicio Actividad Resuelta 8.2 Página 266 Tema 8
 * 
 * A partir de la clase Hora implementar la clase HoraExacta, que incluye en
 * la hora los segundos. Además de los métodos heredados de Hora, dispondrá de:
 * 
 *  - Constructor HoraExacta(hora, minuto, segundo), que construye un objeto con
 * los datos pasados como parámetros.
 * 
 *  - setSegundos(valor), que asigna, si está comprendido entre 0 y 59, el valor
 * indicado a los segundos.
 * 
 *  - inc(), que incrementa la hora en un segundo.
 */

/* Paquetes */
package Tiempo;

/* Imports */
import java.util.Scanner;

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

    HoraExacta horaExacta = new HoraExacta(16, 45, 30); //Creo un objeto HoraExacta con hora 16:45:30
    System.out.println("Hora exacta: " + horaExacta); //Muestro la hora exacta
    horaExacta.inc(); //Incremento la hora exacta en un segundo
    System.out.println("Hora exacta incrementada: " + horaExacta); //Muestro la hora exacta incrementada
    } 
}