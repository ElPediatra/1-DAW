//Alberto Gómez Morales -- 1º DAW - Ficheros

/*
 * Ejercicio 4.-Vamos a crear un programa que acceda con buffer a un fichero de texto que tengamos creado.
 * El programa deberá mostrar el contenido de ese fichero.
 * 
 * Me creo en el escritorio el fichero modulos.txt con los módulos de 1º DAW:
 * 
 * Fichero: Modulos1Daw.txt
 * Módulos del curso 1DAW:
 * Fol.
 * Lenguaje de Marcas.
 * Bases de Datos.
 * Sistemas Informáticos.
 * Programación.
 * Entornos de Desarrollo.
 * 
 * Y la salida del programa, cuando imprimo el fichero línea a línea, sería:
 * 
 *      Fichero: Modulos1Daw.txt
 *      Modulos del curso 1DAW:
 *      Fol.
 *      Lenguaje de Marcas.
 *      Bases de Datos.
 *      Sistemas Informaticos.
 *      Programacion.
 *      Entornos de Desarrollo.
 *      //No pongo tildes, para que me lo muestre correctamente
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ficheros4Alberto{
    public static void main(String[] args){
        String rutaArchivo = "C:\\Users\\alber\\Desktop\\modulos.txt"; //Cambiar la dirección al mostrar el ardhivo en clase

        try (
            BufferedReader bufferedReader = new BufferedReader(new FileReader(rutaArchivo))) { //Buffer para leer el archivo
            String linea; //Atributo para pasar de línea a línea

            // Leer y mostrar cada línea del archivo
            while ((linea = bufferedReader.readLine()) != null) { //Asigno las líneas mientras no esté vacías y las muestro
                System.out.println(linea);
            }
        } catch (IOException fallo) {
            System.out.println("No he podido leer el archivo.");
        }
    }
}