package br.com.jtsilva.operadores;

public class OperadoresLogico {
    public static void main(String[] args) {
        double rendaMensal = 1000;
        int idade = 27;
        boolean temEmprego = true;

        // 1 - idade >= 18 E idade <= 35
        // 2 - rendaMensal >= 2000
        // 3 - temEmprego

        if (idade >= 18 && idade <= 35 && rendaMensal >= 2000 && temEmprego) {
            System.out.println("Pode fazer empréstimo!");
        } else {
            System.out.println("Não pode fazer empréstimo!");
        }

        String usuario = "santos09";
        String senha = "244466666";

        if (usuario.equals("santos") && senha.equals("244466666")) {
            System.out.println("Acessando no sistema!");
        } else {
            System.out.println("Usuário ou senha inválido!");
        }
    }
}