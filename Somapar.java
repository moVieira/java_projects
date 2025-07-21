import java.util.Scanner;

public class Somapar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        int soma = 0;
        
        for (int i = 2; i <= 100; i += 2) {
            if (i % 2 == 0);
            soma += i;
        }
        System.out.println("Resultado: " + soma);   


        }
    }   
}
