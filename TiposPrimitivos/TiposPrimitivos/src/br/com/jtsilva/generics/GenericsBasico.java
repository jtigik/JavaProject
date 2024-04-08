package br.com.jtsilva.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsBasico {
    public static void main(String[] args) {
        List listaBruta = new ArrayList<>();
        listaBruta.add("Paulo");
        listaBruta.add(45);
        listaBruta.add("Clara");
        listaBruta.add(23);
        listaBruta.add("Carina");
        listaBruta.add(11);

        String meuRegistro = (String) listaBruta.get(0);
        System.out.println(meuRegistro);

        List<String> listaGenerica = new ArrayList<>();
        listaGenerica.add("Sergio");
        listaGenerica.add("Antonio");
        // listaGenerica.add(45);

        System.out.println(listaGenerica);
    }
}
