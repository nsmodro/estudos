package br.com.gerenciadordecursos.main;

import br.com.gerenciadordecursos.classes.Aluno;
import br.com.gerenciadordecursos.classes.Aula;
import br.com.gerenciadordecursos.classes.Curso;

public class TestaBuscaAlunosNoCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as Cole��es Java", "Paulo Silveira");

		javaColecoes.adidciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adidciona(new Aula("Criando uma aula", 20));
		javaColecoes.adidciona(new Aula("Modelando com cole��es", 22));
		
		Aluno a1 = new Aluno("Ana", 1591);
		Aluno a2 = new Aluno("Pedro", 2587);
		Aluno a3 = new Aluno("Jos�", 7527);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem � o aluno com matr�cula 2587?");
		Aluno aluno = javaColecoes.buscaPorMatricula(2587);
		System.out.println("Aluno: " + aluno);

	}
}
