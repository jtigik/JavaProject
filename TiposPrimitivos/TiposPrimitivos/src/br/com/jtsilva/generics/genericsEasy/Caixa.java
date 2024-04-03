package br.com.jtsilva.generics.genericsEasy;

/**
 * Aplicação de Complexidade Baixa: Caixa Genérica.
 * Nesta aplicação, criaremos uma classe genérica 'Caixa'
 * que pode armazenar qualquer tipo de objeto.
 */

public class Caixa<T> {
    private T conteudo;

    public void colocar(T conteudo) {
        this.conteudo = conteudo;
    }

    public T retirar() {
        return conteudo;
    }

    public boolean estaVazia() {
        return conteudo == null;
    }
}
