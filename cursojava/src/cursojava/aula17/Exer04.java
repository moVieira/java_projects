package cursojava.aula17;

public class Exer04 {

	public static void main(String[] args) {

		int popA = 80000;
		int popB = 200000;
		int cont = 0;
		
		while (popA < popB) {
			popA  += (popA/100) * 3;
			popB  += (popB/100) * 1.5;
			cont++;
		}
		System.out.println("PopuA" + popA);
		System.out.println("PopuB" + popB);
		System.out.println("Qtd anos" + cont);

	}

}
