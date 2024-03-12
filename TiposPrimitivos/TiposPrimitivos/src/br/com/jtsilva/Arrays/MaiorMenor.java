package br.com.jtsilva.Arrays;

import java.util.Arrays;

public class MaiorMenor {
    public static void main(String[] args) {
        int[] numeros = { 1, 5, 19, 80, 45, 67, 23, 11, 9 };

        // Duas formas de inicializar a variável.
        int maior = 0;
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println(maior);
        System.out.println(menor);

        // ================================================================
        // Outra forma de verificar maior e menor;
        // ================================================================
        System.out.println("Array antes da ordenação:");
        System.out.println(Arrays.toString(numeros));

        System.out.println("Array depois da ordenação:");
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        menor = numeros[0];
        maior = numeros[numeros.length - 1];

        System.out.println(maior);
        System.out.println(menor);
    }
}
