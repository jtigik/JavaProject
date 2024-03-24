package br.com.jtsilva.equipe;

public class Membro {
    private String nome;

    public Membro(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void realizarTarefa() {
        System.out.printf("Membro %s realizando tarefa.\n", getNome());
    }

}
