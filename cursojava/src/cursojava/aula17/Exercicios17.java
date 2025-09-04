package cursojava.aula17;

import java.util.Scanner;

public class Exercicios17 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean validar = false;
		
	do {
			
		System.out.println("Digite umam nota entre 0 e 10: ");
		double nota = scanner.nextDouble();
		
		
		if (nota >=0 && nota <=10 ) {
			validar = true;
			System.out.println("Voce digitou a nota: " + nota);
			
		} else {
			System.out.println("Nota invalida digite novamente: ");
		}
		
	} while (!validar);


	}

}
