/**
 *
 ***1. Baixa Dificuldade:**
 *Crie um ArrayList que armazene os nomes dos seus amigos. Imprima o ArrayList no console.
 */

package br.com.jtsilva.list.Exercicios;

import java.util.ArrayList;

public class ArrayListAmigos {
    public static void main(String[] args) {
        // Cria um ArrayList para armazenar nomes de amigos
        ArrayList<String> amigos = new ArrayList<>();

        // Adiciona nomes ao ArrayList
        amigos.add("João");
        amigos.add("Maria");
        amigos.add("Pedro");

        // Imprime o ArrayList no console
        System.out.println(amigos);
    }
}
