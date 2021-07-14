package bytebank;

public class MovimentarConta {

    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.titular = "Paulo Roberto";

        contaDoPaulo.depositar(50);

        System.out.println(contaDoPaulo.titular + ": " + contaDoPaulo.saldo);

        boolean conseguiuRetirar = contaDoPaulo.sacar(20);
        System.out.println(contaDoPaulo.titular + ": " + contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

        conseguiuRetirar = contaDoPaulo.sacar(2000);
        System.out.println(contaDoPaulo.titular + ": " + contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.depositar(1000);
        contaDaMarcela.titular = "Marcela Lira";
        System.out.println(contaDaMarcela.titular + ": " + contaDaMarcela.saldo);

        boolean conseguiuTransferir = contaDaMarcela.transferir(300, contaDoPaulo);
        System.out.println(contaDaMarcela.titular + ": " + contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.titular + ": " + contaDoPaulo.saldo);
        System.out.println(conseguiuTransferir);
    }
}
