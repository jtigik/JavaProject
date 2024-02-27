package br.com.jtsilva.tipos;

public class ContaCorrente {
    private int numeroConta;
    private int agencia;
    private double saldo;
    private double limite;

    @Override
    public String toString() {
        return "ContaCorrente [numeroConta=" + this.numeroConta + ", agência=" + this.agencia + ", saldo=" + this.saldo
                + ", limite="
                + this.limite + "]";
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacar(double valor) {
        if (valor <= limite) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Não há saldo o suficiente para a operação");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito realizado com sucesso!");
    }
}