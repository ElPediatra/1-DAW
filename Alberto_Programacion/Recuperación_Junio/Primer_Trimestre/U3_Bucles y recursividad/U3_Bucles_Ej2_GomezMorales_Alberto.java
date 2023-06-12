// Alberto Gomez Morales - 1º DAW - Programación - Ejercicio U3_Bucles

/*
 * 2.- Encuentre el error en cada uno de los siguientes segmentos de Código, y explique como corregirlo:
 * 	a) i = 1;
 *		while (i <= 10); ++i;
 *	}
 *
 *	b) for (k = 0.1; k != 1.0; k += 0.1)
 *	System.out.println (k);
 *
 *	c) switch (n) { 
 *		case 1: System.out.println(“El número es 1”);
 *		case 2: System.out.println(“El número es 2”);
 *		break;
 *		default: System.out.println(“El número no es 1 ni 2”);
 *		break;
 *	}
 *
 *	d) El siguiente código debe imprimir los valores 1 a 10:
 *		n = 1;
 *		while (n < 10) System.out.println(n++);
 */

/* Import */
import java.util.Scanner;

public class U3_Bucles_Ej2_GomezMorales_Alberto{
	public static void main(String[] args){
		//a) Se ha cerrado el bucle while pero no se ha abierto correctamente y la variable 'i' ni se ha definido ni se ha puesto el aumento correctamente, lo modifico.
		
		/* Variables */
		int i = 1;

		while (i <= 10){
			System.out.println("El valor de 'i' es: " + i); //Añado esta línea para ir comprobando el valor y que vaya aumentando.
			i++;
		}

		//b) No se ha abierto y cerrado el bucle for, tampoco se ha incializado la variable 'k', también la sección k != 1.0 tendría que ser k < 1.0.
		double k;

		for (k = 0.1; k < 1.0; k += 0.1){
			System.out.println (k);
		}

		//c) No se ha inicializado la variable 'n', tampoco se ha puesto el break para el case 1, también no cargan las comillas (al copiarlo del documento de texto, las reemplazo por las comillas normales).
		Scanner teclado = new Scanner(System.in);
		int n;

		System.out.println("Valide el valor de 'n'");
		n = teclado.nextInt();

		switch (n) {
			case 1:
				System.out.println("El número es 1");
				break;
			case 2:
				System.out.println("El número es 2");
				break;
			default:
				System.out.println("El número no es 1 ni 2");
				break;
		}
		//d) No se ha indicializado la variable 'n' (en este caso la cambio por otra letra ya que la estoy usando en el ejercicio 'c)'. Tampoco se ha abierto y cerrado el bucle, lo modifico.
		int m = 1;

		while (m < 10){
			System.out.println(m++);
		}
	}
}
