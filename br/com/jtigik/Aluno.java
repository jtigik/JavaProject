package aula_10;

public class Aluno {
	
	private String curso;
	private String nome;
	private double nota;
	private int sala;

	/**
	 * @param curso
	 * @param nome
	 * @param nota
	 * @param sala
	 */
	public Aluno(String curso, String nome, double nota, int sala) {
		this.curso = curso;
		this.nome = nome;
		this.nota = nota;
		this.sala = sala;
	}	
	
	/**
	 * @param curso
	 * @param nome
	 * @param nota
	 */
	public Aluno(String curso, String nome, double nota) {
		this.curso = curso;
		this.nome = nome;
		this.nota = nota;
	}

	public Aluno() {
		super();
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + "]";
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
}
