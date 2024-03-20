/**
 * ### Exercício de Dificuldade Média: Manipulação de Arquivos

**Objetivo:** Criar uma classe que lê um arquivo de texto e imprime seu conteúdo na tela. Se o arquivo não existir,
o programa deve informar o usuário e criar um arquivo vazio com o nome solicitado.

**Descrição:**
1. Crie uma classe chamada `LeitorDeArquivo`.
2. Dentro da classe, crie um método chamado `lerArquivo` que recebe o nome de um arquivo como argumento.
3. Utilize a estrutura Try-Catch para capturar uma `FileNotFoundException` e informar ao usuário que o arquivo não
foi encontrado.
4. No bloco `finally`, verifique se o objeto `Scanner` foi criado e, se sim, feche-o.
5. Se o arquivo não existir, crie um novo arquivo vazio com o nome fornecido.

 */
package br.com.jtsilva.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LeitorDeArquivo {
    public void lerArquivo(String nomeDoArquivo) {
        Scanner scanner = null;
        try {
            File file = new File(nomeDoArquivo);
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado. Criando um arquivo vazio chamado " + nomeDoArquivo + ".");
            criarArquivoVazio(nomeDoArquivo);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            System.out.println("Execução do método `lerArquivo` concluída.");
        }
    }

    private void criarArquivoVazio(String nomeDoArquivo) {
        try (PrintWriter writer = new PrintWriter(nomeDoArquivo)) {
            // O arquivo é criado vazio.
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível criar o arquivo " + nomeDoArquivo + ".");
        }
    }

    public static void main(String[] args) {
        LeitorDeArquivo leitor = new LeitorDeArquivo();
        leitor.lerArquivo("exemplo.txt");
    }
}
