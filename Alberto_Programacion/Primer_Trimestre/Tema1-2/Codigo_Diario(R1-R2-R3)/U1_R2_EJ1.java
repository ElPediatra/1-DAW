import java.time.LocalTime; //Estamos importando un paquete
import java.util.Scanner;
public class U1_R2_EJ1{
	public static void main(String[] args){
	//Declaracion variables
	final short SUELDO=200;
	short sueldo=0;
	LocalTime queHoraEsEnElEjido; //es obligatorio y la primera letra es siempre minúscula
	//LocalTime quehoraesenelejido no sigue la norma del buen programador y nos quita medio punto en el examen
	Scanner teclado=new Scanner(System.in);
	int edad=0; //Defino e inicializo
	//int es un número
	//float es un número con decimales
	float altura=0f;
	
	//Desarrollo del programa
	System.out.println("Mi sueldo es; " +sueldo);
	//SUELDO=SUELDO+100;
	System.out.println("Mi sueldo incrementado es; " +sueldo+"€");
	
	queHoraEsEnElEjido=LocalTime.now();
		System.out.println("Y tenemos de hora; "+queHoraEsEnElEjido); 
	
		System.out.println("Dime que edad tienes");
		edad=teclado.nextInt();
		System.out.println("Realmente tienes " +edad+"?");
		
		System.out.println("Dime que altura tienes");
		altura=teclado.nextFloat();
		System.out.println("Realmente tienes " +altura+"?");
	
	}//Fin_main






}//Fin_clase
