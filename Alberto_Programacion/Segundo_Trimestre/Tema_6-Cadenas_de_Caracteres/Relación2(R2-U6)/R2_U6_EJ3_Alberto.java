/*
 * Buscar la palabra o caracter que quiera  el usuario en la frase que nos indique
 */

import java.util.Scanner;

public class R2_U6_EJ3_Alberto {
    public static void main(String args[]) {

        //Definimos las variables
        Scanner teclado = new Scanner(System.in);
        String frase;
        String peticion;
        int posicion;

        //Desarrollamos el programa
        System.out.println("En este programa buscaremos la palabra o el caracter en la frase que indiques.");
        System.out.println("Indica la frase que quieres.");
        frase = teclado.nextLine(); //Solicitamos la frase que quiere el usuario

        System.out.println("Indica la palabra o caracter que quieres buscar: ");
        peticion = teclado.nextLine(); //Solicitamos la palabra/letra que quieren buscar

        posicion = frase.indexOf(peticion); //Uso la función indexOf para buscar la leta o palabra indicada

        System.out.println("La palabra/letra " + peticion + " se encuentra en la posición " + posicion);
        teclado.close();
    }
}