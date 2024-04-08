/**
 * 
 * **Exercício 2 (Baixa complexidade):**
 * Crie uma classe genérica 'Fila' que implemente uma fila de elementos do mesmo tipo.
 */

package br.com.jtsilva.generics.exercicio.fila;

public class No<T> {
    private T valor;
    private No<T> proximo;

    public No(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
}
