//Alberto Gómez Moralse -- Ejercicio 1.14 página 41

import java.util.Scanner;
public class U1_R4_EJ14_Alberto{
	public static void main(String[] args){

	//Declaramos variables
	double base;
	double altura;
	double area;
	Scanner teclado=new Scanner (System.in);

	//Desarrollo del programa
	System.out.println("Indica la base del triangulo: ");
	base=teclado.nextDouble();
	System.out.println("Indica la altura del triangulo: ");
	altura=teclado.nextDouble();

	area= (base * altura) / 2; // Calculamos el area del triángulo

	//Mostar resultado

	System.out.println("El area del triángulo es: " + area);

	}
}
