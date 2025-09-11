package cursojava.aula19;

import java.util.Scanner;

public class Exer4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[2];
		double[] vetorB = new double[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + i +": ");
			vetorA[i] = scanner.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		System.out.print("Vetor A: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B: ");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
	}

}
