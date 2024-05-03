package Tarefa_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tarefa_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomesConvidados = new ArrayList<>();

        System.out.println("Digite os nomes dos convidados (digite 'fim' para encerrar):");
        String nome;
        while (true) {
            nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            nomesConvidados.add(nome);
        }

        Collections.sort(nomesConvidados);

        System.out.println("\nNomes dos convidados em ordem ascendente:");
        for (String convidado : nomesConvidados) {
            System.out.println(convidado);
        }
        scanner.close();
    }
}
