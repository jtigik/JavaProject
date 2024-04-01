package br.com.jtsilva.heranca.exercicio_bonus;

public class Gerente extends Funcionario {
    // Construtor
    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    // Sobrescrita do método para calcular o bônus (20% do salário)
    @Override
    public double calcularBonus() {
        return salario * 0.20;
    }
}
