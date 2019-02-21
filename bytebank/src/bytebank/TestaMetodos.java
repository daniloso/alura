package bytebank;


public class TestaMetodos {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		
		primeiraConta.deposita(300);
		segundaConta.deposita(100);
		
		primeiraConta.transfere(100, segundaConta);

	}

}

