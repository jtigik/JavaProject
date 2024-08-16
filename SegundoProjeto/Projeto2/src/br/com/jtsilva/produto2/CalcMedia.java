package br.com.jtsilva.produto2;

import java.util.Scanner;

public class CalcMedia {

    public static float calcAvg(float n1, float n2, float n3) {
        return (n1 + n2 + n3) / 3.0f;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float n1, n2, n3;

        System.out.println("Informe 3 números para calcular a média!");
        System.out.println("Primeiro número: ");
        n1 = sc.nextFloat();
        System.out.println("Segundo número: ");
        n2 = sc.nextFloat();
        System.out.println("Terceiro número: ");
        n3 = sc.nextFloat();

        System.out.println(calcAvg(n1, n2, n3));

        sc.close();

    }
}
