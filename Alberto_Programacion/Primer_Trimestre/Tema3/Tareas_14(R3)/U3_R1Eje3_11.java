//Alberto Gómez Morales -- Ejercicio 3_11 del libro

/*
 * Pedir un número y calcular su factorial.Por ejemplo, el factorial
 * de 5 se denota 5! y es igual a 5x4x3x2x1=120.
 */

import java.util.Scanner;

public class U3_R1Eje3_11 {
public static void main(String[] args){

    //Definimos las variables
    int numero;
    long factorial;
    Scanner teclado=new Scanner (System.in);

    //Desarrollamos el programa
    System.out.println("Indica un número: ");
    numero=teclado.nextInt();
    factorial = 1; //Necesario inicializarlo, ya que va a multiplicar

    for (int i = numero; i > 0; i--) {
        factorial = factorial * i;
    }
    System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}