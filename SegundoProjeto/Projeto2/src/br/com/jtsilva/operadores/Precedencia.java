package br.com.jtsilva.operadores;

public class Precedencia {
    public static void main(String[] args) {

        // int a = 10;
        // int b = 2;
        // int c = 60;

        // int resultado = a + b * c / 2 + a++ - 3 + 8 - --b;

        // System.out.println(resultado);

        // a = 20;
        // int resultado2 = (a + b) * c / 2 + (a++ - 3) + 8 - --b;
        // System.out.println(resultado2);

        // a = 3;
        // System.out.println(a % 2 == 0 ? ++a : a++);

        int a = 3;
        int b = 4;
        int c = 7;

        // System.out.println(!((a > b) && (a < c)));

        if (a++ >= b)
            System.out.println(--c);
        else
            System.out.println(c++);

        char h = 'h'; // 'h' = 104 -> Integer.valueOf(h));
        char f = 'f'; // 'f' = 102 -> Integer.valueOf(f));

        System.out.println(h + f + "" + h + f);
    }
}