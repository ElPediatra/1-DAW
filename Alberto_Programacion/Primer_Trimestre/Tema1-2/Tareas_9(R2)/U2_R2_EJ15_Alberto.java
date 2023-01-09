//Alberto Gómez Morales -- Ejercicio 15 Libro

//Escribe una aplicación que solicite por consola dos números reales que corresponden a la base y la altura de un triángulo.
//Deberá mostrarse su área, comprobando que lo números introducidos por el usuario no son negativos, algo que no tendría sentido.

import java.util.Scanner;

public class U2_R2_EJ15_Alberto {
    public static void main(String[] args) {

        // Declaramos las variables
        double base;
        double altura;
        double area;
        Scanner teclado = new Scanner(System.in);

        // Desarrollamos el programa
        System.out.println("Voy a calcular el área del triángulo que me indiques:");
        System.out.println("Indicame cuánto mide la base del triángulo: ");
        base = teclado.nextDouble();

        System.out.println("Ahora indicame cuanto mide su altura: ");
        altura = teclado.nextDouble();

        if (base < 0 || altura < 0) {
            System.out.println("El número no puede ser 0 o negativo, prueba otra vez");
        } else {

            area = base * altura / 2;

            System.out.println(
                    "El área del triángulo es: " + area);
        }
    }
}