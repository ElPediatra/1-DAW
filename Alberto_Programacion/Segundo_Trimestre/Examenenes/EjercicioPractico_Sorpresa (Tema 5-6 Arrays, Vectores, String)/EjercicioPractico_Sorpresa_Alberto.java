/*
 * Desarrolla el juego de la cámara secreta, que consiste en abrir la cámara mediante su combinación
 * secreta que está formado por una combinación de números del 1 al 5. El jugador especificará cual
 * es la longitud de la combinación, a mayor longitud, mayor será la dificultad del juego. La apliación
 * genera de forma aleatoria una combinación secreta que el usuario tendrá que acertar. En cada intento
 * se muestra como pista para cara dígito de la combinación introducida por el jugador si es mayor, menor
 * o igual que el correspondiente en la combinación secreta.
 * 
 * 1º Se abre ventana para que el J1 la longitud de la clave que quiere descifrar para crear la clave aleatoria
 * con la longitud indicada.
 * 
 * 2º Se le pide a J1 que escriba la clave que creea que es correcta
 * 
 * 3º Se compara con la clave que se ha generado aleatoriamente
 * 
 * 4º Se le indica al jugador si ha acertado, en caso contrario se le dará pistas sobre cada posición en relación al número que ha escrito
 */

import java.util.Scanner;
import java.util.Random;

public class EjercicioPractico_Sorpresa_Alberto {
  public static void main(String[] args) {

    //Definimos las variables
    Scanner teclado = new Scanner(System.in);
    int longitud;
    int intentos = 0;
    //boolean correcto = true; (Si lo pongo aquí, no me funciona el bucle)
    Random aleatorio = new Random();


    //Desarrollamos el programa

    /* Pedimos la longitud que quiere que tenga la clave */
    System.out.print("Indicame la longitud de la combinación secreta (número entre 1 y 5): ");
    longitud = teclado.nextInt();
    int[] combinacionSecreta = new int[longitud];

    /* Generamos la clave secreta*/
    for (int i = 0; i < longitud; i++) {
      combinacionSecreta[i] = aleatorio.nextInt(5) + 1; // +1 porque empieza por 0
    }

    /* Pedimos la clave secreta al jugador */
    while (true) { //Bucle infinito, no parará hasta que se acierte la clave boolean correcto (si la defino fuera el programa no la carga y no sale nunca)
      System.out.print("Escribe la combinación secreta para abrir la cámara, ten en cuenta que tienes que escribir el número de 1 en 1: ");
      int[] combinacionJugador = new int[longitud];
      for (int i = 0; i < longitud; i++) {
        combinacionJugador[i] = teclado.nextInt();
      }

      // Verificamos si la combinación es correcta
      boolean correcto = true;
      for (int i = 0; i < longitud; i++) {
        if (combinacionJugador[i] != combinacionSecreta[i]) {
          correcto = false;
          break;
        }
      }

      if (correcto) { /* Si se correcto muestro el mensaje y cierro el bucle */
        System.out.println("¡Combinación correcta! Has abierto la cámara secreta en " + intentos + " intentos.");
        break;
      } else { /* Si no es correcto, indico pistas sobre cada posición del código */
        System.out.println("Pista: ");
        for (int i = 0; i < longitud; i++) {
          if (combinacionJugador[i] > combinacionSecreta[i]) { /* Se añade +1 ya que las posiciones del array empiezan por 0 */
            System.out.println("El número de la posición " + (i + 1) + " es muy grande.");
          } else if (combinacionJugador[i] < combinacionSecreta[i]) {
            System.out.println("El número de la posición " + (i + 1) + " es muy pequeño.");
          } else {
            System.out.println("El número de la posición " + (i + 1) + " es correcto.");
          }
        }

        /* Para que salte a la siguiente fila y vuelva a pedir la clave o cerrarlo, añadiendo un intento */
        System.out.println();
        intentos++;
      }
    }
    teclado.close();
  }
}
