import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("insira um numero de 1 a 7");
            int num = scanner.nextInt();

            switch (num) {
                case 1 ->  {
                    System.out.println("Hoje é Domingo!");
                }
                case 2 ->  {
                    System.out.println("Hoje é segunda-feira!");
                }
                case 3 ->  {
                    System.out.println("Hoje é Terça-feira!");
                }
                case 4 ->  {
                    System.out.println("Hoje é Quarta-feira!");
                }
                case 5 ->  {
                    System.out.println("Hoje é Quinta-feira!");
                }
                case 6 ->  {
                    System.out.println("Hoje é Sexta-feira!");
                }
                case 7 ->  {
                    System.out.println("Hoje é Sabado!");
                }
                default -> {
                System.out.println("Invalido");
                }
            }
        }
        
    }
}
