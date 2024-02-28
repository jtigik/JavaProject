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
        double double3 = Double.parseDouble("145.5623");
        System.out.println("Double2: " + double2);
        System.out.println("Double3: " + double3);

        // Float float1 = new Float(52.3456f);
        Float float1 = Float.valueOf(52.3456f);
        Float float2 = Float.valueOf(float1);
        float float3 = Float.parseFloat("79.321");
        System.out.println("Float2: " + float2 + " Float3: " + float3);
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