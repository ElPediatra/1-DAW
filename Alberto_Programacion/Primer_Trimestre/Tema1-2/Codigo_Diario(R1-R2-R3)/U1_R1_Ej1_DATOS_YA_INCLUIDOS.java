public class U1_R1_Ej1_DATOS_YA_INCLUIDOS{ //Nombre del archivo sin formato
public static void main(String []args){
	// Definición de variables

	byte edad; //Defino byte
	short prueba=0; //Defino short e inicializo a X (en este caso 0)
	float altura=0.0f; //Defino float -- Hay que añadir f en el número para que cargue como float
	double sueldo=100.50; //Defino double para mi "sueldo"
	boolean hombre=true; //Defino boolean
	char sexo= 'H'; //Defino char
	String nombre="Alberto Gómez";

	// Desarrollo del programa
	System.out.println("Hola mundo. ¿Quién ha hecho la danza del brum brum?"); //Impresión de texto
	/* Este comentario va a ser
	muy largo, tan largo
	como necesite */

	edad=10;
	System.out.println("La edad es: "+edad); //Impresión de edad

	prueba= 200;
	System.out.println("La edad incrementada es: "+prueba); //Impresión de edad

	altura=1.80f;
	System.out.println("La altura es: "+altura+" metros"); //Impresión de altura
	System.out.println("Nuestro sueldo es de "+sueldo+" miseros euros"); //Impresión sueldo

	hombre=false;
	System.out.println("Yo soy un hombre?: "+hombre); //Impresión helicoptero
	System.out.println("Mi sexo es: "+sexo); //Impresión sexo
	System.out.println("Mi nombre es: "+nombre); //Impresión nombre

	}//Fin del método principal
}
//Fin de la clase
