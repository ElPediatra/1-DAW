//Alberto Gómez Morales - 1º DAW - Ejercicios Recuperación Junio Primer Trimestre

/*
 * 5.- Suponiendo que x=2 y y=3, ¿qué muestra cada una de las siguientes instrucciones?
 *      a) System.out.printf("x = %d%n", x);
 *      b) System.out.printf("El valor de %d + %d es %d%n", x, x, (x+x));
 *      c) System.out.printf("x =");
 *      d) System.out.printf("%d = %d%n", (x+y), (y+x));
 */

public class T2_R1_Ej5_GomezMorales_Alberto {
    public static void main(String[] args){
        /* Variables */
        int x = 2;
        int y = 3;

        /* Muestra de datos */

        //a) --> Muestra 'x = 2'
        System.out.printf("x = %d%n", x);

        //b) --> Muestra 'El valor de 2 + 2 es 4'
        System.out.printf("El valor de %d + %d es %d%n", x, x, (x+x));

        //c) --> Muestra 'x ='
        System.out.printf("x =");

        //d) --> Muestra '5 = 5'
        System.out.printf("%d = %d%n", (x+y), (y+x));
    }
}