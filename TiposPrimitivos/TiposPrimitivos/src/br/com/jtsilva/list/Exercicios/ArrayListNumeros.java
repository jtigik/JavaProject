/**
* **2. Baixa Dificuldade:**
* Crie um ArrayList que armazene os números de 1 a 10. Adicione o número 11 ao ArrayList. 
* Imprima o ArrayList no console.
*/

package br.com.jtsilva.list.Exercicios;

import java.util.ArrayList;

public class ArrayListNumeros {
    public static void main(String[] args) {
        // Cria um ArrayList para armazenar números de 1 a 10
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adiciona números ao ArrayList
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        // Adiciona o número 11 ao ArrayList
        numeros.add(11);

        // Imprime o ArrayList no console
        System.out.println(numeros);
    }
}
