package br.com.jtsilva.aluno;

public class Exemplo {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(); // Criando um objeto da classe Aluno
        aluno1.id = 1;
        aluno1.nome = "Maria";

        System.out.println("ID do aluno: " + aluno1.id);
        System.out.println("Nome do aluno: " + aluno1.nome);
    }
}