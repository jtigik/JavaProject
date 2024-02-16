package br.com.jtsilva.operadores;

public class OperadoresLogico {
    public static void main(String[] args) {
        double rendaMensal = 3000;
        int idade = 17;
        boolean temEmprego = true;

        // 1 - idade >= 18 E idade <= 35
        // 2 - rendaMensal >= 2000
        // 3 - temEmprego

        if (idade >= 18 && idade <= 35 && rendaMensal >= 2000 && temEmprego) {
            System.out.println("Pode fazer empréstimo!");
        } else {
            System.out.println("Não pode fazer empréstimo!");
        }
    }
}