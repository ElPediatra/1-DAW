//Alberto Gómez Morales -- Calcular X en una ecuación de segundo grado (ax2 + bx + c = 0)

import java.util.Scanner;
import java.lang.Math;

public class U2_R6_EJ2_Alberto {
    public static void main(String[] args){
    
    //Definimos las variables
    double a=0;
    double b=0;
    double c=0;
    double aux;
    String mensaje; // Mensaje de error de la ecuación
    double solu1; //Primera solución de la ecuación
    double solu2; //Segunda solución de la ecuación 
    Scanner teclado = new Scanner(System.in);

    //Pedimos los datos
    System.out.println("Dame los tres coeficientes de una ecuación de segundo grado.");
    System.out.println("Inserta el valor de 'a': ");
    a = teclado.nextDouble();
    System.out.println("Inserta el valor de 'b': ");
    b = teclado.nextDouble();
    System.out.println("Inserta el valor de 'c': ");
    c = teclado.nextDouble();

    //Desarrollamos el programa
        // Calculo el discriminante
        aux = ((b*b)-(4*a*c));
        if (aux<0){
            mensaje="No tiene soluciones reales";
        } else {
            if (a==0){
                mensaje="No es una ecuación de segundo grado, no puedo calcularla";
            }else{
                solu1=(-b + Math.sqrt(aux))/(2*a);
                solu2=(-b - Math.sqrt(aux))/(2*a);
                mensaje="Solucion1: " + solu1 + "/nSolucion2: " + solu2;
            }

        }
    
    //Indicamos la solución
    System.out.println("La ecuación: " + a + "x^2 + " + b + "x + " + c +" = 0 tiene estas soluciones:\n" + mensaje);
    }
}
