package br.com.jtsilva.generics.exercicio.arvore;

public class ArvoreBinaria<T extends Comparable<T>> {
    private Nodo<T> raiz;

    public void inserir(T valor) {
        raiz = inserir(valor, raiz);
    }

    private Nodo<T> inserir(T valor, Nodo<T> nodo) {
        if (nodo == null) {
            return new Nodo<>(valor);
        }
        if (valor.compareTo(nodo.getValor()) < 0) {
            nodo.setEsquerdo(inserir(valor, nodo.getEsquerdo()));
        } else {
            nodo.setDireito(inserir(valor, nodo.getDireito()));
        }
        return nodo;
    }

    public boolean buscar(T valor) {
        return buscar(valor, raiz) != null;
    }

    private Nodo<T> buscar(T valor, Nodo<T> nodo) {
        if (nodo == null) {
            return null;
        }
        if (valor.compareTo(nodo.getValor()) == 0) {
            return nodo;
        }
        if (valor.compareTo(nodo.getValor()) < 0) {
            return buscar(valor, nodo.getEsquerdo());
        } else {
            return buscar(valor, nodo.getDireito());
        }
    }
}
