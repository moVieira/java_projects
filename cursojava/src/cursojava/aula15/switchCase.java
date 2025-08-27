package cursojava.aula15;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		
		int diaSemana = scanner.nextInt();
		
		switch(diaSemana) {
		
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("TERCA"); break;
		case 4: System.out.println("QUARTA"); break;
		case 5: System.out.println("QUINTA"); break;
		case 6: System.out.println("SEXTA"); break;
		case 7: System.out.println("SABADO"); break;
		
		default: System.out.println("NAO EH UM DIA DA SEMANA VALIDOR!!!!!");
		}

	}

}
