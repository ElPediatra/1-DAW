//Alberto Gómez Morales -- Ejercicio 14 Libro

//Escribe un programa que solicite al usuario un número comprendido entre 1 y 99.
//El programa debe mostrarlo con letras, por ejemplo, para 56, se verá: <<cincuenta y seis>>.

import java.util.Scanner;

public class U2_R2_EJ14_Alberto {
    public static void main(String[] args) {

        // Declaramos variables
        int num;
        Scanner teclado = new Scanner(System.in);

        // Desarrollamos el programa
        System.out.println("Dime un número entre 0 y 99, te lo diré con letras: ");
        num = teclado.nextInt();
        if (num < 10) {
            switch (num % 10) {
                case 0: System.out.println("Cero");
                    break;
                case 1: System.out.println("Uno");
                    break;
                case 2: System.out.println("Dos");
                    break;
                case 3: System.out.println("Tres");
                    break;
                case 4: System.out.println("Cuatro");
                    break;
                case 5: System.out.println("Cinco");
                    break;
                case 6: System.out.println("Seis");
                    break;
                case 7: System.out.println("Siete");
                    break;
                case 8: System.out.println("Ocho");
                    break;
                default: System.out.println("Nueve");
                    break;
            }
        } else {
            if (num < 20) {
                switch (num % 10) {
                    case 0: System.out.println("Diez");
                        break;
                    case 1: System.out.println("Once");
                        break;
                    case 2: System.out.println("Doce");
                        break;
                    case 3: System.out.println("Trece");
                        break;
                    case 4: System.out.println("Catorce");
                        break;
                    case 5: System.out.println("Quince");
                        break;
                    case 6: System.out.println("Dieciséis");
                        break;
                    case 7: System.out.println("Diecisiete");
                        break;
                    case 8: System.out.println("Dieciocho");
                        break;
                    default: System.out.println("Diecinueve");
                        break;
                }
            } else {
                if (num < 30) {
                    switch (num % 10) {
                        case 0: System.out.println("Veinte");
                            break;
                        case 1: System.out.println("Veintiuno");
                            break;
                        case 2: System.out.println("Veintidós");
                            break;
                        case 3: System.out.println("Veintitrés");
                            break;
                        case 4: System.out.println("Veinticuatro");
                            break;
                        case 5: System.out.println("Veinticinco");
                            break;
                        case 6: System.out.println("Veintiséis");
                            break;
                        case 7: System.out.println("Veintisiete");
                            break;
                        case 8: System.out.println("Veintiocho");
                            break;
                        default: System.out.println("Veintinueve");
                            break;
                    }
                } else {
                    switch (num / 10) {
                        case 3: System.out.print("Treinta");
                            break;
                        case 4: System.out.print("Cuarenta");
                            break;
                        case 5: System.out.print("Cinquenta");
                            break;
                        case 6: System.out.print("Sesenta");
                            break;
                        case 7: System.out.print("Setenta");
                            break;
                        case 8: System.out.print("Ochenta");
                            break;
                        default: System.out.print("Noventa");
                            break;
                    }
                    switch (num % 10) { // Necesario para los "números especiales" 'x' y 'x'
                        case 0:
                            break;
                        case 1: System.out.print(" y uno");
                            break;
                        case 2: System.out.print(" y dos");
                            break;
                        case 3: System.out.print(" y tres");
                            break;
                        case 4: System.out.print(" y cuatro");
                            break;
                        case 5: System.out.print(" y cinco");
                            break;
                        case 6: System.out.print(" y seis");
                            break;
                        case 7: System.out.print(" y siete");
                            break;
                        case 8: System.out.print(" y ocho");
                            break;
                        default: System.out.print(" y nueve");
                            break;
                    }
                }
            }
        }
    }
}