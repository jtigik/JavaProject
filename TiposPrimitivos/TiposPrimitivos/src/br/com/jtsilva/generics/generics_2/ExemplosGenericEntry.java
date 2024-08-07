package br.com.jtsilva.generics.generics_2;

public class ExemplosGenericEntry {
    public static void main(String[] args) {
        GenericEntry<String, Long> entry = new GenericEntry<>("Teste", 10L);
        System.out.println(entry.getData() + " " + entry.getCode());

        GenericEntry<Long, Integer> entryLong = new GenericEntry<>(10L, 11);
        System.out.println(entryLong.getData() + " " + entryLong.getCode());
    }
}
