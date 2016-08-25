package br.com.gerenciadordecursos.main;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando Classe Aula";
		String aula3 = "Trabalhando com cursos e Sets";
		
		//array list é um tipo generico
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		System.out.println("A primeira aula é: "+aulas.get(0));
		
		aulas.forEach(aula -> {
			System.out.println("perconrrendo por for each" + aula);
			});
		
		aulas.add("Aumantando nosso conhecimento");
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
	}
}
