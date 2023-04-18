/* Paquetes*/
package Libro;

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
 * Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura del libro. Deberá
 * disponer de métodos para incrementar la página leida, para obtener información de la última
 * página que se ha leído y para comenzar desde el principio una nueva lectura del mismo libro.
 */
public class MarcaPagina {
    /* Variables */
    static String libro;
    static int paginas;
    static int contador = 1;
    static char reinicio;
    static Scanner teclado = new Scanner (System.in);
    
    /* Constructores */
    MarcaPagina(int paginas){
        this.paginas = paginas; //Constructor para las páginas totales del libro
    }
    
    MarcaPagina(String libro){
        this.libro = libro; //Constructor para el nombre del libro
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Variables */
        String aux1;
        int aux2;

        /* Desarrollamos el programa*/
        //Presentación
        System.out.println("¡Bienvenido al marca páginas virtual Leeitor 9000!");
        
        System.out.println("Indica el nombre del libro que vas a leer:");
        aux1 = teclado.nextLine();
        MarcaPagina nombre = new MarcaPagina(aux1);
        
        System.out.println("Indica el total de las páginas del libro:");
        aux2 = teclado.nextInt();
        MarcaPagina total = new MarcaPagina(aux2);
        
        //Solicitud a método
        menu();        
    }
    
    /* Métodos */
    public static void menu(){
        /* Variables */
        int opcion;
        
        //Presentacion
        System.out.println("Has seleccionado leer el libro: \n" + libro + " el cual consta de: \n" + paginas);
        
        do{
            System.out.println("Selecciona una de las opciones:");
            System.out.println("1.- Página actual");
            System.out.println("2.- Contador de páginas");
            System.out.println("Pulsa 0 para salir");
            opcion = teclado.nextInt();
            
            switch(opcion) {
                case 1:
                    contador();
                break;
                
                case 2:
                    aumento();
                break;
                
                case 0:
                    System.out.println("Gracias por utilizar el marca páginas virtual Leeitor 9000. ¡Hasta la próxima!");
                break;
                
                default:
                    //
            }
            
        }while(opcion != 0);
    }
    
    public static void contador(){
        System.out.println("Vas por la página " + contador + " de " + paginas + " que tiene el libro.");
    }
    
    public static void aumento(){
        if (contador == paginas) {
            System.out.println("¡Has llegado al final del libro!");
        
            System.out.println("¿Quieres volver a empezar el libro?:");
            teclado.nextLine(); // Consumir salto de línea pendiente
            reinicio = teclado.nextLine().charAt(0);
            if (reinicio == 's' || reinicio == 'S'){
                contador = 1;
            }
        } else {
            contador++;
            System.out.println("Páginas leidas actualizadas");
        }
    }
}