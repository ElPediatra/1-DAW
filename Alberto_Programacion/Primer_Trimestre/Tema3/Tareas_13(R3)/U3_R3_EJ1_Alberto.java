//Alberto Gómez Morales -- Tablas de multiplicar

import java.util.Scanner;

public class U3_R3_EJ1_Alberto {
    public static void main(String[] args) {
        //Definimos las variables
        Scanner teclado=new Scanner(System.in);
        
        //Desarrollamos el programa
        
        //Primer bucle para la tabla
        System.out.println("Voy a indicar las tablas del 10 al 1:");
        for (int i=10;i>0;i--) {

            //Segundo bucle para el multiplicador
            System.out.println("Tabla del "+ i +":");
            for (int j=1;j<11;j++){
                System.out.println("\t\t"+i+"x"+j+"="+i*j);
            }
        }

        System.out.println("Listo, hasta la próxima!");
    }
}