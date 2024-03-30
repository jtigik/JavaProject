package br.com.jtsilva.arrays;

public class PercorrendoArray {
    public static void main(String[] args) {
        // Array de inteiro com 10 posições.
        int[] numeros = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        // Percorrendo o Array com 'for'
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("For: %d \n", numeros[i]);
        }

        // Percorrendo o Array com 'for-each'
        for (int y : numeros) {
            System.out.printf("For-each: %d \n", y);
        }

        // Percorrendo o Array pela posição fixa
        System.out.printf("Acesso fixo: %d \n", numeros[0]);
        System.out.printf("Acesso fixo: %d \n", numeros[1]);
        System.out.printf("Acesso fixo: %d \n", numeros[2]);
        System.out.printf("Acesso fixo: %d \n", numeros[3]);
        System.out.printf("Acesso fixo: %d \n", numeros[4]);
        System.out.printf("Acesso fixo: %d \n", numeros[5]);

    }
}
