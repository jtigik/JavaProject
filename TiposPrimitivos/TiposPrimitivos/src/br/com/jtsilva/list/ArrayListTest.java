package br.com.jtsilva.list;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) throws Exception {
        // Create ArrayList of String objects
        ArrayList<String> listPessoa = new ArrayList<>();

        // Add String objects to listPessoa
        listPessoa.add("Atonio");
        listPessoa.add("Maria");
        listPessoa.add("Jonas");
        listPessoa.add("Bianca");

        // Access to elements from listPessoa
        System.out.println(listPessoa);

        // Return the dimension of the listPessoa (how much elements)
        System.out.println(listPessoa.size());

        // Return the element at index 2
        System.out.println(listPessoa.get(2));

        // Add the new element to List
        listPessoa.add("Claudia");
        System.out.println(listPessoa.size());

        // Update the element at index
        listPessoa.set(3, "Claudiane");

        System.out.println(listPessoa);

        // Remove the element at index 2
        listPessoa.remove(2);
        System.out.println(listPessoa);

        // Walking through the list, getting the element at index
        for (int i = 0; i < listPessoa.size(); i++) {
            System.out.printf("Nome do convidado (%d): %s.\n", i, listPessoa.get(i));
        }

        // Walking through the list, getting the element at ForEach variable
        for (String convidado : listPessoa) {
            System.out.printf("Nome do convidado: %s.\n", convidado);
        }
    }
}
