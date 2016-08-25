package br.com.gerenciadordecursos.classes;

public class Aluno {
	
	private String nome;
	private Integer numeroMatricula;
	
	public Aluno(String nome, int numeromatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}
		
		this.nome = nome;
		this.numeroMatricula = numeromatricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumeromatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: "+this.nome+", matricula: "+this.numeroMatricula+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj;
		return this.nome.equals(outroAluno.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

}
