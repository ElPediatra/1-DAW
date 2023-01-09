import java.util.Scanner;

public class ExamenCorregido_Alberto {
    public static void main(String[] args) {

        //Definimos las variables
        Scanner teclado=new Scanner(System.in);
		int numero;
		char salir='n';
        
        /* Mensajes de bienvenida o rechazo del programa */
		String aceptado="Puede quedarse en la pensión.";
        String rechazado="Lo sentimos, pero no cumple los requisitos para quedarse.";

		//Desarrollamos el programa
		System.out.println("Bienvenido a la pensión de los números.");
        System.out.println("Indique su nombre (número) o pulsa 0 para salir:")

		do{
			if(numero==0){ //Opción de salir
				System.out.println("\t\tHas elegido salir, ¿estas seguro? (s/n)");
				salir=teclado.next().charAt(0);
				System.out.println();
				numero++; //Sumo 1 para que pase al switch y salte la opción 'default'
			} else {
				do { //Solicito el número del visitante
                    switch(numero) {
						case 8:
							System.out.println("Buenas 8, usted ya está hospeado en la pensión. ¿Es posible que se haya equivocado de número?");
							break;
						case 12:
							System.out.println("Buenas 12, usted ya está hospeado en la pensión. ¿Es posible que se haya equivocado de número?");
							break;
						default:
							System.out.println("Bienvenido a la recepción de la Pensión de los números, indique su número para comprobar su admisión:");
							break;
					}
					numero=teclado.nextInt();
				} while(numero==8 || numero==12); //Comprobar requisitos si no es ninguno de los inquilinos actuales
				if(numero==0) {
					System.out.println();
					continue;
				}
				if(negativo(numero)){ //Comprobamos si es negativo
					System.out.println(rechazado);
				}
				else{ //Comprobamos si es primo
					if(primo(numero)){
						System.out.println(rechazado);
					}
					else{//Comprobamos su factorial
						if(factorial(numero)>1000000000 || factorial(numero)<=0){
							System.out.println(rechazado);
						}
						else{
							System.out.println(aceptado);
						}
					}
				}
			}
		}while(salir=='n');
		System.out.println("Gracias por presentar su solicitud de admisión a la Pensión de los números.\nHasta la próxima.");
	}

	public static boolean negativo(int numero){}
		boolean esNegativo = numero < 0;
		return esNegativo;
	}

	public static boolean primo(int numero){
		boolean esPrimo=true;
		int aux=2;
		while(esPrimo && aux<n){.
			esPrimo=n%aux==0?false:true;
			aux++;
		}
		return esPrimo;
	}

	public static long factorial(int n){
		long factorial2=1;
		for(int i=2;i<=n;i++){
			factorial2*=i;
		}
		return factorial2;
	}
}