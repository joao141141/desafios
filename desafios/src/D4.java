import java.util.Locale;
import java.util.Scanner;

public class D4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)){


            System.out.println("Insira aqui sua atura");
            double alt = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.println("Insira aqui seu peso:");
            double pes = scanner.nextDouble();
            scanner.nextLine();

            double imc = pes/(alt*alt);

            System.out.println("seu imc é de: " + imc);

            if(imc <= 16.9){
                System.out.println("Você está muito abaixo do peso");
            }
            else if(imc<= 18.4){
                System.out.println("Você está abaixo do peso");
            }
            else if(imc <= 24.9){ 
                System.out.println("Peso Normal");
            }
            else if(imc <= 29.9){
                System.out.println("Acima do peso");
            }
            else if(imc <= 34.9){
                System.out.println("Obesidade Grau 1");
            }
            else if(imc <= 40){
                System.out.println("Obesidade Grau 2");
            }
            else{
                System.out.println("Obesidade grau 3");

            }



        }
    }
}
