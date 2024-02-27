package br.com.jtsilva.veiculo;

public class Carro {
    Stirng nome;
    String marca;
    int ano;
    int velocidade;

    void acelerar(int aceleracao) {
        velocidade += aceleracao;
    }

    void reduzirVelociade(int reducao) {
        velocidade -= reducao;
    }

    void buzinar() {
        System.out.println("honk, honk!!");
    }
}