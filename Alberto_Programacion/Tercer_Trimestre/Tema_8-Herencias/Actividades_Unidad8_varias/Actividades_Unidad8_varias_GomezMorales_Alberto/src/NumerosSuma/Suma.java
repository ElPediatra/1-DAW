/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumerosSuma;

/**
 *
 * @author alber
 */
public class Suma {
    
    public static boolean esNumero(Object ob) {
        return ob instanceof Integer || ob instanceof Double || ob instanceof Long || ob instanceof Float;
    }
    
    public static void sumar(Object a, Object b) {
        if (a instanceof String && b instanceof String) {
            System.out.println(a.toString() + b.toString());
        } else if (esNumero(a) && esNumero(b)) {
            Double resultado = Double.parseDouble(a.toString()) + Double.parseDouble(b.toString());
            System.out.println(resultado);
        } else {
            System.out.println("No sumables");
        }
    }
}
