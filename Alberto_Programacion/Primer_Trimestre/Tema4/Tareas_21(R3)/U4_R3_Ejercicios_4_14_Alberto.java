/*
 * Alberto Gómez Morales -- Ejercicio 14 Libro Tema 4
 * Escribe una función a la que se pase como parámetros de entrada una cantidad de días, horas y
 * minutos. La función calculará y devolverça el número de segundos que existen en los datos de entrada.
 */

import java.util.Scanner;

public class U4_R3_Ejercicios_4_14_Alberto {
	public static void main(String[] args) {

		// Declaramos las variables
        Scanner teclado = new Scanner(System.in);
		int dias;
        int horas;
        int minutos;

		// Desarrollamos el programa
		System.out.println("Con estr programa, podras calcula la cantidad de segundos que hay en los días, horas y minutos que indiques.");
		System.out.println("Indica la cantidad de días:");
		dias = teclado.nextInt();

		System.out.println("Indica la cantidad de horas:");
		horas = teclado.nextInt();

		System.out.println("Indica la cantidad de minutos:");
		minutos = teclado.nextInt();

		System.out.println("La cantidad total en segundos es de " + esSegundos(dias, horas, minutos));
	}

    //Declaramos la función para pasar todo a segundos

    /* En este caso:
     * x -- hace referencia a los días.
     * y -- hace referencia a las horas.
     * z -- hace referencia a los minutos.
     */

	public static int esSegundos(int x, int y, int z) {
		return (z * 60) + (y * 3600) + (x * 24 * 3600);
	}
    
}