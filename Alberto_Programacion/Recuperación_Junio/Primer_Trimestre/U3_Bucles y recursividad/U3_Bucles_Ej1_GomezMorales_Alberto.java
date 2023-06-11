// Alberto Gomez Morales - 1º DAW - Programación - Ejercicio U3_Bucles

/*
 * 1.- Escriba una instrucción o un conjunto de instrucciones en Java, para realizar cada una de las siguientes tareas:
 *      a) Sumar los enteros impares entre 1 y 99, utilizando una instrucción for. Suponga que se han declarado las variables enteras suma y cuenta.
 *      b) Imprimir los enteros del 1 al 20, utilizando un ciclo while y la variable contador i. Suponga que la variable i se ha declarado, pero no se ha inicializado. Imprima solamente cinco enteros por línea.
 *      c) Repita la parte (b), usando una instrucción for.
 */
public class U3_Bucles_Ej1_GomezMorales_Alberto{
    public static void main(String[] args){
        //a)
        int suma = 0;
        int cuenta = 0;

        for (int i = 1; i <= 99; i += 2) {
            suma += i;
            cuenta++;
        }

        System.out.println("La suma de los enteros impares entre 1 y 99 es: " + suma);
        System.out.println("Se encontraron " + cuenta + " números impares.");

        //b)
        int i = 1;
        int contador = 0;

        while (i <= 20) {
            System.out.print(i + " ");
            contador++;
    
            if (contador % 5 == 0) {
                System.out.println();  // Salto de línea después de imprimir cinco enteros
            }

            i++;
        }

        //c)
        for (int j = 1; j <= 20; j++) {
            System.out.print(j + " ");
            
            if (j % 5 == 0) {
                System.out.println();  // Salto de línea después de imprimir cinco enteros
            }
        }
    }
}