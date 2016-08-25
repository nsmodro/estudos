package br.com.gerenciadordecursos.main;

import java.util.List;

import br.com.gerenciadordecursos.classes.Aula;
import br.com.gerenciadordecursos.classes.Curso;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as Coleções Java", "Paulo Silveira");
		List<Aula> aulas = javaColecoes.getAulas();
		
		System.out.println(aulas);
		
		/*aulas.add(new Aula("Trabalhando com ArrayList",21));
		
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getAulas());
		
		System.out.println(aulas == javaColecoes.getAulas());
		
		javaColecoes.getAulas().add(new Aula("Listas de objetos", 20));
		
		System.out.println(javaColecoes.getAulas());*/
		
		javaColecoes.adidciona(new Aula("Trabalhando com ArrayList",21));
		System.out.println(javaColecoes.getAulas());
		
		//isso deveria ser travado // depois de mudar o get para Collections.unmodifiableList(this.aulas) está travado
		//javaColecoes.getAulas().add(new Aula("Listas de objetos", 20));
		System.out.println(javaColecoes.getAulas());
		
		javaColecoes.adidciona(new Aula("Criando uma aula",20));
		javaColecoes.adidciona(new Aula("Modelando com coleções",22));
		
		System.out.println(javaColecoes.getAulas());

	}

}
