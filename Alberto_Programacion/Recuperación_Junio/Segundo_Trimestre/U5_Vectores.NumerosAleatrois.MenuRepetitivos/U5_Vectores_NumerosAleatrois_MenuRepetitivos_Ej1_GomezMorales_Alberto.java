//Alberto Gómez Morales - 1º DAW - Programación

/*
 * 1. Leer 10 enteros, almacenarlos en un vector y determinar en qué posición del vector está el mayor número leído.
 */

 /* Imports */
import java.util.Scanner;

public class U5_Vectores_NumerosAleatrois_MenuRepetitivos_Ej1_GomezMorales_Alberto{
    public static void main(String[] args) {
        /* Variables */
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        int mayorNumero;
        int posicion;

        /* Pido los números y los guardo */
        for (int i = 0; i < 10; i++) {
            System.out.print("Escribe el número entero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        /* Comparo los 2 números */
        mayorNumero = numeros[0];
        posicion = 0;
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > mayorNumero) {
                mayorNumero = numeros[i];
                posicion = i;
            }
        }

        /* Muestro el resultado */
        System.out.println("El mayor número es: " + mayorNumero);
        System.out.println("Se encuentra en la posición: " + posicion);

        teclado.close();
    }
}
