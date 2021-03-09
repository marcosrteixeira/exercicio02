package exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
		
	}

	private void start() {
		
		
		
		
		System.out.print("Digite o valor do produto: ");
		
		Scanner obterValorDoUsuario = new Scanner(System.in);
		
		double valor = obterValorDoUsuario.nextDouble();
		
		int valorComCast = (int) valor;
		
		System.out.println("Valor com casas decimas: "+ valor+"| Valor inteiro: " + valorComCast);
		
		
		
		
	}
	

}
