
public class Programa {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.endereco = new Endereco();
		p.nome = "Paulo";
		p.endereco.logradouro = "Rua dos Testes";
		System.out.println(p.endereco.logradouro);
	}
}
