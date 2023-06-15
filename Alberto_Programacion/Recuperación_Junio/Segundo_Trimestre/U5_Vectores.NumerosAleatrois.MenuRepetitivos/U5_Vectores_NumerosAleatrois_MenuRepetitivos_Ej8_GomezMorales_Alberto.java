//Alberto Gómez Morales - 1º DAW - Programación

/*
 * 8. Almacenar en un vector 50 números enteros, y determinar cuál es el mayor valor y el menor del vector.
 */

import java.util.Scanner;

public class U5_Vectores_NumerosAleatrois_MenuRepetitivos_Ej8_GomezMorales_Alberto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = new int[50];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Escribe el número entero " + (i + 1) + ": ");
            array[i] = teclado.nextInt();
        }

        int mayor = array[0];
        int menor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }

            if (array[i] < menor) {
                menor = array[i];
            }
        }

        System.out.println("El mayor valor del array es: " + mayor);
        System.out.println("El menor valor del array es: " + menor);

        teclado.close();
    }
}