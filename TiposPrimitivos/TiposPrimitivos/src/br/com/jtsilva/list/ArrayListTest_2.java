package br.com.jtsilva.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest_2 {
    public static void main(String[] args) {

        ArrayList<String> timesSerieA = new ArrayList<>();

        timesSerieA.add("Palmeiras");
        timesSerieA.add("Flamengo");
        timesSerieA.add("Corinthians");
        timesSerieA.add("Atlético-MG");
        timesSerieA.add("Botafogo");
        timesSerieA.add("Fluminense");

        System.out.println(timesSerieA);

        ArrayList<String> timesSerieB = new ArrayList<>();

        timesSerieB.add("Vila Nova");
        timesSerieB.add("Olaria");
        timesSerieB.add("Veranópolis");
        timesSerieB.add("CRB");
        timesSerieB.add("Ferroviária");
        timesSerieB.add("XV Novembro");

        System.out.println(timesSerieB);

        System.out.println(todasSeries(timesSerieA, timesSerieB));

        ArrayList<String> listUniao = todasSeries(timesSerieA, timesSerieB);

        Collections.sort(listUniao);

        System.out.println(listUniao);
    }

    public static ArrayList<String> todasSeries(ArrayList<String> timesSerieA, ArrayList<String> timesSerieB) {
        ArrayList<String> listSeries = new ArrayList<>();
        listSeries.addAll(timesSerieA);
        listSeries.addAll(timesSerieB);

        return listSeries;
    }

}
