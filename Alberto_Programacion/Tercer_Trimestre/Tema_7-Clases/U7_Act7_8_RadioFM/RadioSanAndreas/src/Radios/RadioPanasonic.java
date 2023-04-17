/* Paquetes */
package Radios;

/* Imports */
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW
 * @author alber
 * 
 * Definir una clase que permita controlar un sintonizador digital de emisoras FM; concretamente,
 * se desea dotar al controlador de una interfaz que permita subir (up) o baja (down) la frecuencia
 * (en saltos de 0,5 MHz) y mostrar la frecuencia sintonizada en un momento dado (display). Supondremos
 * que el rango de frecuencias para manejar oscila entre los 80 MHz y los 108 MHz y que, al inicio, el
 * controlador sintonice la frecuencia indicada en el contructor o 80 MHz por defecto. Si durante una
 * operación de subida o bajada se sobrepasa uno de los dos límites, la frecuencia sintonizada debe pasar
 * a ser la del extremo contrario. Escribir un pequeño programa principal para probar su funcionamiento.
 */

public class RadioPanasonic {
    /* Variables */
    double frecuencia = 80.0;
    
    /* Constructores */
    RadioPanasonic(double frecuencia){
        frecuencia = 100.5;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*****************************************************");
        System.out.println("**************** Radio conectada ********************");
        System.out.println("*************** Sintonizado: " + frecuencia + "*********************************");
        
    }
    
}
