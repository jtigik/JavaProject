package br.com.jtigik;

import java.util.ArrayList;
import java.util.List;

public class Loops {

	public static void main(String[] args) {
		List <Integer> valores = new ArrayList<>();
		// Utilizado quando sabemos o tamanho da Lista.
		for(int i = 0; i <= 10; i++) {
			System.out.println("Loop 1: " + i);
			valores.add(i);
		}
		//FOR utilizando uma coleção de Integer
		//Utilizado quando não sabemos o tamanho da Lista.
		for(Integer i : valores) {
			System.out.println("Loop 2: " + i);
		}
		
		//Loop mais aprimorado (JDK atual)
		valores.forEach(i -> System.out.printf("Loop 3: %d\n", i));
	}

}
