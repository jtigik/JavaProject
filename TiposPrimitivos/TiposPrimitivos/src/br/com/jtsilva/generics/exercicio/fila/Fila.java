package br.com.jtsilva.generics.exercicio.fila;

public class Fila<T> extends No<T> {

    private No<T> inicio;
    private No<T> fim;

    public Fila(T valor, No<T> inicio, No<T> fim) {
        super(valor);
        this.inicio = inicio;
        this.fim = fim;
    }

    public void enfileirar(T valor) {
        No<T> novoNo = new No<>(valor);
        if (inicio == null) {
            inicio = fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
    }

    public T desenfileirar() {
        if (inicio == null) {
            return null;
        }
        T valor = inicio.getValor();
        inicio = inicio.getProximo();
        if (inicio == null) {
            fim = null;
        }
        return valor;
    }

    public boolean estaVazia() {
        return inicio == null;
    }
}
