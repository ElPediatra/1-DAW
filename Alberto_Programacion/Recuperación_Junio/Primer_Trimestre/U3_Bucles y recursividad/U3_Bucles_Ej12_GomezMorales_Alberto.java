// Alberto Gomez Morales - 1º DAW - Programación - Ejercicio U3_Bucles

/*
 * 12.- ¿Que hace el siguiente segmento de programa?
 *  for (i = 1; i <= 5; i++)
 *   {
 *       for (j = 1; j <= 3; j++)
 *       {
 *           for (k = 1; k <= 4; k++)
 *               System.out.print(‘*’);
 *               System.out.println();
 *           } // fin del for interior
 *       System.out.println();
 *    } // fin del for exterior
 */

public class U3_Bucles_Ej12_GomezMorales_Alberto {
    public static void main(String[] args){
        /* Variables */
        int i;
        int j;
        int k;

        /* Desarrollamos el programa */

        //Muestra 3 líneas de 4 asteríscos 5 veces, separadas por una línea en blanco
        //****
        //****
        //****

        //****
        //****
        //****

        //****
        //****
        //****

        //****
        //****
        //****

        //****
        //****
        //****
        
        for (i = 1; i <= 5; i++){
            for (j = 1; j <= 3; j++){
                for (k = 1; k <= 4; k++)
                    System.out.print("*");
                    System.out.println();
            } // fin del for interior
            System.out.println();
        } // fin del for exterior
    }
}