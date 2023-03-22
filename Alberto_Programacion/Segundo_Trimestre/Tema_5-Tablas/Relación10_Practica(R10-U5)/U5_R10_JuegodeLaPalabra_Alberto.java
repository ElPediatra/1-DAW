/*
 * Diseña una aplicación llamada "El juego de la palabra". Esta aplicación tendrá un almacén de 366 palabras (en español entre 4 y 6 caracteres quitando las tildes de las
 * palabras) y cada vez que se inicie seleccionará una de ellas para que el jugador la adivine. El programa mostrará el tamaño de la palabra con '_' y el jugador tendrá 5
 * intentos para adivinar la palabra, escribiendo una palabra y entonces el programa mostrará de color verde las letras que estén en su posición, en color amarillo las letras
 * que esté en la palabra, pero no en su posición correcta y en rojo las que no correspondan a la palabra.
 *
 * Al final confirmará si se ha acertado la palabra o no y los intentos que se han realizado.
 *
 * 1º Seleccionará una palabra de la base de datos.
 * 2º Indicará al usuario el tamaño de la palabra secreta y le solicitará que escriba una palabra del tamaño indicado.
 * 3º Sobre la palabra que ha escrito el usuario, pondrá de color verde las letras que estén correctas en su posición, en amarillo la que sean de la palabra secreta pero no
 * estén en su posición, y en rojo las que no formen parte de la palabra secreta.
 * 4º Cuando el usuario acierte la palabra secreta o se quede sin intentos, indicará si ha acertado la palabra secreta o no e indicará también el número de intentos.
 */

import java.util.Random;
import java.util.Scanner;
 
public class U5_R10_JuegodeLaPalabra_Alberto {

    /* Textos de colores */
    public static final String RESET = "\u001B[0m"; //Resetear el color al original
    public static final String RED = "\u001B[31m"; //Rojo para las letras erróneas
    public static final String GREEN = "\u001B[32m"; //Verde para las letras correctas en SU POSICIÓN
    public static final String YELLOW = "\u001B[33m"; //Amarillo para las letras correctas SIN POSICIÓN
    public static final String PURPLE = "\u001B[35m"; //Morado para decorar
    public static final String BLUE = "\u001B[34m"; //Azul para decorar

