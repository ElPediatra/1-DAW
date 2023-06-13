//Alberto Gómez Morales -- 1º DAW - Ficheros

/*
 * Ejercicio 6.- Completa el ejercicio anterior, copiando ahora la imagen del archivo anterior (después de leerlo byte a
 * byte), en otro sitio. Es decir, una vez que tenemos todos los bytes del archivo, tendremos que crear una nueva imagen.
 */

/* Imports */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ficheros6Alberto {
    public static void main(String[] args) {
        String rutaArchivoOrigen = "C:\\Users\\alber\\Desktop\\Imagen\\IesMurgi.jpeg"; // Revisar la dirección al mostrarlo
        String rutaArchivoDestino = "C:\\Users\\alber\\Desktop\\Ejercicios_Tema_Ficheros_1DAW\\Ejercicio6\\CopiaIesMurgi.jpeg"; // Revisar la dirección al mostarlo

        try (FileInputStream fileInputStream = new FileInputStream(rutaArchivoOrigen);
            FileOutputStream fileOutputStream = new FileOutputStream(rutaArchivoDestino)) { //selección del archivo origen y el lugar de destino

            byte[] copia = new byte[1024]; //Uso el Array para copiar los bytes
            int byteLeido;

            // Leer y mostrar los byte de la imagen
            while ((byteLeido = fileInputStream.read(copia)) != -1) {
                fileOutputStream.write(copia, 0, byteLeido);
            }
        } catch (IOException fallo) {
            System.out.println("No he podido leer la imagen");
        }
    }
}