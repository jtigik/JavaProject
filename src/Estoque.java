
public class Estoque {

    Produto[] produtos = new Produto[10];

    public void cadastrar(Produto p) {
        produtos[0].setCodigo(p.getCodigo());
        produtos[0].setNome(p.getNome());
        produtos[0].setPreco(p.getPreco());
        produtos[0].setQuantidade(p.getQuantidade());

        System.out.println(p.getNome());

    }

    public void consultar(Integer code) {

        System.out.printf("Produto: %s", produtos[code].getNome());
    }

}