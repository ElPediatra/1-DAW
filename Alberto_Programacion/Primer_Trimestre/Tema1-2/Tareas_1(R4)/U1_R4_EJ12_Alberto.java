//Alberto Gómez Moralse -- Ejercicio 1.12 página 41

import java.util.Scanner;
public class U1_R4_EJ12_Alberto{
	public static void main(String[] args){

	//Declaramos variables
	int numero; //Número que vamos a solicitar
	int resto = 7; //Resto seleccionado con el que comparar
	Scanner teclado=new Scanner (System.in);

	//Desarrollo del programa
	System.out.println("Indica un número entero: ");
	numero=teclado.nextInt();
	
	resto= 7 - numero%7; // Calculamos resto de la operación
	resto= resto== 7 ? 0 : resto; // Compara si faltan por sumar o si da 0

	//Mostar resultado
	System.out.println("Para tu número " + numero + ", le tienes que sumar " + resto + " para que sea múltiplo de 7");

	}
}


