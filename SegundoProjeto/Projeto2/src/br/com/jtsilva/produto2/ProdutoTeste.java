package br.com.jtsilva.produto2;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setDetalhesProduto("Descrição produto");
        produto.setValorProduto(4.78);
        produto.setNomeProduto("Arroz branco");
        produto.setMarca("São João");

        produto.getNomeProduto();
        produto.getDetalhesProduto();
        produto.getValorProduto();
        produto.getMarca();
    }
}