//Alberto Gómez Morales - 1º DAW - Ejercicios Recuperación Junio Primer Trimestre

/*
 * 19.- Escriba una aplicación que muestre los equivalentes enteros de algunas letras en mayúsculas, en minúsculas, dígitos y símbolos especiales. Muestre los equivalentes enteros de los siguientes caractéres: A B C a b c 0 1 2 $ * + / y el carácter en blanco.
 */

public class T2_R1_Ej19_GomezMorales_Alberto {
    public static void main(String[] args){
        /* Variables */
        char aMayus = 'A';
        char aMinus = 'a';
        char bMayus = 'B';
        char bMinus = 'b';
        char cMayus = 'C';
        char cMinus = 'c';
        char cero = '0';
        char uno = '1';
        char dos = '2';
        char dolar = '$';
        char asterisco = '*';
        char barra = '/';
        char blanco = ' ';

        /* Desarrollo del programa */
        System.out.println((int) aMayus); //65
        System.out.println((int) aMinus); //97
        System.out.println((int) bMayus); //66
        System.out.println((int) bMinus); //98
        System.out.println((int) cMayus); //67
        System.out.println((int) cMinus); //99
        System.out.println((int) cero); //48
        System.out.println((int) uno); //49
        System.out.println((int) dos); //50
        System.out.println((int) dolar); //36
        System.out.println((int) asterisco); //42
        System.out.println((int) barra); //47
        System.out.println((int) blanco); //32
    }
}
