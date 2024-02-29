package br.com.jtsilva.tipos;

public class ContaCorrenteMain {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.setNumeroConta(123456789);
        conta.setAgencia(1234);
        conta.setSaldo(170);
        conta.setLimite(250);
        try {
            conta.menu();
        } catch (Exception e) {
            System.out.println("Failed to initialize menu: " + e.toString());
        }
    }
}