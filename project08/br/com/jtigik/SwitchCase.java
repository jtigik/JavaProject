package br.com.jtigik;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
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
//		String format = animal.toUpperCase();
		
		switch (animal.toUpperCase()){
			case "CAT":	
			case "DOG": 
				
				result = "Domestic animal.";
				break;
				
			case "TIGER":
			case "BEAR":
				
				result = "Wild animal.";
				break;
				
			default:
				
				result = "Unknown animal.";
				break;
		}
	
		return result;
	}
}
