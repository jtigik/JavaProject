package br.com.jtsilva.exceptions;

public class ExceptionMain {
    public static void main(String[] args) {
        try {
            validarIdade(15);
        } catch (IdadeIvalidaException e) {
            System.out.println(e.getMessage() + ": " + e.getIdade() + " anos.");
        }
    }

    private static void validarIdade(int idade) throws IdadeIvalidaException {
        if (idade >= 18 && idade <= 35) {
            System.out.println("A pessoa é maior de idade");
        } else {
            throw new IdadeIvalidaException("A pessoa é menor de idade", idade);
        }
    }
}
