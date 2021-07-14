package bytebank;

public class MovimentarConta {

    public static void main(String[] args) {
        Cliente paulo = new Cliente("Paulo Roberto", "222.222.222-22");
        Conta contaDoPaulo = new Conta(2947, 305648);
        contaDoPaulo.depositar(100);
        contaDoPaulo.setTitular(paulo);
        contaDoPaulo.getTitular().setProfissao("Técnico de TI");

        contaDoPaulo.depositar(50);

        System.out.println("id: " + paulo.id);
        paulo.id = 2; // variável estática possui o mesmo valor para todas as instâncias da classe Cliente
        System.out.println(contaDoPaulo.getTitular().getNome() + ": " + contaDoPaulo.getSaldo());

        boolean conseguiuRetirar = contaDoPaulo.sacar(20);
        System.out.println(contaDoPaulo.getTitular().getNome() + ": " + contaDoPaulo.getSaldo());
        System.out.println(conseguiuRetirar);

        conseguiuRetirar = contaDoPaulo.sacar(2000);
        System.out.println(contaDoPaulo.getTitular().getNome() + ": " + contaDoPaulo.getSaldo());
        System.out.println(conseguiuRetirar);

        Cliente marcela = new Cliente("Marcela Lira", "333.333.333-33", "Advogada");
        Conta contaDaMarcela = new Conta(2947, 34564);
        contaDaMarcela.depositar(1000);
        System.out.println("id: " + marcela.id);
        System.out.println(marcela.getNome() + ": " + contaDaMarcela.getSaldo());

        boolean conseguiuTransferir = contaDaMarcela.transferir(300, contaDoPaulo);
        System.out.println(marcela.getNome() + ": " + contaDaMarcela.getSaldo());
        System.out.println(marcela.getNome() + ": " + contaDoPaulo.getSaldo());
        System.out.println(conseguiuTransferir);
    }
}
