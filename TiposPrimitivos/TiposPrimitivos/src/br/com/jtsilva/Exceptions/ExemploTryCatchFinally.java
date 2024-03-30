package br.com.jtsilva.exceptions;

public class ExemploTryCatchFinally {
    public static void main(String[] args) {
        try {
            // Simulando uma operação que pode lançar uma exceção
            int resultado = dividir(10, 0);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Erro de divisão por zero: " + e.getMessage());
        } finally {
            System.out.println("Bloco finally executado sempre, independentemente de exceções.");
        }
    }

    public static int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }
}
