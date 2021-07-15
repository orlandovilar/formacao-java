package bytebankHerdado;

public class ControlarBonificacao {
    private double soma;

    public void registrar(Gerente gerente) {
        double bonificacao = gerente.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    public void registrar(FuncionarioVersao1 funcionario) {
        double bonificacao = funcionario.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    public void registrar(Diretor diretor) {
        double bonificacao = diretor.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    public double getSoma() {
        return soma;
    }
}
