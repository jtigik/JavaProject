package br.com.jtsilva.tipos;

import java.util.Scanner;

public class Calculadora {
    private int valor_1, valor_2;
    private double resultado;

    public int getValor_1() {
        return valor_1;
    }

    public void setValor_1(int valor_1) {
        this.valor_1 = valor_1;
    }

    public int getValor_2() {
        return valor_2;
    }

    public void setValor_2(int valor_2) {
        this.valor_2 = valor_2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public int somar() {
        return this.valor_1 + this.valor_2;
    }

    public float subtrair() {
        return this.valor_1 - this.valor_2;
    }

    public int multiplicar() {
        return this.valor_1 * this.valor_2;
    }

    public float dividir() {
        return this.valor_1 / this.valor_2;
    }

    public void recebeValores(Scanner scanner) {

        System.out.println("Digite o primeiro valor: ");
        this.setValor_1(scanner.nextInt());

        System.out.println("Digite o segundo valor: ");
        this.setValor_2(scanner.nextInt());
    }

    public void menu(Scanner scanner) {

        this.recebeValores(scanner);
        System.out.println("Escolha uma operação: ");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("Digite a opção desejada: ");

        // Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                this.setResultado(this.somar());
                System.out.printf("Resultado final: %f\n", this.getResultado());
                break;
            case 2:
                this.setResultado(this.subtrair());
                System.out.printf("Resultado final: %f\n", this.getResultado());
                break;
            case 3:
                this.setResultado(this.multiplicar());
                System.out.printf("Resultado final: %f\n", this.getResultado());
                break;
            case 4:
                this.setResultado(this.dividir());
                System.out.printf("Resultado final: %f\n", this.getResultado());
                break;
            case 5:
                System.out.println("Obrigado por usar nosso programa!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
