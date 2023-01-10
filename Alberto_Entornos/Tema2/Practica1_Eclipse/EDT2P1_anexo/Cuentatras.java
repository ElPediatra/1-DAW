/** Programa que recibe un número del usuario y muestra la cuenta atrás hasta cero.
 *  Para entradas negativas no hace nada.
 */

import java.util.Scanner;

public class Cuentatras {

	public static void main(String[] args) {
		int entrada;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el principio de la cuenta atrás: ");
		entrada = teclado.nextInt();
		while (entrada >= 0) {
			System.out.println(entrada+"...");
			entrada --;
		}
		System.out.println("Fin de programa.");
		teclado.close();
	}
}
