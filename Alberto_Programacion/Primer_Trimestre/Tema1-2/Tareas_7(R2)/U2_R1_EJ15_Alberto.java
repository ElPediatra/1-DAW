//Alberto Gómez Morales -- Ejercicio 15

import java.util.Scanner;
public class U2_R1_EJ15_Alberto{
	public static void main(String []args){
	
    //Declaro las variables
	int num;
	Scanner teclado=new Scanner(System.in);

	//Desarrollo el programa
	System.out.println("Indica un número entero:");
	num = teclado.nextInt();

	if(num % 2 == 0){ //If si es par
	System.out.println("El número " + num + " es un número par.");
	}
	else{ //Else si es impar (resto no igual a 0)
	System.out.println("El número " + num + " es un número impar.");
	}

	}
}