/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * 
 * Examen Práctico Unidades 7 y 8, Parte Práctica
 * 
 * @author alber
 * 
 * Utiliza tu clase Calendario que representa una fecha concrecta (año, mes y dia) y debe disponer de los métodos:
 * 
 *  + Constructores por defecto, copia y demás necesarios.
 *  + incrementarDia(): que incrementa en un día la fecha del calendario.
 *  + incrementarMes(): que incrementa en un mes la fecha del calendario.
 *  + incrementarAnio(int cantidad): que incrementa la fecha del calendario en el número de años especificados. Teniendo en cuenta que el año 0 no existió.
 *  + .toString(): muestra la fecha por pantalla.
 *  - iguales(): Este método recibirá una fecha por parámetro y determinará si la fecha invocante es igual o distinta, devolverá un booleano para ello.
 * 
 * Se tendrá en consideración que existen meses con distinto número de días, y años bisiestos. Los objetos de tipo Calendario podrán tener una fecha concreta especificada en el momento de
 * creación o la actual en caso de no especificarla.
 * 
 * Se pide, a partir de la clase Calendario escribir la clase CalendarioExacto, que determinará un instante de tiempo exacto formado por un año, mes, dia, hoy y minuto. Implementa los métodos
 * necesarios para incrementar y mostrar CalendarioExacto. Usarás una clase principal (principal_tuNombre) que realice las siguientes acciones:
 *  - Crear y almacenar objetos de tipo CalendarioExacto que sean válidos. Mostrar su información.
 *  - Incrementar un objeto en un día, mes, año, hora o minuto. Mostrar su información.
 *  - Comprobar en un objeto que su año es bisiesto. Mostrar su información.
 *  - Comparar dos objetos de los almacenados si son iguales (tienen la misma fecha y hora) y mostrar la información.
 * 
 * Se debe realizar la implementación atendiendo a:
 *  - Resolución basada en POO, clases, objetos y ArrayList.
 *  - Creación de Paquetes.
 *  - Buen uso de los modificadores de acceso.
 *  - Constructores.
 *  - Buenos hábitos de programación (nombres, variables, clases, métodos...)
 *  - Se cuida el formato y la presentación de la información en pantalla. Colores.
 * 
 * Resuelve lo especificado en el enunciado:
 *  - Dada una fecha, incrementar los días, meses, años, horas y minutos.
 *  - Almacenadas una cantidad de fechas: modificar sus características.
 *  - Comprobación de años bisiestos.
 *  - Comparación de dos fechas almacenadas, el usuario las elige.
 */

/* Paquetes */
package Alberto;

/* Imports */
import java.util.Scanner;

public class Principal_Alberto {
    static Scanner teclado = new Scanner(System.in);
    /* Colores String */
    static final String rojo = "\033[31m"; //Texto color rojo
    static final String verde = "\033[32m"; //Texto color verde
    static final String reset = "\033[0m";  //Texto color por defecto

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //1º Parte del Exámen --- Tema 7 (Lo completo ya que no hice nada el examen anterior)
        
        /* Variables */
        int incrementoAnio;
        
        //Crea la primera fecha (CalendarioAlberto) y la muestro
        CalendarioAlberto fecha1 = new CalendarioAlberto(31, 11, 1990);
        System.out.print(verde + " Fecha actual: " + reset);
        System.out.println(fecha1.toString());
        
        //Incremento el día y lo muestro
        fecha1.incrementarDia();
        System.out.println("\t" + fecha1.toString() + rojo + " Fecha modificada en 1 día." + reset);
        
        //Incremento el mes y lo muestro
        fecha1.incrementarMes();
        System.out.println("\t" + fecha1.toString() + rojo + " Fecha modificada en 1 mes." + reset);
        
        //Incremento los meses en la cantidad que me pidan
        System.out.println("Indicame " + verde + "cuántos años" + reset + " quieres aumentar a la fecha actual: ");
        incrementoAnio = teclado.nextInt();
        fecha1.incrementarAnio(incrementoAnio);
        System.out.println("\t" + fecha1.toString() + rojo + " Fecha modificada en los años indicados." + reset);
        
        //Creo una segunda fecha y la muestro para ver que cargue bien
        CalendarioAlberto fecha2 = new CalendarioAlberto(30, 11, 1990);
        System.out.print(verde + " Fecha para comparar: " + reset);
        System.out.println(fecha2.toString());
        
        //Comparo las 2 fechas
        fecha1.iguales(fecha2);
        
        //Creo una tercera fecha y la comparo
        CalendarioAlberto fecha3 = new CalendarioAlberto(1,1,1995);
        System.out.print(verde + " Fecha para comparar 2: " + reset);
        System.out.println(fecha3.toString());
        
        fecha1.iguales(fecha3);
        
        
        //2º Parte del Exámen --- Tema 8 -- NO REALIZADA
        // Todavía no domino los ArrayList
        
        //Creo una fecha con hora y lo muestro
        CalendarioExactoAlberto fecha4 = new CalendarioExactoAlberto(20, 12, 2002, 12, 23);
        System.out.println("\nObjeto CalendarioExactoAlberto con Fecha y Hora: ");
        System.out.println(fecha4.toString());
    }
}