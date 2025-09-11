package cursojava.aula19;

import java.util.Scanner;

public class Exer1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
	 
	int[] a = new int[5];
	int[] b = new int[a.length];
	

	for (int i = 0; i < a.length; i++) {
		
		System.out.println("Entre com o valor da posicao: : " + i); 
		a[i] = scanner.nextInt();
		
		b[i] = a[i];
    }
	

	
	System.out.print("Vetor A: ");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
	}
	System.out.println();
	
	System.out.println("Vetor B:");
    for (int i = 0; i < b.length; i++) {
        System.out.println(b[i]);
    }
	
	
		
		
		}
	
	
	
	
			
			}





