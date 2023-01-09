//Alberto Gómez Morales -- 1º DAW -- Actividades de Aplicación

/*
 * Calcula la raíz cuadrada de un número natural mediante
 * aproximaciones. En el caso de que no sea exacta, muestra el resto.
 * Por ejemplo, par calcular la raíz cuadrada de 23, probamos 1(2)=1
 * 2(2)=4, 3(2)=9, 4(2)=16,5(2)=25 (nos pasamos), resultando 4 la
 * raíz cuadrada de 23 con un resto de (23-16) de 7.
 */

import java.util.Scanner;

public class alberto {
    public static void main(String[] args) {

        // Definimos las varibales
        int aux = 1;
        int resultado = 0;
        int resto = 0;
        int numero;
        int i = 1;
        int j = 2;
        int encontrado = 0;
        Scanner teclado = new Scanner(System.in);

        // Desarrollamos el programa
        System.out.println("Vamos a calcular la raíz cuadrada de un número natural mediante aproximaciones.");

        System.out.println("Indique el número: ");
        numero = teclado.nextInt();

         /*
         * j --> para poder llevar en cuenta la siguiente operación de cara al while
         * encontrado -> una vez lo tenemos, hacer la "interrupción" del while
         * 
         * el while lo primero que hace es siempre calcular el resto,
         * en caso de que sea 0 o la siguiente vuelta sea mayor el cálculo que
         * el número, termina y ponemos el valor de resultado al
         * mismo que la vuelta del while ( i ) resultado = i
         * que no es 0, pues a dar vueltas
         */

        while (i<=numero&&encontrado!=1){
            resto=numero - (i*i);
            if (resto==0||numero<=(j*j)){
                resultado=i;
                encontrado=1;
            }
            i++;
            j++;

        }

        System.out.println("La raiz de " + numero + " es: " + resultado + " con resto " + resto);
    }
}