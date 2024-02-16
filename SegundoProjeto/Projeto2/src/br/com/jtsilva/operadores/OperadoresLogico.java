package br.com.jtsilva.operadores;

public class OperadoresLogico {
    public static void main(String[] args) {
        double rendaMensal = 3000;
        int idade = 17;
        boolean temEmprego = true;

        // 1 - idade >= 18 E idade <= 35
        // 2 - rendaMensal >= 2000
        // 3 - temEmprego

        boolean avaliaIdade = idade >= 18 && idade <= 35;
        boolean avaliaRenda = rendaMensal >= 2000;

        System.out.println(avaliaIdade);
        System.out.println(avaliaRenda);

        if (avaliaIdade && avaliaRenda && temEmprego) {
            System.out.println("Pode fazer empréstimo!");
        } else {
            System.out.println("Não pode fazer empréstimo!");
        }

    }
}