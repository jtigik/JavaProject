package br.com.jtsilva.equipe;

public class Desenvolvedor extends Membro {

    public Desenvolvedor(String nome) {
        super(nome);
    }

    public void codificar() {
        System.out.printf("Desenvolvedor %s codificando!", getNome());
    }

}
