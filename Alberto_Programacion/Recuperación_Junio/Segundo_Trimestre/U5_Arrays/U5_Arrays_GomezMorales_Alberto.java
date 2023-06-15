//Alberto Gómez Morales - 1º DAW - Programación

/*
 * Con la resolución de este ejercicio se encontrará el mayor elemento de un array de enteros que el usuario insertará por teclado.
 * La dimensión máxima será de 50 elementos.
 */

/* Imports */
import java.util.Scanner;

public class U5_Arrays_GomezMorales_Alberto{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanio;
        int[] array;
        int mayor;

        System.out.print("Ingrese la dimensión del array (máximo 50): ");
        tamanio = teclado.nextInt();

        if (tamanio <= 0 || tamanio > 50) {
            System.out.println("Dimensión inválida. El tamaño del array debe estar entre 1 y 50.");
            return; //No avanzamos
        }

        array = new int[tamanio];

        System.out.println("Escribe los números del array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Número" + (i + 1) + ": ");
            array[i] = teclado.nextInt();
        }

        mayor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }

        System.out.println("El mayor número del array es: " + mayor);

        teclado.close();
    }
}