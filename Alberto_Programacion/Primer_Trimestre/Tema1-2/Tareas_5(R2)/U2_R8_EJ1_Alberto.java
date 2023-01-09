//Alberto Gómez Morales -- Switch con Edad informando del curso

import java.util.Scanner;

public class U2_R8_EJ1_Alberto {
    public static void main(String[] args){
    
    //Definimos las variables
    int edad;
    Scanner teclado=new Scanner(System.in);

    //Aprendiendo Switch
    System.out.println("Indicame tu edad y te dire que curso deberias estar cursando:");
    edad=teclado.nextInt();

        switch (edad) {
		
        case 0:
		case 1:
		case 2:
        System.out.println("Guarderia");
		break;
		
        case 3:
		case 4:
		case 5:
        System.out.println("Preescolar");
		break;

        case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
        System.out.println("Primaria");
		break;

        case 12:
		case 13:
		case 14:
		case 15:
		case 16:
        System.out.println("Secundaria");
		break;

        default:
        System.out.println("Te pasaste la vida");
        }
    }
}