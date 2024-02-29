package br.com.jtsilva.tipos;

import java.util.Scanner;

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

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void menu() {

        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Consultar");
        System.out.println("4 - Nova conta");
        System.out.println("5 - Sair");
        System.out.println("Digite a opção desejada: ");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Digite o valor a ser sacado: ");
                double valor = scanner.nextDouble();
                sacar(valor);
                break;
            case 2:
                System.out.println("Digite o valor a ser depositado: ");
                double valor2 = scanner.nextDouble();
                depositar(valor2);
                break;
            case 3:
                System.out.println(this.toString());
                break;
            case 4:
                System.out.println(this.toString());
                break;
            case 5:
                System.out.println("Obrigado por usar nosso programa!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        scanner.close();
    }
}