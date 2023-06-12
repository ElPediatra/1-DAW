// Alberto Gomez Morales - 1º DAW - Programación - Ejercicio U3_Bucles

/*
 * 4.- ¿Que es lo que hace el siguiente programa?
 *	// Ejercicio 4: Imprimir.java
 *	public class Imprimir {
 *		public static void main(String[] args){
 *			for (int i = 1; i <= 10; i++){
 *				for (int j = 1; j <= 5; j++)
 *					System.out.print('@');
 *				System.out.println();
 *			}
 *		}
 *	}// fin de la clase Imprimir
 */
public class U3_Bucles_Ej4_GomezMorales_Alberto{
	public static void main (String[] args){
		for(int i = 1; i<= 10; i++){
			for (int j = 1; j <= 5; j++)
				System.out.print('@');
			System.out.println();
		}
	}
}
