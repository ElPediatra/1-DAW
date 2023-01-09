//Alberto Gómez Morales -- 1º DAW -- Relación Ejercicios 3 (Tema 3 Moodle)

/*
 * 8. Escribir un programa en Java que sume los cuadrados de los cien primeros números
 * naturales, mostrando el resultado en pantalla.
 */

public class U3_R3Ejer8_Alberto {
    public static void main(String[] args) {

        //Declaramos las variables
        long resultado=1;

        //Desarrollamos el programa
        for (int i = 2; i < 101; i++){
            resultado=resultado+i*i;
        }
        System.out.println(resultado);
    }
}