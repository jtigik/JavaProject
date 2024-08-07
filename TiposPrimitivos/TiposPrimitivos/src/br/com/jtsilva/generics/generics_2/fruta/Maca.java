package br.com.jtsilva.generics.generics_2.fruta;

public class Maca implements IFruta {
    private String nome;
    private String cor;
    private boolean estaMadura;
    private double peso;

    public Maca(String nome, String cor, boolean estaMadura, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.estaMadura = estaMadura;
        this.peso = peso;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getCor() {
        return this.cor;
    }

    @Override
    public boolean estaMadura() {
        return this.estaMadura;
    }

    @Override
    public double getPeso() {
        return this.peso;
    }

    // Novo método para verificar se a maçã é orgânica
    public boolean eOrganica() {
        // Implemente a lógica aqui
        return false; // Retorne o valor correto
    }

    // Novo método para obter o país de origem da maçã
    public String getPaisDeOrigem() {
        // Implemente a lógica aqui
        return "Desconhecido"; // Retorne o valor correto
    }
}
