import java.util.Scanner;
public class U1_R3_EJ1{
/*Escribir una aplicación que pida el año actual y el de nacimiento del usuario. Debe calcular su edad, suponiendo que en el año en curso el usuario ya ha cumplido años.*/

public static void main (String[]args){
	int aActual; //Año actual en curso
	int aNacim; //Año de nacimiento
	int edad;
	String nombre; // Te faltaba declarar la variable 'nombre'
	Scanner teclado=new Scanner(System.in);
	short prueba=32767;

	//Desarrollo del programa
	System.out.println("Cómo te llamas?");
	nombre=teclado.nextLine();

	System.out.println("Hola, "+ nombre +". Voy a calcular tu edad. Dime en que año estamos");
	aActual = teclado.nextInt();
	System.out.print ("Ahora dime en que año naciste:");
	aNacim = teclado.nextInt();
	edad = aActual-aNacim;
	System.out.println("\t\tEl próximo año tendrás "+ (edad + 1) +" años"); // Para indicar la edad del próximo año se debe añadir un año

	//edad--;
	System.out.println("\t\tAlmaceno "+nombre+" , que tiene "+ edad-- +" años. Adios!");
	//prueba++;
	System.out.println("Valor máximo para el tipo de dato short:" +prueba);
	}
}
