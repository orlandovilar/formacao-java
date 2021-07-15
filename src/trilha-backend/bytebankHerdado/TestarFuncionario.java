package bytebankHerdado;

public class TestarFuncionario {
    public static void main(String[] args) {
        Funcionario orlando = new Funcionario();

        orlando.setNome("José Orlando");
        orlando.setCpf("22222222222");
        orlando.setSalario(2500.0);

        System.out.println(orlando.getNome());
        System.out.println(orlando.getBonificacao());
    }
}
