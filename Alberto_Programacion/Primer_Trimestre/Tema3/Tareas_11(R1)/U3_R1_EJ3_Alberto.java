// Alberto Gómez Morales -- Ejercicio 3.3 Libro - Página 75

/*
 * Codificar el juego <<el número secreto>>, que consiste en acertar un
 * número entre 1 y 100 (generado aleatoriamente). Para ello se introduce
 * por teclado una serie de números, para los que se indica <<mayor>> o
 * <<menor>>, según sea mayor o menor con respecto al número secreto. El
 * proceso termina cuando el usuario acierta o cuando se rinde (introduc-
 * iendo un -1).
*/

import java.util.Scanner;

public class U3_R1_EJ3_Alberto {
    public static void main(String[] args) {

        //Defino las variables
        Scanner teclado=new Scanner(System.in);
        byte secreto,dato;
        byte contadorIntentos=0;
        String mensaje;

        //Desarrollo el programa
        System.out.println("¡Bienvenido a <<el número secreto>>!");

        //1.Genero un nº aleatorio entre 1 y 100
        secreto=(byte) (Math.random()*100+1);

        /*
         * System.out.println("Números aleatorios:");
         * for (int i=1;i<101;i++){
         * secreto=(byte)(Math.random()+100+1);
         * System.out.println(secreto);
         */

         //2.Le pido un número al usuario
         System.out.println("¿Cuál es el número secreto entre el 1-100?");
         dato=teclado.nextByte();

         //4.Monto el bucle while
         while(dato!=-1){
            //3.Compruebo si ha acertado o no y le doy pista
            if(dato==secreto){
                System.out.println("¡¡HAS ACERTADO!! El número es "+secreto);

                dato=-1;
            }else{
                mensaje=(secreto>dato)?" Mayor":" Menor";
                System.out.println("PISTA: El nº escondido es"+mensaje);
                System.out.println("¿Cuál es el número sectro entre el 1-100?");
                dato=teclado.nextByte();

                //5.Añado el número de intentos que ha usado
                contadorIntentos++;
            }
         }
        
        System.out.println("¡Lo has conseguido en "+contadorIntentos+" intentos!");
    }
}