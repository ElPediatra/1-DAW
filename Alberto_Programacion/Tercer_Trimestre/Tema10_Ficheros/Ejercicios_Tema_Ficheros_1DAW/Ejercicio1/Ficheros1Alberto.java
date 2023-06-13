//Alberto Gómez Morales -- 1º DAW - Ficheros

/*
 * Ejercicio 1.- Crea un fichero de texto mensajecortesia.txt
 * A continuación, desde un programa de Java, muestra el contenido de ese fichero de texto.
 * La salida, sería la siguiente:
 * 
 *      Curso 2022 2023. Primero DAW.
 *      Estamos aprendiendo a programar en
 *      Java.
 */

/* Imports de io para manejo de archivos y excepciones */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ficheros1Alberto {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("mensajecortesia.txt"))) { //Dirección del archivo Java, como estoy en la misma carpeta no tengo que poner la dirección
            String linea; //Variable para ir leyendo y mostrando las líneas del archivo de texto
            while ((linea = reader.readLine()) != null) { //Bucle para ir leyendo las líneas y mostrándolas mientras no esté vacías
                System.out.println(linea); //Print del texto del archivo
            }
        } catch (IOException fallo) { //Excepción al no poder leer el archivo
            System.out.println("No he podido leer el archivo.");
        }
    }
}