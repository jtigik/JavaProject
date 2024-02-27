package br.com.jtsilva.veiculo;

public class CarroTeste {

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.nome = "Fiesta";
        carro.marca = "Ford";
        carro.ano = 2005;
        carro.velocidade = 60;

        carro.acelerar(40);
        carro.reduzirVelociade(25);

        System.out.printf("Velocidade: %d", carro.velocidade);
    }

}