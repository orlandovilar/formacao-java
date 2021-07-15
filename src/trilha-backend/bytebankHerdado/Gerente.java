package bytebankHerdado;

public class Gerente extends FuncionarioVersao1 implements Autenticavel {
    private int senha;

    public double getBonificacao() {
        return 500.0;
    }

    @Override
    public boolean autenticar(int senha) {
        if(this.senha == senha) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }
}
