package javaUtil.br.com.bytebank.banco.test;

import javaUtil.br.com.bytebank.banco.modelo.ContaCorrente;
import javaUtil.br.com.bytebank.banco.modelo.ContaPoupanca;
import javaUtil.br.com.bytebank.banco.modelo.GuardadorDeContas;
import javaUtil.br.com.bytebank.banco.modelo.Conta;

public class TesteGuardadorDeContas {

    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adicionar(cc);

        Conta cp = new ContaPoupanca(22, 11);
        guardador.adicionar(cp);

        System.out.println(guardador.getQuantidadeDeElementos());

        Conta ref = guardador.getReferencia(0);
        System.out.println();
    }
}
