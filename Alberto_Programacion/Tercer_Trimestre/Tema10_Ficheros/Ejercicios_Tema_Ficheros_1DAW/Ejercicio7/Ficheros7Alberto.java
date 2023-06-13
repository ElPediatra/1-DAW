//Alberto Gómez Morales -- 1º DAW - Ficheros

/*
 * Ejercicio 7.- (Serialización de Ficheros)
 * Utilizando la clase Calendario, que ya teníamos implementada anteriormente, vamos a crear un array de 5 Objetos de
 * esta clase, posteriormente serializaremos el array en un fichero que será:
 * "<Escritorio>/TemaFicherosJava/FicheroSerializado.dat"
 * y posteriormente, des-serializaremos ese array, desde su ubicación original para poder trabajar con él.
 */

import java.io.*;

public class Ficheros7Alberto{
    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\alber\\Desktop\\TemaFicherosJava\\FicheroSerializado.dat"; //Revisar la ruta al mostarlo en clase

        //Creo un Array con 5 calendarios
        Calendario[] calendarios = new Calendario[5];
        calendarios[0] = new Calendario(12,4,1992);
        calendarios[1] = new Calendario(17,4,1994);
        calendarios[2] = new Calendario(29,4,1995);
        calendarios[3] = new Calendario(11,6,2002);
        calendarios[4] = new Calendario(13,6,2023);

        //Serializo el array de Calendario y lo escribio en un archivo
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) { //Creo una muestra nueva en la ruta que me piden
            objectOutputStream.writeObject(calendarios);
            System.out.println("Array serializado y guardado.\n");
        } catch (IOException fallo) {
            System.out.println("No he podido mostrar el Array de Calendarios.\n");
        }

        //Deserializar el archivo y leer el array de calendarios
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            Calendario[] calendariosDeserializados = (Calendario[]) objectInputStream.readObject(); //Hago una copia des-serializando los calendarios

            //Muestro los calendarios con un for-each
            for (Calendario calendario : calendariosDeserializados) {
                System.out.println(calendario.toString());
            }
        } catch (IOException | ClassNotFoundException fallo) {
            System.out.println("No he podido mostrar el Arrat de Calendarios");
        }
    }
}