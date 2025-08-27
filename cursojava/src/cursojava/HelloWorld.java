package cursojava;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o n1: ");
		int n1 = scanner.nextInt();
		
		System.out.print("Digite o n2: ");
		int n2 = scanner.nextInt();
		
		int soma = n1 + n2;
		
		System.out.print("A soma eh: " + soma);
		
	scanner.close();
		
		
		// TODO Auto-generated method stub

	}

}
