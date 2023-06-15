//Alberto Gómez Morales - 1º DAW - Programación

/*
 * 2. Leer 50 enteros, almacenarlos en un vector y determinar en qué posición del vector está
 * el mayor número primo leído
 */

/* Import */
import java.util.Scanner;

public class U5_Vectores_NumerosAleatrois_MenuRepetitivos_Ej2_GomezMorales_Alberto {
    public static void main(String[] args) {
        /* Variables */
        Scanner teclado = new Scanner(System.in);
        int[] arrayNumeros = new int[50];
        int posicionMayorPrimo = -1;
        int mayorPrimo = 0;

        /* Desarrollamos el programa */
        
        //Pedimos los números y los guardamos
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print("Ingrese el número entero #" + (i + 1) + ": ");
            arrayNumeros[i] = teclado.nextInt();
        }

        //Comparamos los números y vemos cual es el Primo Mayor
        for (int i = 0; i < arrayNumeros.length; i++) {
            if (esPrimo(arrayNumeros[i]) && arrayNumeros[i] > mayorPrimo) {
                mayorPrimo = arrayNumeros[i];
                posicionMayorPrimo = i;
            }
        }

        if (posicionMayorPrimo != -1) {
            System.out.println("El mayor número primo es: " + mayorPrimo);
            System.out.println("Se encuentra en la posición: " + (posicionMayorPrimo + 1));
        } else {
            System.out.println("No se encontró ningún número primo en el array.");
        }

        teclado.close();
    }

    /* Métodos */
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
