package br.com.jtsilva.veiculo;

import java.util.Scanner;

public class PrimeNumberValidator {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numToCheck = 0;
        System.out.println("Informe um número: ");
        Scanner scanner = new Scanner(System.in);
        numToCheck = scanner.nextInt();

        // int numToCheck = 17; // Replace with the number you want to check
        if (isPrime(numToCheck)) {
            System.out.println(numToCheck + " É um número Primo.");
        } else {
            System.out.println(numToCheck + " Não é um número Primo.");
        }

        scanner.close();
    }
}
