package Tarefa_Collections_II;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Tarefa_1_Maps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> funcionariosPorGenero = new HashMap<>();
        funcionariosPorGenero.put("M", new ArrayList<>()); // Masculino
        funcionariosPorGenero.put("F", new ArrayList<>()); // Feminino

        System.out.println("Informe os funcionários (digite 'fim' para encerrar):");
        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Gênero (M/F): ");
            String genero = scanner.nextLine();

            if (genero.equalsIgnoreCase("M") || genero.equalsIgnoreCase("F")) {
                funcionariosPorGenero.get(genero).add(nome);
            } else {
                System.out.println("Gênero inválido. Use 'M' para masculino ou 'F' para feminino.");
            }
        }

        System.out.println("\nFuncionários Masculinos (ordem ascendente):");
        Collections.sort(funcionariosPorGenero.get("M"));
        funcionariosPorGenero.get("M").forEach(System.out::println);

        System.out.println("\nFuncionários Femininos (ordem ascendente):");
        Collections.sort(funcionariosPorGenero.get("F"));
        funcionariosPorGenero.get("F").forEach(System.out::println);

        scanner.close();
    }
}
