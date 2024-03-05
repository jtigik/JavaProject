package br.com.jtsilva.tipos;

public enum EnumMesDoAno {
    JANEIRO(1, "Jan"),
    FEVEREIRO(2, "Fev"),
    MARÇO(3, "Mar"),
    ABRIL(4, "Abr"),
    MAIO(5, "Mai"),
    JUNHO(6, "Jun");

    private final int mes;
    private final String name;

    private EnumMesDoAno(int mes, String name) {
        this.mes = mes;
        this.name = name;
    }

    public int getMes() {
        return mes;
    }

    public String getName() {
        return name;
    }

    public static EnumMesDoAno obterMes(int mes) {
        for (EnumMesDoAno m : EnumMesDoAno.values()) {
            if (m.getMes() == mes) {
                return m;
            }
        }
        return null;
    }
}
