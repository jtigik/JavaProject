package Tarefa_Controle_Fluxo;

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double enter = 0.0, nota = 0.0;
        int voltas = 1;

        while (enter != -1) {
            System.out.printf("Digite a nota %d (-1 para calcular a média):", voltas++);
            enter = scanner.nextDouble();
            if (enter > -1)
                nota += enter;
        }

        voltas -= 2;

        if (nota >= 0.0 && voltas > 0) {
            // Calcula a média das notas
            double media = nota / voltas;
            System.out.printf("A média de %d nota(s) é: %.1f\n", voltas, media);
        } else {
            System.out.println("Não foi digitado nenhuma nota");
        }
        scanner.close();
    }
}
