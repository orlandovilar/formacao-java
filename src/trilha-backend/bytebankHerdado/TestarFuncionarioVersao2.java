package bytebankHerdado;

public class TestarFuncionarioVersao2 {

    public static void main(String[] args) {
        FuncionarioVersao2 func1 = new FuncionarioVersao2();

        func1.setSalario(3000.0);
        System.out.println(func1.getTipo());
        System.out.println(func1.getBonificacao());

        FuncionarioVersao2 func2 = new FuncionarioVersao2();
        func2.setTipo(2);
        func2.setSalario(5000.0);
        System.out.println(func2.getTipo());
        System.out.println(func2.getBonificacao());
    }
}
