import java.util.Scanner;

public class Practico25012023_AlbertoGomezMorales{
    public static void main(String[] args){

        //Definimos las variables
        byte opcion;
        char confirmacion;
        boolean salir=false;
        Scanner teclado = new Scanner(System.in);

        //Desarrollamos el programa
        do{
            menu();
                opcion=teclado.nextByte();
            switch(opcion) {
                case 1:
                    ejercicio1();
                break;

                case 2:
                    ejercicio2();
                break;

                case 3:
                    ejercicio3();
                break;

                case 0:
                    System.out.println("Has elegido salir, ¿estás seguro?(s/n)");
                    confirmacion=teclado.next().charAt(0);

                    if(confirmacion=='s' || confirmacion=='S'){
                        System.out.println("\t\t Confirmada su salida del programa. ¡Hasta la próxima!");
                        salir=true;
                        break;
                        }
                break;

                default:
                    System.out.println("Opción no válida. Por favor, selecciona otra opción.");
             }
            }while (!salir);
        }

//Funciones/Métodos

	/* Menú Principal*/
    public static void menu(){
        System.out.println("\t\t ");
        System.out.println("0.Salir.");
        System.out.println("1.Traducir una frase de Español a Morse.");
        System.out.println("2.Traducir una frase de Morse a Español.");
        System.out.println("3.Contar la longitud de las palabras de una frase e indicar su cantidad.");
        System.out.println("\t\tSeleccione una opción por favor.");
    }
	
	/* Traducir palabras a Morse */
	public static void ejercicio1(){
		/* General */
		Scanner teclado = new Scanner(System.in);

		/* Menú Interno */
		char confirmacion1;
        boolean salir1=false;
        
		/* Método */
		String frase1;
		String aux1;
		String traduccion1;

		//.replaceAll("", "");

		//Desarrollamos el método
		System.out.println("Has seleccionado la Opción 1. Traducir un texto de español a morse.");

		while (!salir1){
		System.out.println("Por favor, indica la frase que quieres traducir:");
		frase1 = teclado.nextLine();
		
		aux1 = frase1.toLowerCase(); //Lo paso todo a minúsculas para simplificar el trabajo con la frase

		aux1 = aux1.replaceAll(" ","  ");//Convierto los espacios en 2 espacios para separar las frases(añadire el 3º al convertir las letras)
		aux1 = aux1.replaceAll("a",".- ").replaceAll("b","-... ").replaceAll("c","-.-. ").replaceAll("d","-.. ").replaceAll("e",". ").replaceAll("f","..-. ").replaceAll("g","--. ").replaceAll("h",".... ").replaceAll("i",".. ").replaceAll("j",".--- ").replaceAll("k","-.- ").replaceAll("l",".-.. ").replaceAll("m","-- ").replaceAll("n","-. ").replaceAll("o","--- ").replaceAll("p",".--. ").replaceAll("q","--.- ").replaceAll("r",".-. ").replaceAll("s","... ").replaceAll("t","- ").replaceAll("u","..- ").replaceAll("v","...- ").replaceAll("w",".-- ").replaceAll("x","-..- ").replaceAll("y","-.-- ").replaceAll("z","--.. ").replaceAll("0",".---- ").replaceAll("1","..--- ").replaceAll("2","...-- ").replaceAll("3","....- ").replaceAll("4","..... ").replaceAll("5","-.... ").replaceAll("6","--... ").replaceAll("7","---.. ").replaceAll("8","----. ").replaceAll("9","----- ");

		traduccion1 = aux1.trim(); //Le quito el espacio del final a la frase

		System.out.println("La frase '"+frase1+"' en morse es: "+traduccion1);

		System.out.println("¿Quieres volver al menú principal? (s/n)");
		confirmacion1 = teclado.next().charAt(0);

			if(confirmacion1=='s' || confirmacion1=='S'){
                        System.out.println("\t\t Le devolvemos al menú principal");
                        salir1=true;
                        } else {
							ejercicio1();
						}
		}
	}
	
