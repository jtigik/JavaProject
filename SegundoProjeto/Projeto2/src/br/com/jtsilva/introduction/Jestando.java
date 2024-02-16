package br.com.jtsilva.introduction;

import java.util.Scanner;

public class Jestando {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Informe o valor a ser somado com 5: ");
        int n1 = valor.nextInt();
        int resultado = n1 + 5;
        System.out.println("O resultado da soma é: " + resultado);
        valor.close();
    }
}
