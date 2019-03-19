package br.com.bytebank.banco.teste.util;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
//		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Cliente cliente = new Cliente();
//		lista.add(cliente); ***como meu objeto � do tipo Cliente, n�o da pra add cliente em uma lista que � do tipo Conta
		//List<Conta> lista = new ArrayList<Conta>(); //usa array por baixo
        //List<Conta> lista = new LinkedList<Conta>(); //lista linkada
        List<Conta> lista = new Vector<Conta>(); //usa array por baixo, mas tbm � threadsafe
//        Collection<Conta> lista = new Vector<Conta>(); 
		
		Conta cc = new ContaCorrente(111, 2222);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        System.out.println("Tamanho: "+lista.size());
        
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());
        
        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33, 311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33, 322);
        lista.add(cc4);

        for(int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }
        
        System.out.println("----------");
        
        for (Conta conta : lista) { //� o for each, significa que para cada elemento do tipo Object dentro da sua lista, imprime isso
			System.out.println(conta);
		}
        
	}

}
