/**
 * **3. Baixa-Média Dificuldade:**
 * Crie um ArrayList que armazene os nomes dos seus livros favoritos.
 * Remova o segundo livro do ArrayList. Imprima o ArrayList no console.
 *
 */

package br.com.jtsilva.list.Exercicios;

import java.util.ArrayList;

public class ArrayListLivros {
    public static void main(String[] args) {
        // Cria um ArrayList para armazenar nomes de livros favoritos
        ArrayList<String> livros = new ArrayList<>();

        // Adiciona nomes ao ArrayList
        livros.add("O Pequeno Príncipe");
        livros.add("Cem Anos de Solidão");
        livros.add("1984");
        livros.add("O Alquimista");

        // Remove o segundo livro do ArrayList
        livros.remove(1);

        // Imprime o ArrayList no console
        System.out.println(livros);
    }
}
