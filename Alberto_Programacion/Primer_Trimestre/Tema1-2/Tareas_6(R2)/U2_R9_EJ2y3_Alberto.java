//Alberto Gómez Morales -- Ejercicio 2 y 3 (Relación 1-10)

//Están juntos los 2 ejercicios, ya que el 2 era escribirlo y el 3 crearlo

//Importo paquetes
import java.util.Scanner;

public class U2_R9_EJ2y3_Alberto{
	public static void main(String []args){
	//Defino variables
	int x;
	int y;
	int z;
	int resultado;

	//Desarrollo del programa
	System.out.println("Indicame tres números entero y calculare su producto.");
	Scanner entrada=new Scanner(System.in);

	System.out.println("Introduzca el primer número:");
	x = entrada.nextInt();

	System.out.println("Introduzca el segundo número:");
	y = entrada.nextInt();

	System.out.println("Introduzca el tercer número:");
	z = entrada.nextInt();

	resultado = x*y*z;

	System.out.printf("El producto es, " + resultado);

	}
}
