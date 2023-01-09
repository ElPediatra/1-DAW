//Alberto Gómez Moralse -- Ejercicio 1.15 página 41

import java.util.Scanner;
public class U1_R4_EJ15_Alberto{
	public static void main(String[] args){

	//Declaramos variables
	double a;
	double b;
	double c;
	double x;
	double y;
	Scanner teclado=new Scanner (System.in);

	//Desarrollo del programa
	System.out.println("Vamos a calcular una ecuación de segundo grado, indica el valor de a: ");
	a=teclado.nextDouble();
	System.out.println("Vamos a calcular una ecuación de segundo grado, indica el valor de b: ");
	b=teclado.nextDouble();
	System.out.println("Vamos a calcular una ecuación de segundo grado, indica el valor de c: ");
	c=teclado.nextDouble();
	System.out.println("Vamos a calcular una ecuación de segundo grado, indica el valor de x: ");
	x=teclado.nextDouble();

	y= (a * (x * x)) + (b * x) + c; // Calculamos el valor de 'y' para la ecuación de segundo grado

	//Mostar resultado

	System.out.println("El valor de 'y' para la ecuación es: "+y);

	}
}
