package br.com.gerenciadordecursos.main;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		//n�o tem garantia da ordem da lista
		//vantagem, n�o aceita elementos repetidos
		//busca por elementos � muitoooo mais r�pida (hashSet)	
		Set<String> alunos = new HashSet<>();
		alunos.add("Jo�o");
		alunos.add("Maria");
		alunos.add("Ana");
		alunos.add("Pedro");
			
		System.out.println(alunos);
		
		for (String string : alunos) {
			System.out.println(string);
		}
		
		alunos.add("Jo�o");
		System.out.println(alunos);
		alunos.forEach(aluno -> {System.out.println(aluno);});
		System.out.println(alunos.size());
		
		boolean anaEstaMatriculada = alunos.contains("Ana");
		System.out.println(anaEstaMatriculada);
		
	}

}
 	