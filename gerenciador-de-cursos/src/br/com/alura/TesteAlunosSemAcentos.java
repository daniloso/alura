package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunosSemAcentos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Danilo");
		alunos.add("Carol");
		alunos.add("Nico");
		alunos.add("Paulo");
		alunos.add("Danilo");
		
			System.out.println(alunos.size());
			
			boolean adicionou = alunos.add("Danilo");
			System.out.println("O aluno Danilo foi adicionado ao set? "+adicionou);

	}

}
