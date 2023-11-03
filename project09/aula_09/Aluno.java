package aula_09;

public class Aluno {
	private String nome;
	private String curso;
	private double note;
	private String sala;
	
	
	
	public Aluno(String nome, String curso, double note, String sala) {
		this.nome = nome;
		this.curso = curso;
		this.note = note;
		this.sala = sala;
	}
	
	
	//Gerado automaticamente (gerar método .toString())
	@Override
//	public String toString() {
//		return "Aluno [nome=" + nome 
//				+ ", curso=" + curso 
//				+ ", note=" + note 
//				+ ", sala=" + sala + "]";
//	}
	
	public String toString() {
		return "Aluno [nome=" + nome + "]";
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
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	
	
}
