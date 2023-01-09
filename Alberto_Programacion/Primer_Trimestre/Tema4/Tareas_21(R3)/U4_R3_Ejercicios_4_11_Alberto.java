/*
 * Alberto Gómez Morales -- Ejercicio 11 Libro Tema 4
 * Crear una función que para calcular el volumen de una esfera.
 */

import java.util.Scanner;

public class U4_R3_Ejercicios_4_11_Alberto {
	public static void main(String[] args) {

		// Declaramos las variables
		Scanner teclado = new Scanner(System.in);
        double radio;
        double superficie;
        double volumen;


		// Desarrollamos el programa
		System.out.println("En este programa calcularemos el volumen de una esfera.");
        System.out.println("Indica el radio de la esfera en cm:");
		radio = teclado.nextDouble();

        superficie = esSuperficie(radio);
        volumen = esVolumen(radio);

		System.out.println("La esfera, con el radio que has indicado tiene:");
        System.out.println("\t\t Una superficie de " + superficie + ".");
        System.out.println("\t\t Un volumen de " + volumen + ".");
        System.out.println("Hasta la próxima.");
	}
    
    //Desarrollamos las funciones para la superficie y el volumen

	public static double esSuperficie(double x) {
		return 4*Math.PI*x*x;
	}

	public static double esVolumen(double x) {
		return 4*Math.PI*x*x*x/3;
	}

    //Página para comprobar el resultado -- https://calculadorasonline.com/calcular-el-volumen-de-una-esfera-formula-calculadora/
}