package br.com.jtsilva.Exceptions;

public class Try_Catch_Finally {

    public static void main(String[] args) {

        int tamanho = 0;

        try {
            // String nome = null;
            // tamanho = nome.length();

        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());

        } finally {
            System.out.println("Result: " + tamanho);

        }

    }
}
