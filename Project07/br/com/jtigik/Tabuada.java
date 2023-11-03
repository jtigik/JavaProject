package br.com.jtigik;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um valor para gerar a tuabuada: ");
		int num = s.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X "+ i +" = "+ num * i );
		}
		s.close();
	}

}
