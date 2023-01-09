/*Importo los paquetes -- Scanner para que puedan introducir datos
y Math en caso de ser necesarias operaciones matemáticas complejas*/
import java.util.Scanner;
import java.lang.Math;

//Indico el nombre del archivo y lo inicio
public class practico20221026_alberto {
	public static void main(String []args){

	//Defino las variables (byte, int, double, char, short, long, boolean...).

	Scanner teclado=new Scanner(System.in);
	long nombre; //Falla la variable, no recuerdo la adecuada para letras
	byte opcion;

	/* Variables de la opción 1 */
	int numCubo;
	int cuboResultado;

	/* Variables de la opción 2 */
	int numParImpar;
	int resto;

	/* Variables de la opción 3 */
	int hombres;
	int mujeres;
	int totalClase;
	double porcentajeHombre;
	double porcentajeMujer;

	//Desarrollo el programa solicitado
	System.out.println("Buenas, indique su nombre para poder dirigirme correctamente a usted: ");
	nombre = teclado.nextLong(); //Obtenemos el nombre del usuario para poder personalizar el menú

	/* Personalizo la bienvenida al usuario e indico las diferentes opciones que tiene el programa */
	System.out.println("Buenas " + nombre + ", este programa tiene 4 opciones que podrás seleccionar.");
	System.out.println("En la primera opción (1), calcularé el cubo de un número que me indiques.");
	System.out.println("En la segunda opción (2), comprobaré si el número que has indicado es par o impar.");
	System.out.println("En la tercera opción (3), indicaré el procentaje de hombres y mujeres en un aula dependiendo de la cantidad de personas de cada sexo que me hayas indicado.");
	System.out.println("La cuarta opción (4), cerrará el menú.");

	/* Le solicito al usuario la opción que va a querer usar */
	System.out.println("Bueno " + nombre + ", indicame la opción que quieres usar. Recuerda que están enumeradas del 1 al 4.");
	opcion = teclado.nextByte();

	/* Ejecuto un switch para crear el menú, dependiendo de la opción del usuario se ejecutará una opción u otra, también he habilitado
	un default en caso de que la opción marcada no esté entre las indicadas */

	switch (opcion){
		case (1): { //Opción 1 (Calcular el cubo del número indicado por el usuario)
			System.out.println(nombre + " has seleccionado la opción de calcular el cubo de un número.");
			System.out.println("Indicame el número al que quieres que calcule su cubo.");
			numCubo = teclado.nextInt();

			cuboResultado = numCubo * numCubo * numCubo; //Calculo el cubo del número indicado por el cliente con otra variable (auxiliar), tambien podría indicarlo directamente en el texto final con la operación

			System.out.println(nombre + ", el cubo del número " + numCubo + " que has indicado es " + cuboResultado);
			}
		break;
		
/* NO HE CONSEGUIDO SOLUCIONARLO, LO DEJO EN COMENTARIOS PERO LA IDEA ERA COMPARAR EL RESTO Y DEPENDIENDO DE SI DA 0 Y OTRO NUMERO INDICAR SI ES PAR O IMPAR

		case (2): {//Opción 2 (Verificar si el número indicado por el usuario es par o impar)
			System.out.println(nombre + " has seleccionado la opción de comprobar si un número es par o impar.");
			System.out.println("Por favor, indicame el número que quieres que compruebe: ");
			numParImpar = teclado.nextInt();
			
			resto = numParImpar ? 2 = 0;

			 	if (resto = 0) {
				System.out.println(nombre + "el número" + numParImpar + " que has indicado es par");
				} else {
					System.out.println(nombre + "el número" + numParImpar + " que has indicado es inpar");
				}
			}
		break;
*/

		case (3): {//Opción 3 (Calcular el porcentaje de hombres y mujeres, indicados por el usuario)
			System.out.println(nombre + " has seleccionado la opción de calcular el porcentaje de hombres y mujeres en una clase.");

			System.out.println("Indicame el número de hombres en el aula: "); //Solicitamos el número de hombres y mujeres en el aula
			hombres = teclado.nextInt();			
			System.out.println("Indicame el número de mujeres en el aula: ");
			mujeres = teclado.nextInt();

			totalClase = hombres + mujeres; //Calculo el total de la clase

			porcentajeHombre = (hombres * 100) / totalClase; //Calculo el porcentaje de hombres y luego lo resto al 100% para obtener el de mujeres
			porcentajeMujer = 100 - porcentajeHombre;

			System.out.println(nombre + "el porcentaje de nombres en el aula es del " + porcentajeHombre + "% y el de mujeres es del " + porcentajeMujer + "%.");

		}
	break;


case (4): {//Opción 4 (Salir del menú)
	System.out.println("Procedo a cerrar el menú, ha sido un placer " + nombre);
}
	break;

default:
	System.out.println("Perdona " + nombre + ", la opción que has indicado no es correcta.");


		}
	}
}
