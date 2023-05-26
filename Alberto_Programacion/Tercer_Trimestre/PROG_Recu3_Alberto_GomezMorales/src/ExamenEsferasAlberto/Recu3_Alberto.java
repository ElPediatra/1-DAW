/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW
 * @author alber
 *
 * Clase Principal - Peticiones de datos y gestión general del programa
 * 
 * Tiene clientela con las clases PuntoAlberto y EsferaAlberto, de las cuales utiliza sus métodos y objetos.
 */

/* Paquetes */
package ExamenEsferasAlberto;

/* Imports */
import static ExamenEsferasAlberto.EsferaAlberto.totalEsferas; //Importo el paquete para poder usar el contador de esferas
import java.util.ArrayList;
import java.util.Scanner;

/* Clase */
public class Recu3_Alberto{
    /* Colores String */
    final static String ROJO = "\033[31m"; //Texto color rojo
    final static String VERDE = "\033[32m"; //Texto color verde
    final static String RESET = "\033[0m";  //Texto color por defecto
    static Scanner teclado = new Scanner(System.in);

    /* ArrayList para las esferas */
    public static ArrayList<EsferaAlberto> esferas = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }
    
    /* Métodos */
    private static void menu() {
        /* Variables */
        byte opcion;
        char confirmacion;
        boolean salir = false;

        //Desarrollamos el programa
        do {
            menuTexto();
            opcion = teclado.nextByte();
            switch (opcion) {
                case 1:
                    altaEsferaArray();
                    break;
                
                case 2:
                    seleccionarEsferas();
                    break;
                
                case 3:
                    mostrarArrayList(esferas);
                    break;
                    
                case 4:
                    totalEsferas();
                    break;
                
                case 0:
                    System.out.println("Has elegido salir, ¿estás seguro?(s/n)");
                    confirmacion = teclado.next().charAt(0);
                    
                    if (confirmacion == 's' || confirmacion == 'S') {
                        System.out.println("\t\t Confirmada su salida del programa. ¡Hasta la próxima!");
                        salir = true;
                        break;
                    }
                    break;
                
                default:
                    System.out.println("Opción no válida. Por favor, selecciona otra opción.");
            }
        } while (!salir);
    }

    /* Texto Menu */
    public static void menuTexto() {
        System.out.println("\t Menú de Esferas ");
        System.out.println(ROJO + "1. " + RESET + VERDE + "Añadir una esfera." + RESET);
        System.out.println(ROJO + "2. " + RESET + VERDE + "Comparar 2 esferas." + RESET);
        System.out.println(ROJO + "3. " + RESET + VERDE + "Mostrar las esferas." + RESET);
        System.out.println(ROJO + "4. " + RESET + VERDE + "Mostrar el total de esferas creadas (número)." + RESET);
        System.out.println(ROJO + "0. " + RESET + VERDE + "Salir." + RESET);
        System.out.println("\tSeleccione una opción por favor.");
    }
    
    /* Crear esfera y añadir al Array */
    public static void altaEsferaArray(){
        /* Variables */
        int x;
        int y;
        double radio;
        
        System.out.println("Indica la coordenada X del punto (0-30): ");
        x=teclado.nextInt();
        System.out.println("Indica la coordenada Y del punto (0-30): ");
        y=teclado.nextInt();
        System.out.println("Indica el valor del radio (0-12): ");
        radio=teclado.nextDouble();
        
        EsferaAlberto esfera = new EsferaAlberto(x,y,radio);
        
        esferas.add(esfera);
        
        System.out.println("Las esferas creadas hasta ahora son: ");
        mostrarArrayList(esferas);
    }
    
    /* Mostar las esferas */
    public static void mostrarArrayList(ArrayList<EsferaAlberto> esferas) {
        /* Variables */
        int contador=0;
        
        if(esferas.isEmpty()){
            System.out.println("No hay esferas creadas :(");
        } else {        
            for (EsferaAlberto esfera : esferas) {
                System.out.println(contador + ". Esfera:\n" + esfera + "\n");
                contador++;
            }
        }
    }
    
    /* Seleccionar Esferas a comparar */
    public static void seleccionarEsferas(){
        int aux1;
        int aux2;
        
        if(esferas.isEmpty()){
            System.out.println("No hay esferas creadas :(");
        } else {        
            mostrarArrayList(esferas);
            System.out.println("Selecciona las esferas que quieres comparar:");
            System.out.println("Primera esfera: ");
            aux1=teclado.nextInt();
            System.out.println("Segunda esfera: ");
            aux2=teclado.nextInt();
            
            esferas.get(aux1).compararEsferas(esferas.get(aux2));
        }
    }
}
