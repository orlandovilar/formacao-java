package bytebank;

public class Referencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(2947, 3030);

        primeiraConta.depositar(300);
        System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo()
);

        segundaConta.depositar(100);
        System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo()
);

        primeiraConta.depositar(100);
        System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo()
);

        if(primeiraConta == segundaConta) {
            System.out.println("Contas iguais");
        }else {
            System.out.println("Contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}
