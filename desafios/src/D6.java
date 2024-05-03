
import java.util.Locale;
import java.util.Scanner;

public class D6 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("");
            System.out.println("Bem vindo ao nosso verificador de Triangulos!!!");
            System.out.println("Insira os lados do triangulo");

            System.out.println("Lado A:");
            double ladoA = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Lado B:");
            double ladoB = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Lado C:");
            double ladoC = scanner.nextDouble();
            scanner.nextLine();

            if ((ladoA + ladoB) > ladoC && (ladoA + ladoC) > ladoB && (ladoB + ladoC) > ladoA) {
                System.out.println("Triângulo válido");
            } else {
                System.out.println("Triângulo Inválido");
            }

        }
    }
}
