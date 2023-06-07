//Alberto Gómez Morales - 1º DAW - Ejercicios Recuperación Junio Primer Trimestre

/*
 * 6.- Indique el orden de evaluación de los operadores en cada una de las siguientes instrucciones en Java, y muestre el valor de x después de ejecutar cada una de ellas:
 *      a) x = 7 + 3 * 6 / 2 - 1;
 *      b) x = 2 % 2 + 2 * 2 - 2 / 2;
 *      c) x = (3 *  9 * (3 + (9 * 3 / (3))));
 */

public class T2_R1_Ej6_GomezMorales_Alberto {
    public static void main(String[] args){
        /* Variables */
        int x;

        //a) --> Ejecuta: Primero 3 * 6 = 18 --> Segundo 18 / 2 = 9 --> Tercero 7 + 9 - 1 = 15;
        x = 7 + 3 * 6 / 2 - 1;
        System.out.println(x);
        
        //b) --> Ejecuta: Primero 2 % 2 = 0 --> Segundo 2 * 2 = 4 --> Tercero 2 / 2 = 1 --> Cuarto 0 + 4 - 1 = 3
        x = 2 % 2 + 2 * 2 - 2 / 2;
        System.out.println(x);

        //C) --> Ejecuta: Primero (27 * (3 + (9)) --> Segundo: (27 * (12)) --> Tercero 27 * 12 = 324
        x = (3 * 9 * (3 + (9 * 3 / (3))));
        System.out.println(x);
    }
}