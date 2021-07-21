package javaUtil.br.com.bytebank.banco.modelo;

import java.util.Arrays;

public class GuardadorDeContas {

    private Conta[] referencias;
    private int posicaoLivre;

    public GuardadorDeContas() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    public void adicionar(Conta conta) {
        this.referencias[posicaoLivre] = conta;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
       return this.posicaoLivre;
    }

    public Conta getReferencia(int i) {
        return this.referencias[i];
    }
}
