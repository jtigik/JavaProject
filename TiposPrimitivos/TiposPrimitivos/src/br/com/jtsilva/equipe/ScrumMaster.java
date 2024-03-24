package br.com.jtsilva.equipe;

public class ScrumMaster extends Membro {

    public ScrumMaster(String nome) {
        super(nome);
    }

    public void facilitarReunioes() {
        System.out.printf("ScrumMaster %s facilitando reuniões.\n", getNome());
    }

}