     public static void main(String[] args) {
         //Definimos las variables
         Scanner teclado = new Scanner(System.in);
         Random random = new Random();
         /* Creo un almacén de palabras para usar (le quito las tíldes para que las detece) */
         String[] palabras = {"acero", "acierto", "acorde", "adios", "afan", "agil", "ahora", "ajo", "ajos", "ala", "alea", "alegria", "algo", "alma", "alta", "alto", "amar", "amiga", "amigo", "amor", "ancho", "andar", "año", "añojo", "apoyo", "arena", "arete", "argon", "arroz", "arte", "asar", "asesino", "asno", "astro", "ateo", "atril", "atun", "aula", "aura", "auto", "avion", "avisar", "ayer", "azul", "bache", "bahia", "baila", "baile", "baja", "bajon", "balcon", "baldio", "balsa", "banco", "banda", "barba", "barco", "barro", "basico", "beber", "bebida", "bello", "beso", "bestia", "bien", "bigote", "billete", "blanco", "bloque", "boca", "boda", "bodega", "bola", "bolsa", "bomba", "bondad", "bonito", "borde", "bosque", "bote", "boxeo", "brazo", "breve", "brillar", "brisa", "bronce", "bruto", "buceo", "buey", "buho", "buitre", "burro", "busco", "cabaña", "cabal", "caballo", "cabala", "cabello", "cable", "cabo", "cacho", "cadera", "cafe", "caja", "cajon", "cala", "caldo", "calle", "calor", "campo", "canal", "canguro", "canto", "capaz", "capo", "cara", "caro", "carro", "carta", "casa", "caso", "casta", "castor", "cauce", "causa", "caza", "cazar", "cazo", "cebolla", "ceda", "ceder", "cebra", "cedo", "ceja", "cejas", "cena", "ceniza", "cepa", "cercar", "cerrar", "cerveza", "cesta", "chaleco", "charco", "chico", "chica", "chino", "chispa", "chorizo", "chulo", "ciclon", "cid", "cielo", "cien", "ciervo", "cigarro", "cine", "circo", "ciruela", "cita", "ciudad", "clara", "claro", "clave", "cobarde", "cobra", "coca", "codorniz", "cohete", "cojo", "cola", "colegio", "colgar", "collar", "comer", "cometa", "como", "compas", "contar", "copa", "copiar", "coral", "corcho", "corona", "correr", "cosa", "coser", "costa", "crecer", "creer", "crema", "criar", "cria", "criba", "cruzar", "cuadra", "cuadro", "cuarto", "cuatro", "cubierto", "cubrir", "cuchillo", "cuello", "cuenta", "cuento", "cuerda", "cuesta", "cueva", "cuidar", "culpa", "culto", "cumbre", "cumplir", "cuna", "cundir", "cupula", "cura", "curar", "curva", "dama", "dar", "dato", "dia", "diamante", "diana", "diez", "dinero", "dios", "direccion", "dirigir", "disco", "diseño", "diva", "divan", "divino", "doce", "doble", "docena", "dolor", "domar", "don", "donde", "donar", "dorado", "dos", "dosis", "dragon", "ducha", "duda", "dueño", "dulce", "duna", "duro", "echar", "edad", "eden", "efecto", "egoista", "eje", "ejercito", "elefante", "elegir", "elemento", "elevado", "ella", "ello", "embudo", "emocion", "empate", "empleo", "empresa", "enano", "encima", "encontrar", "enemigo", "energia", "enlace", "enorme", "ensayo", "entrada", "entre", "entregar", "envio", "epoca", "error", "esbelto", "escala", "escena", "escolta", "escribir", "escuela", "ese", "esencia", "esfera", "esfuerzo", "eso", "espacio", "espalda", "espejo", "espina", "esposa", "esquina", "estar", "este", "esto", "estres", "estudio", "etapa", "euforia", "europeo", "evento", "examen", "exceso", "excusa", "existir", "exito", "experto", "explicar", "extra", "fabrica", "fabuloso", "facil", "falso", "falta", "fama", "familia", "famoso", "fantasma", "farol", "fase", "fatal", "favor", "faz", "febrero", "fecha", "feliz", "felpa", "femenino", "fenix", "feria", "fertil", "fervor", "festejo", "fiable", "ficha", "fiebre", "fiel", "fiera", "fiesta", "figura", "fijar", "fila", "filete", "filo", "filtro", "finca", "finlandes", "firma", "firme", "fisico", "flaco", "flauta", "flor", "flota","flujo", "foco", "zurullo"};
         int indicePalabra;
         String palabraSecreta;
         int longitudPalabra;
         char[] letrasAdivinadas;
         char[] letrasUsuario;
         char letraUsuario;
         char letraSecreta;
         int intentos;

 
         /* Uso Random para seleccionar una palabra y su longitud */
         indicePalabra = random.nextInt(palabras.length);
         palabraSecreta = palabras[indicePalabra];
         longitudPalabra = palabraSecreta.length();
         intentos = longitudPalabra; /* Asigno el número de intentos al tamaño de la palabra */
          
         //Desarrollamos el programa
         System.out.println(YELLOW + "*************************************************************************************" + RESET);
         System.out.println(YELLOW + "*************** "+RESET+BLUE+"Bienvenido al juego de la palabra (Wordle)"+RESET+YELLOW+" **************************" + RESET);
         System.out.println(YELLOW + "*************************************************************************************" + RESET);
         System.out.println("");

         /* Muestro el tamaño de la palabra con "_" y lo indíco*/
         letrasAdivinadas = new char[longitudPalabra];
         for (int i = 0; i < longitudPalabra; i++) {
             letrasAdivinadas[i] = '_';
         }

         System.out.println("Dispones de "+intentos+" intentos para acetar la palabra, el programa te indicará si has acertado o no cada letra.");
         System.out.println("\tMarcará en "+RED+"ROJO "+RESET+"si la letra no es correcta.");
         System.out.println("\tMarcará en "+YELLOW+"AMARILLO "+RESET+"si está en la palabra pero no en su sitio");
         System.out.println("\tMarcará en "+GREEN+"VERDE "+RESET+"si está en su posición correcta.");
         System.out.println("");

         System.out.println("\tLa palabra tiene " + longitudPalabra + " letras: " + String.valueOf(letrasAdivinadas));
         System.out.println("");
 
         /* Le pido al usuario que intente adivinar la palabra */
         while (intentos > 0) {
             System.out.print("Introduce una palabra de " + longitudPalabra + " letras: ");
             String palabraUsuario = teclado.nextLine().toLowerCase(); //Paso la palabra a minúscula para que no haya fallos al comparar

             /* Compruebo la palabra y de ser correcta mando mensaje con el número de aciertos */
             if (palabraUsuario.equalsIgnoreCase(palabraSecreta)) {
                 System.out.println("¡Felicidades! Has acertado la palabra secreta en " + (5 - intentos + 1) + " intentos.");
                 return;
             }

             /* Si la palabra no coincide, mustrar las letras correctas, incorrectas (rojo) y en posición incorrecta (amarillo-naranja)*/
             letrasUsuario = palabraUsuario.toCharArray(); //Convierto la palabra del usuario a un array de chars
             for (int i = 0; i < longitudPalabra; i++) { //Recorro y comparo arrays
                 letraUsuario = letrasUsuario[i];
                 letraSecreta = palabraSecreta.charAt(i);
                 if (letraUsuario == letraSecreta) {
                     letrasAdivinadas[i] = letraUsuario; //Si es correcta la almaceno para mostrarla después por separado
                     System.out.print(GREEN + letraUsuario + RESET);
                 } else if (palabraSecreta.indexOf(letraUsuario) >= 0) {
                     System.out.print(YELLOW + letraUsuario + RESET);
                 } else {
                     System.out.print(RED + letraUsuario + RESET);
                 }
             }

             System.out.println();
             System.out.println(String.valueOf(letrasAdivinadas)); //Cambio la letra adivinada en el '_' de la posición correspondiente
             intentos--; // Resto un intento
             System.out.println("Te quedan "+RED+intentos+RESET+" intentos.");
         }

            /* Si el usuario no acierta la palabra en 5 intentos, mostrar la palabra secreta */
            System.out.println(PURPLE + "Mala suerte, " + RESET + BLUE + "no has acertado la palabra secreta. La palabra era " + RESET + YELLOW + palabraSecreta + RESET + ".");
     }
 }