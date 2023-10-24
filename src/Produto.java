
public class Produto {
    Integer codigo;
    String nome;
    Double preco;
    Integer quantidade;

    /**
     * @param codigo
     * @param nome
     * @param preco
     * @param quantidade
     */
    public Produto(Integer codigo, String nome, Double preco, Integer quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

}