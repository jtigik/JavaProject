package Tarefa_Wrapper;

import java.util.Scanner;

public class Casting {

    // Convert primitive types to Wrapper types
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tarefa_Wrapper");
        System.out.println("Informe um número inteiro: ");
        int n1 = scanner.nextInt();
        String numeroString = String.valueOf(n1);
        Integer numeroInteger = Integer.valueOf(n1);

        System.out.printf("Valor convertido para String: %s\n", numeroString);
        System.out.printf("Valor convertido para Integer: %s\n", numeroInteger);

        scanner.close();
    }
}
