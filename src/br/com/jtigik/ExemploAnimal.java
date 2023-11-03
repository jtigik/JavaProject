package br.com.jtigik;

import java.util.Scanner;

public class ExemploAnimal {

	public static void main(String[] args) {
		/*
		 *Acesso direto à Classe e seus métodos
		 *sem a necessidade do construtor.
		 */
		System.out.println(VerificaIdade.getIdade(6));
		
		verAminal();

	}
	
	public static void verAminal() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um animal: ");
		String animal = s.next();
		
		String msg = getAnimal(animal);
		
		System.out.println(msg);
		s.close();
	}
	
	public static String getAnimal(String animal) {
		
		String result;
		
		try {
			String format = animal.toUpperCase();
			
			if(format.equals("DOG") || format.equals("CAT")) {
				result = "Domestic animal.\n";
			}else if(format.equals("TIGER") || format.equals("BEAR")){
				result = "Wild animal.\n";
			}else {
				result = "Unknown animal.\n";
			}
		}catch (Exception e) {
			result = e.getMessage();
		}
		return result;
		
	}
}
