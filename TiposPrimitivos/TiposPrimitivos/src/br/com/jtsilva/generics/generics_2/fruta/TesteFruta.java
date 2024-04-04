package br.com.jtsilva.generics.generics_2.fruta;

import java.util.ArrayList;
import java.util.List;

public class TesteFruta {
    public static void main(String[] args) {
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
}
