package bytebankHerdado;

public class AutenticacaoUtil {
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
}
