// Alberto Gomez Morales - 1º DAW - Programación - Ejercicio U3_Bucles

/*
 * 9.- (Calcular las ventas) Un vendedor minorista en línea vende cinco productos cuyos precios de venta son los siguientes: producto 1, $2.98; producto 2, $4.50; producto 3,
 * $9.98; producto 4, $4.49 y producto 5, $6.87. Escriba una aplicación que lea una serie de pares de números, como se muestra a continuación:
 *		a) número del producto;
 *		b) cantidad vendida.
 * Su programa debe utilizar una instrucción switch para determinar el precio de venta de cada producto. Debe calcular y mostrar el valor total de venta de todos los productos
 * vendidos. Use un ciclo controlado por centinela para determinar cuando debe el programa dejar de iterar para mostrar los resultados finales.
 */

/* Imports */
import java.util.Scanner;

public class U3_Bucles_Ej9_GomezMorales_Alberto{
	public static void main(String[] args){
		/* Variables */
        Scanner teclado = new Scanner(System.in);
        double producto1 = 2.98;
        double producto2 = 4.50;
        double producto3 = 9.98;
        double producto4 = 4.49;
        double producto5 = 6.87;
        int numProducto = 0;
        int cantidadVendida = 0;
        double total = 0;
        double precioVenta;
        double ventaProducto;
    
        /* Desarrollamos el programa */
        while (numProducto >= 0) { //Bucle para los pedidos
            System.out.print("Indica el número del producto (o un número negativo para salir): ");
            numProducto = teclado.nextInt();

            if (numProducto >= 0) {
                System.out.print("Indica la cantidad del producto: ");
                cantidadVendida = teclado.nextInt();

                // Calcular el precio de venta según el número del producto
                switch (numProducto) {
                    case 1:
                        precioVenta = producto1;
                        break;
                    case 2:
                        precioVenta = producto2;
                        break;
                    case 3:
                        precioVenta = producto3;
                        break;
                    case 4:
                        precioVenta = producto4;
                        break;
                    case 5:
                        precioVenta = producto5;
                        break;
                    default:
                        System.out.println("Número de producto inexistente.");
                        continue;
                }

                ventaProducto = precioVenta * cantidadVendida;
                total += ventaProducto;
            }
        }

        //Precio final
        System.out.println("El precio total es: " + total + "$");
        teclado.close();
    }
}