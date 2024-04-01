package br.com.jtsilva.heranca.exercicio_bonus;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    // Construtor
    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    // Método para calcular o bônus (10% do salário)
    public double calcularBonus() {
        return salario * 0.10;
    }
}
