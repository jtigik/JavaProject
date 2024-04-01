package br.com.jtsilva.heranca.exercicio_bonus;

public class TesteFuncionario {
    public static void main(String[] args) {
        // Criação de objetos de cada tipo de funcionário
        Funcionario funcionario = new Funcionario("Funcionario", "111.222.333-44", 3000.00);
        Gerente gerente = new Gerente("Gerente", "222.333.444-55", 5000.00);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Desenvolvedor", "333.444.555-66", 4000.00);
        Analista analista = new Analista("Analista", "444.555.666-77", 4500.00);

        // Teste do cálculo dos bônus
        System.out.println("Bônus do Funcionário: R$ " + funcionario.calcularBonus());
        System.out.println("Bônus do Gerente: R$ " + gerente.calcularBonus());
        System.out.println("Bônus do Desenvolvedor: R$ " + desenvolvedor.calcularBonus());
        System.out.println("Bônus do Analista: R$ " + analista.calcularBonus());
    }
}
