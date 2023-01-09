import java.util.Scanner;

public class profe { // Nombre del archivo

    /*
     * Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen
     * aspectos que influirán en esta decisión: si está lloviendo y si hemos terminado nuestras tareas.
     * Solo podremos salir a la calle si no está lloviendo y hemos finalizadso nuestras tareas.
     * Existe una opción en la que, indistintamente de lo anterior, podremos salir a la calle: el hecho de que
     * tengamos que ir a la biblioteca
     * (para realizar algún trabajo, entregar un libro, etc.). Solicitar al usuario
     * (mediante un booleano) si
     * llueve, si ha finalizado las tareas y si necesita ir a la biblioteca. El
     * algoritmo debe mostrar mediante un
     *
     * booleano (true o false) si es posible que se le otorgue permiso para ir a la
     * calle.
     */

    public static void main(String[] args) {
        // Definición de variables

        Scanner teclado = new Scanner(System.in);
        boolean llueve = true, tareasFinal = true, irBiblioteca = true, salir = false;

        // Desarrollo del problema

        System.out.println("Está lloviendo?");
        llueve = teclado.nextBoolean();
        System.out.println("Has terminado las tareas?");
        tareasFinal = teclado.nextBoolean();
        System.out.println("Tienes que ir a la biblioteca?");
        irBiblioteca = teclado.nextBoolean();

            salir = (llueve==false && tareasFinal==true || irBiblioteca==true);

            // ¿Se podría así? Salir = irBiblioteca || (!llueve && tareasFin);

        System.out.println("¿Puedes salir?: " + salir );
    }

}
