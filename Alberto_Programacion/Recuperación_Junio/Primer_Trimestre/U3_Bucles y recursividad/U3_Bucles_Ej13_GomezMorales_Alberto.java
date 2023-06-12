// Alberto Gomez Morales - 1º DAW - Programación - Ejercicio U3_Bucles

/*
 * 13.- (Canción “Los doce días de Navidad”) Escriba una aplicación que utilice instrucciones de repetición y switch
 * para imprimir la canción “Los doce días de Navidad” (The Twelve Days of Christmas). Una instrucción switch debe
 * utilizarse para imprimir el día (es decir, “first”, “second”, etcetera). Una instrucción switch separada debe
 * utilizarse para imprimir el resto de cada verso. Visite el sitio Web en.wikipedia.org/wiki/The_Twelve_Days_of_Christmas_(song)
 * para obtener la letra completa de la canción.
 */

public class U3_Bucles_Ej13_GomezMorales_Alberto {
    public static void main(String[] args){
        for (int dia = 1; dia <= 12; dia++) {
            System.out.print("En el " + obtenerDia(dia) + " día de Navidad,\nMi verdadero amor me dio:\n");

            switch (dia) {
                case 12:
                    System.out.println("\tDoce tambores redoblando,");
                case 11:
                    System.out.println("\tOnce gaitas tocando,");
                case 10:
                    System.out.println("\tDiez señores saltando,");
                case 9:
                    System.out.println("\tNueve damas bailando,");
                case 8:
                    System.out.println("\tOcho criadas ordeñando,");
                case 7:
                    System.out.println("\tSiete cisnes nadando,");
                case 6:
                    System.out.println("\tSeis gansos poniendo,");
                case 5:
                    System.out.println("\tCinco anillos de oro,");
                case 4:
                    System.out.println("\tCuatro aves volando,");
                case 3:
                    System.out.println("\tTres gallinas francesas,");
                case 2:
                    System.out.println("\tDos tórtolas,");
                case 1:
                    if (dia == 1) { //Diferencio el primer día de los demás
                        System.out.println("\tUn loro en un peral.");
                    } else {
                        System.out.println("\tY un loro en un peral.");
                    }
                    break;
            }

            System.out.println();
        }
    }

    public static String obtenerDia(int dia) {
        switch (dia) {
            case 1:
                return "primer";
            case 2:
                return "segundo";
            case 3:
                return "tercer";
            case 4:
                return "cuarto";
            case 5:
                return "quinto";
            case 6:
                return "sexto";
            case 7:
                return "séptimo";
            case 8:
                return "octavo";
            case 9:
                return "noveno";
            case 10:
                return "décimo";
            case 11:
                return "undécimo";
            case 12:
                return "duodécimo";
            default:
                return "";
        }
    }
}
