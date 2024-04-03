package br.com.jtsilva.generics.genericsMediumEasy;

public class Nodo<T> {
    T valor;
    Nodo<T> proximo;

    public Nodo(T valor) {
        this.valor = valor;
        this.proximo = null;
    }
}
