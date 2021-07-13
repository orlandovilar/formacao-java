package sintaxeEVariaveis;

public class ExercicioImpostoRenda {
    public static void main(String[] args) {
        double salario = 3300.0, imposto;

        if(1900.0 <= salario && salario <= 2800.0) {
            imposto = 7.5;
            System.out.println("Sua aliquota é de: " + imposto + "%");
            System.out.println("Você pode deduzir até R$142");
        }else if(2800.01 <= salario && salario <= 3751.0) {
            imposto = 15;
            System.out.println("Sua aliquota é de: " + imposto + "%");
            System.out.println("Você pode deduzir até R$350");
        }else if(3751.01 <= salario && salario <= 4664.0) {
            imposto = 22.5;
            System.out.println("Sua aliquota é de: " + imposto + "%");
            System.out.println("Você pode deduzir até R$636");
        }
    }
}
