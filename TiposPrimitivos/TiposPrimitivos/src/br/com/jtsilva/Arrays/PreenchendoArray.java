package br.com.jtsilva.arrays;

import java.util.Arrays;

public class PreenchendoArray {
    public static void main(String[] args) {
        int valorX = 2;
        int valorY = 0;

        int[] arrayA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        int[] arrayB = new int[arrayA.length];

        // Preenchendo todas as posições do ArrayB
        for (int i : arrayA) {
            arrayB[valorY] = i * valorX;
            valorY++;
        }
        System.out.println(Arrays.toString(arrayB));
        System.out.printf("Array: %s", Arrays.toString(arrayB));

        // Preenchendo 3 primeiras posições do ArrayB
        for (int i = 0; i < 3; i++) {
            arrayB[i] = arrayA[i] * valorX;
        }
        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));
    }
}
