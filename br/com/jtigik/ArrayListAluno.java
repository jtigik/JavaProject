package aula_10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAluno {

	public static void ExemploListaOrdenadaClasseExterna() {
		System.out.println("========== Exemplo Lista Ordenada Classe Externa ==========");
		List<Aluno> lista = new ArrayList<Aluno>();
		
		Aluno a = new Aluno("João da Silva", "Linux Básico", 7.8, 204);
		Aluno b = new Aluno("Antonio Souza", "OpenOffice", 9.4, 305);
		Aluno c = new Aluno("Lucia Ferreira", "Internet", 7.0, 101);
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		
		System.out.println(lista);
		System.out.println();
		System.out.println("========== Fim Lista Ordenada Classe Externa ==========");
	}
}
