package br.com.jtsilva.Exceptions;

public class IdadeIvalidaException extends Exception {
    private int idade;

    public IdadeIvalidaException(String message, int idade) {
        super(message);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}
