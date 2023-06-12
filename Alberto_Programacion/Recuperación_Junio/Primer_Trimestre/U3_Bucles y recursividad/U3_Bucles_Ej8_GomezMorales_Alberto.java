// Alberto Gomez Morales - 1º DAW - Programación - Ejercicio U3_Bucles

/*
 * 8.- (Programa para imprimir gráficos de barra) Una aplicación interesante de las computadoras es la visualización de gráficos convencionales y de barra.
 * Escriba una aplicación que lea cinco números, cada uno entre 1 y 30. Por cada número leído, su programa debe mostrar el mismo número de asteriscos adyacentes.
 * Por ejemplo, si su programa lee el número 7, debe mostrar *******. Muestre las barras de asteriscos después de leer los cinco números.
 */

/* Imports */
import java.util.Scanner;

public class U3_Bucles_Ej8_GomezMorales_Alberto{
	public static void main(String[] args){
		/* Variables */
		Scanner teclado = new Scanner(System.in);
		int numero;

		/* Desarrollamos el main */
		        
        // Leer los cinco números y mostrar las barras de asteriscos
        for (int i = 1; i <= 5; i++) {
            System.out.print("Escribe un número entre 1 y 30: ");
            numero = teclado.nextInt();
            
            // Validar el rango del número ingresado
            if (numero < 1 || numero > 30) {
                System.out.println("El número no es válido. Debe estar entre 1 y 30.");
                i--; // Cancelo la lectura del contador 'i'
            }
            
            System.out.print(numero + ": ");
            
            // Mostrar la barra de asteriscos
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
	}
}
