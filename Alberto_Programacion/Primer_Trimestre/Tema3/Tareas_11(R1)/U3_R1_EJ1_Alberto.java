// Alberto Gómez Morales -- Ejercicio 3.1 Libro - Página 74

/*
 * Diseñar un programa que muestre, para cada número introducido por teclado,
 * si es par, si es positivo y su cuadrado.El proceso se repetirá hasta que el
 * número introducido sea 0
 */

import java.util.Scanner;

public class U3_R1_EJ1_Alberto {
    public static void main(String[] args) {

		// Declaramos las variables
        int numero;
        int cuadrado;
        String par;
        String positivo;
        Scanner teclado = new Scanner(System.in);

        // Desarrollamos el programa
        System.out.println("Inserta un número: ");
        numero = teclado.nextInt(); //Solicito el número

        while (numero != 0) { //Abro while para que se repita hasta que indiquen el número 0

            //Compruebo el signo
            positivo = numero > 0 ? "+":"-";
            System.out.print("El número "+ numero +" tiene signo " + positivo);

            //Compruebo si es par o impar
            if (numero % 2 == 0) {
                par = "es PAR";
            } else {
                par = "es IMPAR";
            }
            System.out.print(", "+ par);

            //Calculo su cuadrado
            cuadrado = numero * numero;
            System.out.println(" y su cuadrado es " + cuadrado);

            //Al final de las comprobaciones solicito el siguiente número para cerrar el bucle, se repetirá hasta que se indique 0
            System.out.println("Inserta otro número: ");
            numero = teclado.nextInt();
        }
        
        System.out.println("Eso es todo viejo!");
    }
}