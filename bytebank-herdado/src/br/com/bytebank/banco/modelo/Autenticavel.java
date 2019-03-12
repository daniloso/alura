package br.com.bytebank.banco.modelo;

public abstract interface Autenticavel {
	
	public void setSenha(int senha);
	
	public boolean autentica(int senha);
}
