/**
 * **Exercício 3 (Média complexidade):**
*
* Crie uma classe genérica 'ArvoreBinaria' que implemente uma
* árvore binária de pesquisa.
 */

package br.com.jtsilva.generics.exercicio.arvore;

public class Nodo<T> {
    private T valor;
    private Nodo<T> esquerdo;
    private Nodo<T> direito;

    public Nodo(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public Nodo<T> getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(Nodo<T> esquerdo) {
        this.esquerdo = esquerdo;
    }

    public Nodo<T> getDireito() {
        return direito;
    }

    public void setDireito(Nodo<T> direito) {
        this.direito = direito;
    }
}
