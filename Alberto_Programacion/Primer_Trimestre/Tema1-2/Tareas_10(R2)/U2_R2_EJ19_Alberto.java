//Alberto Gómez Morales -- Ejercicio 19 Libro

//Crea una aplicación que solicite al usuario cuántos grados tiene un ángulo y muestre el equivalente en radianes.
// Si el ángulo introducido por el usuario no se encuentra en el rango de 0° a 360°, hay que transformarlo a dicho rango.
// Nota: El operador módulo puede ayudarnos a convertir un ángulo a su equivalente en el rango comprendido de 0° a 360°.

import java.util.Scanner;

public class U2_R2_EJ19_Alberto {
	public static void main(String[] args) {

		// Declaramos las variables
		double grados;
		double pi = 3.141592;
		Scanner teclado = new Scanner(System.in);

		// Desarrollo del programa
		System.out.println("Indica los grados de un ángulo y los pasaré a radianes:");
		grados = teclado.nextDouble();

		// Reviso que los grados estén entre 0 y 360, de no ser así los paso a ese rango
		// Después lo paso a radianes
		grados = grados >= 0 && grados <= 360 ? grados : grados % 360;
		grados = grados * pi / 180;

		System.out.println("Los grados indicados en radianes son: " + grados);
	}
}
