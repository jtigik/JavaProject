package br.com.jtsilva.heranca.exercicio_animal;

public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("O gato mia! (Miau, miau, miau, miau, miau, miau...)");
    }
}
