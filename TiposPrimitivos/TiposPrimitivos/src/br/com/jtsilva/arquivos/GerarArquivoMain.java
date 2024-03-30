package br.com.jtsilva.arquivos;

public class GerarArquivoMain {
    public static void main(String[] args) {
        IGeracaoArquivo excel = new Excel();
        IGeracaoArquivo pdf = new PDF();
        IGeracaoArquivo txt = new TXT();

        excel.gerarArquivos("Tipo excel");
        pdf.gerarArquivos("Tipo PDF");
        txt.gerarArquivos("Tipo TXT");
    }
}
