package br.com.gerenciadordecursos.main;

import java.util.Iterator;
import java.util.Set;

import br.com.gerenciadordecursos.classes.Aluno;
import br.com.gerenciadordecursos.classes.Aula;
import br.com.gerenciadordecursos.classes.Curso;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as Coleções Java", "Paulo Silveira");

		javaColecoes.adidciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adidciona(new Aula("Criando uma aula", 20));
		javaColecoes.adidciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Ana", 1591);
		Aluno a2 = new Aluno("Pedro", 2587);
		Aluno a3 = new Aluno("José", 7527);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados nesse curso");
		javaColecoes.getAlunos().forEach(aluno -> {System.out.println(aluno);});
		
		System.out.println("O aluno "+ a1 + " está matriculado??");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		//esse retorna false sem implementação de HashCode 
		Aluno alunoAna = new Aluno("Ana", 1591);
		System.out.println("O aluno "+ alunoAna + " está matriculado??");
		System.out.println(javaColecoes.estaMatriculado(alunoAna));
		
		//equals
		System.out.println(a1+" é equals com "+alunoAna);
		System.out.println(a1.equals(alunoAna));
		
		//obrigatoriamente o hashCode tem que ser true
		System.out.println(a1.hashCode() == alunoAna.hashCode());
		
		
		//Iterator
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterator = alunos.iterator();
		while (iterator.hasNext()) {
			Aluno proximo = iterator.next();
			System.out.println(proximo);
		}
		
	}

}
