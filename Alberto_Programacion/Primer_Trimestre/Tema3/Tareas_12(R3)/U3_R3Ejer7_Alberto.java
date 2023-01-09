//Alberto Gómez Morales -- 1º DAW -- Relación Ejercicios 3 (Tema 3 Moodle)

/*
 * 7. Escribir un programa en Java que multiplique los 20 primeros número naturales
 * (1*2*3*4*5…).
 */

public class U3_R3Ejer7_Alberto {
    public static void main(String[] args) {

        //Declaramos las variables
        long resultado=1;

        //Desarrollamos el programa
        for (int i = 1; i < 21; i++){
            resultado=resultado*i;
        }
        System.out.println(resultado);
    }
}