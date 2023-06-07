//Alberto Gómez Morales - 1º DAW - Ejercicios Recuperación Junio Primer Trimestre

/*
 * 2.- Escriba declaraciones, instrucciones o comentarios para realizar cada una de las siguientes tareas:
 *      a) Indicar que un programa calculará el producto de tres enteros.
 *      b) crear un objeto Scanner llamado entrada que lea valores de entrada estándar.
 *      c) Declarar las variables x, y, z y resultado de tipo int.
 *      d) Pedir al usuario que escriba el primer entero.
 *      e) Leer el primer entero del usuario y almacenarlo en la variable x.
 *      f) Pedir al usuario que escriba el segundo entero.
 *      g) Leer el segundo entero del usuario y almacenarlo en la variable y.
 *      h) Pedir al usuario que escriba el tercer entero.
 *      i) Leer el tercer entero del usuario y almacenarlo en la variable z.
 *      j) Calcular el producto de los tres enteros contenidos en las variables x, y y z, y asignar el resultado a la variable resultado.
 *      k) Usar System.out.printf para mostrar el mensaje "El producto es", seguido del valor de la variable resultado.
 * 
 *  3.- Utilice las instrucciones que escribió en el ejercicio 2.5 para escribir un programa completo que calcule e imprima el producto de tres enteros.
 */

/* Imports */
import java.util.Scanner;

public class T2_R1_Ej2yEj3_GomezMorales_Alberto {
   public static void main(String[] args){

       //a)
       System.out.println("En este programa se calculará el producto de tres números enteros.");

       //b)
       Scanner teclado = new Scanner(System.in);

       //c)
       /* Variables */
       int x;
       int y;
       int z;
       int resultado;

       //d)
       System.out.println("Indique el primer número entero: ");

       //e)
       x = teclado.nextInt();

       //f)
       System.out.println("Indique el segundo número entero: ");

       //g)
       y = teclado.nextInt();

       //h)
       System.out.println("Indique el tercer número entero: ");

       //i)
       z = teclado.nextInt();

       //j)
       resultado = x * y * z;

       //k)
       System.out.printf("El producto es " + resultado);

       teclado.close();
   }
}