package br.com.jtsilva.autenticacao;

public interface IAutenticacao {
    boolean validarEmail(String email);

    boolean validarSenha(String senha);

    boolean autenticarUsuario(String email, String senha);
}
