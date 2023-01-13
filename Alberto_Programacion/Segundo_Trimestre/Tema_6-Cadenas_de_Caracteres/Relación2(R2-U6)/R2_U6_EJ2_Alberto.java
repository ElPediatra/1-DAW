import java.util.Scanner;

public class R2_U6_EJ2_Alberto {
        public static void main(String[] args) {

            //Definimos las variables
            Scanner teclado = new Scanner(System.in);
            String frase;
            String fraseInvertida;

            //Desarrollamos el programa
            System.out.println("En este programa, intentaremos invertir la frase que escribas.");
            System.out.println("Por favor, indica tu frase: ");
            frase = teclado.nextLine(); //Capturo la frase
            
            fraseInvertida = invertirFrase(frase, frase.length()-1); //Mando al método con lenghth-1 (solo me funciona así)
            System.out.println("La frase invertida es " + fraseInvertida);
            teclado.close();
        }

        //Método para invertir la frase
        static String invertirFrase(String frase, int posicion){
            if(posicion == 0){ //Si ya ha llegado a la posición 0 cierra
                return frase.charAt(0) + "";
            } else { //Si todavía no ha llegado a la posición 0, manda la letra de la posición y aplico de nuevo el método restanto una posición al char
            char letter = frase.charAt(posicion);
            return letter + invertirFrase(frase, posicion-1);
            }
        }
    }
