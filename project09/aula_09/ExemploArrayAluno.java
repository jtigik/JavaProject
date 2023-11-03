package aula_09;

import java.util.ArrayList;
import java.util.List;

public class ExemploArrayAluno {

	public static void main(String[] args) {
		
		listaOrdenadaComparador();
		listaOrdenadaClasseExterna();

	}

	private static void listaOrdenadaClasseExterna() {
		System.out.println("========== Exemplo Lista Ordenada Classe Externa ==========");
		List<Aluno> lista = new ArrayList<Aluno>();
		
		Aluno a = new Aluno("João da Silva", "Linux Básico", 7.8, "204A");
		Aluno b = new Aluno("Antonio Souza", "OpenOffice", 9.4, "305B");
		Aluno c = new Aluno("Lucia Ferreira", "Internet", 7.0, "101A");
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		
		System.out.println(lista);// Imprime referência de memória.
		System.out.println();
		System.out.println("");
	}

	private static void listaOrdenadaComparador() {
		System.out.println("========== Exemplo Lista Ordenada ==========");
		
	}

}
