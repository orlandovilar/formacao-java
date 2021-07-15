package bytebankHerdado;

public class Gerente extends FuncionarioVersao1 {
    private int senha;

    public boolean autenticar(int senha) {
        if(this.senha == senha) {
            return true;
        }else {
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getBonificacao() {
        return 500.0;
    }




}
