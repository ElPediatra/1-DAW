//Alberto Gómez Morales -- 1º DAW - Ficheros

/*
 * Ejercicio 9.- Realiza un programa que dentro del sitio que nosotros queramos, me cree una carpeta y posteriormente, en
 * esa carpeta que acabamos de crear, me creará un fichero de una hoja de cálculo
 */

/* Import */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ficheros9Alberto{
    public static void main(String[] args){
        String rutaCarpeta = "C:\\Users\\alber\\Desktop\\Ejercicios_Tema_Ficheros_1DAW\\Ejercicio9";
        String nombreCarpeta = "Prueba";
        String nombreArchivo = "Prueba.csv";

        // Crear la carpeta
        File carpeta = new File(rutaCarpeta, nombreCarpeta); //Intentamos crear la carpeta
        boolean carpetaCreada = carpeta.mkdir(); //Confirma si se ha creado la carpeta

        if (carpetaCreada) { 
            System.out.println("Carpeta creada correctamente.");

            //Creamos el archivo y añadimos en la dirección
            String rutaArchivo = carpeta.getAbsolutePath() + "\\" + nombreArchivo;

            try (FileWriter fileWriter = new FileWriter(rutaArchivo)) {
                //Escribimos datos en el archivo para que no esté vacío
                fileWriter.write("Celda A1, Celda B1, Celda C1\n");
                fileWriter.write("Celda A1, Celda B1, Celda C1\n");

                System.out.println("Archivo creado correctamente.");
            } catch (IOException fallo) {
                System.out.println("No he podido crear el archivo.");
            }
        } else {
            System.out.println("Error al crear la carpeta.");
        }
    }
}