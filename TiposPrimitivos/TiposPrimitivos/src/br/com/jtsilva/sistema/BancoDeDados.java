package br.com.jtsilva.sistema;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {

    private List<Venda> listaDeVendas = new ArrayList<>();

    public void salvarVendaNoBanco(Venda venda) {
        this.listaDeVendas.add(venda);
    }

    public List<Venda> buscarTodos() {
        return this.listaDeVendas;
    }
}
