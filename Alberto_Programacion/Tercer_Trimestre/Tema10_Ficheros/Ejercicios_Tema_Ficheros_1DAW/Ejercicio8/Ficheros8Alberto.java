//Alberto Gómez Morales -- 1º DAW - Ficheros

/*
 * Ejercicio 8.- A partir de la ruta de una carpeta, mostrar todos los ficheros o directorios que tiene esa carpeta, así como
 * los ficheros de las subcarpetas. La Carpeta donde buscaremos será: <Escritorio>\\Imagenes
 */

 import java.io.File;

 public class Ficheros8Alberto{
    public static void main(String[] args){
        String rutaCarpeta = "C:\\Users\\alber\\Desktop\\Imagenes"; // Ajusta la ruta de la carpeta según tu ubicación

        File carpeta = new File(rutaCarpeta);

        /* Compruebo que la dirección sea válida */
        if (carpeta.isDirectory()) {
            /* Cargamos los archivos */
            File[] archivos = carpeta.listFiles();

            /* Mostramos los archivos */
            if (archivos != null) { //Recorre mientras queden archivos en la carpeta
                for (File archivo : archivos) { //For each para mostar todos los archivos
                    System.out.println(archivo.getAbsolutePath());
                }
            } else {
                System.out.println("La carpeta está vacía.");
            }
        } else {
            System.out.println("La ruta no es válida.");
        }
    }
 }
