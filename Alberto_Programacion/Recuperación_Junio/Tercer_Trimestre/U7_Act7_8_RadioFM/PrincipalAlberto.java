//Alberto Gómez Morales - 1º DAW - Programación

/* 
 * Definir una clase que permita controlar un sintonizador digital de emisoras FM; concretamente,
 * se desea dotar al controlador de una interfaz que permita subir (up) o baja (down) la frecuencia
 * (en saltos de 0,5 MHz) y mostrar la frecuencia sintonizada en un momento dado (display). Supondremos
 * que el rango de frecuencias para manejar oscila entre los 80 MHz y los 108 MHz y que, al inicio, el
 * controlador sintonice la frecuencia indicada en el contructor o 80 MHz por defecto. Si durante una
 * operación de subida o bajada se sobrepasa uno de los dos límites, la frecuencia sintonizada debe pasar
 * a ser la del extremo contrario. Escribir un pequeño programa principal para probar su funcionamiento.
 */

public class PrincipalAlberto{
    public static void main(String[] args) {

        RadioFMAlberto radio = new RadioFMAlberto(88);

        System.out.println("Frecuencia inicial: " + radio.getFrecuencia());

        //Subo la frecuencia dos veces
        radio.up();
        radio.up();

        System.out.println("Frecuencia después de subir dos veces: " + radio.getFrecuencia());

        //Bajo la frecuencia tres veces
        radio.down();
        radio.down();
        radio.down();

        System.out.println("Frecuencia después de bajar tres veces: " + radio.getFrecuencia());
    }
}