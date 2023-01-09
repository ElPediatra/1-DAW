//Alberto Gómez Morales -- Ejercicio 16 Libro

//Utiliza el operador ternario para calcular el valor absoluto de un número que se solicita al usuario por teclado.

import java.util.Scanner;
public class U2_R2_EJ16_Alberto {
    public static void main(String[] args) {
        // Declaramos las variables
        int num;
        Scanner teclado = new Scanner(System.in);

        // Desarrollamos el programa
        System.out.println("Indicame un número y te calcularé su valor absoluto: ");
        num = teclado.nextInt();
        num = num < 0 ? num * -1 : num;

        System.out.println("El valor absoluto de tu número es: " + num);
    }
}