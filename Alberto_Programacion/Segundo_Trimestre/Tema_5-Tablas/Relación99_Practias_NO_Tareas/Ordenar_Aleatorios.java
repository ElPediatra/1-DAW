/*
 * Ejercicio para pedir números al usuario y mostrarlos:
 *  - De menor a mayor
 *  - De mayor a menor
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ordenar_Aleatorios {
  public static void main(String[] args) {

    //Definimos las variables
    Scanner teclado = new Scanner(System.in);
    System.out.print("Cuántos números desea ingresar: ");
    int n = teclado.nextInt();
    int[] numbers = new int[n];

    System.out.println("Ingrese los números:");
    for (int i = 0; i < n; i++) {
      numbers[i] = teclado.nextInt();
    }

    Arrays.sort(numbers);
    System.out.println("De mayor a menor:");
    for (int i = n - 1; i >= 0; i--) {
      System.out.println(numbers[i]);
    }

    System.out.println("De menor a mayor:");
    for (int i = 0; i < n; i++) {
      System.out.println(numbers[i]);
    }
  }
}