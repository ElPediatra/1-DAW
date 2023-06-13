//Alberto Gómez Morales -- 1º DAW - Ficheros

/*
 * Ejercicio 10.- (Práctica del vídeo 146). Realiza un programa que le pida al usuario tres cadenas:
 * El Nombre de un directorio o carpeta, que será el nombre de un directorio a crear.
 * El nombre de un archivo, que el programa de java le pone extensión .txt porque será un archivo de texto que se creará
 * dentro de la carpeta que el usuario ha indicado en el primer parámetro.
 * El tercer parámetro que se le pide al usuario, será una frase que se debe insertar en el archivo creado anteriormente.
 */

/* Import */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ficheros10Alberto{
    public static void main(String[] args){
        String rutaCarpeta;
        String nombreCarpeta;
        String nombreArchivo;
        String textoArchivo;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indica la dirección para crear la carpeta (las barras que separan las carpetas tienen que ser dobles).");
        rutaCarpeta = teclado.nextLine();
        System.out.println("Indica el nombre de la carpeta");
        nombreCarpeta = teclado.nextLine();
        System.out.println("Indica el nombre del archivo");
        nombreArchivo = teclado.nextLine();
        System.out.println("Indica el texto del archivo: ");
        textoArchivo = teclado.nextLine();

        // Crear la carpeta
        File carpeta = new File(rutaCarpeta, nombreCarpeta); //Intentamos crear la carpeta
        boolean carpetaCreada = carpeta.mkdir(); //Confirma si se ha creado la carpeta

        if (carpetaCreada) { 
            System.out.println("Carpeta creada correctamente.");

            //Creamos el archivo y añadimos en la dirección
            String rutaArchivo = carpeta.getAbsolutePath() + "\\" + nombreArchivo + ".txt";

            try (FileWriter fileWriter = new FileWriter(rutaArchivo)) {
                //Escribimos datos en el archivo para que no esté vacío
                fileWriter.write(textoArchivo);

                System.out.println("Archivo creado correctamente.");
            } catch (IOException fallo) {
                System.out.println("No he podido crear el archivo.");
            }
        } else {
            System.out.println("Error al crear la carpeta.");
        }
    }
}