package javaUtil.br.com.bytebank.banco.test;

import javaUtil.br.com.bytebank.banco.modelo.Conta;
import javaUtil.br.com.bytebank.banco.modelo.ContaCorrente;
import javaUtil.br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorContas {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adicionar(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		guardador.adicionar(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		System.out.println(ref.getNumero());
		
	}

}
