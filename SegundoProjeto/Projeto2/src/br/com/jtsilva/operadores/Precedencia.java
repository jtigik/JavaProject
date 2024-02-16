package br.com.jtsilva.operadores;

public class Precedencia {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        int c = 60;

        int resultado = a + b * c / 2 + a++ - 3 + 8 - --b;

        System.out.println(resultado);

        a = 20;
        int resultado2 = (a + b) * c / 2 + (a++ - 3) + 8 - --b;
        System.out.println(resultado2);
    }
}