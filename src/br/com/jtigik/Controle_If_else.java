package br.com.jtigik;

import java.util.Scanner;

public class Controle_If_else {
	
	public void exemplo1(int num) {
		
		int result = num;
		
		if (result > 1) {
			System.out.println("Ex1: Primeiro bloco\n");
		} else {
			System.out.println("Ex1: Segundo bloco\n");
		}
	}

	public static void exemplo2(int num) {
		int result = num;
		
		if (result > 1 && result <= 5) {
			System.out.println("Ex2:Primeiro bloco\n");
		} else if (result >= 5 && result < 8) {
			System.out.println("Ex2:Segundo bloco\n");
		} else {
			System.out.println("Ex2:Terceiro bloco\n");
		}
	}
	
	public void exemplo3(int num) {
		
		if (num >= 5) {
			System.out.println("Ex3:Primeiro bloco\n");
			if (num >= 8) {
				System.out.println("Ex3:Segundo bloco\n");
			} else if (num >=6) {
				System.out.println("Ex3:Terceiro bloco\n");
			} else {
				System.out.println("Ex3:Quarto bloco\n");
			}
		} else {
			if (num >= 1 && num <= 3) {
				System.out.println("Ex3:Quinto bloco\n");
			} else {
				System.out.println("Ex3:Sexto bloco\n");
			}
		}
	}

	
	public static void main(String[] args) {
		
		Controle_If_else controle = new Controle_If_else();
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Informe um valor inteiro: ");
		int valor = ent.nextInt();
		ent.close();
		
		controle.exemplo1(valor);
		//Metodos Static não precisam de construtores.
		exemplo2(valor);
		controle.exemplo3(valor);
	}	
}
