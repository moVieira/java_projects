import java.util.Scanner;

public class imc {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Peso em kg: ");
    float peso = scanner.nextFloat();

    System.out.println("altura em metros: ");
    float altura = scanner.nextFloat();

    float imc = peso / (altura * altura);
    System.out.printf("Seu IMC é: %.1f \n" , imc);
    
        if (imc < 18.5) {
            System.out.println("Classificação: ABAIXO DO PESO MORE!");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Classificação: Normal ok tudo bem.");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Classificação: ta gordinha, flor");
        } else if (imc >= 30.0) {
            System.out.println("Classificação: Imennnnsaaa de gorda");

            
        }
        scanner.close();
    }
}