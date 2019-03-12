package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.Designer;
import br.com.bytebank.banco.modelo.Funcionario;
import br.com.bytebank.banco.modelo.Gerente;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("223355646-9");
		nico.setSalario(2590.80);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		Funcionario dan = new Designer();
		dan.setNome("Danilo");
		dan.setCpf("1222333");
		dan.setSalario(3500.00);
		
		System.out.println(dan.getNome());
		System.out.println(dan.getBonificacao());
	}

}
