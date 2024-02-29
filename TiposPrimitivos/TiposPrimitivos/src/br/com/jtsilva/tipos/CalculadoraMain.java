package br.com.jtsilva.tipos;

import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        calc.menu(scanner);
        scanner.close();
    }
}
