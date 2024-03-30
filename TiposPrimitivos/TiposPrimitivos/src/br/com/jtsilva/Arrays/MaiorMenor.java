package br.com.jtsilva.arrays;

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

        // ================================================================
        // Mais uma forma de verificar maior e menor (Class Math());
        // ================================================================

        for (int i = 0; i < numeros.length; i++) {
            menor = Math.min(menor, numeros[i]);
            maior = Math.max(maior, numeros[i]);
        }

        System.out.printf("O menor valor do Array: %d\n", menor);
        System.out.printf("O maior valor do Array: %d\n", maior);

        // ================================================================
        // Ordenação com Array de String
        // ================================================================

        String[] nomes = { "José", "Maria", "Pedro", "Ana", "Claudia", "Marcos", "Pedro", "Natalia", "Antonio" };
        System.out.println("Array antes de ordenar:");
        System.out.println(Arrays.toString(nomes));

        Arrays.sort(nomes);

        System.out.println("Array depois de ordenar:");
        System.out.println(Arrays.toString(nomes));

        // ================================================================
        // Calcula média Array de double
        // ================================================================

        float[] notas = { 1.6f, 5.3f, 9.1f, 8.7f, 4.9f, 7.0f, 2.4f, 10.0f, 9.5f };
        double[] grades = { 1.6, 5.3, 9.1, 8.7, 4.9, 7.0, 2.4, 10.0, 9.5 };
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }
        System.out.println(soma / notas.length);
        double media = soma / notas.length;

        soma = 0;
        for (double grade : grades) {
            soma += grade;
        }
        System.out.println(soma / grades.length);
        double avg = soma / grades.length;

        System.out.printf("A média das notas é: %.1f\n", media);
        System.out.printf("A média das notas é: %.1f\n", avg);

    }
}
