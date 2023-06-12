// Alberto Gomez Morales - 1º DAW - Programación - Ejercicio U3_Bucles

/*
 * 7.- (Factoriales) Los factoriales se utilizan con frecuencia en los problemas de probabilidad. El factorial de un entero positivo n (se escribe como n! y se pronuncia “factorial de n”)
 * es igual al producto de los enteros positivos del 1 a n. Escriba una aplicación que calcule los factoriales del 1 al 20. Use el tipo long. Muestre los resultados en formato tabular.
 * Que dificultad podría impedir que usted calculara el factorial de 100?
 */

public class U3_Bucles_Ej7_GomezMorales_Alberto{
	public static void main(String[] args){
		/* Variables */
		long factorial; //Lo hago con long ya que saldrá un número muy largo para int.
		
		/* Desarrollamos el main */
		for (int i = 1; i <= 20; i++) {
            factorial = calcularFactorial(i); //Mando al método
            System.out.println(i + "\t" + factorial);
        }

		for (int i = 1; i <= 100; i++) { //Muy grande para mostrar, al final da siempre 0
			factorial = calcularFactorial(i); //Mando al método
            System.out.println(i + "\t" + factorial);
		}
	}

	/* Métodos */
	private static long calcularFactorial(int j) {
		/* Variables */
        long factorial = 1;

		/* Desarrollamos el método */
        for (int i = 1; i <= j; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
