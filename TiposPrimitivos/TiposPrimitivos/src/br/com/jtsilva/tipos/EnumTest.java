package br.com.jtsilva.tipos;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(EnumUF.RJ);
        System.out.println(EnumUF.DF);

        for (EnumUF uf : EnumUF.values()) {
            System.out.println(uf);
        }

        for (EnumMesDoAno mes : EnumMesDoAno.values()) {
            System.out.println(mes.getName());
        }

        System.out.println(EnumMesDoAno.obterMes(1));
    }
}
