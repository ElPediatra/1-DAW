//Alberto Gómez Morales -- Ejercicio 13 Libro -- En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales.
//El número de animales que alimentar (todos de la misma especie) es numAnimales, y sabemos que cada animal come una media de kilosPorAnimal.
//Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos de alimento suficiente para cada animal.
//En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno de los animales.
//Nota: Evitar que la aplicación realice divisiones por cero.

import java.util.Scanner;
public class U2_R2_EJ13_Alberto{
	public static void main(String []args){

	//Declarar variables
	int comidaDiaria,numAnimales,kilosPorAnimal;
	Scanner teclado=new Scanner(System.in);
	
    //Desarrollo del programa
    //Obtenemos los datos para las operaciones
	System.out.println("Vamos a revisar si hay alimento suficiente para todos los animales.");
    System.out.println("Indica la cantidad de comida que has comprado en Kg:");
	comidaDiaria = teclado.nextInt();

	System.out.println("Indica el número de animales que hay que alimentar:");
	numAnimales = teclado.nextInt();

	System.out.println("Dime la cantidad media en kilos que come cada animal:");
	kilosPorAnimal = teclado.nextInt();

	if(numAnimales<=0){//Descarto divisón por 0 o menor como solicita el ejercicio
		System.out.println("No hay animales, no hace falta comida.");
	} else{//Vemos si hay suficiente alimento
	
    if(numAnimales*kilosPorAnimal<=comidaDiaria){
	    System.out.println("Hay alimento suficiente para los animales.");
	} else{//En caso de no haber suficiente alimento, calculamos cuánto hay que darle a cada animal (lo calculamos directamente con float)
	    System.out.println("No hay alimento suficiente para los animales, hay que recortar la comida diaria.");
		System.out.printf("%s %.2f%s","Cada animal podrá tomar ",((float) comidaDiaria / numAnimales),"kg de alimento si queremos alimentarlos a todos.");
	      }
	}

	}
}

