package br.com.jtsilva.tipos;

import java.util.Scanner;

public class SimplesTab {

    public static void main(String[] args) {

        int num = 0, termo = 0, cont = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tabuada de qual número? ");

        num = scanner.nextInt();

        while (cont <= 10) {
            termo = num * cont;
            System.out.println(num + " x " + cont + " = " + termo);
            cont++;
        }
        scanner.close();
    }
}
