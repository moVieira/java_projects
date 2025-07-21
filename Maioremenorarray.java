import java.util.Scanner;

public class Maioremenorarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int maxi, mini;

        System.out.println("digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        maxi = numbers[0];
        mini = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxi) {
                maxi = numbers[i];
            }
            if (numbers[i] < mini) {
                mini = numbers[i];
            }
        }
        System.out.println("Maior valor: " + maxi);
        System.out.println("Menor valor: " + mini);
    }
}