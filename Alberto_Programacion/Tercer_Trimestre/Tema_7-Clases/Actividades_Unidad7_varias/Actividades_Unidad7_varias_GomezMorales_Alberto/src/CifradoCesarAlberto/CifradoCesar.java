/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CifradoCesarAlberto;

/**
 *
 * @author alber
 */
public class CifradoCesar {
    
    public static String cifrar(String texto, int n) {
        String cifrado = "";
        
        char nuevaLetra;
        char letra;
        
        for (int i = 0; i < texto.length(); i++) {
            letra = texto.charAt(i);
            if (Character.isLetter(letra)) {
                nuevaLetra = (char) (letra + n);
                if ((Character.isLowerCase(letra) && nuevaLetra > 'z') || (Character.isUpperCase(letra) && nuevaLetra > 'Z')) {
                    nuevaLetra = (char) (nuevaLetra - 26);
                }
                cifrado += nuevaLetra;
            } else {
                cifrado += letra;
            }
        }
        return cifrado;
    }
}