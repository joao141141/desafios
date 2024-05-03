import java.util.Scanner;


public class D2 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira os 3 lados do triangulo");


            int lado1 = scanner.nextInt();
            int lado2 = scanner.nextInt();
            int lado3 = scanner.nextInt();


            if(lado1 == lado2 && lado2 == lado3){
                System.out.println("este é um triangulo equilátero!");
            }
            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Este é um triangulo isósceles!");
            }
            else {
                System.out.println("Este é um triangulo Escaleno");
            }
        }

    }
}
