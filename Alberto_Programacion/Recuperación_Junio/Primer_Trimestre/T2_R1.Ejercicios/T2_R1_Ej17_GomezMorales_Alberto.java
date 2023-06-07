//Alberto Gómez Morales - 1º DAW - Ejercicios Recuperación Junio Primer Trimestre

/*
 * 17.- Escriba una aplicación que muestre un patrón de tablero de damas, como se muestra a continuación:
 * * * * * * * * * 
 *  * * * * * * * *
 * * * * * * * * * 
 *  * * * * * * * *
 * * * * * * * * * 
 *  * * * * * * * *
 * * * * * * * * * 
 *  * * * * * * * *
 */

public class T2_R1_Ej17_GomezMorales_Alberto {
    public static void main(String[] args){
        for(int i=1; i<9;i++){
            if(i%2==0){
                System.out.println(" * * * * * * * *");
            } else {
                System.out.println("* * * * * * * * ");
            }
        }       
    }
}