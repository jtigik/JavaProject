package br.com.jtsilva.tipos;

public class ContaCorrente {

    private double limite;
    private int numeroConta;
    private int agencia;
    private double saldo;
    private double limiteUtilizado;

    @Override
    public String toString() {
        return "ContaCorrente [numeroConta = " + this.numeroConta + ", agência = " + this.agencia + ", saldo = "
                + this.saldo
                + ", limiteUtilizado = " + this.limiteUtilizado + "]";
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
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

    public double getLimiteUtilizado() {
        return limiteUtilizado;
    }

    public void setLimiteUtilizado(double limiteUtilizado) {
        this.limiteUtilizado = limiteUtilizado;
    }

    public void sacar(double valor) {

        if ((saldo - valor) >= 0) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.println(this.toString());
        } else if ((limiteUtilizado <= limite) && (valor <= (limite + saldo))) {
            limiteUtilizado += (valor - saldo);
            saldo = 0;
            System.out.println("Você está utilizando o cheque especial!");
            System.out.println(this.toString());
        } else {
            System.out.println("Não há saldo o suficiente para a operação");
            System.out.println(this.toString());
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito realizado com sucesso!");
    }
}