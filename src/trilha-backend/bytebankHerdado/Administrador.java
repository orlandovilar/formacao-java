package bytebankHerdado;

public class Administrador extends FuncionarioVersao1 implements Autenticavel {
    private int senha;
    @Override
    public double getBonificacao() {
        return 50;
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
