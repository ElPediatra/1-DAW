//Alberto Gómez Moralse -- Ejercicio 1.13 página 41

import java.util.Scanner;
public class U1_R4_EJ13_Alberto{
	public static void main(String[] args){

	//Declaramos variables
	int numero; //Número que vamos a solicitar
	int multiplo; //Múltiplo solicitado
	int resto; //Restante seleccionado con el que comparar
	Scanner teclado=new Scanner (System.in);

	//Desarrollo del programa
	System.out.println("Indica un número entero: ");
	numero=teclado.nextInt();
	System.out.println("Indica otro número entero para ser el múltiplo: ");
	multiplo=teclado.nextInt();

	resto= multiplo - numero%multiplo; // Calculamos resto de la operación
	resto= resto== multiplo ? 0: resto; // Compara si faltan por sumar o si da 0

	//Mostar resultado
	System.out.println("Para tu número " + numero + ", le tienes que sumar " + resto + " para que sea múltiplo de " +multiplo);

	}
}

