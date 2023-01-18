import java.util.Scanner;

// Tabla / Array de edades

public class R0_U5_EJ1_Alberto{
static Scanner teclado = new Scanner(System.in); //Variable GLOBAL
    public static void main(String[] args){

        //Definimos las variables
        byte opcion;
        char confirmacion;
        boolean salir=false;

        //Desarrollamos el programa
        do{
            mostrar();
                opcion=teclado.nextByte();
            switch(opcion) {
                case 1:
                    ejercicio1();
                break;

                case 2:
                    ejercicio2();
                break;

                case 3:
                    ejercicio3();
                break;

                case 4:
                    ejercicio4();
                break;

                case 0:
                    System.out.println("Has elegido salir, ¿estás seguro?(s/n)");
                    confirmacion=teclado.next().charAt(0);

                    if(confirmacion=='s'){
                        System.out.println("\t\t\t Confirmada su salida. ¡Hasta la próxima!");
                        salir=true;
                        break;
                        }
                break;

                default:
                    System.out.println("Opción no válida.");
                
             }
            }while (!salir);

            teclado.close();
        }

//Funciones/Métodos


public static void mostrar(){
    System.out.println("\t\tBienvenido a las Estructuras de Datos Arrays.");
    System.out.println("0.Salir.");
    System.out.println("1.Crear un vector para almacenar datos (int).");
    System.out.println("2.Crear un vector para almacenar letras (char).");
    System.out.println("3.Crear un método para mostrar un vector que le entra por cabecera.");
    System.out.println("4.Crear con métodos; Dada una palabra por el usuario, preguntarle que letra quiere buscar y dar como respuesta el número de veces que aparece en la palabra (ignorando meyúsculas y minúsculas)");
    System.out.println("\t\tSeleccione una opción por favor.");
}    

    public static void ejercicio1(){
    //Creamos un vector de enteros
    int edad[], mirar;

    edad=new int[17];

    //Inicializamos el vector
    for(int i=0;i<17;i++){
        edad[i]=0;
    }
            /* Otra manera de inicializarlo
             * edad={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
             */
    
    //Accedemos a la posición
    System.out.println("El vector tiene en la posición 5 el valor de "+edad[5]);
    edad[5]=30; //asignamos un valor
    mirar=edad[5]+5;
    System.out.println("El vector tiene en la posición 5 el valor de "+mirar);

    //Mostramos todo el vector
    System.out.print("El vector edad contiene:{");
    for(int i=0;i<17;i++){
        System.out.print(edad[i]+",");
        }
        System.out.println("}");
    }

    public static void ejercicio2(){
        //Creamos un vector de letras
        char palabra[], letra;
        int dimension;
        
        do {
            System.out.println("Dime de que dimensión quieres el vector:");
            dimension=teclado.nextInt();
        } while(dimension<=0); //La dimensión no puede ser negativa ni cero

        //Le asignamos la dimensión a la estructura
        palabra=new char[dimension];

        //Inicializamos la estructura
        for(int i=0;i<palabra.length;i++){
            palabra[i]='%';
        }
        //La visualizamos por pantalla
        System.out.println("Nuestro array de caracteres contiene:");
            for(int i=0;i<palabra.length;i++){
            System.out.println(palabra[i]);
        }

        //Modificamos datos
        palabra[0]='M';
        palabra[2]='J';

        //La visualizamos por pantalla
        System.out.println("Nuestro array de caracteres contiene:");
        for(int i=0;i<palabra.length;i++){
        System.out.println(palabra[i]);
        }

        //Rellenamos el vector de valores
        for(int i=0;i<palabra.length;i++){
            System.out.println("Posición: "+i+". Dame su valor: ");
            letra=teclado.next().charAt(0);
        }

        //La visualizamos por pantalla
        System.out.println("Nuestro array de caracteres contiene: ");
        for(int i=0;i<palabra.length;i++){
            System.out.println(palabra[i]);
        }
    }

    public static void ejercicio3(){
    }

    public static void ejercicio4(){
    }
}
