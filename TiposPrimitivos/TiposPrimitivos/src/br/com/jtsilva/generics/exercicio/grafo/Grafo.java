/**
* **Exercício 4 (Média complexidade):**
*
* Crie uma classe genérica 'Grafo' que implemente um grafo não direcionado.
*/

package br.com.jtsilva.generics.exercicio.grafo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Grafo<T> {
    private Map<T, List<T>> vertice;

    public Grafo() {
        this.vertice = new HashMap<>();
    }

    public void adicionaVertice(T vertice) {
        if (!this.vertice.containsKey(vertice)) {
            this.vertice.putIfAbsent(vertice, new ArrayList<>());
        }
    }

    public void adicionaAresta(T origem, T destino) {
        if (this.vertice.containsKey(origem) && this.vertice.containsKey(destino)) {
            this.vertice.get(origem).add(destino);
            this.vertice.get(destino).add(origem);
        }
    }

    public boolean existeAresta(T origem, T destino) {
        return this.vertice.get(origem).contains(destino);
    }

    public Set<T> getVertice() {
        return this.vertice.keySet();
    }

    public List<T> getAdjacentes(T vertice) {
        return this.vertice.get(vertice);
    }
}
