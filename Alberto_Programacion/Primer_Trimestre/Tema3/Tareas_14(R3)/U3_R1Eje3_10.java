//Alberto Gómez Morales -- Ejercicio 3_10 del libro

/*
 * Mostrar la suma de los 10 primeros números impares.
 */

import java.util.Scanner;

public class U3_R1Eje3_10 {
public static void main(String[] args){

    //Definimos las variables
    int impar = 0;
    double suma = 0;
    Scanner teclado=new Scanner (System.in);

    //Desarrollamos el programa
    for (int i = 1; i <= 10; i++) {
        impar = 2 * i -1;
        suma = suma + impar;
    }

    System.out.println("La suma total es de :" + suma);

    }
}