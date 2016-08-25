package br.com.gerenciadordecursos.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.gerenciadordecursos.classes.Aula;
import br.com.gerenciadordecursos.classes.Curso;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as Coleções Java", "Paulo Silveira");
		
		javaColecoes.adidciona(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adidciona(new Aula("Criando uma aula",20));
		javaColecoes.adidciona(new Aula("Modelando com coleções",22));
		
		List<Aula> aulasImutavies = javaColecoes.getAulas();
		System.out.println(aulasImutavies);
		
		List<Aula> aulas = new ArrayList<Aula>(aulasImutavies);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
	}

}
