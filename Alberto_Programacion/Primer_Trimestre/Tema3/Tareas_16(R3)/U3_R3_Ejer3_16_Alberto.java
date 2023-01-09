//Alberto Gómez Morales -- 1º DAW -- Actividades de Aplicación

/*
 * Solicita al usuario un número n y dibuja un triángulo de base
 * y altura n, de la forma (para n igual a 4):
 *     *
 *    * *
 *   * * *
 *  * * * *
 */

import java.util.Scanner;

public class U3_R3_Ejer3_16_Alberto {
    public static void main(String[] args){
    
    //Definimos las varibales
    int filas;
    Scanner teclado=new Scanner(System.in);

    System.out.println("Indica el número de filas para el triángulo: ");
    filas=teclado.nextInt();

    System.out.println("El triángulo sería así: ");

    // Bucle externo
    for (int i = 1; i <= filas; i++) {
        // Pintar los espacios
        for (int j = 1; j <= filas - i; j++) {
        System.out.print(" ");
        }
        // Pintar los asteriscos
        for (int k = 0; k < i; k++) {
            System.out.print(" *");
        }
      System.out.println();
    }

    }
}