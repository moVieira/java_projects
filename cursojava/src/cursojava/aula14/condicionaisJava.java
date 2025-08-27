package cursojava.aula14;

import java.util.Scanner;

public class condicionaisJava {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//
		System.out.print("Digite sua idade!!! ");
		
		int idade = scanner.nextInt();
		
		if(idade >= 18) {
			System.out.println("Eh de maior!!!");
		
		} else {
			System.out.println("NAO EH DE MAIOR!!!");
		}
		
		
		
		System.out.println("DIGITE O PRECOR VEYRRR: ");
		double precoItem = scanner.nextDouble();
		
		if(precoItem <= 10) {
			System.out.println("TA BARATO");
			
		}else if((precoItem >= 10) && (precoItem < 15)){
			System.out.print("PEDE DESCONTO VEIR");
			
		}else if((precoItem >= 15) && (precoItem < 17)){
			System.out.println("PESQUISA MAIS VEIR");
			
		}else {
			System.out.println("SAI FORA MT CARO VEIR!!!!!");
		
		
	}
  }
}
