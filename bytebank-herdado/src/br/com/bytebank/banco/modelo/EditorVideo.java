package br.com.bytebank.banco.modelo;

public class EditorVideo extends Funcionario {

	@Override
	public double getBonificacao() {
		return super.getSalario() + 150.00;
	}
}
