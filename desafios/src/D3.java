import java.util.Scanner;

public class D3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)){
        System.out.println("Digite 2 números");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Digite agora a operação que deverá ser realizada");
        char operacao = scanner.next().charAt(0);

        double resultado;

        switch(operacao){
            case '+' -> {
                resultado = num1 + num2;
            }
            case '-' -> {
                resultado = num1-num2;
            }
            case'/' -> {
                if(num2 != 0 || num1 != 0) {
                    resultado= num1 / num2;
                } else {
                    System.out.println("Erro! Divisão por zero não é permitida");
                    return;
                }
            }
            case '*' -> {
                resultado = num1*num2;
            }
            default -> {
                System.out.println("Operação inválida!");
                return;
            }
        }
        System.out.println("Resultado: " + resultado);
       } 
    
    
    }
}
