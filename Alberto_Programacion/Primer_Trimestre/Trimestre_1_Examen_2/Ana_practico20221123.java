import java.util.Scanner;
public class Ana_practico20221123{

	public static void main(String[] args){

	  //Def. de variables
      Scanner teclado= new Scanner(System.in);
	  boolean salir=false, valido=true, primo=true;
      byte opcion=1;
      char confirmacion='s';
	  int huesped=0;
	  long fact=0, billon=1000000000;
      String mensaje="";

	  // Desarrollo del programa

        do{
           mostrar();
	       opcion=teclado.nextByte();
		   switch(opcion){
              case 1://Vamos a pedir un numero y ver si es válido
 					System.out.println("¿Quien se va a alojar?");
                    huesped=teclado.nextInt();
                    if((huesped==12) || (huesped==8) || (huesped==0)){
						valido= false;
						mensaje=" ,ya es huesped.";	
						}
                    else{
                        if (huesped<0){  //Negativos no
							valido=false;
							mensaje=", tiene actitudes negativas ante la vida";
							} 
						else{
                          fact=huesped;
                           for (int i=huesped;i>=2;i--){ //calculamos el factorial
                               i*=i;
							   fact=i;				
				    	    }
                           if (fact>=billon){ //es ricachon?
                              valido=false; 
                              mensaje=", mejor se aloja en el Number Astoria de mas categoria."; 
						   }
						
						   //System.out.println(huesped);
                           for(int i=huesped-1;i>1;i--){  //Primos no
							   
                               if((huesped%i)==0){						 		
								  	primo=false;
  			  						mensaje=", demasiado presuntuoso";                                  
								} 
                             
                           } //end for
                        if (primo){
							valido=false;
							mensaje=", demasiado presuntuoso";
						 }
						}//fin else-neg
					} //fin else-validos
				   
				  if (valido){
					System.out.println("Bienvenido, puede usted alojarse número "+huesped);
					}
				  else{
					System.out.println("Lo siento número "+huesped+" no cumple con los requisitos para ser alojado"+ mensaje);
                  }
                  break;
			  case 2:
                  System.out.println("Has elegido salir, estas seguro(s/n)");
                  confirmacion=teclado.next().charAt(0);

                  if (confirmacion=='s'){
					  System.out.println("\t\t\tConfirmada tu salida.Bye!!");
                      salir=true;
					  break;	
					}
				  break;
			  default:
				  System.out.println("Opción no válida");


		 }
		}while (!salir);
	}//fin del main
	public static void mostrar(){
		System.out.println("\t\t\t\tBienvenido a la Pensión de los Números");
		System.out.println("1.Pedir una habitación");
        System.out.println("2.Salir");
		System.out.println("¿Cuál es la opción elegida?");

	}

   


}
