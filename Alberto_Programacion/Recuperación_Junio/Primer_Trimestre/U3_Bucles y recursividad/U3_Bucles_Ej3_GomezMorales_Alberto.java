// Alberto Gomez Morales - 1º DAW - Programación - Ejercicio U3_Bucles

/*
 * 3.- Encuentre y corrija los errores en cada uno de los siguientes fragmentos de código:
 * a) for (i = 100, i >= 1, i++)
 * 		System.out.println(i);
 * b) El siguiente código debe imprimirse sin importar si el valor entero es par o impar:
 *		switch (value % 2)
 * 		{
 *		 case 0:
 *			 System.out.println(“Entero par”);
 *		 case 1:
 *			 System.out.println(“Entero impar”);
 * 		}
 * c) El siguiente código debe imprimir los enteros impares del 19 al 1:
 * 		for (i = 19; i >= 1; i += 2)
 * 			System.out.println(i);
 * d) El siguiente código debe imprimir los enteros pares del 2 al 100:
 * 		contador = 2;
 * 		do {
 * 			System.out.println(contador);
 * 			contador += 2;
 *		} While (contador < 100);
 */

/* Import */
import java.util.Scanner;

public class U3_Bucles_Ej3_GomezMorales_Alberto{
	public static void main(String[] args){
		//a) No se ha inicializado la variable 'i', tampoco se ha separado las gestiones de 'i' con ';', se ha usado ',', lo modifico.
		// También da un bucle infinito, ya que se indica que tiene que funcionar mientras i sea MAYOR o igual que 1, cambio que 'i' sea 1 y mientras que sea menor o igual que 100.
		for (int i = 1; i <= 100; i++){
			System.out.println(i);
		}

		//b) Hay que añadir un default case para que se tenga esa opción, tampoco se ha inicializado la variable 'value'.
		Scanner teclado = new Scanner(System.in);
		int value;

		System.out.println("Indica el valor de value");
		value = teclado.nextInt();
		
		switch (value % 2)
		{
			case 0:
				System.out.println("Entero par");
			break;

			case 1:
				System.out.println("Entero impar");
			break;

			default:
				System.out.println("El número es " + value);
		}

		//c) En el bucle se indica que se incremente el número, no hay que incrementarlo, hay que reducir de 2 en 2 para que vaya mostrando los valores. Tampoco se ha inicializado la variable 'i'.
		for(int i = 19; i >= 1; i -=2){
			System.out.println(i);
		}

		//d) No se ha definido la variable 'contador', también se indica 'While' en vez de 'while' e indicar que sea menor o igual, no solo menor.
		int contador = 2;
		do
		{
			System.out.println(contador);
			contador += 2;
		} while (contador <= 100);
	}
}
