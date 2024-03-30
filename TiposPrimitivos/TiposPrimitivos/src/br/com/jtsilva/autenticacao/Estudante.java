package br.com.jtsilva.autenticacao;

public class Estudante implements IAutenticacao {
    @Override
    public boolean validarEmail(String email) {
        return email.contains("@");
    }

    @Override
    public boolean validarSenha(String senha) {
        return senha.length() > 6;
    }

    @Override
    public boolean autenticarUsuario(String email, String senha) {
        return validarEmail(email) && validarSenha(senha);
    }

    public boolean validarIdade(int idade) {
        return idade >= 18;
    }

}
