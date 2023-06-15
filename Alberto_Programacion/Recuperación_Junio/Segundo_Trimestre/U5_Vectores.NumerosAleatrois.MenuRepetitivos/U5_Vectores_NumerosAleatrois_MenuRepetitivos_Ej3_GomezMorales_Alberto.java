//Alberto Gómez Morales - 1º DAW - Programación

/*
 * 3. De los 300 primeros números decir cuantos hay múltiplos de 11, y almacenarlos en un vector.
 */

public class U5_Vectores_NumerosAleatrois_MenuRepetitivos_Ej3_GomezMorales_Alberto {
    public static void main(String[] args) {
        int aux = 300; //Límite que pongo para el Array
        int[] array = new int[aux / 11];

        int contador = 0;

        // Buscar múltiplos de 11 y almacenarlos en el Array
        for (int i = 1; i <= aux; i++) {
            if (i % 11 == 0) {
                array[contador] = i;
                contador++;
            }
        }

        System.out.println("Cantidad de múltiplos de 11: " + contador);
        System.out.println("Múltiplos de 11 que hay en el Arrat:");
        for (int i = 0; i < contador; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
