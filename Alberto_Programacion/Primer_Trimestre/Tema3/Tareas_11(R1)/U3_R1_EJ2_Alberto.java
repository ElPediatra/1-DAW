// Alberto Gómez Morales -- Ejercicio 3.2 Libro - Página 74

/*
 * Implementar una aplicación para calcular datos estadísticos de las edades
 * de los alumnos de un centro educativo. Se introducirán datos hasta que uno de
 * ellos sea negativo, y se mostrará: la suma de todas las edades introducidas,
 * la media, el número de alumnos y cuántos son mayores de edad.
*/

//Se debe resolver con "while".

import java.util.Scanner;
public class U3_R1_EJ2_Alberto {
    public static void main(String[] args) {

    //Defino las variables
    Scanner teclado=new Scanner(System.in);
    byte edad=0;
    int edades=0;
    float alumnos=0;
    float mediaEdades=0;
    int mayoresEdad=0;

    //Desarrollo el programa
    System.out.println("Vamos a revisar la edad de los alumnos del centro, así como la media y la cantidad de mayores de edad.");

    //Pedir la edad
    System.out.println("Introduce la edad del alumno: ");
    edad=teclado.nextByte();
    while(edad>0) {

    //Sumamos las edades para el total
    edades+=edad;

    //Comprobamos si es mayor de edad y sumamos de ser así
    if(edad>=18){
        mayoresEdad+=1;
    }

    //Pido la edad de otro alumno hasta que indique un negativo
    System.out.println("Introduce otra edad: ");
        edad=teclado.nextByte();
        alumnos+=1;
    }
    //Calculo la edad media.
    mediaEdades=edades/alumnos;

    System.out.println("El recuento ha finalizado, voy a mostrate los datos.");
    System.out.println("La suma de las edades total es: "+ edades);
    System.out.println("El numero total de alumnos es: "+ alumnos);
    System.out.println("La media de las edades es: "+ mediaEdades);
    System.out.println("En el centro hay un total de "+ mayoresEdad +" de alumnos mayores de edad.");

    }
}