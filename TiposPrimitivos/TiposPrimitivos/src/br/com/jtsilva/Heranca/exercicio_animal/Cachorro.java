package br.com.jtsilva.heranca.exercicio_animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro late! (Au, au, au, au, au, au, au, au, au, au...)");
    }
}
