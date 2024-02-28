package br.com.jtsilva.introduction;

public class TesteLoop {
    public static void main(String[] args) {

        int num = 0;

        looping(num);

    }

    public static void looping(int num) {
        while (num < 10) {
            System.out.printf("Testing %d\n", num++);
        }
    }
}