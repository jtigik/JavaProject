package br.com.jtsilva.heranca;

public class TesteHeranca {
    public static void main(String[] args) {

        MembroComunidade membro = new Empregado();
        // MembroComunidade = Referencia (Tipo de referência)
        // membro = Nome do Objeto, instancia, atributo
        // new MembroComunidade() = Tipo do Objeto, instancia, atributo
        // () = Construtor
        membro.exibirMembro();
    }
}
