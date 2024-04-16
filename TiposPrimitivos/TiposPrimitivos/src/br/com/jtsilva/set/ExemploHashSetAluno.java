package br.com.jtsilva.set;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSetAluno {
    public static void main(String args[]) {
        // exemploListaSimples();
        exemploConsultando();
        // exemploRemover();
    }

    private static void exemploRemover() {
        System.out.println("\n**** exemploRemover ****");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 10);
        Aluno e = new Aluno("Teste", "OpenOffice", 10);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);

        conjunto.remove(a);
        System.out.println(conjunto);

        for (Aluno aluno : conjunto) {
            System.out.println(aluno);
        }
    }

    private static void exemploConsultando() {
        System.out.println("\n**** exemploConsultando ****");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 10);
        Aluno e = new Aluno("Teste", "OpenOffice", 10);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);

        System.out.println(conjunto.contains(e));

        if (conjunto.contains(d)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found!");
        }
    }

    /**
     * Para não repetir objetos na lista de alunos é necessário que a classe
     * Aluno implemente o equals e hashcode
     */
    private static void exemploListaSimples() {
        System.out.println("\n**** exemploListaSimples ****");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 10);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);
    }
}
