package sintaxeEVariaveis;

public class TestaCondicional {

    public static void main(String[] args) {
        System.out.println("testando Condicionais:\n");
        int idade = 17, quantidadePessoas = 2;

        if(idade >= 18) {
            System.out.println("Você tem mais de 18 anos.");
            System.out.println("Seja bem vindo!");
        }else {
            if(quantidadePessoas >= 2) {
                System.out.println("Você é menor de idade, mas está acompanhado.");
            }else {
                System.out.println("Você não é bem vindo.");
            }
        }

        if(idade == 20)
            System.out.println("Você tem 20 anos de idade.");
    }
}
