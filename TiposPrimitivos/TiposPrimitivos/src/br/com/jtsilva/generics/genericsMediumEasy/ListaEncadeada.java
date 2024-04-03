package br.com.jtsilva.generics.genericsMediumEasy;

public class ListaEncadeada<T> {
    private Nodo<T> cabeca;

    public void adicionar(T valor) {
        if (cabeca == null) {
            cabeca = new Nodo<>(valor);
        } else {
            Nodo<T> atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = new Nodo<>(valor);
        }
    }

    public boolean remover(T valor) {
        if (cabeca == null)
            return false;

        if (cabeca.valor.equals(valor)) {
            cabeca = cabeca.proximo;
            return true;
        }

        Nodo<T> atual = cabeca;
        while (atual.proximo != null) {
            if (atual.proximo.valor.equals(valor)) {
                atual.proximo = atual.proximo.proximo;
                return true;
            }
            atual = atual.proximo;
        }

        return false;
    }

    public void imprimir() {
        Nodo<T> atual = cabeca;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
}
