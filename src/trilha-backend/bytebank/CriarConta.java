package bytebank;

public class CriarConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(2947, 304948);
        primeiraConta.depositar(200);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.depositar(100);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta(2947, 345644);
        segundaConta.depositar(50);

        System.out.println("Primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("Segunda conta tem " + segundaConta.getSaldo());

        System.out.println(primeiraConta.getNumero());
        System.out.println(primeiraConta.getAgencia());

        primeiraConta.setAgencia(2947);

        System.out.println(primeiraConta.getAgencia());

        if(primeiraConta == segundaConta) {
            System.out.println("Contas iguais");
        }else {
            System.out.println("Contas diferentes");
        }
    }
}
