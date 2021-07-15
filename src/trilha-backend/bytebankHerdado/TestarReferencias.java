package bytebankHerdado;

public class TestarReferencias {

    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();
        gerente1.setNome("Renato");
        gerente1.setSalario(5000.0);

        FuncionarioVersao1 funcionario1 = new FuncionarioVersao1();
        funcionario1.setSalario(2000.0);

        Diretor diretor1 = new Diretor();
        funcionario1.setSalario(10000.0);

        ControlarBonificacao controle1 = new ControlarBonificacao();
        ControlarBonificacao controle2 = new ControlarBonificacao();
        ControlarBonificacao controle3 = new ControlarBonificacao();
        controle1.registrar(gerente1);
        System.out.println(controle1.getSoma());
        controle2.registrar(funcionario1);
        System.out.println(controle2.getSoma());
        controle3.registrar(diretor1);
        System.out.println(controle3.getSoma());

    }
}
