/*
 * Alberto Gómez Morales -- Ejercicio 13 Libro Tema 4
 * Crea la función 'muestraPares(int n)' que muestre por consola los primeros n números pares.
 */


    import java.util.Scanner; //Importación de paquetes

    public class U4_R3_Ejercicios_4_13_Alberto {
        public static void main(String[] args) {

            // Declaramos las variables
            int numero;
            Scanner teclado = new Scanner(System.in);

            // Desarrollamos el programa
            System.out.println("Indica la cantidad de números pares que quieres que escriba (empezaré a mostarlos desde 0):");
            numero = teclado.nextInt();

            System.out.println("Los primero/s " + numero + " número/s pares son: ");
            muestraPares(1,numero);
        }
        
        //Declaramos la función que se solicitia
        public static void muestraPares(int i, int x) {
            if(x>0){
                System.out.println(i*2);
                muestraPares(i+1, x-1);
            }
        }

    }
