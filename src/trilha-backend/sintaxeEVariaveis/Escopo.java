package sintaxeEVariaveis;

public class Escopo {

    public static void main(String[] args) {
        System.out.println("Testando Condicionais");

        int idade = 20;
        int quantidadePessoas = 3;
        boolean acompanhado;

        if(quantidadePessoas >= 2) {
            acompanhado = true;
        }else {
            acompanhado = false;
        }

        System.out.println("Valor de acompanhado = " + acompanhado);
    }
}
