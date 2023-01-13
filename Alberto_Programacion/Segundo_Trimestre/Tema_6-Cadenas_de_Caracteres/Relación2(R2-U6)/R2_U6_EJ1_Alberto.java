
/*
 * Calcular los palabras que hay en una frase
 */

import java.util.Scanner;

public class R2_U6_EJ1_Alberto {

    public static void main(String[] args) {

        //Definimos las variables
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        char espacios;

        //Desarrollamos el programa
        System.out.println("En este programa calcularemos la cantidad de palabras que hay en una frase");
        System.out.println("Indica la frase que quieres que comprobemos, por favor: ");
        String frase = teclado.nextLine();

        for (int i = 0; i < frase.length() ; i++) {
            espacios = frase.charAt(i); //Va avanzando hasta el final de la frase y comprobando los espaciones que tiene par contar las palabras
            if(espacios == ' ') {
                contador++; //Aumenta el contador para saber el total
            }
        }

        System.out.println("El total de palabras en la frase es " + (contador += 1));
    }
}