package cursojava.aula19;

import java.util.Scanner;

public class Exer9 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[3];
		int[] vetorB = new int[vetorA.length];
		double[] vetorC = new double[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + i + " do vetor A: ");
			vetorA[i] = scanner.nextInt();	
		}
		
		System.out.println();
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + i + " do vetor B: ");
			vetorB[i] = scanner.nextInt();	
			
			vetorC[i] = vetorA[i] / vetorB[i];
		}
		
		System.out.println();
		
		System.out.print("Vetor A: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor C: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		
	}

}
