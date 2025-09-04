package cursojava.aula17;

import java.util.Scanner;

public class Exercicios17_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in); 
		
		boolean validar = false;
		
		do { 
			System.out.println("Digite seu nome de usuario: ");
			String nome = scanner.nextLine();
			
			System.out.println("Digite sua senha: ");
			String senha = scanner.nextLine();
			
			if( nome.equalsIgnoreCase(senha)) {
				
				System.out.println("A senha nao pode ser igual o nome de usuario!! Digite novamente: ");
				
				
			} else {
				System.out.println("Usuario e senha validados!");
				validar = true;
				
			}
			
		}while (!validar); //true ! nega
		
		

	}

}
