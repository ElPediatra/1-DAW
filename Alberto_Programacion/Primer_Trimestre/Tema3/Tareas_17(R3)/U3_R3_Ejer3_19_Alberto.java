//Alberto Gómez Morales -- 1º DAW -- Actividades de Aplicación

/*
 * Calcula la raíz cuadrada de un número natural mediante
 * aproximaciones. En el caso de que no sea exacta, muestra el resto.
 * Por ejemplo, par calcular la raíz cuadrada de 23, probamos 1(2)=1
 * 2(2)=4, 3(2)=9, 4(2)=16,5(2)=25 (nos pasamos), resultando 4 la
 * raíz cuadrada de 23 con un resto de (23-16) de 7.
 */

import java.util.Scanner;

public class U3_R3_Ejer3_19_Alberto {
    public static void main(String[] args) {

        //Declarar variables
        int numero;
        int raiz = 0;
        int resto;
        Scanner teclado=new Scanner(System.in);

        //Desarrollamos el programa
        System.out.println("Vamos a calcular la raíz cuadrada de un número natural mediante aproximaciones.");
        System.out.println("Indique el número: ");
        numero=teclado.nextInt();

        for(int i=0;i*i<=numero;i++){raiz=i;}

        resto=numero-raiz*raiz;

        if(resto==0){
            System.out.println("La raíz cuadrada de "+ numero +" es " +raiz);
        }
        else{
            System.out.println("La raíz cuadrada de "+ numero +" es "+ raiz +" con resto "+ resto);
        }
    }
}