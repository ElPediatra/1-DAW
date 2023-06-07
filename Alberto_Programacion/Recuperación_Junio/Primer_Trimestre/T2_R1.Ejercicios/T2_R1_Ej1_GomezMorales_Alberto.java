//Alberto Gómez Morales - 1º DAW - Ejercicios Recuperación Junio Primer Trimestre

/*
 * 1.- Escriba instrucciones para realizar cada una de las siguientes tareas:
 *	a) Declarar las variables c, estaEsUnaVariable, q76354 y numero como tipo de int.
 *	b) Pedir al usuario que introduzca un entero.
 *	c) Recibir un entero como entrada y asignar el resultado a la variable int valor. Suponga que se puede utilizar la variable entrada tipo Scanner para recibir un valor del teclado.
 *	d) Imprimir "Este es un programa en Java" en una línea de la ventana de comandos. Use el método System.out.println.
 *	e) Imprimir "Este es un programa en Java" en una dos líneas de la ventana de comandos. La primera línea debe terminar con "es un". Use el método System.out.printf y dos especificadores de formato %s.
 *	f) Si la variable número no es igual a 7, mostrar "La variable número no es igual a 7".
 */

/* Imports */
import java.util.Scanner;

public class T2_R1_Ej1_GomezMorales_Alberto{
	public static void main(String[] args){
		/* Variables */

		//a)
		int c;
		int estaEsUnaVariable;
		int q76354;
		int numero;

		//b
		Scanner teclado = new Scanner(System.in);

		/* Desarrollo del Programa */
		System.out.print("Introduzca un número para la variable 'numero': ");
		numero = teclado.nextInt();	

		//c)

		int entrada;
		int valor;
		System.out.println("Introduzca otro número para convertido de la variable entrada a la variable valor: ");
		entrada = teclado.nextInt();
		valor = entrada;
		System.out.println("La variable 'valor' ahora tiene el valor: " + valor);

		//d)

		System.out.println("Este es un programa en Java");

		//e)

		System.out.printf("Es es un %s%s", "\n", "programa en Java \n");

		//f)

		if(numero != 7){
			System.out.println("La variable número no es igual a 7");
		} else {
			System.out.println("La variable número si es igual a 7");
		}
	
		teclado.close();
	}
}
