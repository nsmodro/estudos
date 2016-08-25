package br.com.gerenciadordecursos.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String nomeInstrutor;
	//funciona com as 2
	//a diferença é a performance 
	//arraylists insere rapidamente e busca rapidamente. Problema é inserir no meio ou no começo e deletar 
	//linkedList melhor para inserir e deletar no meio e inicio na lista. Lenta na busca.
	//private List<Aula> aulas = new LinkedList<Aula>();
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();	
	
	//esse LinkedHashSet guarda a ordem de inserção
	//private Set<Aluno> alunos = new LinkedHashSet<>();
	
	//só funciona para obj que tem implementado comparable -- busca mais rápido que lista
	//private Set<Aluno> alunos = new TreeSet<>();
	
	
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	//private Map<Integer, Aluno> matriculaParaAluno = new LinkedHashMap<>();
	
	public Curso(String nome, String nomeInstrutor) {
		this.nome = nome;
		this.nomeInstrutor = nomeInstrutor;
	}

	public String getNome() {
		return nome;
	}
	
	public String getNomeInstrutor() {
		return nomeInstrutor;
	}
	
	public List<Aula> getAulas() {
		//return aulas;
		
		//agora apenas leitura
		return Collections.unmodifiableList(this.aulas);
	}
	
	public void adidciona(Aula aula) {
		this.aulas.add(aula);
	}	
	
	public int getTempoTotal() {
		/*int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;*/
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "[Curso: " + getNome() + ", tempo total: "+getTempoTotal()+", aulas: "+this.aulas+"";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeromatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(this.alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaPorMatricula(int matricula) {
		/*for (Aluno aluno : alunos) {
			if (aluno.getNumeromatricula() == matricula) {
				return aluno;
			}
		}
		throw new NoSuchElementException("Matrícula não encontrada");
		*/
		if (!matriculaParaAluno.containsKey(matricula)) {
			throw new NoSuchElementException("Matrícula não encontrada");
		}
		
		//iteração para map
		//matriculaParaAluno.forEach((numeroMatricula,aluno) -> {System.out.println(aluno);});
		
		//pessoas.keySet().forEach(idade -> {System.out.println(pessoas.get(idade));});
		
		return matriculaParaAluno.get(matricula);
	}

}
