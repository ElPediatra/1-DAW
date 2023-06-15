//Alberto Gómez Morales - 1º DAW - Programación

/*
 * 7. Almacenar en un vector 20 números enteros y calcularle el factorial a cada uno de los números leídos almacenándolos en otro vector.
 */

import java.util.Scanner;

public class U5_Vectores_NumerosAleatrois_MenuRepetitivos_Ej7_GomezMorales_Alberto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = new int[20];
        long[] factorialArray = new long[20];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Escribe el número entero " + (i + 1) + ": ");
            array[i] = teclado.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            factorialArray[i] = calcularFactorial(array[i]);
        }

        System.out.println("Factoriales de los números ingresados:");
        for (int i = 0; i < factorialArray.length; i++) {
            System.out.println("Número: " + array[i] + ", Factorial: " + factorialArray[i]);
        }
        teclado.close();
    }

    /* Métodos */
    public static long calcularFactorial(int numero) {
        long factorial = 1;

        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
