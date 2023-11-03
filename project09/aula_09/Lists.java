package aula_09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * É como um array, cujo o tamanhopode crescer.
 * A busca de um elementoé rápido, mas inserções/exclusões não são.
 * 
 * @author Jeferson Tigik
 *
 */

public class Lists {

//	public static void main(String[] args) {
//		exemploListaSimples();
//		listaOrdenadaAsc();
//		exemploListaNumeros();
//	}
	
	private static void exemploListaNumeros() {
		System.out.println("========== Exemplo Lista Numérica ==========");
		List<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(3);
		//Criar 1 add() por vez.
		numeros.add(79);
		numeros.add(12);
		numeros.add(46);
		numeros.add(8);
		numeros.add(32);
		System.out.println(numeros);
	}

	public static void exemploListaSimples() {
		System.out.println("========== Exemplo Lista simples ==========");
		List<String> lista = new ArrayList<String>();
		lista.add("João da Silva");
		lista.add("Antonio de Souza");
		lista.add("Lucia Ferreira");
		lista.add("Ana dos Santos");
		
		System.out.println(lista);
		System.out.println("");
	}
	
	public static void listaOrdenadaAsc() {
		System.out.println("========== Exemplo de lista ordenada Ascendente ==========");
		List<String> lista = new ArrayList<String>();
		
		lista.add("João da Silva");
		lista.add("Antonio de Souza");
		lista.add("Lucia Ferreira");
		lista.add("Ana dos Santos");
		Collections.sort(lista);
		
		System.out.println(lista);
		System.out.println("");
	}

}
