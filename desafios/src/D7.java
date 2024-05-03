
import java.util.Locale;
import java.util.Scanner;

public class D7 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Bem vindo ao nosso verificador de numeros primos.");
            System.out.println("Insira aqui o numero que tu deseja verificar");
            int num = scanner.nextInt();

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
