//Alberto Gómez Morales -- Ejercicio 3_5 del libro

/*
 * Desarrollar un juego que ayude a mejorar el cálculo mental de la
 * suma. El jugador tendrá que introducir la solución de la suma de dos
 * números aleatorios comprendidos entre 1 y 100.Mientras la solución
 * introducida sea correcta, el juego continuará. En caso contrario,
 * el programa terminará y mostrará el número de operaciones realizadas
 * correctamente.Usa un do_while() en tu resolución
 */

import java.util.Scanner;

public class U3_R1Eje3_5 {
public static void main(String[] args){

    //Definimos las variables
    int resultado;
    int operando1;
    int operando2;
    int operaciones = 0;
    Scanner teclado=new Scanner (System.in);

    //Desarrollamos el programa

    do {
        operando1 = (int) (Math.random() * 100 + 1);
        operando2 = (int) (Math.random() * 100 + 1);

        System.out.println("Cuánto es " + operando1 +" + " + operando2 +"?");
        resultado = teclado.nextInt();

        operaciones++;
    } while (resultado == operando1 + operando2);

    System.out.println("Has conseguido hacer " + (operaciones - 1) + " sumas consecutivas!");
}
}