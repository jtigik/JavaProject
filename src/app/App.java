package app;

public class App {
    // Aplicação principal
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto();
        Estoque estoque = new Estoque();

        produto.setCodigo(1234);
        produto.setNome("Amaciante");
        produto.setPreco(34d);
        produto.setQuantidade(20);

        estoque.cadastrar(produto);
        estoque.consultar(0);

        produto.setCodigo(3467);
        produto.setNome("Sabonete");
        produto.setPreco(12d);
        produto.setQuantidade(10);

        estoque.cadastrar(produto);
        estoque.consultar(3467);
    }
}
