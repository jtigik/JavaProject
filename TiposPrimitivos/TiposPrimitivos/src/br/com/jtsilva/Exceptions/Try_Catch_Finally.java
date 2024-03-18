package br.com.jtsilva.Exceptions;

public class Try_Catch_Finally {

    public static void main(String[] args) {
        try {

            String nome = null;
            int tamanho = nome.length();

        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
