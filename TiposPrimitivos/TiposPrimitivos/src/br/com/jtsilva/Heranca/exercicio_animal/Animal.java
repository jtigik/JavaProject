package br.com.jtsilva.heranca.exercicio_animal;

public class Animal {
    String nome;
    int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("O animal faz um som!");
    }
}
