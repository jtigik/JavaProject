package br.com.jtsilva.operadores;

public class OperadoresRelacional {
    public static void main(String[] args) {
        // Operadores --> ==, !=, >, <, >=, <=
        // Retornam valores booleanos --> True / False

        int saldoBancario = 20000;
        int saque = 1000;

        boolean possoFazerSaque = saldoBancario > saque;
        System.out.printf("Variável posso fazer saque >: %b\n", possoFazerSaque);

        // Aumentando o valor do saque
        saque = 30000;

        possoFazerSaque = saldoBancario > saque;
        System.out.printf("Variável posso fazer saque >: %b\n", possoFazerSaque);

        saque = 20000;

        possoFazerSaque = saldoBancario == saque;
        System.out.printf("Variável posso fazer saque ==: %b\n", possoFazerSaque);

        saque = 1000;

        possoFazerSaque = saque <= saldoBancario;
        System.out.printf("Variável posso fazer saque <= 20.000: %b\n", possoFazerSaque);

        int minhaIdade = 30;
        int minhaMae = 70;

        boolean idadeDiferente = minhaIdade != minhaMae;
        System.out.printf("As idades são diferentes? R.: %b\n", idadeDiferente);

        Pessoa obj = null;

        boolean objNulo = obj != null;
        System.out.printf("Objeto é nulo? R.: %b\n", objNulo);
    }
}