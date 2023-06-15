/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alber
 */

/* Paquetes */
package Animales;

/* Imports */
import java.util.ArrayList;

public class PruebaAnimales {

    private static Object nombresPerros;
    public static void main(String[] args) {
        
        /* Objetos */
        Gatos gato1 = new Gatos(Sexo.Hembra, "de tierra", "Siamés");
        Gatos gato2 = new Gatos(Sexo.Macho, "de tierra", "Persa");
        Perros perro1 = new Perros(Sexo.Macho, "de tierra", "Caniche", "Popeye");
        Perros perro2 = new Perros(Sexo.Hembra, "de tierra", "Labrador", "Obelix");
        
        //Muestro los objetos
        System.out.println(gato1.toString());
        System.out.println(gato2.toString());
        System.out.println(perro1.toString());
        System.out.println(perro2.toString());
        
        //Uso los objetos en los métodos
        gato1.maullar();
        gato2.comidaGatos("atún");
        perro1.ladrar();
        perro2.juegaCon(perro1);
        
        //Añado nombre de perros al ArrayList nombresPerros
        /* ************************************************************************* */
        
        /* Modificaciones ArrayList */
        ArrayList<String> nombresPerros = new ArrayList<String>();
        
        nombresPerros.add("Milú");
        nombresPerros.add("Ideafix");
        nombresPerros.add("Rantanplán");
        nombresPerros.add("Copito de nieve");
        nombresPerros.add("Luna");
        nombresPerros.add("Chica");
        nombresPerros.add("Luna");
        nombresPerros.add("Misifu");
        nombresPerros.add("Misifu2");
        
        //Lo incluyo en la posición que yo quiera
        nombresPerros.add(8, "Rex");
        
        //Devuelvo el tamaño del ArrayList
        nombresPerros.size();
        
        //Devuelvo un nombre de la posición que yo quiera (en este caso 4)
        nombresPerros.get(4);
        
        //Para comprobar si existe el elemento
        nombresPerros.contains("Chica");
        
        //Muestra la primera posición de lo que busquemos
        nombresPerros.indexOf("Luna");
        
        //Muestra la última posición de lo que busquemos
        nombresPerros.lastIndexOf("Luna");
        
        //Borramos el elemento 8 de la lista
        nombresPerros.remove(8);
        
        //Borramos un nombre en específico
        nombresPerros.remove("Misifu2");
        
        //Borrar el ArrayList por completo
        /* nombresPerros.clear(); */
        
        //Indicamos si está vacío o no
        nombresPerros.isEmpty();
        
        //Copiamos el ArrayList
        ArrayList nombresCopia = (ArrayList) nombresPerros.clone();
                
        /* Gestiones ArraList Perros */
        ArrayList<Perros> nombresPerros2 = Perros.crearPerros();
        System.out.println("Perros antes de modificar:");
        Perros.mostrarPerros(nombresPerros2);

        Perros.modificarPerro(nombresPerros2, 1, "Princesita (nombre cambiado)");
        System.out.println("Perros después de modificar:");
        Perros.mostrarPerros(nombresPerros2);
    }
}
