package br.com.jtsilva.generics.generics_2.fruta;

public class Banana implements IFruta {
    private String nome;
    private String cor;
    private boolean estaMadura;
    private double peso;

    public Banana(String nome, String cor, boolean estaMadura, double peso) {
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
}
