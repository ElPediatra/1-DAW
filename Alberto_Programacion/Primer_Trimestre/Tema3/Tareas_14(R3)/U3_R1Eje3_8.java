//Alberto Gómez Morales -- Ejercicio 3_8 del libro

/*
 * Pedir diez números por teclado y mostrar la media.
 */

import java.util.Scanner;

public class U3_R1Eje3_8 {
public static void main(String[] args){

    //Definimos las variables
    Scanner teclado=new Scanner (System.in);
    int numero;
    int suma = 0;
    double media;

    //Desarrollamos el programa
    for (int i = 1; i <= 10; i++) {
        System.out.println("Indica un número: ");
        numero=teclado.nextInt();

        suma = suma + numero;
    }

    media = suma / 10;
    System.out.println("La media de los 10 números es: " + media);

    }
}