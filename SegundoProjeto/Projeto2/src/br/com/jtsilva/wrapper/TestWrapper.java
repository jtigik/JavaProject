package br.com.jtsilva.wrapper;

public class TestWrapper {
    public static void main(String[] args) {
        Integer numero1 = Integer.valueOf(50);// Forma correta para converter;
        Integer numero2 = new Integer("100");

        Integer valorTotal = numero1 + numero2;
        System.out.printf("O valor total é: %d\n", valorTotal);

        Double double1 = new Double(52.56);// Não é mais utilizado.
        System.out.println(double1);

        Double double2 = new Double("52.56");
        System.out.println("Double: " + double2);

        Float float1 = new Float(52);
        Float float2 = new Float("52");
        System.out.println("Float: " + (float1 + float2));

        Character c1 = new Character('a');
        Character c2 = new Character('b');
        // System.out.println("Character: " + (c1 + c2));
        System.out.println("Character: " + c1 + c2);

        // Boolean bool1 = new Boolean(true);
        // Boolean bool1 = new Boolean("true");
        Boolean bool1 = Boolean.valueOf("tRUE");// Forma correta para converter;
        System.out.println("Booleano: " + bool1);
    }
}