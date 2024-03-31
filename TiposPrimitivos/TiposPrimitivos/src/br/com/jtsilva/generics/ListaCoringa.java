package br.com.jtsilva.generics;

import java.util.ArrayList;
import java.util.List;

public class ListaCoringa {
    public static void main(String[] args) {

        List<?> listaCoringa = new ArrayList<>();

        List<Integer> listaDeInteger = new ArrayList<>();

        listaDeInteger.add(25);
        listaDeInteger.add(35);
        listaDeInteger.add(45);
        listaDeInteger.add(55);

        listaCoringa = listaDeInteger;

        System.out.println(listaCoringa);
        System.out.println(listaDeInteger);

        double valorSomado = somaDeValores(listaDeInteger);
        System.out.println(valorSomado);
    }

    private static double somaDeValores(List<? extends Number> listaInteger) {
        double soma = 0.0;
        for (Number numero : listaInteger) {
            soma += numero.doubleValue();
        }
        return soma;
    }
}
