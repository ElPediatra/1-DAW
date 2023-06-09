// Alberto Gomez Morales - 1º DAW - Programación - Ejercicio Resolución_Ejerc_Recup1Parcial

/*
 * Teniendo en cuenta que se construirá un menú para la petición de números que seguirán las siguientes indicaciones:
 *  - Se realizará la petición al usuario de números enteros hasta que su suma supere 10000.
 *  - No se considerarán los nº primos mayores de 100, ni el 10000.
 *  - Se visualizará el total obtenido y el nº que hace sobrepasar el límite.
 *  - Se mostrarán los números insertados poro orden inverso.
 * Así pues, tras estudiar al nuevo número, decide si incrementa o no el total. El proceso debe ser iterativo con confirmación de salida (s/n).
 * 
 *      Escribir un programa en Java que simule lo anteriormente expuesto. Para ello se tomará desde teclado un número entero, que no podrá ser 0,
 *  ni 10000, ni primos mayores de 100 y se emitirá el mensaje "Otro más vamos por...." o "Lo siento, no cumple los requisitos", según se cumpla o
 *  no las condiciones que se han especificado.
 *      a) Tratar todas las opciones para los números, las válidas y las no válidas.
 *      b) Buenos hábitos de programación (nombres variables, clases,...).
 *      c) Debes arbitrar una opción para finalizar la ejecución, tras la cual se preguntará "Has elegido salir, estás seguro? (s/n)".
 *      d) Incluya documentación interna aclarativa e informativa.
 *      e) Se cuida el formato y la presentación de la información en pantalla.
 *      f) Resuelva lo especificado en el enunciado.
 *          - Números introducidos por el usuario.
 *          - Calcula la validez del número.
 *          - Iterativo.
 *          - Confirmación de salida.
 *          - Resolución basada en métodos.
 * 
 * Algunas anotaciones:
 * public static void main(String[] args)   System.out.println("examen");       import java.util.Scanner;
 * Scanner teclado = new Scanner(System.in);    nextLine().charAt(0);       nextLine();     nextInt();
 */

 /* Imports */
import java.util.Scanner;

public class Resolucion_Ejerc_Recup1Parcial_GomezMorales_Alberto {
    final static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args){
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
                    sumatoria();
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
        System.out.println("\t Menú sumatorio de números");
        System.out.println("1. Añadir números.");
        System.out.println("0.Salir.");
        System.out.println("\tSeleccione una opción por favor.");
    }

    public static void sumatoria(){
        int[] lista = ;
    }
}