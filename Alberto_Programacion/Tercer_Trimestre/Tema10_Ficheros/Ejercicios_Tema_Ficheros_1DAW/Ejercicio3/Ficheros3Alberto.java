//Alberto Gómez Morales -- 1º DAW - Ficheros

/*
 * Ejercicio 3.- Posteriormente al fichero salida.txt, creado en el ejercicio anterior, le añadirás la frase:
 * IES Murgi ( El Ejido) Almeria
 * Curso 2021 2022.
 * CFGS DAW.
 * 
 *      Contenido de salida.txt:
 * 
 *      Estamos escribiendo a traves de streams de datos.
 *      IES Murgi ( El Ejido) Almeria
 *      Curso 2022 2023.
 *      CFGS DAW.
 */

/* Imports */
import java.io.FileWriter;
import java.io.IOException;

public class Ficheros3Alberto {
    public static void main(String[] args) {
        /* Texto que quiero añadir */
        String nuevaFrase = "\n\nIES Murgi (El Ejido) Almeria\nCurso 2022 2023.\nCFGS DAW.";

        /* Dirección del archivo */
        String rutaArchivo = "C:\\Users\\alber\\Documents\\Ficheros\\salida.txt"; //Revisar la dirección al mostrar el archivo

        try {
            /* Creo el fileWriter para hacer un append (añadir) del texto al archivo */
            FileWriter fileWriter = new FileWriter(rutaArchivo, true);

            /* Añado la frase al archivo */
            fileWriter.write(nuevaFrase);

            /* Cierro el fileWriter */
            fileWriter.close();

            System.out.println("He añadido el texto al archivo.");
        } catch (IOException fallo) {
            System.out.println("No he podido modificar el archivo.");
        }
    }
}
