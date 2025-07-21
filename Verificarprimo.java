import java.util.Scanner;

public class Verificarprimo {
    public static boolean primo(int numero) {
        if (numero <= 1) return false;
        if (numero == 2) return true;
        if (numero % 2 == 0) return false;
        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();
        
        if (numero <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {
            System.out.println(numero + (primo(numero) ? " é um número primo." : " não é um número primo."));
        }
        
        sc.close();
    }
}
