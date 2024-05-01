package app;

public class Produto {
    Integer codigo;
    String nome;
    Double preco;
    Integer quantidade;

    /*
     * Foram definidos 2 tipos construtores (vazio e com parâmetros)
     * para proporcionar maior flexibilidade à aplicação.
     */

    public Produto(Integer codigo, String nome, Double preco, Integer quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto() {
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}