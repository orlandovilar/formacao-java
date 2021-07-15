package bytebankHerdado;

public class TestarFuncionarioVersao1 {
    public static void main(String[] args) {
        FuncionarioVersao1 orlando = new Gerente();

        orlando.setNome("José Orlando");
        orlando.setCpf("22222222222");
        orlando.setSalario(2500.0);

        System.out.println(orlando.getNome());
        System.out.println(orlando.getBonificacao());
    }
}
