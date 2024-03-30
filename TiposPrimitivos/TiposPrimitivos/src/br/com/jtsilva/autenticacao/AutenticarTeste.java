package br.com.jtsilva.autenticacao;

import javax.swing.JOptionPane;

public class AutenticarTeste {
    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog("Informe seu email: ");
        String senha = JOptionPane.showInputDialog("Informe sua senha: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
        String perfil = JOptionPane.showInputDialog("Informe seu perfil: ");

        System.out.println(email);
        System.out.println(senha);
        System.out.println(idade);
        System.out.println(perfil);

        /*
         * Não é necessário ainda saber qual objeto será utilizado
         * mas já é possível definir a referência do Objeto.
         */

        /**
         * a - Administrator
         * e - Estudante
         */

        IAutenticacao autenticador;
        boolean idadeOK = false;

        if (perfil.equalsIgnoreCase("a")) {
            autenticador = new Admin();
        } else if (perfil.equalsIgnoreCase("e")) {
            autenticador = new Estudante();
            if (autenticador instanceof Estudante) {
                idadeOK = ((Estudante) autenticador).validarIdade(idade);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Perfil informado inválido!");
            return;
        }
        boolean autenticado = false;

        if (autenticador instanceof Estudante) {
            autenticado = autenticador.autenticarUsuario(email, senha) && idadeOK;
        } else {
            autenticado = autenticador.autenticarUsuario(email, senha);
        }

        System.out.println(autenticado);
        if (autenticado) {
            JOptionPane.showMessageDialog(null, "Acesso liberado!");
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negado!");
        }
    }
}
