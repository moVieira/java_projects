package cursojava.aula17;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		
		boolean validar = false;
		
		do {
			System.out.println("Entre com a populacao A: ");
			 popA = scanner.nextDouble();
			 
			 if (popA > 0) {
				 validar = true;
			 } else {
				 System.out.println("A populacao precisa ser maior que 0");
			 }
			
		} while (!validar);
		
		do {
			System.out.println("Entre com a populacao B: ");
			 popB = scanner.nextDouble();
			 
			 if (popB > 0) {
				 validar = true;
			 } else {
				 System.out.println("A populacao precisa ser maior que 0");
			 }
			
		} while (!validar);
		
		do {
			System.out.println("Entre com a taxa de crescimento A: ");
			 taxaA = scanner.nextDouble();
			 
			 if (taxaA > 0) {
				 validar = true;
			 } else {
				 System.out.println("A populacao precisa ser maior que 0");
			 }
			
		} while (!validar);
		
		do {
			System.out.println("Entre com a taxa de crescimento B: ");
			taxaB = scanner.nextDouble();
			 
			 if (taxaB > 0) {
				 validar = true;
			 } else {
				 System.out.println("A populacao precisa ser maior que 0");
			 }
			
		} while (!validar);
		
		
		int cont = 0;
		
		while (popA < popB) {
			
			popA  += (popA/100) * taxaA;
			popB  += (popB/100) * taxaB;
			cont++;
		}
		System.out.println("PopuA" + popA);
		System.out.println("PopuB" + popB);
		System.out.println("Qtd anos" + cont);

	}

	}


