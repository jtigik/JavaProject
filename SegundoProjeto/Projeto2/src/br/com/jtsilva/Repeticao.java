package br.com.jtsilva;

import java.util.Arrays;

public class Repeticao {

    public static void main(String[] args) {

        int[] vetor = { 2, 3, 5, 7, 9, 12 };
        int pos = 1;
        for (int i : vetor) {
            pos = Arrays.binarySearch(vetor, i);
            System.out.printf("Posição: %d - Valor: %d\n", pos, i);
        }

        System.out.println("Resultado for-each");
    }

}