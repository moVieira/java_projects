import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Escreva um num: ");
            int num = scanner.nextInt();

            if
            (num % 2 == 0) {
                System.out.println(num + " é par");
            } else {
                System.out.println(num + " é ímpar");

            }
        }
    }
}