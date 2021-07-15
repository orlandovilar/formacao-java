package bytebankHerdado;

public class TestarReferencias {

    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();
        gerente1.setNome("Renato");
        gerente1.setSalario(5000.0);

        Diretor diretor1 = new Diretor();
        diretor1.setSalario(10000.0);

        Designer designer1 = new Designer();
        designer1.setSalario(2000.0);

        ControlarBonificacao controle = new ControlarBonificacao();
        controle.registrar(gerente1);
        controle.registrar(diretor1);
        controle.registrar(designer1);
        System.out.println(controle.getSoma());

    }
}
