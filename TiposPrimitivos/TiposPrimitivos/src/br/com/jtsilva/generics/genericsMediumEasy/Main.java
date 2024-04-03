package br.com.jtsilva.generics.genericsMediumEasy;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> listaDeStrings;
        listaDeStrings = new ListaEncadeada<>();
        listaDeStrings.adicionar("Primeiro");
        listaDeStrings.adicionar("Segundo");
        listaDeStrings.adicionar("Terceiro");

        listaDeStrings.imprimir();

        listaDeStrings.remover("Segundo");
        listaDeStrings.imprimir();
    }

}
