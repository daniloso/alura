package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Orientação a objetos", "Paulo Silveira");
		List<Aula> aulas = javaColecoes.getAulas();
//		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 21));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		
		
		System.out.println(javaColecoes.getAulas());
	}

}
