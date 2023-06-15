/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW
 * 
 * @author alber
 * 
 * En el momento de decorar una casa, una habitación o cualquier objeto, se
 * plantea el problema de elegir la paleta de colores que vamos a utilizar
 * en nuestra decoración. Existe una solución, algo atrevida, que consiste
 * en utilizar colores al azar.
 * 
 * Diseña la clase Colores, que alberga por defecto una serie de colores
 * (mediante una cadena), aunque es posible añadir tantos como necesitemos.
 * La clase tendrá un método que devuelve una tabla con los n colores que
 * necesitemos elegidos al azar sin repeticiones.
 */

/* Paquetes */
package PaletaColores;

/* Imports */
import java.util.Scanner;
import java.util.Arrays;

public class Principal {
    static Scanner teclado = new Scanner(System.in);
    static Colores colores1 = new Colores();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Variables */
        menu();
    }
    private static void menu() {
        /* Variables */
        int opcion;
        boolean salir = false; //Se valida con el metodo salida()
        
        /* Desarrollamos el método */
        do{
            System.out.println("*****************************************************");
            System.out.println("*************** Menu Seleccion de Colores ***********");
            System.out.println("*****************************************************");
            System.out.println("\t1. Seleccionar color al azar.");
            System.out.println("\t2. Añadir un color.");
            System.out.println("\t0. Salir.");

            opcion = teclado.nextInt();

            switch(opcion) {
                case 1:
                    pedirColores(); //Pedimos los colores aleatorios
                    break;
                case 2:
                    agregarColores();
                    break;
                case 0:
                    salida(); //Salida salida();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while(opcion != 0);
    }
    
    private static void pedirColores(){
        /* Variables */
        int n;
        
        System.out.println("Escribe el número de colores que quieres seleccionar:");
        n = teclado.nextInt();
        
        String[] seleccionarColores = colores1.seleccionarColores(n);
        
        System.out.println("Colores seleccionados: " + Arrays.toString(seleccionarColores));
    }
    
    private static void agregarColores(){
        /* Variables */
        String color;
        
        System.out.println("Escribe el color que quieres añadir:");
        color = new Scanner(System.in).nextLine();
    
        colores1.incluirColor(color);
    }
        
    private static boolean salida(){
        /* Variables */
        boolean salir;
        char letra;
        
        /* Desarrollamos el método */
        System.out.println("¿Seguro que quieres salir?(s/n)");
        letra = new Scanner(System.in).next().charAt(0);
        
        letra = Character.toLowerCase(letra);
        salir = letra=='s';
        return salir;
    }
}