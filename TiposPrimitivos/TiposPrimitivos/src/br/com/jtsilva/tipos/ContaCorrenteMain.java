package br.com.jtsilva.tipos;

public class ContaCorrenteMain {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.setNumeroConta(123456789);
        conta.setAgencia(1234);
        conta.setSaldo(1000);
        conta.setLimite(10000);
        System.out.println(conta.toString());
    }
}