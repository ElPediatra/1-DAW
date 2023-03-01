/*
Alberto Gómez Morales - 1º DAW - Programación Tema 5

Práctico - Validación logueo NIF / NIE

- Resolución basada en métodos
- Uno recursivo (Se valora extra)
- Podemos implementar: Arrays, String, char, vectores...

Desarrolla un programa, en el cual, el usuario inciará sesión con su NIF o NIE (en caso de no ser español). El programa verificará si el NIF o NIE es correcto, en el caso de serlo dará
acceso a la apliación y en el caso de no ser válido indicará que no se puede acceder.

Para verificar el NIF de españoles residentes, el algoritmo de cálculo del dígito de control es el siguiente:
- Se divide el número entre 23 y el resto se sustituye por una letra que se determina por inspección mediante la siguiente tabla

RESTO 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
LETRA T R W A G M Y F P D X  B  N  J  Z  S  Q  V  H  L  C  K  E

Los NIE de extrajeros residentes en España, tienen una letra (X, Y, Z), 7 números y dígito de control.
Para el cálculo del dígito de control se sustituye:

X --> 0
Y --> 1
Z --> 2

y se aplica el mismo algoritmo que para el NIF.
*/

import java.util.Scanner;

public class Logueo_Alberto{
    public static void main(String[] args) {

        //Definimos las variables
        Scanner teclado = new Scanner(System.in);
        String nifnie;
        String dni;
        String letras;
        int numero;
        char letraControl;
        char letraCalculada;


        //Desarrollamos el programa
        
        /* Pedimos el NIF / NIE al usuario */
        System.out.println("**********************************************");
        System.out.println("******** Sistema de acceso del estado ********");
        System.out.println("**********************************************");
        System.out.print("Introduzca su NIF o NIE: ");
        nifnie = teclado.next().toUpperCase(); //Reviso por si el usuario no pusiese las letras en mayúscula

        /* Verifico la longitud y el formato del NIF/NIE introducido */
        if (nifnie.length() != 9 || !nifnie.matches("[XYZ0-9]\\d{7}[TRWAGMYFPDXBNJZSQVHLCKE]")) {
            System.out.println("El NIF/NIE introducido no es válido, revíselo por favor.");
            return;
        }

        /* Obtengo el número y letra de control del NIF/NIE */
        dni = nifnie.substring(0, 8);
        letraControl = nifnie.charAt(8); //Son de 9 dígitos pero se empieza por 0

        /* Convierto el número del NIF/NIE a un número entero */
        if (nifnie.charAt(0) == 'X') {
            numero = 0;
        } else if (nifnie.charAt(0) == 'Y') {
            numero = 1;
        } else if (nifnie.charAt(0) == 'Z') {
            numero = 2;
        } else {
            numero = Integer.parseInt(dni); //Para que cargue el DNI como int al ser una String
        }

        /* Calculo la letra de control del NIF/NIE */
        letras = "TRWAGMYFPDXBNJZSQVHLCKE"; //Cadena con toda las letras válidas
        letraCalculada = letras.charAt(numero % 23);

        /* Verifico si la letra de control es correcta, dando el mensaje de acceso */
        if (letraControl == letraCalculada) {
            System.out.println("\tAcceso concedido.");
        } else {
            System.out.println("\tAcceso denegado.");
        }
    }
}