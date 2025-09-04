package cursojava.aula17;

import java.util.Scanner;

public class Exer03 {
	public static void main(String[] args) {
		
		boolean  infoValida = false;
		
		String  nome;
		int  idade;
		double  salario;
		String  sexo;
		String  estadoCivil;
		
		Scanner scanner = new Scanner(System.in);
		
	do {
		System.out.println("Digite o nome: ");
		nome = scanner.next();
		
		if (nome.length() > 3) {
			infoValida = true;
		} else {
			System.out.println("Precisa do minimo de 3 caracteres!!!");
		} 
		
	} while (!infoValida);
	
	
	infoValida = false;
	do {
		
		System.out.println("Digite sua idade:  ");
		idade = scanner.nextInt();
		
		if (idade >= 0 && idade <= 150) {
			infoValida = true;
		} else {
			System.out.println("Precisa ser entre 0 e 150 bb!!!");
		} 
	} while (!infoValida);
	
	

	infoValida = false;
	do {
		
		System.out.println("Digite seu salario: ");
		salario = scanner.nextDouble();
		
		
		if (salario > 0) {
			infoValida = true;
		} else {
			System.out.println("Precisa ser maior que 0!!!");
		} 
	} while (!infoValida);
	
	infoValida = false;
	do {
		
		System.out.println("Digite o sexo: ");
		sexo = scanner.next();
		
		if (sexo.equalsIgnoreCase("f") ||
				sexo.equalsIgnoreCase("m")) {
			infoValida = true;
		} else {
			System.out.println("Sexo precisa ser f ou m!!!");
		} 
	} while (!infoValida);
	
	

	infoValida = false;
	do {
		
		System.out.println("Digite o seu estado civil: ");
		estadoCivil = scanner.next();
		
		if (estadoCivil.equalsIgnoreCase("s") ||
				estadoCivil.equalsIgnoreCase("c") || 
				estadoCivil.equalsIgnoreCase("v") ||
				estadoCivil.equalsIgnoreCase("d")) {
			infoValida = true;
		} else {
			System.out.println("Precisa ser S C V ou D!!!");
		} 
	} while (!infoValida);
	
	System.out.println("AS SEGUINTAES INDORMACOES FORAM COLETADAS: ");
	System.out.println("Nome: " + nome);
	System.out.println("Idade: " + idade);
	System.out.println("Salario: " + salario);
	System.out.println("sexo: " + sexo);
	System.out.println("Estado Civil: " + estadoCivil);
		
		
		
	
	}

}
