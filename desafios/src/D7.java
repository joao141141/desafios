
import java.util.Locale;
import java.util.Scanner;

public class D7 {
    //atualizado

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("Bem vindo ao nosso verificador de numeros primos.");
            int num;

            do {
                try {
                    System.out.println("Insira um numero inteiro positivo maior do que 1 para que nosso sistema verifique se o mesmo é ou nao um número primo");
                    num = scanner.nextInt();

                    if (num <= 1) {
                        throw new IllegalArgumentException("Número invalido. Insira um número inteiro positivo maior do que 1.");
                    }
                } catch (Exception e) {
                    scanner.nextLine();
                    System.out.println("Erro: " + e.getMessage());
                    num = 0;
                }
            } while (num <= 1);

            boolean primo = verificarPrimo(num);

            if (primo) {
                System.out.println("O numero " + num + " é primo");
            } else {
                System.out.println("O numero " + num + " não é primo");
            }

            scanner.close();
        }
    }

    public static boolean verificarPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
