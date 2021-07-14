package bytebank;

public class MovimentarConta {

    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.titular = paulo;
        contaDoPaulo.titular.nome = "Paulo Roberto";
        contaDoPaulo.titular.cpf = "222.222.222-22";
        contaDoPaulo.titular.profissao = "Técnico de TI";

        contaDoPaulo.depositar(50);

        System.out.println(contaDoPaulo.titular.nome + ": " + contaDoPaulo.saldo);

        boolean conseguiuRetirar = contaDoPaulo.sacar(20);
        System.out.println(contaDoPaulo.titular.nome + ": " + contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

        conseguiuRetirar = contaDoPaulo.sacar(2000);
        System.out.println(contaDoPaulo.titular.nome + ": " + contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

        Cliente marcela = new Cliente();
        marcela.nome = "Marcela Lira";
        marcela.cpf = "333.333.333-33";
        marcela.profissao = "Advogada";
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.depositar(1000);
        System.out.println(marcela.nome + ": " + contaDaMarcela.saldo);

        boolean conseguiuTransferir = contaDaMarcela.transferir(300, contaDoPaulo);
        System.out.println(marcela.nome + ": " + contaDaMarcela.saldo);
        System.out.println(marcela.nome + ": " + contaDoPaulo.saldo);
        System.out.println(conseguiuTransferir);
    }
}
