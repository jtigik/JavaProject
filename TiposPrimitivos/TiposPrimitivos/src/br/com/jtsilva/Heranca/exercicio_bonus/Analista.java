package br.com.jtsilva.heranca.exercicio_bonus;

public class Analista extends Funcionario {
    // Construtor
    public Analista(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    // Sobrescrita do método para calcular o bônus (15% do salário)
    @Override
    public double calcularBonus() {
        return salario * 0.15;
    }
}
