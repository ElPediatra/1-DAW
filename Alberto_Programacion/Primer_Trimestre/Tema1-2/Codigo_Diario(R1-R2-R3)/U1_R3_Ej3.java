import java.util.Scanner;
public class U1_R3_Ej3{ //Nombre del archivo
	public static void main(String[]args){
	//Definición de variables
	byte edad;
	Scanner teclado=new Scanner(System.in);
	boolean mayorEdad=true;

	//Desarrollo del problema

	System.out.println("Dime cual es tu edad:");
	edad=teclado.nextByte();
	mayorEdad=(edad>=18);
	System.out.println ("Mayoría de edad "+mayorEdad);

	}

}
