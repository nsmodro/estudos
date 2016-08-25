package br.com.gerenciadordecursos.main;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		//não tem garantia da ordem da lista
		//vantagem, não aceita elementos repetidos
		//busca por elementos é muitoooo mais rápida (hashSet)	
		Set<String> alunos = new HashSet<>();
		alunos.add("João");
		alunos.add("Maria");
		alunos.add("Ana");
		alunos.add("Pedro");
			
		System.out.println(alunos);
		
		for (String string : alunos) {
			System.out.println(string);
		}
		
		alunos.add("João");
		System.out.println(alunos);
		alunos.forEach(aluno -> {System.out.println(aluno);});
		System.out.println(alunos.size());
		
		boolean anaEstaMatriculada = alunos.contains("Ana");
		System.out.println(anaEstaMatriculada);
		
	}

}
 	