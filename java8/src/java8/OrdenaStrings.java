package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura onlie");
		palavras.add("editora casa do cogido");
		palavras.add("caelum");

		Collections.sort(palavras);
		System.out.println(palavras);
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		//Collections.sort(palavras, comparador); ***Jeito antigo
		palavras.sort(comparador); //Com java 8
		System.out.println(palavras);
		
//		for (String p : palavras) {
//			System.out.println(p);
//		}
		
		Consumer<String> consumidor = new imprimeNaLinha();
		palavras.forEach(consumidor);

	}
	
	static class imprimeNaLinha implements Consumer<String>{

		@Override
		public void accept(String s) {
			System.out.println(s);
		}
		
	}

	public static class ComparadorPorTamanho implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {

			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length()) 
				return 1;
			return 0;
		}

	}
}
