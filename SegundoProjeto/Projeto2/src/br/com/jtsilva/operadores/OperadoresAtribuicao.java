package br.com.jtsilva.operadores;

public class OperadoresAtribuicao {
    public static void main(String[] args) {
        int resultado = 10 + 20;
        System.out.println("O valor do resultado é: " + resultado);

        int numeroA = 100;
        numeroA += 200;
        System.out.println("O valor do número A é: " + numeroA);

        int numeroB = 500;
        numeroB -= 250;
        System.out.println("O valor do número B é: " + numeroB);

        int numeroC = 500;
        numeroC *= 100;
        System.out.println("O valor do número C é: " + numeroC);

        int numeroD = 1000;
        numeroD /= 500;
        System.out.println("O valor do número D é: " + numeroD);

        int numeroE = 10555;
        numeroE %= 5;
        System.out.println("O valor do número E é: " + numeroE);
    }
}