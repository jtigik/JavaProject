package br.com.jtsilva.arquivos;

public class PDF implements IGeracaoArquivo {

    @Override
    public void gerarArquivos(String newArquivos) {

        System.out.printf("Gerando arquivo em PDF: " +
                "%s.pdf\n", newArquivos);
    }
}
