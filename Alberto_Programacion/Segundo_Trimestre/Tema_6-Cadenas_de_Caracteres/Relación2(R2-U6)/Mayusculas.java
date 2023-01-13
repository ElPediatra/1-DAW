import java.util.Scanner;
    public class R2_U6_EJ2_Alberto {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String frase = sc.nextLine();
            String x = sc.nextLine();
            System.out.println(frase.replace(x,x.toUpperCase()));
    
        }
    }