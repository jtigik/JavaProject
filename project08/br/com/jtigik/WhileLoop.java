package br.com.jtigik;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Deseja gerar a tabuada de algum número? ");
		System.out.println("Sim - Para gerar: ");
		String resposta = s.next();
		
		while (resposta.equalsIgnoreCase("Sim")){
			
			System.out.println("Digite um valor para gerar a tabuada: ");
			
			int num = s.nextInt();
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " X "+ i +" = "+ num * i );
			}
			System.out.println("Deseja gerar outra tabuada? ");
			resposta = s.next();
		}
		s.close();
		System.out.println("Obrigado!");
	}
}
