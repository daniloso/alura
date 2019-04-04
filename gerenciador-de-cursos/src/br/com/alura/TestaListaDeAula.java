package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Revisitando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);//Foi necessário implementar a interface Comparable<Aula> na classe aula e sobscrever o método compareTo
		System.out.println("Classificação por ordem alfabética: "+ aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));//Aqui com esse método é possivel comparar pelo tempo
		System.out.println("Classificação por ordem de minutos: "+ aulas);
		
		
		
		
	}

}
