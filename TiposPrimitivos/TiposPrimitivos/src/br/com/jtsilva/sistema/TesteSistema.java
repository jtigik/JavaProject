package br.com.jtsilva.sistema;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class TesteSistema {

    public static void main(String[] args) {
        BancoDeDados bancoDeDados = new BancoDeDados();

        Cliente cliente = new Cliente();
        cliente.setNome("Adriano");
        cliente.setCpf("113333555555");

        List<Produto> produtos = Arrays.asList(new Produto("Teclado"),
                new Produto("Mouse"),
                new Produto("Gamer Chair"));

        Venda venda = new Venda(cliente, produtos);
        venda.setChave(UUID.randomUUID().toString());

        bancoDeDados.salvarVendaNoBanco(venda);

        for (Venda objVenda : bancoDeDados.buscarTodos()) {
            System.out.println(objVenda.toString());
            System.out.println(objVenda.getProdutos());
        }
    }

}
