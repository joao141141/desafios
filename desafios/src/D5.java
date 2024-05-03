import java.util.Locale;
import java.util.Scanner;


public class D5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
            try(Scanner scanner = new Scanner (System.in).useLocale(Locale.US)){

                System.out.println("Bem vindo ao conversor de temperatura para Fahrenheit ou Kelvin.");
                System.out.println("Insira aqui o valor em Celsius que iremos converter");

                double convTemp;

                double temp = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Agora selecione para qual tu quer converter:");
                System.out.println("suas opções são:");
                System.out.println("K para Kelvin");
                System.out.println("F para Fahrenheit");
                
                String opc = scanner.nextLine().toLowerCase();
                

                if("f".equals(opc)) {
                    convTemp = (temp*1.8) + 32;
                    System.out.println("A temperatura em Fahrenheit é: " + convTemp);
                }
                else if("k".equals(opc)){
                    convTemp = temp + 273;
                    System.out.println("A temperatura em Kelvin é: " + convTemp);
                }
                else {
                    System.out.println("Opção invalida.");
                }


            } catch(Exception e){
                System.out.println("Ocorreu um erro, certifique-se de inserir todos os valores corretamente");
            }
    }
}

