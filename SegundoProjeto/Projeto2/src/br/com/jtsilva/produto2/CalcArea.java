package br.com.jtsilva.produto2;

import java.util.Scanner;

public class CalcArea {

    public static float calcArea(float n1, float n2) {
        return n1 * n2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float n1, n2;

        System.out.println("Informe 2 números para calcular a área!");
        System.out.println("Altura: ");
        n1 = sc.nextFloat();
        System.out.println("Base: ");
        n2 = sc.nextFloat();

        System.out.printf("Área total: %.2f", calcArea(n1, n2));

        sc.close();

    }

}
