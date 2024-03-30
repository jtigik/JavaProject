package br.com.jtsilva.arrays;

public class SomandoArray {
    public static void main(String[] args) {
        int[] arrayA = { 2, 4, 8 }, arrayB = { 3, 6, 5 };
        int[] arrayC = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            arrayC[i] = arrayA[i] + arrayB[i];
        }
        // System.out.println(Arrays.toString(arrayC));
        System.out.println("Array A:");
        imprimirArray(arrayA);
        System.out.println("Array B:");
        imprimirArray(arrayB);
        System.out.println("Array C:");
        imprimirArray(arrayC);
    }

    public static void imprimirArray(int[] arrayValores) {
        for (int i : arrayValores) {
            System.out.printf("%d ", i);
        }
        System.out.println("\n=================");
    }
}
