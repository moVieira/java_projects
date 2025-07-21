import java.util.Scanner;

public class MediaAritmetricaAluno {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a primeira nota: ");
            double nota1 = sc.nextDouble();

            System.out.print("Digite a segunda: ");
            double nota2 = sc.nextDouble();

            double media = (nota1 + nota2) / 2;

            System.out.println("Média é: " + media);

            if (media >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}