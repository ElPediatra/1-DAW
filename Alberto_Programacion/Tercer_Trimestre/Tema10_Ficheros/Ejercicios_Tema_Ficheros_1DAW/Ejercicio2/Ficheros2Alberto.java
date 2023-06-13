//Alberto Gómez Morales -- 1º DAW - Ficheros

/*
 * Ejercicio2.- Desde un programa de Java, mete en un fichero de texto (salida.txt) que estará en una Carpeta Ficheros,
 * que hemos creado antes en Mis Documentos, la frase (carácter a carácter) :
 * Estamos escribiendo a traves de streams de datos...
 *      Contenido de salida.txt:
 * 
 *      Estamos escribiendo a traves de streams de datos.
 */

/* Imports */
import java.io.FileWriter;
import java.io.IOException;

public class Ficheros2Alberto{
    public static void main(String[] args) {
        String rutaArchivo;
        String frase;

        /* Indico la frase que quiero escribir */
        frase = "Estamos escribiendo a traves de streams de datos...";

        /* Indico la dirección del fichero */
        rutaArchivo = "C:\\Users\\alber\\Documents\\Ficheros\\salida.txt"; //Cuando lo muestre en clase, tengo que cambiar la dirección para poner la del usuario del PC

        try {
            /* Creamos el FileWriter para crear el archivo */
            FileWriter fileWriter = new FileWriter(rutaArchivo);

            /* Usamos el FileWriter para escribir la frase*/
            for (int i = 0; i < frase.length(); i++) {
                fileWriter.write(frase.charAt(i));
            }

            /* Cierro para que deje de escribir */
            fileWriter.close();

            System.out.println("Archivo escrito exitosamente.");
        } catch (IOException fallo) {
            System.out.println("No he podido crear/escribir el archivo");
        }
    }
}