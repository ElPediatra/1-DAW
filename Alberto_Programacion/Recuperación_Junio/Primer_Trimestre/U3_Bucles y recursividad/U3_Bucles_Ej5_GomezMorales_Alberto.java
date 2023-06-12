// Alberto Gomez Morales - 1º DAW - Programación - Ejercicio U3_Bucles

/*
 * 5.- (Buscar el valor menor) Escriba una aplicación que encuentre el menor de varios enteros. Suponga que el primer valor leído especifica el numero de valores que el usuario introducirá.
 */

/* Import */
import java.util.Scanner;

public class U3_Bucles_Ej5_GomezMorales_Alberto{
	public static void main(String[] args){
	/* Variables */
	Scanner teclado = new Scanner(System.in);
	int cantidad;
	int menor;
	int valor;

	/* Desarrollamos el programa */
		System.out.print("Introduce el número de valores: ");
        cantidad = teclado.nextInt();

        System.out.print("Introduce el primer valor: ");
        menor = teclado.nextInt();

        for (int i = 1; i < cantidad; i++) {
            System.out.print("Introduce el número" + (i + 1) + ": ");
            valor = teclado.nextInt();
	            if (valor < menor) {
	                menor = valor;
	            }
        }
        System.out.println("El valor menor es: " + menor);
	}
}
