package bytebankHerdado;

public class TestarGerente {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();
        gerente1.setNome("Renato");
        gerente1.setCpf("123456789");
        gerente1.setSalario(5000.0);
        gerente1.setSenha(2222);

        System.out.println(gerente1.getNome());
        System.out.println(gerente1.getCpf());
        System.out.println(gerente1.getSalario());

        System.out.println(gerente1.autenticar(2222));

        System.out.println(gerente1.getBonificacao());
    }
}
