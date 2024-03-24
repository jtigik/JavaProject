package br.com.jtsilva.sistema;

import java.util.List;

public class Venda extends IdentificadorVenda {

    private Cliente cliente;
    private List<Produto> produtos;

    public Venda(Cliente cliente, List<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return "Venda [cliente = " + this.cliente.getNome()
                + ". CPF = " + this.cliente.getCpf()
                + ". Chave = " + this.getChave();
    }

}
