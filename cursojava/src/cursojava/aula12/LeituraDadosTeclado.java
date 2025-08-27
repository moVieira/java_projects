package cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nome = scanner.nextLine();
		System.out.println("Seu nome: " + nome);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scanner.next();
		System.out.println("Seu primeiro nome: " + primeiroNome);
		
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		System.out.println("Sua idade: " + idade);
		

	}

}
