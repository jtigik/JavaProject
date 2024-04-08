package br.com.jtsilva.generics.exercicio.pares;

public class ExemploPares {

    public static void main(String[] args) {

        Par<String, Integer> pares = new Par<>();

        pares.setPrimeiro("pares");
        pares.setSegundo(10);

        System.out.println(pares.getPrimeiro());
        System.out.println(pares.getSegundo());

        Par<Double, String> pares2 = new Par<>();
        pares2.setPrimeiro(23.09);
        pares2.setSegundo("pares2");

        System.out.println(pares2.getPrimeiro());
        System.out.println(pares2.getSegundo());
    }
}
