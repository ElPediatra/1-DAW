//Alberto Gómez Morales -- 1º DAW - Ficheros

/*
 * Ejercicio 5.- Utilizando la clase FileInputStream, y su método read (), que previamente tendrás que consultar en la Api
 * de Java, muestra todos los bytes que tiene un fichero ( IesMurgi.jpeg ) , que tienes en una carpeta del escritorio.
 */

/* Imports */
import java.io.FileInputStream;
import java.io.IOException;

public class Ficheros5Alberto {
    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\alber\\Desktop\\Imagen\\IesMurgi.jpeg"; // Revisar la dirección al mostrarlo

        try (FileInputStream fileInputStream = new FileInputStream(rutaArchivo)) { //selección del archivo
            int byteLeido;

            // Leer y mostrar los byte de la imagen
            while ((byteLeido = fileInputStream.read()) != -1) {
                System.out.println(byteLeido);
            }
        } catch (IOException fallo) {
            System.out.println("No he podido leer la imagen");
        }
    }
}