	/* Traducir de Morse a Español */
	public static void ejercicio2(){
		/* General */
		Scanner teclado = new Scanner(System.in);

		/* Menú Interno */
		char confirmacion2;
        boolean salir2=false;
        
		/* Método */
		String frase2;
		String aux2;
		String traduccion2;

		//Desarrollamos el método
		System.out.println("Has seleccionado la Opción 2. Traducir un texto de morse a español.");

		while (!salir2){
		System.out.println("Recuerda que para que el programa funcione correctamente tienes que:");
		System.out.println("\t\tSeparar cada letra con 1 espacio ' '.");
		System.out.println("\t\tSeparar cada palabra con 3 espacios '   '.");
		System.out.println("Por favor, indica la frase que quieres traducir: ");
		frase2 = teclado.nextLine();

		//Convierto los códigos morse en letras del abecedario
		aux2 = frase2.replaceAll(".-","a");
		aux2 = aux2.replaceAll("-...","b");
		aux2 = aux2.replaceAll("-.-.","c");
		aux2 = aux2.replaceAll("-..","d");
		aux2 = aux2.replaceAll(".","e");
		aux2 = aux2.replaceAll("..-.","f");
		aux2 = aux2.replaceAll("--.","g");
		aux2 = aux2.replaceAll("....","h");
		aux2 = aux2.replaceAll("..","i");
		aux2 = aux2.replaceAll(".---","j");
		aux2 = aux2.replaceAll("-.-","k");
		aux2 = aux2.replaceAll(".-..","l");
		aux2 = aux2.replaceAll("--","m");
		aux2 = aux2.replaceAll("-.","n");
		aux2 = aux2.replaceAll("---","o");
		aux2 = aux2.replaceAll(".--.","p");
		aux2 = aux2.replaceAll("--.-","q");
		aux2 = aux2.replaceAll(".-.","r");
		aux2 = aux2.replaceAll("...","s");
		aux2 = aux2.replaceAll("-","t");
		aux2 = aux2.replaceAll("..-","u");
		aux2 = aux2.replaceAll("...-","v");
		aux2 = aux2.replaceAll(".--","w");
		aux2 = aux2.replaceAll("-..-","x");
		aux2 = aux2.replaceAll("-.--","y");
		aux2 = aux2.replaceAll("--..","z");
		aux2 = aux2.replaceAll(".----","0");
		aux2 = aux2.replaceAll("..---","1");
		aux2 = aux2.replaceAll("...--","2");
		aux2 = aux2.replaceAll("....-","3");
		aux2 = aux2.replaceAll(".....","4");
		aux2 = aux2.replaceAll("-....","5");
		aux2 = aux2.replaceAll("--...","6");
		aux2 = aux2.replaceAll("---..","7");
		aux2 = aux2.replaceAll("----.","8");
		aux2 = aux2.replaceAll("-----","9");
		
/* aux2 = frase2.replaceAll(".-","a").replaceAll("-...","b").replaceAll("-.-.","c").replaceAll("-..","d").replaceAll(".","e").replaceAll("..-.","f").replaceAll("--.","g").replaceAll("....","h").replaceAll("..","i").replaceAll(".---","j").replaceAll("-.-","k").replaceAll(".-..","l").replaceAll("--","m").replaceAll("-.","n").replaceAll("---","o").replaceAll(".--.","p").replaceAll("--.-","q").replaceAll(".-.","r").replaceAll("...","s").replaceAll("-","t").replaceAll("..-","u").replaceAll("...-","v").replaceAll(".--","w").replaceAll("-..-","x").replaceAll("-.--","y").replaceAll("--..","z").replaceAll(".----","0").replaceAll("..---","1").replaceAll("...--","2").replaceAll("....-","3").replaceAll(".....","4").replaceAll("-....","5").replaceAll("--...","6").replaceAll("---..","7").replaceAll("----.","8").replaceAll("-----","9");
		 */
		//Convierto el conjunto de 3 espacios '   ' en otro caracter para no borrarlo con el resto
		aux2=aux2.replaceAll("   ","_");

		//Quito los espacios que hay entre las letras
		aux2=aux2.replaceAll(" ","");

		//vuelvo a transformar el espacio entre frases para que sea 1 espacio ' '.
		aux2=aux2.replaceAll("_"," ");

		traduccion2=aux2;

		System.out.println("La frase '"+frase2+"' en español es: "+traduccion2);

		System.out.println("¿Quieres volver al menú? (s/n)");
		confirmacion2 = teclado.next().charAt(0);

			if(confirmacion2=='s' || confirmacion2=='S'){
                        System.out.println("\t\t Le devolvemos al menú principal");
                        salir2=true;
                        break;
                        }
		}

	}

	/* Contar el tamaño de las palabras de una frase */
	public static void ejercicio3(){

	/* General */
		Scanner teclado = new Scanner(System.in);

		/* Menú Interno */
		char confirmacion3;
        boolean salir3=false;
        
		/* Método */
		String frase3;

		/* No lo he sacado al final, tenía en mente que tenia que separar las palabras, cada vez que llegase a un espacio, cortar el tramo desde el "inicio" a ese espacio (sin contarlo) y contar la cantidad de chars que hay en la palabra... pero no he encontrado la manera de que me funcionase asi que dejo el mensaje de "en desarrollo y la opción de salir o no" */
		//substring();
		//lenght();

		//Desarrollamos el método
		System.out.println("Has seleccionado la Opción 3. Contar la longitud de las palabras de una frase e indicar su cantidad.");

		while (!salir3){
		System.out.println("\t\tOpción en desarrollo, no implementada todavía.");
		System.out.println("\t\tDisculpe las molestias.");

		System.out.println("¿Quieres volver al menú? (s/n)");
		confirmacion3 = teclado.next().charAt(0);

			if(confirmacion3=='s' || confirmacion3=='S'){
                        System.out.println("\t\t Le devolvemos al menú principal");
                        salir3=true;
                        break;
                        }
		}	
	}
}
