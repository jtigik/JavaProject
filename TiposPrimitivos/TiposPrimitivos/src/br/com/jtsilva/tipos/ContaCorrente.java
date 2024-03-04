package br.com.jtsilva.tipos;

import java.util.Scanner;

public class ContaCorrente {

    private static final double limite = 200;
    private int numeroConta;
    private int agencia;
    private double saldo;
    private double limiteUtilizado;

    @Override
    public String toString() {
        return "ContaCorrente [numeroConta = " + this.numeroConta + ", agência = " + this.agencia + ", saldo = "
                + this.saldo + "]";
    }
    // @Override
    // public String toString() {
    // return "ContaCorrente [numeroConta = " + this.numeroConta + ", agência = " +
    // this.agencia + ", saldo = "
    // + this.saldo
    // + ", limiteUtilizado = " + this.limiteUtilizado + "]";
    // }

    public double getLimite() {
        return limite;
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

    public void criarConta() {
        setNumeroConta(123456789);
        setAgencia(1234);
        setSaldo(5);
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
        if ((limiteUtilizado > 0) && (valor <= limiteUtilizado)) {
            limiteUtilizado -= valor;
            System.out.println("Deposito realizado com sucesso!");
            System.out.println(this.toString());
        } else if ((limiteUtilizado > 0) && (valor > limiteUtilizado)) {
            saldo += (valor - limiteUtilizado);
            limiteUtilizado = 0;
            System.out.println("Deposito realizado com sucesso!");
            System.out.println(this.toString());
        } else {
            saldo += valor;
            limiteUtilizado = 0;
            System.out.println("Deposito realizado com sucesso!");
            System.out.println(this.toString());
        }
    }

    public void sacar_2(double valor) {

        if ((saldo - valor) >= limite) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Não há saldo o suficiente para a operação");
        }
        if (saldo < 0) {
            System.out.println("Você está utilizando o cheque especial!");
        }
        System.out.println(this.toString());
    }

    public void depositar_2(double valor) {

        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
        System.out.println(this.toString());
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public int menu() {

        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Consultar");
        System.out.println("4 - Sair");
        System.out.println("Digite a opção desejada: ");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                criarConta();
                System.out.println("Digite o valor a ser sacado: ");
                double valor = scanner.nextDouble();
                sacar_2(valor);
                break;
            case 2:
                criarConta();
                System.out.println("Digite o valor a ser depositado: ");
                double valor2 = scanner.nextDouble();
                depositar_2(valor2);
                break;
            case 3:
                System.out.println(this.toString());
                break;
            case 4:
                System.out.println("Obrigado por usar nosso programa!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        scanner.close();
        return opcao;
    }
}