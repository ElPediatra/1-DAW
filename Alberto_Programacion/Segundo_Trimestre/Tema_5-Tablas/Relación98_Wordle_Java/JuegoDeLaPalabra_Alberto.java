/*
 * Diseña una aplicación llamada "El juego de la palabra". Esta aplicación tendrá un almacén de 366 palabras (en español entre 4 y 6 caracteres quitando las tildes de las palabras) y cada vez que se inicie seleccionará una de ellas para que el jugador la adivine. El programa mostrará el tamaño de la palabra con “_” y el jugador tendrá 5 intentos para adivinar la palabra, escribiendo una palabra y entonces el programa mostrará de color verde las letras que estén en su posición, en color amarillo las letras que esté en la palabra, pero no en su posición correcta y en rojo las que no correspondan a la palabra.
 * Al final confirmará si se ha acertado la palabra o no y los intentos que se han realizado.
 * 1º Seleccionará una palabra de la base de datos.
 * 2º Indicará al usuario el tamaño de la palabra secreta y le solicitará que escriba una palabra del tamaño indicado.
 * 3º Sobre la palabra que ha escrito el usuario, pondrá de color verde las letras que estén correctas en su posición, en amarillo la que sean de la palabra secreta pero no estén en su posición, y en rojo las que no formen parte de la palabra secreta.
 * 4º Cuando el usuario acierte la palabra secreta o se quede sin intentos, indicará si ha acertado la palabra secreta o no e indicará también el número de intentos.
 */

import java.util.Random;
import java.util.Scanner;

