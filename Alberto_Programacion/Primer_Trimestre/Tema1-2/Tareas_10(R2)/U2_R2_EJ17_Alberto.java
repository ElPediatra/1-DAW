//Alberto Gómez Morales -- Ejercicio 17 Libro

//Realiza <<el juego de la suma>>, que consiste en que aparezcan dos números aleatorios (comprendidos entre 1 y 99)
// que el usuario tiene que sumar. La aplicación debe indicar si el resultado de la operación es correcto o incorrecto

import java.util.Scanner;

public class U2_R2_EJ17_Alberto{
	public static void main(String []args){
	
	//Definimos las variables
	int numero1;
	int numero2;
	int suma;
	int resultado;
	Scanner teclado = new Scanner(System.in);
	
	//Desarrollamos el programa
	System.out.println("Indicame un número entero: ");
	numero1 = teclado.nextInt();
	System.out.println("Indicame otro número entero: ");
	numero2 = teclado.nextInt();
	System.out.println("Ahora, suma esos dos números e indica el resultado. Comprobaré si has acertado: ");
	resultado = teclado.nextInt();
	
	suma = numero1 + numero2;
	
	if (suma == resultado) {
		System.out.println("Enhorabuena, sabes sumar dos números enteros");
	} else {
		System.out.println("Vas a tener que volver a primaria, no has sumado bien");
	}
	}
}