//Alberto Gómez Morales -- 1º DAW -- Actividades de Aplicación

/*
 * Realiza un programa que convierta un número decimal en su
 * representación binaria. Hay que tener en cuenta que
 * desconocemos cuántas cifras tiene el número que introduce el
 * usuario. Por simplicidad, irémos mostrando el número binario
 * con un dígito por línea.
 */

import java.util.Scanner;

public class U3_R3_Ej3_11_Alberto {
    public static void main(String[] args){
    
        //Desarrollamos las variables
        int decimal;
        int modulo;
        String binario="";
        Scanner teclado=new Scanner (System.in);

        System.out.println("Buenas, indica un número decimal (base 10) y lo pasaré a binario: ");
        decimal=teclado.nextInt();

        while (decimal>0){
            modulo = decimal%2;
            binario = modulo + binario;
            decimal = decimal/2;
        }

        System.out.println("El número " + decimal + "en binario sería: " + binario);


        // OTRA MANERA DE HACERLO

        /*
        int binario[] = new int[40];
        int decimal;
        int auxiliar = 0;
        Scanner teclado=new Scanner (System.in);

        System.out.println("Buenas, indica un número decimal (base 10) y lo pasaré a binario: ");
        decimal=teclado.nextInt();

        System.out.println("El número " + decimal + "En binario sería: ");

        while (decimal > 0){
            binario[auxiliar++] = decimal%2;
            decimal = decimal/2;
        }
        for (int i = auxiliar-1;i>=0;i--) {
            System.out.print(binario[i]);
        }
         */
    }
}