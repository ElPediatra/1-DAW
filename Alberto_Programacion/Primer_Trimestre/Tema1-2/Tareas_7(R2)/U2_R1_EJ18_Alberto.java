//Alberto Gómez Morales -- Ejercicio 18

import java.util.Scanner;
public class U2_R1_EJ18_Alberto{
	public static void main(String []args){
	//Declaro las variables
	int radio;
	double pi = 3.14159;
	Scanner teclado=new Scanner(System.in);
    // Se declara solo radio y pi, ya que el resto de datos no se quieren almacenar, se calculan directamente en el resultado

	//Desarrollo del programa
	System.out.println("Indica un número entero para el radio de un círculo y te calcularé el diamétro, la circunferencia y el área:");
	radio = teclado.nextInt();
	System.out.printf("El diámetro es: %d, la circunferencia: %f y el área: %f.",2 * radio,2 * pi * radio,pi * radio * radio);
    //Damos el resultado calculandolo, ya que el ejercicio no quiere que almacenemos los datos
    //En el ejercicio carga como pi * radio * 2 pero es pi * radio al cuadrado (es decir radio * radio)

	}
}