package bytebankHerdadoConta;

public class TestarContas {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente(111, 111);
        cc.depositar(100.0);
        try {
            cc.sacar(200.0);
        }catch (SaldoInsuficienteException ex) {
            ex.getMessage();
        }

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.depositar(200.0);

        try {
            cc.transferir(10.0, cp);
        }catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
    }
}