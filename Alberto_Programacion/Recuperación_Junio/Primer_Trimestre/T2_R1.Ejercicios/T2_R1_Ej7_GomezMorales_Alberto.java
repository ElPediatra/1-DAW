//Alberto Gómez Morales - 1º DAW - Ejercicios Recuperación Junio Primer Trimestre

/*
 * 7.- Escriba una apliación que muestre los números del 1 al 4 en la misma línea, con cada par de número adyacentes separado pro un espacio. Use las siguientes técnicas:
 *      a) Mediante una instrucción System.out.println.
 *      b) Mediante cuatro instrucciones System.out.print.
 *      c) Mediante una instrucción System.out.printf.
 */

public class T2_R1_Ej7_GomezMorales_Alberto {
    public static void main(String[] args){

        //a)
        System.out.println("1 2 3 4");

        //b)
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4");

        //c)
        System.out.println(); //Pongo esta para separar del print anterior
        System.out.printf("1 2 3 4");
    }
}