package br.com.jtsilva.tipos;

public class CastingPrimitivos {
    public static void main(String[] args) throws Exception {

        // Atribuição convencional.
        int numeroX = 7;
        int numeroY = numeroX + 1;
        int numeroZ = numeroY + numeroX;
        System.out.printf("Valor final de: %d\n", numeroZ);

        byte resultado = 27;
        byte resultado2 = 121;

        // Casting explicitely

        byte somatorio = (byte) (resultado + resultado2);
        System.out.println("Resultado casting explicito: " + somatorio);

        // Casting implicitely

        int valorA = 100;
        long valorB = valorA;

        System.out.println("Resultado casting implicito: " + valorB);

        // Casting forcefully
        float valorFloatA = (float) 100.03f;
        int valorFloatB = (int) valorFloatA;
        System.out.printf("O valor de valorFloatB é: %d\n", valorFloatB);
        System.out.println("O valor de valorFloatB é: " + valorFloatB);

        // MAX_VALUE dos tipos primitives.

        System.out.println("MAX_VALUE do tipo byte: " + Byte.MAX_VALUE);
        System.out.println("MAX_VALUE do tipo short: " + Short.MAX_VALUE);
        System.out.println("MAX_VALUE do tipo int: " + Integer.MAX_VALUE);
        System.out.println("MAX_VALUE do tipo long: " + Long.MAX_VALUE);
        System.out.println("MAX_VALUE do tipo float: " + Float.MAX_VALUE);
        System.out.println("MAX_VALUE do tipo double: " + Double.MAX_VALUE);
    }
}