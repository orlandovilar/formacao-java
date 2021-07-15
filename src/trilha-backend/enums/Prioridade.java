package enums;

public enum Prioridade {
    MIN(1),MAX(3),NORMAL(5);

    private int valor;

    Prioridade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }
}
