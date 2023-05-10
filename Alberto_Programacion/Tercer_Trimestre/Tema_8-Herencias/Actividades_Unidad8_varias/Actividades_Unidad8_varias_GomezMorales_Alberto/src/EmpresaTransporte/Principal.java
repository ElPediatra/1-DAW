/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpresaTransporte;

/**
 * Alberto Gómez Morales - 1º DAW - Programación
 * Ejercicio 8.12
 * Página 274
 * 
 * @author alber
 * 
 * Las empresas de transporte, para evitar daños en los paquetes, embalan todas
 * sus mercancías en cajas con el tamaño adecuado. Una caja se crea expresamente
 * con un ancho y un fondo y, una vez creada, se mantiene inmutable. Cada caja
 * lleva pegada una etiqueta, de un máximo de 30 caracteres, con información útil
 * como el nombre del destinatario, dirección, etc. Implementa la clase Caja con
 * los siguientes métodos:
 *  - Caja(int ancho, in alto, int fondo, Unidad unidad): que construye una caja
 * con las dimensiones especificadas, que pueden encontrarse en "cm" (centímetros)
 * o "m" (metros).
 *  - double getVolumen(): que devuelve el volumen de la caja en metros cúbicos.
 *  - void setEtiqueta(String etiqueta): que modifica el valor de la etiqueta de la caja.
 *  - String toString(): que devuelve una cadena con la representación de la caja.
 */
public class Principal {
    public static void main(String[] args) {
        Caja caja1 = new Caja(1.0, 2.0, 3.0, Unidad.M);
        caja1.setEtiqueta("Caja 1");
        System.out.println(caja1);
        System.out.println("Volumen: " + caja1.getVolumen() + " m^3");

        Caja caja2 = new Caja(50.0, 60.0, 70.0, Unidad.CM);
        caja2.setEtiqueta("Caja 2: una caja más grande");
        System.out.println(caja2);
        System.out.println("Volumen: " + caja2.getVolumen() + " m^3");
    }
}
