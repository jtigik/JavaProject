package br.com.jtsilva.produto2;

public class Produto {
    private String nomeProduto;
    private double valorProduto;
    private String detalhesProduto;
    private String marca;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getDetalhesProduto() {
        return detalhesProduto;
    }

    public void setDetalhesProduto(String detalhesProduto) {
        this.detalhesProduto = detalhesProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}