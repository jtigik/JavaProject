
/*### Exercício para Iniciante: Tratamento de Entrada de Dados

**Objetivo:** Criar uma classe que solicita ao usuário que insira um número inteiro. Se o usuário inserir um valor que não seja um número inteiro, o programa deve capturar a exceção e solicitar que ele tente novamente.

**Descrição:**
1. Crie uma classe chamada `NumeroInteiro`.
2. Dentro da classe, crie um método chamado `solicitarNumero` que lê um número do console.
3. Utilize a estrutura Try-Catch para capturar qualquer `InputMismatchException` que possa surgir se o usuário inserir dados que não são um número inteiro.
4. No bloco `finally`, coloque um print que sempre será executado, indicando o fim da execução do método.

**Código:** */

package br.com.jtsilva.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ApenasInteiros {
    public void solicitarNumero() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Por favor, insira um número inteiro: ");
            int numero = scanner.nextInt();
            System.out.println("O número inserido foi: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Você não inseriu um número inteiro. Tente novamente.");
        } finally {
            System.out.println("Execução do método `solicitarNumero` concluída.");
            scanner.close();
        }
    }

    public static void main(String[] args) {
        ApenasInteiros numeroInteiro = new ApenasInteiros();
        numeroInteiro.solicitarNumero();
    }
}
