package Tarefa_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarefa_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> funcionariosMasculinos = new ArrayList<>();
        ArrayList<String> funcionariosFemininos = new ArrayList<>();

        System.out.println("Informe os funcionários (digite 'fim' para encerrar):");
        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Gênero (M/F): ");
            String genero = scanner.nextLine();

            if (genero.equalsIgnoreCase("M")) {
                funcionariosMasculinos.add(nome);
            } else if (genero.equalsIgnoreCase("F")) {
                funcionariosFemininos.add(nome);
            } else {
                System.out.println("Gênero inválido. Use 'M' para masculino ou 'F' para feminino.");
            }
        }

        System.out.println("\nFuncionários Masculinos:");
        for (String funcionario : funcionariosMasculinos) {
            System.out.println(funcionario);
        }

        System.out.println("\nFuncionários Femininos:");
        for (String funcionario : funcionariosFemininos) {
            System.out.println(funcionario);
        }
    }
}
