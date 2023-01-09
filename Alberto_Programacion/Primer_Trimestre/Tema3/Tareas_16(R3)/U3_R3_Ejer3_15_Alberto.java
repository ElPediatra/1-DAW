//Alberto Gómez Morales -- 1º DAW -- Actividades de Aplicación

/*
 * Diseña una aplicación que dibuje el triángulo de Pacal, para
 * n filas. Numerando las filas y elementos desde 0, la fórmula
 * para obtener el m-ésimo elemento de la n-ésima fila es:
 * E(n, m) = n!/(m!*(n-m)!). Donde n! es el factorial de n.
 * 
 * Un ejemplo de triángulo de Pascal con 5 filas (n = 4) es:
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 */

import java.util.Scanner;

public class U3_R3_Ejer3_15_Alberto {
    public static void main(String[] args){
    
        //Desarrollamos las variables
        int filas;
        int auxiliar;
        Scanner teclado=new Scanner(System.in);

        //Desarrollamos el programa
        System.out.println("Indica el número de filas que quiere para el triángulo de Pascal: ");
        filas=teclado.nextInt();

        System.out.println("Este es el triángulo de Pascal: ");

        for(int i =0;i<filas;i++) {
            auxiliar = 1;

            for(int j=0;j<=i;j++) {
                System.out.printf(auxiliar + " ");
                auxiliar = auxiliar * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}