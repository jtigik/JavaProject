package br.com.jtigik;

import java.util.Scanner;

public class VerificaIdade {

	public static void main(String[] args) {
		//Mais de 5 linhas, separar em métodos separados.
		verIdade();
	}
	
	public static void verIdade() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int idade = s.nextInt();
		
		String msg = getIdade(idade);
		
		System.out.println(msg);
		s.close();
	}
	
	public static String getIdade(int idade) {
		
		if(idade >= 0 && idade <= 3) {
			return "Voce eh um bebe.\n";
		}else if(idade >= 6 && idade <= 10) {
			return "Voce eh uma criança.\n";
		}else if (idade >= 11 && idade <= 17) {
			return "Voce eh adolescente.\n";
		}else {
			return "Voce eh adulto.\n";
		}
	}
}
