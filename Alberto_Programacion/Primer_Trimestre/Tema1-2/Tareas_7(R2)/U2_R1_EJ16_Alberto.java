//Alberto Gómez Morales -- Ejercicio 16

import java.util.Scanner;
public class U2_R1_EJ16_Alberto{
	public static void main(String []args){

	//Declaro variables
	int num1;
    int num2;
	Scanner teclado=new Scanner(System.in);

	//Desarrollo el programa
	System.out.println("Indica un número entero:");
	num1 = teclado.nextInt();
	System.out.println("Indica otro número entero:");
	num2 = teclado.nextInt();

	if(num1 % num2 == 0){ //Compruebo si es múltiplo
	System.out.println("El número " + num1 + " indicado si múltiplo de " + num2 + ".");
	}
	else{ //En caso de no ser múltiplo
	System.out.println("El número " + num1 + " indicado no es múltiplo de " + num2 + ".");
	}

	}
}