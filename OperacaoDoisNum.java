import java.util.Scanner;

public class OperacaoDoisNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro num: ");
        int num1 = scanner.nextInt();

        System.out.println("Segundo num: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite a operação desejada (+, -, *, /): ");
        char oper = scanner.next().charAt(0);

        switch (oper) {
            case '+':
                System.out.println("O resultado de " + num1 + " + " + num2 + " é "  + (num1 + num2));
                break;
            case '-':
            System.out.println("O resultado de " + num1 + " - " + num2 + " é "  + (num1 - num2));
                break;
            case '*':
            System.out.println("O resultado de " + num1 + " * " + num2 + " é "  + (num1 * num2));
                break;
            case '/':
                if (num2 != 0){
                    System.out.println("O resultado de " + num1 + " / " + num2 + " é " + (num1 / num2));
                } else {
                    System.out.println("Por 0 nao pode ok?");
                }
                break;  
            default:
                System.out.println("Operação inválida");
                break;
        }

        scanner.close();

    }
}