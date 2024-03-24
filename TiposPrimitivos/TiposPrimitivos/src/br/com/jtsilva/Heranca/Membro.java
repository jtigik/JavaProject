package br.com.jtsilva.Heranca;

public class Membro {
    private String nome;

    public Membro(String nome) {
        setNome(nome);
        System.out.printf("Membro %s realizando tarefa.\n", getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
