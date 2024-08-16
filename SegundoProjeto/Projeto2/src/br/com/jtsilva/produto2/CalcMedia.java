package br.com.jtsilva.produto2;

import java.util.Scanner;

public class CalcMedia {

    public static float calcAvg(float number) {
        return number / 3.0f;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float number = 0;

        System.out.println("Informe 3 números para calcular a média!");

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Número %d:\n ", i);
            number += sc.nextFloat();
        }

        System.out.printf("Resultado final: %.1f\n", calcAvg(number));

        sc.close();

    }
}
