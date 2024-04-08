/**
 * **Exercício 1 (Baixa complexidade):**
 * Crie uma classe genérica 'Par' que armazene dois valores de tipos diferentes.
 */

package br.com.jtsilva.generics.exercicio.pares;

public class Par<T1, T2> {
    private T1 primeiro;
    private T2 segundo;

    public T1 getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(T1 primeiro) {
        this.primeiro = primeiro;
    }

    public T2 getSegundo() {
        return segundo;
    }

    public void setSegundo(T2 segundo) {
        this.segundo = segundo;
    }

}
