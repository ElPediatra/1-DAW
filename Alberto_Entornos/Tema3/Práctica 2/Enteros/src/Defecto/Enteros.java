package Defecto;


public class Enteros {

	/*
	 * Método r_factorial: Recibe un entero y devuelve su factorial. El
	 * factorial de un número es el resultado de multiplicar todos los números
	 * comprendidos entre 1 y ese número. Este método resuelve el problema
	 * mediante llamadas recursivas
	 */

	public static int r_factorial(int n) {
		int resultado;

		if (n == 0) {
			resultado = 1;
		} else {
			resultado = n * r_factorial(n - 1);
		}
		return resultado;
	}

	/*
	 * Método factorial: Recibe un entero y devuelve su factorial. El factorial
	 * de un número es el resultado de multiplicar todos los números
	 * comprendidos entre 1 y ese número. Este método resuelve el problema sin
	 * llamadas recursivas
	 */
	public static long factorial(long n) {
		long resultado;

		if (n < 0) { //Añado este if para la excepción de número negativo
            throw new IllegalArgumentException("El número debe de ser un entero no negativo");
        }
		
		resultado = 1;
		for (int i = 2; i <= n; i++) {
			resultado = resultado * i;
		}
		return resultado;
	}

	/*
	 * Método alreves: Recibe una cadena de caracteres y devuelve la misma
	 * cadena, pero invirtiendo el orden de los caracteres.
	 */
	public static String alreves(String cadena) {
		String resultado = "";

		for (int i = cadena.length() - 1; i >= 0; i--) {
			resultado = resultado + cadena.charAt(i);
		}
		return resultado;
	}

	/*
	 * Método capicua: Recibe un número entero y devuelve true si es capicua o
	 * false si no es capicua. Se dice que un número es capicua cuando se
	 * obtiene el mismo resultado leyéndolo de izquierda a derecha y de derecha
	 * a izquierda
	 */
	public static boolean capicua(int n) {
		boolean resultado;
		String cadena;

		cadena = Integer.toString(n);
		if (cadena.equals(alreves(cadena))) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
	}

	/*
	 * Método divisible: Recibe dos números enteros (multiplo y divisor) y
	 * devuelve true si el primero es divisible por el segundo. Se dice que un
	 * número (multiplo) es divisible por otro (divisor) si la división es
	 * exacta, es decir, de resto 0
	 */
	public static boolean divisible(int multiplo, int divisor) {
		boolean resultado;

		if (multiplo % divisor == 0) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
	}

	/*
	 * Método multiplo: Recibe dos números enteros (mult y divisor) y devuelve
	 * true si el primero es múltiplo del segundo. Se dice que un número (mult)
	 * es múltiplo de otro (divisor) si la división es exacta, es decir, de
	 * resto 0
	 */
	public static boolean multiplo(int mult, int divisor) {
		boolean resultado;

		try {
			if (mult % divisor == 0) {
				resultado = true;
			} else {
				resultado = false;
			}
		} catch (ArithmeticException e) {
			resultado = false;
		}
		return resultado;
	}

	/*
	 * Método esPrimo: Recibe un número entero y devuelve true si es primo o
	 * false si no es primo. Se dice que un número es primo cuando es mayor que
	 * 1 y no tiene más divisores que el 1 y a sí mismo.
	 */
	public static boolean esPrimo(int n) {
		boolean primo;

		if (n <= 1) {
			primo = false;
		} else {
			primo = true;
			int i = 2;
			while (primo && i <= n / 2) {
				if (divisible(n, i)) {
					primo = false;
				} else {
					i++;
				}
			}
		}
		return primo;
	}

	/*
	 * Método n_primos: Recibe un número entero y devuelve el número de primos
	 * menores o iguales a ese número.
	 */
	public static int n_primos(int n) {
		int resultado = 0;

		for (int i = 2; i <= n; i++) {
			if (esPrimo(i)) {
				resultado++;
			}
		}
		return resultado;
	}

	/*
	 * Método primosHasta: Recibe un número entero y devuelve los números primos
	 * menores o iguales a ese número.
	 */
	public static int[] primosHasta(int n) {
		int[] resultado;

		resultado = new int[n_primos(n)];
		int cont = 0;
		for (int i = 2; i <= n; i++) {
			if (esPrimo(i)) {
				resultado[cont] = i;
				cont++;
			}
		}

		return resultado;
	}

	/*
	 * Método primerosPrimos: Recibe un número entero (n) y devuelve los n
	 * primeros primos
	 */
	public static int[] primerosPrimos(int n) {
		int[] resultado = new int[(n < 0) ? 0 : n];

		int cont = 0;
		int i = 2;
		while (cont < n) {
			if (esPrimo(i)) {
				resultado[cont] = i;
				cont++;
			}
			i++;
		}

		return resultado;
	}

	/*
	 * Método divide: Recibe dos números reales y devuelve su división
	 * Si el divisor es 0 genera un excepción
	 */
	public static double divide (double dividendo, double divisor) {
		double resultado;
		if (divisor==0) {
			throw new ArithmeticException();
		} else {
			resultado = dividendo / divisor;
		}
		return resultado;
	}
}