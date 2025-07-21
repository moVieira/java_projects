import java.util.Scanner;

public class Deznum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int[] num = new int[10];
            int contar = 0;

            System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Digite um numero especifico: ");
        int numEspecifico = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (num[i] == numEspecifico) {
                contar++;
            }
        }

        // Imprime o resultado
        System.out.println("O número " + numEspecifico + " apareceu " + contar + " X.");

        sc.close();
    }
}