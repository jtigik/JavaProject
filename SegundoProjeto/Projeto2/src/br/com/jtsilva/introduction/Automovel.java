package br.com.jtsilva.introduction;

public class Automovel {
    private String proprietario;
    private String modelo;
    private String placa;
    private int ano;

    public Automovel(String proprietario, String modelo, String placa, int ano) {
        this.proprietario = proprietario;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
