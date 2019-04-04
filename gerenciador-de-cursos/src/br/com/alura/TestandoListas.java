package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		String curso1 = "2: Java 8: Tire proveito dos novos recursos da linguagem";
		String curso2 = "1: Apache Camel";
		String curso3 = "3: Certificacao Java SE 8 Programmer I";
		
		ArrayList<String> cursos = new ArrayList<>();
		
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		System.out.println(cursos);
		
//		cursos.remove(0); remove o elemento na posição 0
//		System.out.println(cursos);
		
		System.out.println("O primeiro curso da lista eh o: " +cursos.get(0)); // imprime na posição 0
		Collections.sort(cursos);
		System.out.println("Em ordem alfabética: "+cursos);
		
		for (String aula : cursos) { //Imprimindo em outra linha
			System.out.println("Aula: "+aula);
		}
		
	}

}
