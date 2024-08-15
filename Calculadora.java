import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora!");
        System.out.println("Escolha a operação desejada:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Digite o número da operação: ");
        int operacao = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("O resultado da adição é: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("O resultado da divisão é: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }
        scanner.close();
    }
}
