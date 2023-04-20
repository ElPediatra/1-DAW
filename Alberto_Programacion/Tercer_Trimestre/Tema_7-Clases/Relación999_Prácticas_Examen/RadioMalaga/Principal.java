/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* Paquetes */
package Radio;

/* Imports*/
import java.util.Scanner;

/**
 *
 * @author alber
 */
public class Principal {
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu(); //Mandamos al menú principal
    }
    
    /* Métodos */
    private static void menu() {
        /* Variables */
        int opcion;
        boolean salir = false; //Se valida con el metodo salida()
        RadioPortatil radio1 = new RadioPortatil(102.5); //Asigno 2 radios mediante el constructor
        RadioPortatil radio2 = new RadioPortatil(100.0);
        radio1.mostrar(); //Muestro la frecuencia de radio1
        
        /* Desarrollamos el método */
        do{
            System.out.println("*****************************************************");
            System.out.println("*************** Menu de Radio San Andreas ***********");
            System.out.println("*****************************************************");
            System.out.println("\t1. Subir frecuencia (0.5 MHz).");
            System.out.println("\t2. Bajar frecuencia (0.5 MHz).");
            System.out.println("\t3. Mostrar frecuencia.");
            System.out.println("\t0. Salir.");

            opcion = teclado.nextInt();

            switch(opcion) {
                case 1:
                    radio1.subir(); //Aumento frecuencia
                    break;
                case 2:
                    radio1.bajar(); //Disminuyo frecuencia
                    break;
                case 3:
                    radio1.mostrar(); //Muestro frecuencia
                    break;
                case 0:
                    salida(); //Salida salida();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while(opcion != 0);
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
