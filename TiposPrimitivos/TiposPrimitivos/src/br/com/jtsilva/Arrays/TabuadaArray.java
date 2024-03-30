package br.com.jtsilva.arrays;

public class TabuadaArray {
    public static void main(String[] args) {
        int[] numeroDeEntrada = { 2, 3, 5, 7, 10 }; // 5 Tabuadas a serem calculadas.

        for (int i : numeroDeEntrada) {

            System.out.println("=============");
            System.out.printf("Tabuada do %d \n", i);
            System.out.println("=============");

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}
