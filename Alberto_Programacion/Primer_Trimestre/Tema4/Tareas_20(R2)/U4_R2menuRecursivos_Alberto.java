/* 
 * Completa tu código U4_menuRecusivos.java con los siguientes enunciados:
 * 1.Diseñar una función que calcule a^n, donde a es la base de tipo real y n el exponente entero no negativo, debéis resolverlo con una versión iterativa y otra recursiva.
 * 2. Escribir una función que calcule de forma recursiva el máximo común divisor de dos numeros. Para ello sabemos que el
 * mcd( a-b, b) si a>=b
 * mcd(a, b-a) si b>a
 * a  si b=0
 * b si a=0
 * 3.Escribe una función recursiva que calcule e enesimo termino de la serie de Fibonacci. En esta serie el enesio valor se calcula sumando los dos valores anteriores de la serie. Es decir:
 * fibonacci(n)= fibonacci(n-1) + fibonacci(n-2)
 * fibonacci(0)=1
 * fibonacci(1)=1
 */

import java.util.Scanner;

public class U4_R2menuRecursivos_Alberto {
	public static void main(String[] args) {

		// Declaramos las variables
		int menu;
		int n;
		int m;
		double x, y;
		char decimales;
		Scanner teclado = new Scanner(System.in);

		// Desarrollamos el programa
		System.out.println("Selecciona una opción:");
		System.out.println("\t\t 1.Factorial recursivo");
		System.out.println("\t\t 2.Suma sobrecargada");
		System.out.println("\t\t 3.Potencia iterativa");
		System.out.println("\t\t 4.MCD recursivo");
		System.out.println("\t\t 5.Fibonacci recursivo");
		menu = teclado.nextInt();

		switch (menu) {
			case 0:
				break;

			case 1:
				System.out.println("Indica un número entero:");
				n = teclado.nextInt();
				System.out.println("El factorial " + n + " es " + factorial(n));
				break;

			case 2:
				System.out.println("¿La suma va a ser con decimales? (s/n)");
				decimales = teclado.next().charAt(0);

				switch (decimales) {
					case 's':
						System.out.println("Indica el primer número:");
						x = teclado.nextDouble();

						System.out.println("Indica el segundo número:");
						y = teclado.nextDouble();

						System.out.println("La suma de " + x + " y " + y + " es " + suma2(x, y));
						break;

					case 'n':
						System.out.println("Indica el primer número:");
						n = teclado.nextInt();

						System.out.println("Indica el segundo número:");
						m = teclado.nextInt();

						System.out.println("La suma de " + n + " y " + m + " es " + suma2(n, m));
						break;

					default:
						System.out.println("Opción incorrecta.");
						break;
				}
				break;

			case 3:
				System.out.println("Indica la base: ");
				x = teclado.nextDouble();

				do {
					System.out.println("Indica el exponente (debe ser positivo):");
					y = teclado.nextDouble();
				} while (y < 0);
				System.out.println("La potencia de " + x + " elevado a " + y + " es " + potencia(x, y));
				break;

			case 4:
				System.out.println("Indica el primer número: ");
				n = teclado.nextInt();
				System.out.println("Introduce el segundo número: ");
				m = teclado.nextInt();

				System.out.println("El máximo común divisor de " + n + " y " + m + " es " + mcd(n, m));
				break;

			case 5:
				System.out.println("Indica un número");
				n = teclado.nextInt();
				System.out.println("El termino para el número " + n + " de la serie de Fibonacci es " + fibonacci(n));
				break;

			default:
				System.out.println("Opción incorrecta.");
				break;
		}
	}

	// Comienzo de los métodos

	public static long factorial(int n) {
		long factorial = 1;
		if (n == 0) {
			factorial = 1;
		} else {
			factorial = n * factorial(n - 1);
		}
		return factorial;
	}

	public static int suma(int n, int m) {
		return (n + m);
	}

	public static double suma2(double n, double m) {
		return (n + m);
	}

	public static double potencia(double n, int m) {
		double potencia = 1;
		if (n == 0) {
			return potencia;
		} else {
			for (double i = 1; i <= m; i++) {
				potencia *= n;
			}
			return potencia;
		}
	}

	public static int mcd(int n, int m) {
		int mcd;
		if (m == 0) {
			mcd = n;
		} else {
			mcd = mcd(m, n % m);
		}
		return mcd;
	}

	public static int fibonacci(int n) {
		int fibonacci2;
		if (n == 0 || n == 1) {
			fibonacci2 = 1;
		} else {
			fibonacci2 = fibonacci(n - 1) + fibonacci(n - 2);
		}
		return fibonacci2;

	}
}