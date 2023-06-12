// Alberto Gomez Morales - 1º DAW - Programación - Ejercicio U3_Bucles

/*
 * 6.- (Calcular el producto de enteros impares) Escriba una aplicación que calcule el producto de los enteros impares del 1 al 15.
 */

public class U3_Bucles_Ej6_GomezMorales_Alberto{
	public static void main(String[] args){
		/* Variables */
		int producto = 1; //Lo incializo a 1 para poder realiza el primer producto
	
		for (int i = 1; i <= 15; i+=2){
			producto = producto * i;
		}

		System.out.println("El producto de los enteros impares del 1 al 15 es: "+ producto);
	}
}
