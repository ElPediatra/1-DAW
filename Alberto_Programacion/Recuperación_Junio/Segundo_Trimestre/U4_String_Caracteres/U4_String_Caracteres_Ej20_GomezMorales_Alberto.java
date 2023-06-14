//Alberto Gómez Morales - 1º DAW - Programación

/*
 * Implementa un programa que lea una frase y muestre todas sus palabras ordenadas de forma alfabética.
 * Suponemos que cada palabra de la frase se separa de otra por un único espacio.
 */

/* Imports */
import java.util.Scanner;
import java.util.Arrays;

public class U4_String_Caracteres_Ej20_GomezMorales_Alberto {
    public static void main(String[] args) {
        /* Variables */
        Scanner teclado = new Scanner(System.in);
        String frase;
        String[] palabras;

        /* Pedimos la frase */
        System.out.print("Introduce una frase: ");
        frase = teclado.nextLine();

        /* Separamos las palabras y las incluimos en el Array */
        palabras = frase.split(" ");

        /* Ordenamos las palabras */
        Arrays.sort(palabras);

        /* Muestro las palabras con un for each */
        System.out.println("Palabras ordenadas:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}