// Alberto Gomez Morales - 1º DAW - Programación - Ejercicio U3_Bucles

/*
 * 10.- Suponga que i = 1, j = 2, k = 3 y m = 2. . Que es lo que imprime cada una de las siguientes instrucciones?
 *      a) System.out.println(i == 1);
 *      b) System.out.println(j == 3);
 *      c) System.out.println((i >= 1) && (j < 4));
 *      d) System.out.println((m <= 99) & (k < m));
 *      e) System.out.println((j >= i) || (k == m));
 *      f ) System.out.println((k + m < j) | (3 – j >= k));
 *      g) System.out.println(!(k > m));
 */

public class U3_Bucles_Ej10_GomezMorales_Alberto {
    public static void main(String[] args){
        /* Variables */
        int i = 1;
        int j = 2;
        int k = 3;
        int m = 2;

        //a) Indica si el valor es true/false es decir, si el valor de i es 1 o no, en este caso mostrará 'true'
        System.out.println(i == 1);

        //b) Indica si el valor es true/false es decir, si el valor de j es 3 o no, en este caso mostrará 'false'
        System.out.println(j == 3);

        //c) Indica si el valor es true/false es decir, si el valor de i es mayor o igual que 1 y j es menor que 4, en este caso mostrará 'true'
        System.out.println((i >= 1) && (j < 4));

        //d) Indica si el valor es true/false es decir, si el valor de m es menor o igual que 1 y k es menor que m, en este caso mostrará 'false'
        System.out.println((m <= 99) & (k < m));

        //e) Indica si el valor es true/false en relación a las 2 peticiones solicitadas, solo que depende de 1 de ellas, no es necesario que se cumplan las 2, en este caso mostrará 'true'
        System.out.println((j >= i) || (k == m));

        //f) Indica si el valor es true/false en relación a las 2 peticiones solicitadas, solo que depende de 1 de ellas, no es necesario que se cumplan las 2, en este caso mostrará 'false'
        System.out.println((k + m < j) | (3 - j >= k));

        //g) Indica si el valor es true/false, en este caso con la petición de que el valor de k no sea mayor que el de m, pero como si lo es mostrará 'false'.
        System.out.println(!(k > m));

    }
}
