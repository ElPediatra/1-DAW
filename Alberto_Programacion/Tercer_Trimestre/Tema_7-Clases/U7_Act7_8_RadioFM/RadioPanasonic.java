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
    static double frecuencia;
    static Scanner teclado = new Scanner(System.in);
    
    /* Constructores */
    RadioPanasonic(double frecuencia){
        this.frecuencia = frecuencia; //Utilizo el constructor para asignar la frecuencia por defecto
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Variables*/
        //Scanner teclado = new Scanner(System.in);
        RadioPanasonic radio = new RadioPanasonic(80.0); //No se usa, pero sirve para usar el constructor y asignar la frecuencia
        int opcion;

        /* Desarrollamos el programa */
        inicio();
        
        do{
            System.out.println("*****************************************************");
            System.out.println("*************** Menu de Radio San Andreas ***********");
            System.out.println("*************** Frecuencia actual:" + frecuencia + " **************");
            System.out.println("*****************************************************");
            System.out.println("\t1. Subir frecuencia (0.5 MHz)");
            System.out.println("\t2. Bajar frecuencia (0.5 MHz)");
            System.out.println("\t3. Salir");

            opcion = teclado.nextInt();

            switch(opcion) {
                case 1:
                    subir();
                    break;
                case 2:
                    bajar();
                    break;
                case 3:
                    System.out.println("Confirmaddo su salida...\n\t Salida confirmada!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while(opcion != 3);
    }
    
    /* Métodos */

    public static void inicio() {
        System.out.println("*****************************");
        System.out.println("Estado: Encendida");
        System.out.println("Sintonizando: Espere....");
        System.out.println("*****************************");
    }
    
    public static void subir(){
        frecuencia += 0.5;
        if(frecuencia > 108.0) {
            frecuencia = 80.0;
        }
    }
    
    public static void bajar(){
        frecuencia -= 0.5;
        if(frecuencia < 80.0) {
            frecuencia = 108.0;
        }
    }
}
