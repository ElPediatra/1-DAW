//Alberto Gómez Morales - 1º DAW - Ejercicios Recuperación Junio Primer Trimestre

/*
 * 4.- Escriba instrucciones en Java que realicen cada una de las siguientes tareas:
 *      a) Mostrar el mensaje "Escriba un entero: ", dejando el cursos en la misma línea.
 *      b) Asignar el producto de las variables b y c a la variable a.
 */

/* Imports */
import java.util.Scanner;

public class T2_R1_Ej4_GomezMorales_Alberto {
    public static void main(String[] args){
        /* Variables */
        int a;
        int b;
        int c;
        Scanner teclado = new Scanner(System.in);

        //a)
        System.out.print("Escriba unentero: ");
        
        //b)
        b = teclado.nextInt();
        c = 12;

        a = b * c;

        System.out.println("Valor de B: " + b + "\nValor de C: " + c + "\nValor de A (producto de 'b' y 'c'): " + a);

        teclado.close();
    }
}
