/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * 
 * @author alber
 * 
 * Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura del libro. Deberá
 * disponer de métodos para incrementar la página leida, para obtener información de la última
 * página que se ha leído y para comenzar desde el principio una nueva lectura del mismo libro.
 */

/* Paquetes */
package MarcaPaginas;

/* Imports  */
import java.util.Scanner;

public class Principal {
    
    //Activo escaner y constructor para la clase Principal
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();
    }
    
    private static void menu(){
        /* Variables */
        boolean salir = false;
        
        /* Asigno constructor */
        MarcaPagina libro1 = new MarcaPagina();
        
        while (!salir) {
            System.out.println("\t***** MENU *****");
            System.out.println("1. Avanzar página.");
            System.out.println("2. Página Actual.");
            System.out.println("3. Leer de nuevo el libro.");
            System.out.println("4. Salir");
            System.out.println("\t****************");
            System.out.print("Seleccione una opción: ");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    libro1.avanzarPagina();
                    System.out.println("Página leída: " + libro1.getPaginaActual() + "\n");
                    break;
                case 2:
                    System.out.println("Última página leída: " + libro1.getUltimaPaginaLeida() + "\n");
                    break;
                case 3:
                    libro1.reiniciarLibro();
                    System.out.println("Empezando desde el principio.\n");
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.\n");
                    break;
            }
        }
    }    
}