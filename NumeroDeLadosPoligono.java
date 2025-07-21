import java.util.Scanner;

public class NumeroDeLadosPoligono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lados do polígono convexo: ");
        int nLados = scanner.nextInt();

        if (nLados >= 3) {

            int nDiagonais = (nLados * (nLados - 3)) / 2;

            System.out.println("O num de diagonais é: " + nDiagonais);  
        } else {
            System.out.println("tem q ter pelo menos 3 lados");
    }
    scanner.close();
} 
}