public class JuegoDeLaPalabra_Alberto {
    public static void main(String[] args) {
        //Definimos las variables
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        
        // Almacén de palabras
        String[] palabras = {"acero", "acierto", "acorde", "adios", "afan", "agil", "ahora", "ajo", "ajos", "ala", "alea", "alegria", "algo", "alma", "alta", "alto", "amar", "amiga", "amigo", "amor", "ancho", "andar", "año", "añojo", "apoyo", "arena", "arete", "argon", "arroz", "arte", "asar", "asesino", "asno", "astro", "ateo", "atril", "atun", "aula", "aura", "auto", "avion", "avisar", "ayer", "azul", "bache", "bahia", "baila", "baile", "baja", "bajon", "balcon", "baldio", "balsa", "banco", "banda", "barba", "barco", "barro", "basico", "beber", "bebida", "bello", "beso", "bestia", "bien", "bigote", "billete", "blanco", "bloque", "boca", "boda", "bodega", "bola", "bolsa", "bomba", "bondad", "bonito", "borde", "bosque", "bote", "boxeo", "brazo", "breve", "brillar", "brisa", "bronce", "bruto", "buceo", "buey", "buho", "buitre", "burro", "busco", "cabaña", "cabal", "caballo", "cabala", "cabello", "cable", "cabo", "cacho", "cadera", "cafe", "caja", "cajon", "cala", "caldo", "calle", "calor", "campo", "canal", "canguro", "canto", "capaz", "capo", "cara", "caro", "carro", "carta", "casa", "caso", "casta", "castor", "cauce", "causa", "caza", "cazar", "cazo", "cebolla", "ceda", "ceder", "cebra", "cedo", "ceja", "cejas", "cena", "ceniza", "cepa", "cercar", "cerrar", "cerveza", "cesta", "chaleco", "charco", "chico", "chica", "chino", "chispa", "chorizo", "chulo", "ciclón", "cid", "cielo", "cien", "ciervo", "cigarro", "cine", "circo", "ciruela", "cita", "ciudad", "clara", "claro", "clave", "cobarde", "cobra", "coca", "codorniz", "cohete", "cojo", "cola", "colegio", "colgar", "collar", "comer", "cometa", "como", "compás", "contar", "copa", "copiar", "coral", "corcho", "corona", "correr", "cosa", "coser", "costa", "crecer", "creer", "crema", "criar", "cría", "criba", "cruzar", "cuadra", "cuadro", "cuarto", "cuatro", "cubierto", "cubrir", "cuchillo", "cuello", "cuenta", "cuento", "cuerda", "cuesta", "cueva", "cuidar", "culpa", "culto", "cumbre", "cumplir", "cuna", "cundir", "cúpula", "cura", "curar", "curva", "dama", "dar", "dato", "día", "diamante", "diana", "diez", "dinero", "dios", "dirección", "dirigir", "disco", "diseño", "diva", "diván", "divino", "doce", "doble", "docena", "dolor", "domar", "don", "donde", "donar", "dorado", "dos", "dosis", "dragón", "ducha", "duda", "dueño", "dulce", "duna", "duro", "echar", "edad", "edén", "efecto", "egoísta", "eje", "ejército", "elefante", "elegir", "elemento", "elevado", "ella", "ello", "embudo", "emoción", "empate", "empleo", "empresa", "enano", "encima", "encontrar", "enemigo", "energía", "enlace", "enorme", "ensayo", "entrada", "entre", "entregar", "envío", "época", "error", "esbelto", "escala", "escena", "escolta", "escribir", "escuela", "ese", "esencia", "esfera", "esfuerzo", "eso", "espacio", "espalda", "espejo", "espina", "esposa", "esquina", "estar", "este", "esto", "estrés", "estudio", "etapa", "euforia", "europeo", "evento", "examen", "exceso", "excusa", "existir", "éxito", "experto", "explicar", "extra", "fábrica", "fabuloso", "fácil", "falso", "falta", "fama", "familia", "famoso", "fantasma", "farol", "fase", "fatal", "favor", "faz", "febrero", "fecha", "feliz", "felpa", "femenino", "fénix", "feria", "fértil", "fervor", "festejo", "fiable", "ficha", "fiebre", "fiel", "fiera", "fiesta", "figura", "fijar", "fila", "filete", "filo", "filtro", "finca", "finlandés", "firma", "firme", "físico", "flaco", "flauta", "flor", "flota","flujo", "foco", "zurullo"};
        // Generar número aleatorio para seleccionar la palabra
        int indicePalabra = random.nextInt(palabras.length);
        String palabraSecreta = palabras[indicePalabra];
        int longitudPalabra = palabraSecreta.length();

        // Mostrar el tamaño de la palabra con "_"
        char[] letrasAdivinadas = new char[longitudPalabra];
        for (int i = 0; i < longitudPalabra; i++) {
            letrasAdivinadas[i] = '_';
        }
        System.out.println("La palabra tiene " + longitudPalabra + " letras: " + String.valueOf(letrasAdivinadas));

        // Solicitar al usuario que adivine la palabra
        
        int intentos = 5;
        while (intentos > 0) {
            System.out.println("Introduce una palabra de " + longitudPalabra + " letras: ");
            String palabraUsuario = teclado.nextLine();
            // Comprobar si la palabra del usuario coincide con la palabra secreta
            if (palabraUsuario.equalsIgnoreCase(palabraSecreta)) {
                System.out.println("¡Felicidades! Has acertado la palabra secreta en " + (5 - intentos + 1) + " intentos.");
                return;
            }
            // Si la palabra no coincide, mostrar las letras correctas, incorrectas y en posición incorrecta
            char[] letrasUsuario = palabraUsuario.toCharArray();
            for (int i = 0; i < longitudPalabra; i++) {
                char letraUsuario = letrasUsuario[i];
                char letraSecreta = palabraSecreta.charAt(i);
                if (letraUsuario == letraSecreta) {
                    letrasAdivinadas[i] = letraUsuario;
                } else if (palabraSecreta.indexOf(letraUsuario) >= 0) {
                    System.out.print("\033[33m" + letraUsuario);
                } else {
                    System.out.print("\033[31m" + letraUsuario);
                }
            }
            System.out.println("\033[0m");
            System.out.println(String.valueOf(letrasAdivinadas));
            intentos--;
        }
        // Si el usuario no acierta la palabra en 5 intentos, mostrar la palabra secreta
        System.out.println("Lo siento, no has acertado la palabra secreta. La palabra era " + palabraSecreta + ".");
    }
}