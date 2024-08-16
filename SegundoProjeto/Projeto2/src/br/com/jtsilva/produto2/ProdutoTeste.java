package br.com.jtsilva.produto2;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto = new Produto();
        Produto produto1 = new Produto();
        Produto vetor[];

        /*
         * Multiline comment:
         * Ctrl+Shift+A
         */

        // Singleline comment: Ctrl+;

        produto.setDetalhesProduto("Arroz Branco especial");
        produto.setValorProduto(3.78);
        produto.setNomeProduto("Arroz");
        produto.setMarca("São João");

        produto1.setDetalhesProduto("Feijão preto sem casca");
        produto1.setValorProduto(8.90);
        produto1.setNomeProduto("Feijão");
        produto1.setMarca("Prato cheio");

        System.out.println(produto.toString());
        System.out.println(produto1.toString());
    }
}