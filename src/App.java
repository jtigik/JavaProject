public class App {
    public static void main(String[] args) throws Exception {
        Estoque estoque = new Estoque();
        Produto produto = new Produto();

        produto.setCodigo(1234);
        produto.setNome("Amaciante");
        produto.setPreco(34d);
        produto.setQuantidade(20);

        estoque.cadastrar(produto);
        estoque.consultar(0);
    }
}
