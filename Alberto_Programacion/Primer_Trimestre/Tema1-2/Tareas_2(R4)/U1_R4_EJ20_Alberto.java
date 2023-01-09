//Alberto Gómez Moralse -- Ejercicio 1.20 página 42

import java.util.Scanner;
import java.lang.Math; //Importamos paquete para calcular la raíz cuadrada
public class U1_R4_EJ20_Alberto{
	public static void main(String[] args){

	//Declaramos variables
    double numero;
    double resultado;
	Scanner teclado=new Scanner(System.in);

    //Desarrollamos el programa
    System.out.println("Indica un número real");
	numero=teclado.nextDouble();

    resultado=Math.sqrt(numero); //Calculamos la raíz cuadrada del número indicado (necesario importar paquete)

    //Mostrar resultado

    System.out.println("La raíz cuadrada de "+numero+" es "+resultado);

    }
}