package br.com.jtsilva;

import br.com.jtsilva.tipos.NumberArray;

public class MainArray {
    public static void main(String[] args) {
        // Create an instance of NumberArray with some initial numbers
        NumberArray numberArray = new NumberArray(new int[] { 10, 20, 30, 40, 50 });

        // Print the numbers in the array
        numberArray.printNumbers();

        // Calculate and print the sum of the numbers
        int sum = numberArray.calculateSum();
        System.out.println("Sum of the numbers: " + sum);

        // Add a new number to the array and show the updated sum
        numberArray.addNumber(60);
        numberArray.printNumbers();
        sum = numberArray.calculateSum();
        System.out.println("Updated sum of the numbers: " + sum);
    }
}
