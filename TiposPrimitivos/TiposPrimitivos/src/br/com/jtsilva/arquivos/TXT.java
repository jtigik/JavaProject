package br.com.jtsilva.arquivos;

public class TXT implements IGeracaoArquivo {

    @Override
    public void gerarArquivos(String newArquivos) {

        System.out.printf("Gerando arquivo em TXT: %s.txt\n", newArquivos);
    }

}
