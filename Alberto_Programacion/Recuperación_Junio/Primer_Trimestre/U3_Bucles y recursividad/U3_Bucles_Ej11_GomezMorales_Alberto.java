// Alberto Gomez Morales - 1º DAW - Programación - Ejercicio U3_Bucles

/*
 * 11.- (Ternas pitagóricas) Un triángulo rectángulo puede tener lados cuyas longitudes sean valores enteros.
 * El conjunto de tres valores enteros para las longitudes de los lados de un triángulo rectángulo se conoce como terna pitagórica.
 * Las longitudes de los tres lados deben satisfacer la relación que establece que la suma de los cuadrados de dos lados es igual
 * al cuadrado de la hipotenusa. Escriba una aplicación que muestre una tabla de las ternas pitagóricas para lado1, lado2 y la
 * hipotenusa, que no sean mayores de 500. Use un ciclo for triplemente anidado para probar todas las posibilidades. Este método es
 * un ejemplo de la computación de “fuerza bruta”.
 */

public class U3_Bucles_Ej11_GomezMorales_Alberto {
    public static void main(String[] args) {
        /* Variables */
        int lado1;
        int lado2;
        int hipotenusa;

        /* Desarrollamos el main */

        //Realizo bucles para ver varios casos
        for (lado1 = 1; lado1 <= 100; lado1++) {
            for (lado2 = 1; lado2 <= 100; lado2++) {
                for (hipotenusa = 1; hipotenusa <= 100; hipotenusa++) {
                    //Verifico si se cumple la terna pitagórica
                    if (lado1 * lado1 + lado2 * lado2 == hipotenusa * hipotenusa) {
                        //Muestro los resultado
                        System.out.println("Terna pitagórica: \n\tLado1 = " + lado1 +
                                "\n\tLado2 = " + lado2 + "\n\tHipotenusa = " + hipotenusa);
                    }
                }
            }
        }
    }
}
