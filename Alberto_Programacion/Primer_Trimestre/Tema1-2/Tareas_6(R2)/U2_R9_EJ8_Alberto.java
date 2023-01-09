//Alberto Gómez Morales -- Ejercicio 8 (Relación 1-10)

//Importo paquetes
import java.util.Scanner;
public class U2_R9_EJ8_Alberto{
	public static void main(String []args){
	
	//Declaro las variables
	double num1;
	double num2;
	double resultado;
	Scanner teclado=new Scanner(System.in);

	//Desarrollo el programa
	System.out.println("Da 2 números y calcularé la suma, producto, diferencia y cociente de los 2.");

	System.out.println("Indica el primer número:");
	num1 = teclado.nextDouble();

	System.out.println("Indica el segundo número:");
	num2 = teclado.nextDouble();

	resultado = num1 + num2;//Calculo la suma de los números
	System.out.println("La suma es: " + resultado);

	resultado = num1 * num2;//Calculo el producto de los números
	System.out.println("El producto es: " + resultado);

	resultado = num1 - num2;//Calculo la diferencia de los números
	System.out.println("La diferencia es: " + resultado);

	resultado = num1 / num2;//Calculo el cociente de los números
	System.out.println("El cociente es: "+resultado);

	}
}