//Alberto Gómez Morales - 1º DAW - Programación

/*
 * 5. Leer 40 números enteros, almacenarlos en un vector y determinar en qué posiciones se encuentran los números terminados en 4.
 */

/* Import */
import java.util.Scanner;

public class U5_Vectores_NumerosAleatrois_MenuRepetitivos_Ej5_GomezMorales_Alberto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = new int[40];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Escribe el número del array " + (i + 1) + ": ");
            array[i] = teclado.nextInt();
        }

        // Buscar las posiciones de los números terminados en 4
        System.out.println("Posiciones de los números terminados en 4:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 4) {
                System.out.println("\tPosición " + (i + 1));
            }
        }
        teclado.close();
    }
}
