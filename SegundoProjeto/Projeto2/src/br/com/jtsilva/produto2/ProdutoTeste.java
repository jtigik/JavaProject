package br.com.jtsilva.produto2;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto = new Produto();
        Produto produto1 = new Produto();
        Produto vetor[] = new Produto[2];

        /*
         * Multiline comment:
         * Ctrl+Shift+A
         */

        // Singleline comment: Ctrl+;

        produto.setDetalhesProduto("Arroz Branco especial");
        produto.setValorProduto(3.78);
        produto.setNomeProduto("Arroz");
        produto.setMarca("São João");
        vetor[0] = produto;
        System.out.println(vetor[0].toString());

        produto.setDetalhesProduto("Feijão preto sem casca");
        produto.setValorProduto(8.90);
        produto.setNomeProduto("Feijão");
        produto.setMarca("Prato cheio");
        vetor[1] = produto;
        System.out.println(vetor[1].toString());

        System.out.println(vetor.length);
        /*
         * System.out.println(produto.toString());
         * System.out.println(produto1.toString());
         */
    }
}