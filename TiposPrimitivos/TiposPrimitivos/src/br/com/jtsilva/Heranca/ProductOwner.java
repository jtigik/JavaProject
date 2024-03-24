package br.com.jtsilva.Heranca;

public class ProductOwner extends Membro {

    public ProductOwner(String nome) {
        super(nome);
    }

    public void priorizarBackLog() {
        System.out.printf("Product owner %s, priorizando Backlog.\n", getNome());
    }
}
