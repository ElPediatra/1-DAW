package Defecto;


public class Principal {

	public static void main(String[] args) {
		System.out.println("Ejecución de algunos métodos de la clase Enteros");
		System.out.println("================================================");

		String miNombre = "Adolfo";
		System.out.println("Mi nombre al derecho es: " + miNombre);
		System.out.println("Y al revés es: " + Enteros.alreves(miNombre));

		int misNumeros[] = { 571, 715, 913, 599 };
		for (int i = 0; i < misNumeros.length; i++) {
			boolean primo = Enteros.esPrimo(misNumeros[i]);
			System.out.println("El número " + misNumeros[i]+(primo? " es" : " no es") + " primo");
		}

	}

}
