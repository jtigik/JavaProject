package br.com.jtsilva.generics.generics_2;

import java.util.ArrayList;
import java.util.List;

import br.com.jtsilva.generics.generics_2.fruta.Banana;
import br.com.jtsilva.generics.generics_2.fruta.IFruta;
import br.com.jtsilva.generics.generics_2.fruta.Maca;

public class ExemplosJavaGenerics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Paulo");
        list.add("4");

        imprimir(list);

        List<Long> longList = new ArrayList<>();
        longList.add(1l);
        longList.add(2l);
        longList.add(3l);
        longList.add(4l);
        imprimir(longList);

        String primeiroSt = pegarPrimeiroLista(list);
        System.out.println(primeiroSt);

        Long primeiroLong = pegarPrimeiroLista(longList);
        System.out.println(primeiroLong);

        Long primeiroLong2 = pegarPrimeiroListaLong(longList);
        System.out.println(primeiroLong2);

        imprimir2(longList);

        List<IFruta> frutas = new ArrayList<>();

        frutas.add(new Maca("Macã", "Vermelha", true, 0.15));
        frutas.add(new Banana("Banana", "Amarela", true, 0.12));

        imprimirFrutas(frutas);

    }

    private static void imprimirFrutas(List<? extends IFruta> frutas) {
        for (IFruta fruta : frutas) {
            System.out.println(fruta.getNome());
        }
    }

    private static void imprimir2(List<?> longList) {
        for (Object st : longList) {
            if (st instanceof Long) {
                Long stLong = (Long) st;
                System.out.println(stLong.toString());
            }
            System.out.println("Qualquer coisa: " + st.toString());
        }
    }

    private static <T> Long pegarPrimeiroListaLong(List<T> longList) {
        return (Long) longList.get(0);
    }

    private static <T> T pegarPrimeiroLista(List<T> list) {
        return list.get(0);
    }

    public static <T> void imprimir(List<T> list) {
        for (T st : list) {
            System.out.println(st.toString());
        }
    }
}
