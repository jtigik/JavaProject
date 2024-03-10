package br.com.jtsilva.tipos;

public class NumberArray {
    // Private array to store numbers
    private int[] numbers;

    // Constructor to initialize the array with given numbers
    public NumberArray(int[] initialNumbers) {
        numbers = initialNumbers.clone(); // Clone to avoid external modifications
    }

    // Method to calculate the sum of the numbers in the array using a for-each loop
    public int calculateSum() {
        int sum = 0;
        for (int number : numbers) { // For-each loop to iterate over the array elements
            sum += number;
        }
        return sum;
    }

    // Method to add a new number to the array
    public void addNumber(int newNumber) {
        int[] newNumbers = new int[numbers.length + 1];
        System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
        newNumbers[numbers.length] = newNumber;
        numbers = newNumbers;
    }

    // Method to print all numbers in the array
    public void printNumbers() {
        System.out.print("Numbers in the array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
