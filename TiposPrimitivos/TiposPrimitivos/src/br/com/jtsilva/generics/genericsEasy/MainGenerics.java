package br.com.jtsilva.generics.genericsEasy;

public class MainGenerics {
    public static void main(String[] args) {
        Caixa<Integer> caixaDeInteiros = new Caixa<>();
        caixaDeInteiros.colocar(123);

        Caixa<String> caixaDeStrings = new Caixa<>();
        caixaDeStrings.colocar("Texto genérico");

        System.out.println("Conteúdo da caixa de inteiros: " + caixaDeInteiros.retirar());
        System.out.println("Conteúdo da caixa de strings: " + caixaDeStrings.retirar());
    }
}
