import java.util.Scanner;

import javax.lang.model.element.VariableElement;

import java.lang.Math;
import java.time.LocalTime;

public class Resumen_Java_Alberto {
    public static void main(String[] args) {

        int aulas = 20;

        final tipo nombreConstante; // Constante "final"
        final byte mayoriaEdad = 18;
        final int numeroAlumnos;

        a = 1;
        b = -a // b vale -1

        a ++; // a = a + 1;
        b --; // b = b - 1;

        variable += 3; // variable = variable + 3;
        x *= 2; //X = x * 2;

        Scanner teclado = new Scanner(System.in);

        variable = teclado.next"TipoVariable"();

        numeroAlumnos = aulas * 30;

        System.out.println("Hola");
        System.out.print("Hola holita");
        System.out.printf("Que pasó");


        int a, b;
        a = 3 < 5 ? 1 : -1; // 3 < 5 es cierto: a toma el valor de 1
        b = a == 7 ? 10:20; // a (que vale 1) == 7 es falso: b toma el valor de 20

        int a = (int) 2.6; //(int) indica el tipo al que se convertirá el valor

        int a = 2;
        double x = 2.3;

        // Muestra if
        a = 3;
        if (a + 1 < 10) {
            a = 0;
            System.out.println("Hola");
        }
        System.out.println("El valor de a es " + a);

        //Muestra if-else
        if (a > 0) {
            System.out.println("Valor positivo");
        } else {
            System.out.println("Valor negativo o cero");
        }

        //Muestra Operador Ternario
        variable = condición ? valor1 : valor2

        //Es lo mismo que usar

        if (condición) {
            variable = valor1;
        } else {
            variable = valor2;
        }

        //Ejemplo ternario
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int maximo = a > b ? a : b; // A mayor que B o contrario
        System.out.println("El máximo es: " + maximo);

        //Muestra anidaciones

        if (a - 2 == 1) {
            System.out.println("Hola ");
        } else {
            if (a - 2 == 5) {
                System.out.println ("Me ");
            } else {
                if (a - 2 == 8) {
                    System.out.println("Alegro ");
                } else {
                    if (a - 2 == 9) {
                        System.out.println("De ");
                    } else {
                        if (a - 2 == 11) {
                            System.out.println("Conocerte.");
                        } else {
                            System.out.println("Sin coincidencia");
                        }
                    }
                }
            }
        }

        //Muestra Anidaciones abreviado
        if (a - 2 == 1) {
            System.out.println("Hola ");
        } else if (a - 2 == 5) {
            System.out.println("Me ");
        } else if (a - 2 == 8) {
            System.out.println("Alegro ");
        } else if (a - 2 == 9) {
            System.out.println("De ");
        } else if (a - 2 == 11) {
            System.out.println("Conocerte.");
        } else {
            System.out.println("Sin coincidencia.");
        }

        //Muestra Switch
        switch (nota) {
            case 0,1,2,3,4: {//Bloque formado por dos instrucciones: entre llaves
                System.out.println("Suspenso.");
                System.out.println("Ánimo...");
            }
            break;
            case 5: //Bloque de una única instrucción: podemos obviar las llaves
                System.out.println("Suficiente.");
            break;
            case 6:
                System.out.println("Bien.");
            break;
            case 7,8:
                System.out.println("Notable.");
            break;
            case 9,10: {
                System.out.println("Sobresaliente.");
                System.out.println("Enhorabuena.");
            }
            break;
            default:
                System.out.println("Nota incorrecta.");
        }


        int i = 1; //Valor inicial

    
        while (i <=3) { /*El bucle iterará mientras i sea menos
                        o igual que 3*/
            System.out.println(i); //Mostramos i
            i++; /*Incrementamos i para la siguiente vuelta
                 del bucle*/
        }


        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <=10);


        for (int i = 1; i <= 2; i++) {
            System.out.println("La i vale " + i);
        }

        i = 1;
        
        while (i <= 10) {
            System.out.println("La i vale" + );
            if (i == 2) {
                break; /*El bucle esta para valor 10
                        pero con break lo cortamos en 2 */
            }
            i++;
        }


        i = 0;

        while (i < 10) {
            i++;
            if (i % 2 == 0) { //Si i es par
                continue;
            }
            System.out.println("La i vale " + i);
        }

        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 3; j++) { //j va independiente de i
                System.out.println("Ejecutando...");
            }
        }

        for (i = 1; i <=3; i++) {
            System.out.println("Bucle externo, i=" + i);
            j = 1;
            while (j <= i) { //j depende del valor de i
                System.out.println("...Bucle interno, j=" + j);
                j++;
            }
        }
    }

    static tipo nombreFunción() {
        cuerpo de la función
    }

    variosSaludos(2); //llamada con un literal
    int n = 3;
    variosSaludos(2+n); //llamada con una expresión

    tipo nombreFuncion(tipo1 parametro1, tipo2 parametro2...) {
        cuerpo de la función


    int a = suma(2, 3);
    int b = suma(7, 1) * 5;

    tipo nombreFunción(parámetros) {
        ...
        return (valor);
    }

    // Función sobrecargada
    static int suma(int a, int b) {
        int suma;
        suma = a + b;
        return (suma);
    }

    // Función sobrecargada
    static double suma(int a, double pesoA, int b, double pesoB) {
        double suma;
        suma = a * pesoA / (pesoA + pesoB) + b;
        return (suma);
    }

    static int funcionRecursiva() {
        if (caso base) {
            resultado = valorBase;
        } else {
            resultado = funcionRecursiva(nuevosDatos); //Llamada recursiva
            ...
        }
        return (resultado);
    }

}}
