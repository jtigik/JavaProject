package br.com.jtigik;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String resposta = "";
		
		do {
			System.out.println("Digite um valor para gerar a tuabuada: ");
			int num = s.nextInt();
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " X "+ i +" = "+ num * i );
			}
			
			System.out.println("Deseja gerar outra tabuada? ");
			System.out.println("Sim - Para gerar: ");
			resposta = s.next();
		} while (resposta.equalsIgnoreCase("Sim"));
		
		System.out.println("Obrigado!");
		s.close();
	}

}
