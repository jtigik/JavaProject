package br.com.jtsilva.arquivos;

public class Excel implements IGeracaoArquivo {

    @Override
    public void gerarArquivos(String newArquivos) {
        System.out.printf("Gerando arquivo em Excel: " +
                "%s.xlsx\n", newArquivos);
    }
}
