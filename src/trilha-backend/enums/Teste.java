package enums;

public class Teste {

    public static void main(String[] args) {
        Prioridade pMin = Prioridade.MIN;
        Prioridade pMax = Prioridade.MAX;

        System.out.println(pMin.name());
        System.out.println(pMax.name());
        System.out.println(pMax.ordinal());
    }
}
