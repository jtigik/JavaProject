package br.com.jtsilva.tipos;

public class ContaCorrenteMain {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.setNumeroConta(123456789);
        conta.setAgencia(1234);
        conta.setSaldo(200);
        conta.setLimite(200);
        conta.setLimiteUtilizado(0);
        conta.sacar(350);
    }
}