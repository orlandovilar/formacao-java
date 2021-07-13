package sintaxeEVariaveis;

public class TestaConversao {

    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = (int) salario; // chama-se Casting

        System.out.println(valor);

        double n1 = 0.1;
        double n2 = 0.2;
        double somaDouble = n1 + n2;

        System.out.println(somaDouble);

        double idade = 30.0;
        System.out.println("A idade de Marcos é " + (int) idade + "!");


    }
}
