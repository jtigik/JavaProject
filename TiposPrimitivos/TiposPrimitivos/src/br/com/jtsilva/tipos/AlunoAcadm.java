package br.com.jtsilva.tipos;

public class AlunoAcadm {
    private byte idade;
    private String nome;
    private String curso;
    private float media;
    private short matricula;
    private int turma;
    private long cpf;
    private char genero;
    private double altura;
    private boolean ativo;

    public byte getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "AlunoAcadm:\n idade=" + idade
                + ",\nnome=" + nome
                + ",\ncurso=" + curso
                + ",\nmedia=" + media
                + ",\nmatricula=" + matricula
                + ",\nturma=" + turma
                + ",\ncpf=" + cpf
                + ",\ngenero=" + (genero == 0)
                + ", \naltura=" + altura
                + ",\nativo=" + ativo + "]";
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public short getMatricula() {
        return matricula;
    }

    public void setMatricula(short matricula) {
        this.matricula = matricula;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}