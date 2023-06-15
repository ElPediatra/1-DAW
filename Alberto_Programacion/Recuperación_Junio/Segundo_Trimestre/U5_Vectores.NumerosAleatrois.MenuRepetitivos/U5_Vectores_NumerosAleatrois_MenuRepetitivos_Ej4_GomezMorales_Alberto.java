//Alberto Gómez Morales - 1º DAW - Programación

/*
 * 4. Almacenar en un vector de 10 posiciones los 10 números primos comprendidos entre 100 y 300. Luego mostrarlos en pantalla.
 */

/* Import */
import java.lang.Math;

public class U5_Vectores_NumerosAleatrois_MenuRepetitivos_Ej4_GomezMorales_Alberto {
    public static void main(String[] args) {
        int[] array = new int[10];
        int contador = 0;

        // Buscar números primos entre 100 y 300
        for (int i = 100; i <= 300; i++) {
            if (esPrimo(i)) {
                array[contador] = i;
                contador++;

                if (contador == 10) {
                    break; //Si llega a 10 rompo el bucle (mal hecho xd)
                }
            }
        }

        //
        System.out.println("Números primos entre 100 y 300:");
        for (int i = 0; i < contador; i++) {
            System.out.print(array[i] + " ");
        }
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