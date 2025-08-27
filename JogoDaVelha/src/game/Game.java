package game;

import java.util.Scanner;

public class Game {
	
	Scanner scanner = new Scanner(System.in);
	
	
	String[][] tabuleiro = new String[3][3];
	private int jogador = 0; //0 = o e 1 = x
	private int parada = 1;
	private int cont = 1;
	
	
	public Game() {
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tabuleiro[i][j] = " ";
			}
		}
	}
	
	
	public void executar(){
		do {
		tela();
		verificarJogador();
		jogada();
		verificarPartida();
		} while(parada != 0);
		
}
	public void tela() {
		System.out.println("   0   1   2");
		System.out.println("0: " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2]);
		System.out.println("1: " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2]);
		System.out.println("2: " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2]);
				
	}
	
	public int verificarJogador(){ //se o jogador 0 ja jogou, agr vai ser o 1
		if (jogador == 0){
			jogador = 1;
		} else {
			jogador = 0;
		}
		return jogador;
	}
	
	
	public void jogada(){
		int linhaJogada, colunaJogada;
		
		do {
		System.out.println("Digite a linha escolhida: ");
		linhaJogada = scanner.nextInt();
		System.out.println("Digite a coluna escolhida: ");
		colunaJogada = scanner.nextInt();
		
		
		if(linhaJogada >= 0 && linhaJogada < 3 && colunaJogada >= 0 && colunaJogada < 3 && tabuleiro[linhaJogada][colunaJogada] == " ") {
			preencherTabuleiro(linhaJogada,colunaJogada);
			break;
		} else {
			System.out.println("Jogada invalida, tente novamente");
		}
		
		}while (true);
	
		
	}
	
	public String preencherTabuleiro(int linha, int coluna) {
		if (jogador == 0) {
			tabuleiro[linha][coluna] = "O";
		} else {
			tabuleiro[linha][coluna] = "X";
		}
		return tabuleiro[linha][coluna];
		}
		
		public void verificarPartida() {
			if (cont < 9) {
				//verificar linhas:
				for (int i = 0; i < 3; i++) {
					if(tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][0] == tabuleiro[i][2] && tabuleiro[i][0] != " ") {
						if(jogador == 0) {
							tela();
							System.out.println("O circulo venceu!");
							parada = 0;
						} else {
							tela();
							System.out.println("O X venceu!");
							parada = 0;
							
							
						}
					}
				}
				//verificar diagonais: 
				if((tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[0][0] == tabuleiro[2][2] && tabuleiro[0][0] != " ") ||
						(tabuleiro[2][0] == tabuleiro[1][1] && tabuleiro[2][0] == tabuleiro[0][2] && tabuleiro[2][0] != " ")) {
					if(jogador == 0) {
						tela();
						System.out.println("Jogador O venceu!");
						parada = 0;
					} else {
						tela();
						System.out.println("Jogador X venceu!");
						parada = 0;
						
						
					}
					
				}
				
			} else {
				tela();
				System.out.println("Empate!");
				parada = 0;
			}
			cont++;
		}
	}
