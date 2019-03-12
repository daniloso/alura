package br.com.bytebank.banco.modelo;

public class Designer extends Funcionario {

	@Override
	public double getBonificacao() {
		return super.getSalario() + 200.00;
	}
}
