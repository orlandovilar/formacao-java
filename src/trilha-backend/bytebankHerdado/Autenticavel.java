package bytebankHerdado;

public abstract interface Autenticavel {
    public abstract boolean autenticar(int senha);

    public abstract void setSenha(int senha);
}
