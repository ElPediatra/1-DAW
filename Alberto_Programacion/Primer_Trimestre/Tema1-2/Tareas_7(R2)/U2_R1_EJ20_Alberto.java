//Alberto Gómez Morales -- Ejercicio 20

import java.util.Scanner;

public class U2_R1_EJ20_Alberto{
	public static void main(String []args){
    
	//Declaro las variables
	int num;
	Scanner teclado=new Scanner(System.in);

	//Desarrollo el programa
	System.out.println("Introduce un número entero de 5 dígitos:");
	num = teclado.nextInt();
	System.out.printf("%d   %d   %d   %d   %d",num / 10000,(num % 10000) / 1000,((num % 10000) % 1000) / 100,(((num % 10000) % 1000) % 100) / 10,((((num % 10000) % 1000) % 100) % 10));
	//Definimos como int para que a la hora de dividir los números no cargue los decimales y así obtengamos el número en su posición
	//Luego con printf defino con %d y los espacios la posición de cada uno de ellos.
	}
}