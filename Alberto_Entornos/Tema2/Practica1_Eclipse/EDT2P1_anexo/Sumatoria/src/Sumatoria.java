/** Programa que recibe un número y devuelve la suma desde 1 hasta ese número
 *  Para 0 o valores negativos devuelve 0.
 */

import java.util.Scanner;

public class Sumatoria {

	public static void main(String[] args) {
		int entrada;
		int suma = 0;
		int contador = 1;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por favor, introduzca el número hasta el que quiere sumar:");
		entrada = teclado.nextInt();
		while (contador <= entrada) {
			suma = suma + contador;
			contador ++;
		}
		
		System.out.println("La suma es: "+suma);
		teclado.close();
	}

}
