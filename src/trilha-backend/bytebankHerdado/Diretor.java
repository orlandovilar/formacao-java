package bytebankHerdado;

public class Diretor extends FuncionarioVersao1 {

    public double getBonificacao() {
        return super.getSalario() + 1000.0;
    }




}
